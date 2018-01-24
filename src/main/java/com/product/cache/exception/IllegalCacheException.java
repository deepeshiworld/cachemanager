package com.product.cache.exception;

public class IllegalCacheException extends RuntimeException {

    private String message;

    public IllegalCacheException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
