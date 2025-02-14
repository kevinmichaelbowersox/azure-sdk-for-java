// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SSIS property override. */
@Fluent
public final class SsisPropertyOverride {
    /*
     * SSIS package property override value. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "value", required = true)
    private Object value;

    /*
     * Whether SSIS package property override value is sensitive data. Value will be encrypted in SSISDB if it is true
     */
    @JsonProperty(value = "isSensitive")
    private Boolean isSensitive;

    /** Creates an instance of SsisPropertyOverride class. */
    public SsisPropertyOverride() {
    }

    /**
     * Get the value property: SSIS package property override value. Type: string (or Expression with resultType
     * string).
     *
     * @return the value value.
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value property: SSIS package property override value. Type: string (or Expression with resultType
     * string).
     *
     * @param value the value value to set.
     * @return the SsisPropertyOverride object itself.
     */
    public SsisPropertyOverride withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get the isSensitive property: Whether SSIS package property override value is sensitive data. Value will be
     * encrypted in SSISDB if it is true.
     *
     * @return the isSensitive value.
     */
    public Boolean isSensitive() {
        return this.isSensitive;
    }

    /**
     * Set the isSensitive property: Whether SSIS package property override value is sensitive data. Value will be
     * encrypted in SSISDB if it is true.
     *
     * @param isSensitive the isSensitive value to set.
     * @return the SsisPropertyOverride object itself.
     */
    public SsisPropertyOverride withIsSensitive(Boolean isSensitive) {
        this.isSensitive = isSensitive;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model SsisPropertyOverride"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SsisPropertyOverride.class);
}
