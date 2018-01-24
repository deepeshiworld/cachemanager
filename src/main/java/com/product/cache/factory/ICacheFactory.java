package com.product.cache.factory;

import com.product.cache.cacheProvider.ICache;
import com.product.cache.util.CacheType;

public interface ICacheFactory {

    public ICache getCache(CacheType cacheType) ;
}
