package com.product.cache;

import com.product.cache.cacheProvider.ICache;
import com.product.cache.config.ConfigType;
import com.product.cache.config.ICacheConfig;

public class CacheManager {

    private CacheManager() {
    }


    public static ICache getCache(ICacheConfig cacheConfig, ConfigType configType){

        if(configType==ConfigType.LRU_CONFIG){

           // CacheFactory.getCache(cacheConfig,configType);
        }

        return null;
    }
}
