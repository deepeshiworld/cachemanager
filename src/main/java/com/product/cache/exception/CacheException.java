package com.product.cache.exception;

public class CacheException extends RuntimeException{

    private String message;

    public CacheException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
