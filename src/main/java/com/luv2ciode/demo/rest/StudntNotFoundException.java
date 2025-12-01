package com.luv2ciode.demo.rest;

public class StudntNotFoundException extends RuntimeException {

    public StudntNotFoundException(String message) {
        super(message);
    }

    public StudntNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudntNotFoundException(Throwable cause) {
        super(cause);
    }
}
