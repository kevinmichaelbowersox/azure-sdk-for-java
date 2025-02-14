// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.RoutingConfigurationNfv;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** NetworkVirtualApplianceConnection resource. */
@Fluent
public final class NetworkVirtualApplianceConnectionInner extends SubResource {
    /*
     * Properties of the express route connection.
     */
    @JsonProperty(value = "properties")
    private NetworkVirtualApplianceConnectionProperties innerProperties;

    /*
     * The name of the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /** Creates an instance of NetworkVirtualApplianceConnectionInner class. */
    public NetworkVirtualApplianceConnectionInner() {
    }

    /**
     * Get the innerProperties property: Properties of the express route connection.
     *
     * @return the innerProperties value.
     */
    private NetworkVirtualApplianceConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource.
     *
     * @param name the name value to set.
     * @return the NetworkVirtualApplianceConnectionInner object itself.
     */
    public NetworkVirtualApplianceConnectionInner withName(String name) {
        this.name = name;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkVirtualApplianceConnectionInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the name property: The name of the resource.
     *
     * @return the name value.
     */
    public String namePropertiesName() {
        return this.innerProperties() == null ? null : this.innerProperties().name();
    }

    /**
     * Set the name property: The name of the resource.
     *
     * @param name the name value to set.
     * @return the NetworkVirtualApplianceConnectionInner object itself.
     */
    public NetworkVirtualApplianceConnectionInner withNamePropertiesName(String name) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkVirtualApplianceConnectionProperties();
        }
        this.innerProperties().withName(name);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the NetworkVirtualApplianceConnection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the asn property: Network Virtual Appliance ASN.
     *
     * @return the asn value.
     */
    public Long asn() {
        return this.innerProperties() == null ? null : this.innerProperties().asn();
    }

    /**
     * Set the asn property: Network Virtual Appliance ASN.
     *
     * @param asn the asn value to set.
     * @return the NetworkVirtualApplianceConnectionInner object itself.
     */
    public NetworkVirtualApplianceConnectionInner withAsn(Long asn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkVirtualApplianceConnectionProperties();
        }
        this.innerProperties().withAsn(asn);
        return this;
    }

    /**
     * Get the tunnelIdentifier property: Unique identifier for the connection.
     *
     * @return the tunnelIdentifier value.
     */
    public Long tunnelIdentifier() {
        return this.innerProperties() == null ? null : this.innerProperties().tunnelIdentifier();
    }

    /**
     * Set the tunnelIdentifier property: Unique identifier for the connection.
     *
     * @param tunnelIdentifier the tunnelIdentifier value to set.
     * @return the NetworkVirtualApplianceConnectionInner object itself.
     */
    public NetworkVirtualApplianceConnectionInner withTunnelIdentifier(Long tunnelIdentifier) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkVirtualApplianceConnectionProperties();
        }
        this.innerProperties().withTunnelIdentifier(tunnelIdentifier);
        return this;
    }

    /**
     * Get the bgpPeerAddress property: List of bgpPeerAddresses for the NVA instances.
     *
     * @return the bgpPeerAddress value.
     */
    public List<String> bgpPeerAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().bgpPeerAddress();
    }

    /**
     * Set the bgpPeerAddress property: List of bgpPeerAddresses for the NVA instances.
     *
     * @param bgpPeerAddress the bgpPeerAddress value to set.
     * @return the NetworkVirtualApplianceConnectionInner object itself.
     */
    public NetworkVirtualApplianceConnectionInner withBgpPeerAddress(List<String> bgpPeerAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkVirtualApplianceConnectionProperties();
        }
        this.innerProperties().withBgpPeerAddress(bgpPeerAddress);
        return this;
    }

    /**
     * Get the enableInternetSecurity property: Enable internet security.
     *
     * @return the enableInternetSecurity value.
     */
    public Boolean enableInternetSecurity() {
        return this.innerProperties() == null ? null : this.innerProperties().enableInternetSecurity();
    }

    /**
     * Set the enableInternetSecurity property: Enable internet security.
     *
     * @param enableInternetSecurity the enableInternetSecurity value to set.
     * @return the NetworkVirtualApplianceConnectionInner object itself.
     */
    public NetworkVirtualApplianceConnectionInner withEnableInternetSecurity(Boolean enableInternetSecurity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkVirtualApplianceConnectionProperties();
        }
        this.innerProperties().withEnableInternetSecurity(enableInternetSecurity);
        return this;
    }

    /**
     * Get the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     *
     * @return the routingConfiguration value.
     */
    public RoutingConfigurationNfv routingConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().routingConfiguration();
    }

    /**
     * Set the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     *
     * @param routingConfiguration the routingConfiguration value to set.
     * @return the NetworkVirtualApplianceConnectionInner object itself.
     */
    public NetworkVirtualApplianceConnectionInner withRoutingConfiguration(
        RoutingConfigurationNfv routingConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkVirtualApplianceConnectionProperties();
        }
        this.innerProperties().withRoutingConfiguration(routingConfiguration);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
