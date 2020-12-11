package com.lti.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class RecordNotFoundException extends RuntimeException{
	public RecordNotFoundException(String message) {
        super(message);
    }

    public RecordNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
