package com.ivakhnenko.agileenginetest.exception;


import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ImageAppException extends RuntimeException {
    public ImageAppException(String message) {
        super(message);
    }
}
