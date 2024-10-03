package com.tortas.microservice.exception;

import com.tortas.microservice.model.Product;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message) {
        super(message);
    }
}
