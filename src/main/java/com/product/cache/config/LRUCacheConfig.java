package com.product.cache.config;

import com.product.cache.util.CacheType;

public class LRUCacheConfig implements ICacheConfig{

    private int keys;
    private String name;
    private CacheType cacheType;

    public int getKeys() {
        return keys;
    }

    public String getName() {
        return name;
    }

    public CacheType getCacheType() {
        return cacheType;
    }

    public LRUCacheConfig() {
    }

    public LRUCacheConfig(LRuCacheBuilder builder) {
        this.keys = builder.keys;
        this.name = builder.name;
        this.cacheType=builder.cacheType;
    }

    public static class LRuCacheBuilder {
        private int keys;
        private String name;
        private CacheType cacheType;

        public LRuCacheBuilder(int keys, CacheType cacheType) {
            this.keys = keys;
            this.cacheType=cacheType;
        }

        public LRuCacheBuilder setCacheType(CacheType cacheType) {
            this.cacheType = cacheType;
            return this;
        }

        public LRuCacheBuilder setKeys(int keys) {
            this.keys = keys;
            return this;
        }

        public LRuCacheBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public LRUCacheConfig build() {
            LRUCacheConfig params = new LRUCacheConfig(this);
            validateUserObject(params);
            return params;
        }

        private boolean validateUserObject(LRUCacheConfig params) {

            // do some validation of null and inappropriate
            return true;
        }
    }
}
