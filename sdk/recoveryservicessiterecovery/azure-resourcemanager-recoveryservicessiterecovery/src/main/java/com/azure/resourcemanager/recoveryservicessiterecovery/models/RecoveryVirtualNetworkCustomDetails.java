// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Recovery Virtual network custom input. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "resourceType",
    defaultImpl = RecoveryVirtualNetworkCustomDetails.class)
@JsonTypeName("RecoveryVirtualNetworkCustomDetails")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Existing", value = ExistingRecoveryVirtualNetwork.class),
    @JsonSubTypes.Type(name = "New", value = NewRecoveryVirtualNetwork.class)
})
@Immutable
public class RecoveryVirtualNetworkCustomDetails {
    /** Creates an instance of RecoveryVirtualNetworkCustomDetails class. */
    public RecoveryVirtualNetworkCustomDetails() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
