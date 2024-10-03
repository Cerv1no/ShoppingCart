package com.tortas.microservice.exception;

public class AlreadyExistsException extends RuntimeException{

    public AlreadyExistsException(String message) {
        super(message);
    }
}
