// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Create/Update/Get common properties of the redis cache. */
@Fluent
public class RedisCommonProperties {
    /*
     * All Redis Settings. Few possible keys:
     * rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value
     * etc.
     */
    @JsonProperty(value = "redisConfiguration")
    private RedisConfiguration redisConfiguration;

    /*
     * Redis version. This should be in the form 'major[.minor]' (only 'major' is required) or the value 'latest' which
     * refers to the latest stable Redis version that is available. Supported versions: 4.0, 6.0 (latest). Default
     * value is 'latest'.
     */
    @JsonProperty(value = "redisVersion")
    private String redisVersion;

    /*
     * Specifies whether the non-ssl Redis server port (6379) is enabled.
     */
    @JsonProperty(value = "enableNonSslPort")
    private Boolean enableNonSslPort;

    /*
     * The number of replicas to be created per primary.
     */
    @JsonProperty(value = "replicasPerMaster")
    private Integer replicasPerMaster;

    /*
     * The number of replicas to be created per primary.
     */
    @JsonProperty(value = "replicasPerPrimary")
    private Integer replicasPerPrimary;

    /*
     * A dictionary of tenant settings
     */
    @JsonProperty(value = "tenantSettings")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tenantSettings;

    /*
     * The number of shards to be created on a Premium Cluster Cache.
     */
    @JsonProperty(value = "shardCount")
    private Integer shardCount;

    /*
     * Optional: requires clients to use a specified TLS version (or higher) to connect (e,g, '1.0', '1.1', '1.2')
     */
    @JsonProperty(value = "minimumTlsVersion")
    private TlsVersion minimumTlsVersion;

    /*
     * Whether or not public endpoint access is allowed for this cache.  Value is optional but if passed in, must be
     * 'Enabled' or 'Disabled'. If 'Disabled', private endpoints are the exclusive access method. Default value is
     * 'Enabled'
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /** Creates an instance of RedisCommonProperties class. */
    public RedisCommonProperties() {
    }

    /**
     * Get the redisConfiguration property: All Redis Settings. Few possible keys:
     * rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value
     * etc.
     *
     * @return the redisConfiguration value.
     */
    public RedisConfiguration redisConfiguration() {
        return this.redisConfiguration;
    }

    /**
     * Set the redisConfiguration property: All Redis Settings. Few possible keys:
     * rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value
     * etc.
     *
     * @param redisConfiguration the redisConfiguration value to set.
     * @return the RedisCommonProperties object itself.
     */
    public RedisCommonProperties withRedisConfiguration(RedisConfiguration redisConfiguration) {
        this.redisConfiguration = redisConfiguration;
        return this;
    }

    /**
     * Get the redisVersion property: Redis version. This should be in the form 'major[.minor]' (only 'major' is
     * required) or the value 'latest' which refers to the latest stable Redis version that is available. Supported
     * versions: 4.0, 6.0 (latest). Default value is 'latest'.
     *
     * @return the redisVersion value.
     */
    public String redisVersion() {
        return this.redisVersion;
    }

    /**
     * Set the redisVersion property: Redis version. This should be in the form 'major[.minor]' (only 'major' is
     * required) or the value 'latest' which refers to the latest stable Redis version that is available. Supported
     * versions: 4.0, 6.0 (latest). Default value is 'latest'.
     *
     * @param redisVersion the redisVersion value to set.
     * @return the RedisCommonProperties object itself.
     */
    public RedisCommonProperties withRedisVersion(String redisVersion) {
        this.redisVersion = redisVersion;
        return this;
    }

    /**
     * Get the enableNonSslPort property: Specifies whether the non-ssl Redis server port (6379) is enabled.
     *
     * @return the enableNonSslPort value.
     */
    public Boolean enableNonSslPort() {
        return this.enableNonSslPort;
    }

    /**
     * Set the enableNonSslPort property: Specifies whether the non-ssl Redis server port (6379) is enabled.
     *
     * @param enableNonSslPort the enableNonSslPort value to set.
     * @return the RedisCommonProperties object itself.
     */
    public RedisCommonProperties withEnableNonSslPort(Boolean enableNonSslPort) {
        this.enableNonSslPort = enableNonSslPort;
        return this;
    }

    /**
     * Get the replicasPerMaster property: The number of replicas to be created per primary.
     *
     * @return the replicasPerMaster value.
     */
    public Integer replicasPerMaster() {
        return this.replicasPerMaster;
    }

    /**
     * Set the replicasPerMaster property: The number of replicas to be created per primary.
     *
     * @param replicasPerMaster the replicasPerMaster value to set.
     * @return the RedisCommonProperties object itself.
     */
    public RedisCommonProperties withReplicasPerMaster(Integer replicasPerMaster) {
        this.replicasPerMaster = replicasPerMaster;
        return this;
    }

    /**
     * Get the replicasPerPrimary property: The number of replicas to be created per primary.
     *
     * @return the replicasPerPrimary value.
     */
    public Integer replicasPerPrimary() {
        return this.replicasPerPrimary;
    }

    /**
     * Set the replicasPerPrimary property: The number of replicas to be created per primary.
     *
     * @param replicasPerPrimary the replicasPerPrimary value to set.
     * @return the RedisCommonProperties object itself.
     */
    public RedisCommonProperties withReplicasPerPrimary(Integer replicasPerPrimary) {
        this.replicasPerPrimary = replicasPerPrimary;
        return this;
    }

    /**
     * Get the tenantSettings property: A dictionary of tenant settings.
     *
     * @return the tenantSettings value.
     */
    public Map<String, String> tenantSettings() {
        return this.tenantSettings;
    }

    /**
     * Set the tenantSettings property: A dictionary of tenant settings.
     *
     * @param tenantSettings the tenantSettings value to set.
     * @return the RedisCommonProperties object itself.
     */
    public RedisCommonProperties withTenantSettings(Map<String, String> tenantSettings) {
        this.tenantSettings = tenantSettings;
        return this;
    }

    /**
     * Get the shardCount property: The number of shards to be created on a Premium Cluster Cache.
     *
     * @return the shardCount value.
     */
    public Integer shardCount() {
        return this.shardCount;
    }

    /**
     * Set the shardCount property: The number of shards to be created on a Premium Cluster Cache.
     *
     * @param shardCount the shardCount value to set.
     * @return the RedisCommonProperties object itself.
     */
    public RedisCommonProperties withShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }

    /**
     * Get the minimumTlsVersion property: Optional: requires clients to use a specified TLS version (or higher) to
     * connect (e,g, '1.0', '1.1', '1.2').
     *
     * @return the minimumTlsVersion value.
     */
    public TlsVersion minimumTlsVersion() {
        return this.minimumTlsVersion;
    }

    /**
     * Set the minimumTlsVersion property: Optional: requires clients to use a specified TLS version (or higher) to
     * connect (e,g, '1.0', '1.1', '1.2').
     *
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the RedisCommonProperties object itself.
     */
    public RedisCommonProperties withMinimumTlsVersion(TlsVersion minimumTlsVersion) {
        this.minimumTlsVersion = minimumTlsVersion;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether or not public endpoint access is allowed for this cache. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'. If 'Disabled', private endpoints are the exclusive
     * access method. Default value is 'Enabled'.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether or not public endpoint access is allowed for this cache. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'. If 'Disabled', private endpoints are the exclusive
     * access method. Default value is 'Enabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the RedisCommonProperties object itself.
     */
    public RedisCommonProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (redisConfiguration() != null) {
            redisConfiguration().validate();
        }
    }
}
