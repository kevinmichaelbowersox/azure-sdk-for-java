# Azure Purview Sharing client library for Java

**Please rely heavily on the [service's documentation][product_documentation] and our [data-plane client docs][protocol_method] to use this library**

[Source code][source_code] | [Package (Maven)][package] | [API reference documentation][docs] | [Product Documentation][share_product_documentation] | [Samples][samples_code]

## Getting started

### Prerequisites

- [Java Development Kit (JDK)][jdk] with version 8 or above
- [Azure Subscription][azure_subscription]
- An existing Microsoft Purview account.

For more information about creating a Microsoft Purview account, see [here][create_azure_purview_account].

## Documentation

Various documentation is available to help you get started

- [API reference documentation][docs]
- [Product documentation][share_product_documentation]

### Adding the package to your product

[//]: # ({x-version-update-start;com.azure:azure-analytics-purview-sharing;current})
```xml
<dependency>
    <groupId>com.azure</groupId>
    <artifactId>azure-analytics-purview-sharing</artifactId>
    <version>1.0.0-beta.1</version>
</dependency>
```
[//]: # ({x-version-update-end})

### Authentication

[Azure Identity][azure_identity] package provides the default implementation for authenticating the client.

## Examples

### Create a Sent Share Client
```java com.azure.analytics.purview.sharing.createSentShareClient
```

### Create a Sent Share
```com.azure.analytics.purview.sharing.createSentShare
```

### Get a Sent Share
```com.azure.analytics.purview.sharing.getSentShare
```

### Get All Sent Shares
```com.azure.analytics.purview.sharing.getAllSentShares
```

### Delete a Sent Share
```com.azure.analytics.purview.sharing.deleteSentShare
```

### Send a Share Invitation to a User
```com.azure.analytics.purview.sharing.createUserInvitation
```

### Send a Share Invitation to a Service
```com.azure.analytics.purview.sharing.createServiceInvitation
```

### Get All Sent Share Invitations
```com.azure.analytics.purview.sharing.getAllSentShareInvitations
```

### Get Sent Share Invitation
```com.azure.analytics.purview.sharing.getSentShareInvitations
```

### Create a Received Share Client
```com.azure.analytics.purview.sharing.createReceivedShareClient
```

### Get All Detached Received Shares
```com.azure.analytics.purview.sharing.getAllDetachedReceivedShares
```
### Get Received Share
```com.azure.analytics.purview.sharing.getReceivedShare
```

### Attach Received Shares
```com.azure.analytics.purview.sharing.attachReceivedShare
```

### Get All Attached Received Shares
```com.azure.analytics.purview.sharing.getAllAttachedReceivedShares
```

### Delete a Received Share
```com.azure.analytics.purview.sharing.deleteReceivedShare
```

## Contributing

For details on contributing to this repository, see the [contributing guide](https://github.com/Azure/azure-sdk-for-java/blob/main/CONTRIBUTING.md).

1. Fork it
1. Create your feature branch (`git checkout -b my-new-feature`)
1. Commit your changes (`git commit -am 'Add some feature'`)
1. Push to the branch (`git push origin my-new-feature`)
1. Create new Pull Request

<!-- LINKS -->
[source_code]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/purview/azure-analytics-purview-sharing/src
[package]: https://mvnrepository.com/artifact/com.azure/azure-analytics-purview-sharing
[share_product_documentation]: https://docs.microsoft.com/azure/purview/concept-data-share
[samples_code]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/purview/azure-analytics-purview-sharing/src/samples/
[product_documentation]: https://azure.microsoft.com/services/
[docs]: https://azure.github.io/azure-sdk-for-java/
[jdk]: https://docs.microsoft.com/java/azure/jdk/
[azure_subscription]: https://azure.microsoft.com/free/
[azure_identity]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/identity/azure-identity
[create_azure_purview_account]: https://docs.microsoft.com/azure/purview/create-catalog-portal
