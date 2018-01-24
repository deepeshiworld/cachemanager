package com.product.cache.factory;

import com.product.cache.cacheProvider.ICache;
import com.product.cache.cacheProvider.LRUCache;
import com.product.cache.config.ICacheConfig;
import com.product.cache.exception.InvalidCacheConfigException;
import com.product.cache.util.CacheType;

public class LRUCacheFactory implements ICacheFactory {

    private static LRUCache lruCache;

    public static ICache getCache(ICacheConfig cacheConfig) {

        if (cacheConfig == null) {
            throw new InvalidCacheConfigException("null cache config");
        }

        if (lruCache == null) {
            synchronized (LRUCacheFactory.class) {
                if (lruCache == null) {
                    lruCache = new LRUCache(cacheConfig);
                }
            }
        }
        return lruCache;
    }

    @Override
    public ICache getCache(CacheType cacheType) {
        return null;
    }
}
