package com.product.cache.cacheProvider;

import com.product.cache.config.ICacheConfig;
import com.product.cache.exception.CacheException;

import java.util.concurrent.ConcurrentHashMap;

public class LRUCache implements ICache {

    private ConcurrentHashMap<String, Object> cacheMap;


    public LRUCache(ICacheConfig cacheConfig) {

        this.cacheMap = cacheMap;
    }

    @Override
    public Object get(String key) {
        return cacheMap.get(key);
    }

    @Override
    public boolean put(String key, Object val) throws CacheException {

        try {
            cacheMap.put(key, val);
        } catch (Exception e) {
            throw new CacheException("Unalbe to update");
        }

        return true;

    }

    @Override
    public boolean delete(String key) {

        try {
            cacheMap.remove(key);
        } catch (Exception e) {
            throw new CacheException("Unalbe to update");
        }

        return true;

    }

    @Override
    public void reset() throws CacheException {

        try {
            this.cacheMap.clear();
        } catch (Exception e) {
            throw new CacheException("Unalbe to update");
        }

    }


}
