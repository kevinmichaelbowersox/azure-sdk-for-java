package com.azure.analytics.purview.sharing;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

import com.azure.analytics.purview.sharing.models.BlobStorageArtifact;
import com.azure.analytics.purview.sharing.models.InPlaceSentShare;
import com.azure.analytics.purview.sharing.models.ReferenceNameType;
import com.azure.analytics.purview.sharing.models.SentShare;
import com.azure.analytics.purview.sharing.models.ServiceInvitation;
import com.azure.analytics.purview.sharing.models.StorageAccountPath;
import com.azure.analytics.purview.sharing.models.StoreReference;
import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Configuration;
import com.azure.core.util.polling.PollResponse;
import com.azure.core.util.polling.SyncPoller;
import com.azure.identity.DefaultAzureCredentialBuilder;

import reactor.core.publisher.Mono;

class PurviewShareTestBase extends TestBase{

    protected ReceivedSharesClient receivedSharesClient;

    protected SentSharesClient sentSharesClient;
    
    protected String clientId;
    
    protected String targetActiveDirectoryId;
    
    protected String targetObjectId;
    
    protected String providerStorageAccountResourceId;

    protected String consumerStorageAccountResourceId;
    
    protected String consumerEmail;

    @Override
    protected void beforeTest() {

        this.initializeSentShareClient();
        this.initializeReceivedShareClient();

        clientId = Configuration.getGlobalConfiguration().get("AZURE_CLIENT_ID");
        targetActiveDirectoryId = Configuration.getGlobalConfiguration().get("AZURE_TENANT_ID");
        targetObjectId = Configuration.getGlobalConfiguration().get("TARGET_OBJECT_ID");
        providerStorageAccountResourceId = Configuration.getGlobalConfiguration().get("PROVIDER_STORAGE_RESOURCE_ID");
        consumerStorageAccountResourceId = Configuration.getGlobalConfiguration().get("CONSUMER_STORAGE_RESOURCE_ID");
        consumerEmail = Configuration.getGlobalConfiguration().get("CONSUMER_EMAIL");
    }
 
    protected SentShare createSentShare(UUID uuid) {
        
        String sentShareId = uuid.toString();
        
        InPlaceSentShare sentShare = new InPlaceSentShare()
                .setDisplayName(testResourceNamer.randomName("sentshare", 26))
                .setDescription("A sample share");

        StoreReference storeReference = new StoreReference()
                .setReferenceName(this.providerStorageAccountResourceId)
                .setType(ReferenceNameType.ARM_RESOURCE_REFERENCE);
        
        StorageAccountPath storageAccountPath = new StorageAccountPath()
                .setContainerName("test-files")
                .setReceiverPath("graph.png")
                .setSenderPath("graph.png");

        BlobStorageArtifact artifact = new BlobStorageArtifact()
                .setStoreReference(storeReference)
                .setPaths(List.of(storageAccountPath));
        
        sentShare.setArtifact(artifact);

        RequestOptions requestOptions = new RequestOptions();
        SyncPoller<BinaryData, BinaryData> response =
                sentSharesClient.beginCreateOrReplaceSentShare(sentShareId, BinaryData.fromObject(sentShare), requestOptions); 
        
        response.waitForCompletion();
        
        return response.getFinalResult().toObject(SentShare.class);
    }
    
    protected Response<BinaryData> createSentShareAndServiceInvitation(){
        return this.createSentShareAndServiceInvitation(UUID.randomUUID(), UUID.randomUUID());
   }
    
    protected Response<BinaryData> createSentShareAndServiceInvitation(UUID sentShareId, UUID sentShareInvitationId){
        this.createSentShare(sentShareId);

        String invitationId = sentShareInvitationId.toString();
       
        var sentShareInvitation = new ServiceInvitation()
                .setTargetActiveDirectoryId(UUID.fromString(this.targetActiveDirectoryId))
                .setTargetObjectId(UUID.fromString(this.targetObjectId));

        return sentSharesClient.createSentShareInvitationWithResponse(
                        sentShareId.toString(),
                        invitationId,
                        BinaryData.fromObject(sentShareInvitation),
                        new RequestOptions());
    }

    private void initializeReceivedShareClient() {
        ReceivedSharesClientBuilder receivedSharesClientbuilder =
                new ReceivedSharesClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            receivedSharesClientbuilder
                    .httpClient(interceptorManager.getPlaybackClient())
                    .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
        } else if (getTestMode() == TestMode.RECORD) {
            receivedSharesClientbuilder
                    .addPolicy(interceptorManager.getRecordPolicy())
                    .credential(new DefaultAzureCredentialBuilder().build());
        } else if (getTestMode() == TestMode.LIVE) {
            receivedSharesClientbuilder.credential(new DefaultAzureCredentialBuilder().build());
        }
        
        receivedSharesClient = receivedSharesClientbuilder.buildClient();
    }

    private void initializeSentShareClient() {
        SentSharesClientBuilder sentSharesClientbuilder =
                new SentSharesClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            sentSharesClientbuilder
                    .httpClient(interceptorManager.getPlaybackClient())
                    .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
        } else if (getTestMode() == TestMode.RECORD) {
            sentSharesClientbuilder
                    .addPolicy(interceptorManager.getRecordPolicy())
                    .credential(new DefaultAzureCredentialBuilder().build());
        } else if (getTestMode() == TestMode.LIVE) {
            sentSharesClientbuilder.credential(new DefaultAzureCredentialBuilder().build());
        }

        sentSharesClient = sentSharesClientbuilder.buildClient();
    }
   }
