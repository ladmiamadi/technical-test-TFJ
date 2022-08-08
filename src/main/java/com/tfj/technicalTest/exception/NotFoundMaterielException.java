package com.tfj.technicalTest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundMaterielException extends RuntimeException {
    public NotFoundMaterielException (String s) {
        super(s);
    }
}
