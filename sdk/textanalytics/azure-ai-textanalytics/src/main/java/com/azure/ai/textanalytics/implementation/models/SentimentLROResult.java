// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** The SentimentLROResult model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("SentimentAnalysisLROResults")
@Fluent
public final class SentimentLROResult extends AnalyzeTextLROResult {
    /*
     * The results property.
     */
    @JsonProperty(value = "results", required = true)
    private SentimentResponse results;

    /** Creates an instance of SentimentLROResult class. */
    public SentimentLROResult() {}

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public SentimentResponse getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the SentimentLROResult object itself.
     */
    public SentimentLROResult setResults(SentimentResponse results) {
        this.results = results;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SentimentLROResult setTaskName(String taskName) {
        super.setTaskName(taskName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SentimentLROResult setLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
        super.setLastUpdateDateTime(lastUpdateDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SentimentLROResult setStatus(State status) {
        super.setStatus(status);
        return this;
    }
}
