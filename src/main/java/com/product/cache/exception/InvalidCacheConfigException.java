package com.product.cache.exception;

public class InvalidCacheConfigException extends RuntimeException{

    private String message;

    public InvalidCacheConfigException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
