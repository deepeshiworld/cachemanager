package com.product.cache.cacheProvider;

import com.product.cache.exception.CacheException;

public interface ICache {

    public Object get(String key);

    public boolean put(String key, Object val) throws CacheException;

    public boolean delete(String key) throws CacheException;

    public void reset()  throws CacheException;
}
