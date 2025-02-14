// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configure pairing input. */
@Fluent
public final class CreateProtectionContainerMappingInput {
    /*
     * Configure protection input properties.
     */
    @JsonProperty(value = "properties")
    private CreateProtectionContainerMappingInputProperties properties;

    /** Creates an instance of CreateProtectionContainerMappingInput class. */
    public CreateProtectionContainerMappingInput() {
    }

    /**
     * Get the properties property: Configure protection input properties.
     *
     * @return the properties value.
     */
    public CreateProtectionContainerMappingInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Configure protection input properties.
     *
     * @param properties the properties value to set.
     * @return the CreateProtectionContainerMappingInput object itself.
     */
    public CreateProtectionContainerMappingInput withProperties(
        CreateProtectionContainerMappingInputProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
