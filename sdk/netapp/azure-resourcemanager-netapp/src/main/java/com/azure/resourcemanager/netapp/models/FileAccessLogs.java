// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Flag indicating whether file access logs are enabled for the volume, based on active diagnostic settings present on
 * the volume.
 */
public final class FileAccessLogs extends ExpandableStringEnum<FileAccessLogs> {
    /** Static value Enabled for FileAccessLogs. */
    public static final FileAccessLogs ENABLED = fromString("Enabled");

    /** Static value Disabled for FileAccessLogs. */
    public static final FileAccessLogs DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of FileAccessLogs value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FileAccessLogs() {
    }

    /**
     * Creates or finds a FileAccessLogs from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FileAccessLogs.
     */
    @JsonCreator
    public static FileAccessLogs fromString(String name) {
        return fromString(name, FileAccessLogs.class);
    }

    /**
     * Gets known FileAccessLogs values.
     *
     * @return known FileAccessLogs values.
     */
    public static Collection<FileAccessLogs> values() {
        return values(FileAccessLogs.class);
    }
}
