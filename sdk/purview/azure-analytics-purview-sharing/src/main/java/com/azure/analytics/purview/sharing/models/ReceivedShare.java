// Copyright (c) Microsoft Corporation. All rights reserved.

package com.azure.analytics.purview.sharing.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A received share data transfer object. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "shareKind",
        defaultImpl = ReceivedShare.class)
@JsonTypeName("ReceivedShare")
@JsonSubTypes({@JsonSubTypes.Type(name = "InPlace", value = InPlaceReceivedShare.class)})
@Immutable
public class ReceivedShare extends Resource {
    /** Creates an instance of ReceivedShare class. */
    public ReceivedShare() {}
}
