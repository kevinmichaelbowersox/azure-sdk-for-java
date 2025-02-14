// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.ClusterManager;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ClusterManagersGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"analyticsWorkspaceId\":\"qqagwwr\",\"availabilityZones\":[\"mz\",\"sgl\",\"rczezkhhlt\"],\"clusterVersions\":[],\"detailedStatus\":\"UpdateFailed\",\"detailedStatusMessage\":\"oawjqoyueay\",\"fabricControllerId\":\"bpcms\",\"managedResourceGroupConfiguration\":{\"location\":\"yrrueqth\",\"name\":\"gnmbscbbxigdhx\"},\"managerExtendedLocation\":{\"name\":\"d\",\"type\":\"opedbwdpyqyybxub\"},\"provisioningState\":\"Failed\",\"vmSize\":\"fcbqwremjela\"},\"location\":\"cigeleohdbvqvw\",\"tags\":{\"ybxc\":\"opwbeonrlkwzd\",\"hkrttzrazis\":\"akxcptsoqfyiaseq\",\"vanbwzohmnrxxbs\":\"ykiue\",\"dptysprqs\":\"jklinh\"},\"id\":\"nzxojpslsvjgpli\",\"name\":\"fiqwoy\",\"type\":\"qvapcohhoucq\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        NetworkCloudManager manager =
            NetworkCloudManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ClusterManager response =
            manager
                .clusterManagers()
                .getByResourceGroupWithResponse("wqagnepzwa", "lsbs", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("cigeleohdbvqvw", response.location());
        Assertions.assertEquals("opwbeonrlkwzd", response.tags().get("ybxc"));
        Assertions.assertEquals("qqagwwr", response.analyticsWorkspaceId());
        Assertions.assertEquals("mz", response.availabilityZones().get(0));
        Assertions.assertEquals("bpcms", response.fabricControllerId());
        Assertions.assertEquals("yrrueqth", response.managedResourceGroupConfiguration().location());
        Assertions.assertEquals("gnmbscbbxigdhx", response.managedResourceGroupConfiguration().name());
        Assertions.assertEquals("fcbqwremjela", response.vmSize());
    }
}
