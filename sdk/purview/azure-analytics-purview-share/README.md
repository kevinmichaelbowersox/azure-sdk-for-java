# Azure PurviewShareClient client library for Java

Azure PurviewShareClient client library for Java.

This package contains Microsoft Azure PurviewShareClient client library.

## Documentation

Various documentation is available to help you get started

- [API reference documentation][docs]
- [Product documentation][product_documentation]

## Getting started

### Prerequisites

- [Java Development Kit (JDK)][jdk] with version 8 or above
- [Azure Subscription][azure_subscription]

### Adding the package to your product

[//]: # ({x-version-update-start;com.azure:azure-analytics-purview-share;current})
```xml
<dependency>
    <groupId>com.azure</groupId>
    <artifactId>azure-analytics-purview-share</artifactId>
    <version>1.0.0-beta.1</version>
</dependency>
```
[//]: # ({x-version-update-end})

### Authentication

[Azure Identity][azure_identity] package provides the default implementation for authenticating the client.

## Key concepts

## Examples

The following section demonstrates how to initialize and authenticate a client to share data.

### Create Sent Share

```java com.azure.analytics.purview.share.createSentShare
SentSharesClient sentSharesClient =
        new SentSharesClientBuilder()
                .credential(new DefaultAzureCredentialBuilder().build())
                .endpoint("https://<my-account-name>.purview.azure.com/share")
                .buildClient();

var sentShareId = UUID.randomUUID().toString();
var sentShare = """
        {
          "shareKind": "InPlace",
          "properties": {
            "displayName": "sentShare1",
            "description": "description",
            "artifact": {
              "storeKind": "AdlsGen2Account",
              "storeReference": {
                "type": "ArmResourceReference",
                "referenceName": "/subscriptions/de06c3a0-4610-4ca0-8cbb-bbdac204bd65/resourceGroups/sender-storage-rg/providers/Microsoft.Storage/storageAccounts/providerstorage"
              },
              "properties": {
                "paths": [
                  {
                    "containerName": "container1",
                    "receiverPath": "SharedFile.txt",
                    "senderPath": "directory/file.txt"
                  }
                ]
              }
            }
          }
        }
        """;

RequestOptions requestOptions = new RequestOptions();
SyncPoller<BinaryData, BinaryData> response =
        sentSharesClient.beginCreateSentShare(sentShareId, BinaryData.fromString(sentShare), requestOptions);
```

### Send Invitation
```java com.azure.analytics.purview.share.sendInvitation
SentSharesClient sentSharesClient =
        new SentSharesClientBuilder()
                .credential(new DefaultAzureCredentialBuilder().build())
                .endpoint("https://<my-account-name>.purview.azure.com/share")
                .buildClient();

var sentShareId = "<sent-share-id>";
var sentShareInvitationId = UUID.randomUUID().toString();
var sentShareInvitation = """
        {
          "invitationKind": "User",
          "properties": {
            "notify": true,
            "targetEmail": "testReceiver@microsoft.com"
          }
        }
        """;

RequestOptions requestOptions = new RequestOptions();
Response<BinaryData> response =
        sentSharesClient.createSentShareInvitationWithResponse(
                sentShareId,
                sentShareInvitationId,
                BinaryData.fromString(sentShareInvitation),
                requestOptions);
```

### View Sent Share Invitations
```java com.azure.analytics.purview.share.listSentInvitations
SentSharesClient sentSharesClient =
        new SentSharesClientBuilder()
                .credential(new DefaultAzureCredentialBuilder().build())
                .endpoint("https://<my-account-name>.purview.azure.com/share")
                .buildClient();

var sentShareId = "<sent-share-id>";

RequestOptions requestOptions = new RequestOptions().addQueryParam("$orderBy", "properties/sentAt desc");
PagedIterable<BinaryData> response =
        sentSharesClient.listSentShareInvitations(sentShareId, requestOptions);
```

### View Received Invitations
```java com.azure.analytics.purview.share.listDetachedReceivedShares
ReceivedSharesClient receivedSharesClient =
        new ReceivedSharesClientBuilder()
                .credential(new DefaultAzureCredentialBuilder().build())
                .endpoint("https://<my-account-name>.purview.azure.com/share")
                .buildClient();

RequestOptions requestOptions = new RequestOptions().addQueryParam("$orderBy", "properties/createdAt desc");
PagedIterable<BinaryData> response = receivedSharesClient.listDetachedReceivedShares(requestOptions);
```

### Attach Received Share
```java com.azure.analytics.purview.share.attachReceivedShare
ReceivedSharesClient receivedSharesClient =
        new ReceivedSharesClientBuilder()
                .credential(new DefaultAzureCredentialBuilder().build())
                .endpoint("https://<my-account-name>.purview.azure.com/share")
                .buildClient();

RequestOptions listRequestOptions = new RequestOptions().addQueryParam("$orderBy", "properties/createdAt desc");
PagedIterable<BinaryData> listResponse = receivedSharesClient.listDetachedReceivedShares(listRequestOptions);

Optional<BinaryData> detachedReceivedShare = listResponse.stream().findFirst();

if (detachedReceivedShare.isEmpty()) {
    return;
}

String receivedShareId = new ObjectMapper()
        .readValue(detachedReceivedShare.get().toString(), ObjectNode.class)
        .get("id")
        .textValue();

var receivedShare = """
        {
          "shareKind": "InPlace",
          "properties": {
            "sink": {
              "storeKind": "BlobAccount",
              "storeReference": {
                "type": "ArmResourceReference",
                "referenceName": "/subscriptions/4D8FD81D-431D-4B1D-B46C-C770CFC034FC/resourceGroups/contoso-rg/providers/Microsoft.Storage/storageAccounts/blobAccount"
              },
              "properties": {
                  "containerName": "container1",
                  "folder": "folder1",
                  "mountPath": "mountpath1"
              }
            }
          }
        }
        """;

RequestOptions createRequestOptions = new RequestOptions();
SyncPoller<BinaryData, BinaryData> createResponse =
        receivedSharesClient.beginCreateReceivedShare(receivedShareId, BinaryData.fromString(receivedShare), createRequestOptions);
```
### List Attached Received Share
```java com.azure.analytics.purview.share.listAttachedReceivedShare
ReceivedSharesClient receivedSharesClient =
        new ReceivedSharesClientBuilder()
                .credential(new DefaultAzureCredentialBuilder().build())
                .endpoint("https://<my-account-name>.purview.azure.com/share")
                .buildClient();

RequestOptions requestOptions = new RequestOptions().addQueryParam("$orderBy", "properties/createdAt desc");
PagedIterable<BinaryData> response =
        receivedSharesClient.listAttachedReceivedShares(
                "/subscriptions/4D8FD81D-431D-4B1D-B46C-C770CFC034FC/resourceGroups/contoso-rg/providers/Microsoft.Storage/storageAccounts/blobAccount",
                requestOptions);

Optional<BinaryData> receivedShare = response.stream().findFirst();

if (receivedShare.isEmpty()) {
    return;
}

String receivedShareId = new ObjectMapper()
        .readValue(receivedShare.get().toString(), ObjectNode.class)
        .get("id")
        .textValue();
```

## Troubleshooting

## Next steps

## Contributing

For details on contributing to this repository, see the [contributing guide](https://github.com/Azure/azure-sdk-for-java/blob/main/CONTRIBUTING.md).

1. Fork it
1. Create your feature branch (`git checkout -b my-new-feature`)
1. Commit your changes (`git commit -am 'Add some feature'`)
1. Push to the branch (`git push origin my-new-feature`)
1. Create new Pull Request

<!-- LINKS -->
[product_documentation]: https://azure.microsoft.com/services/
[docs]: https://azure.github.io/azure-sdk-for-java/
[jdk]: https://docs.microsoft.com/java/azure/jdk/
[azure_subscription]: https://azure.microsoft.com/free/
[azure_identity]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/identity/azure-identity
