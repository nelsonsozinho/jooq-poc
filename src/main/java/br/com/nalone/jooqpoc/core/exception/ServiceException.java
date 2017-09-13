package br.com.nalone.jooqpoc.core.exception;

import br.com.nalone.jooqpoc.core.enums.ErrorType;

public class ServiceException extends RuntimeException {

    private final int code;
    private final String message;

    public ServiceException(final int code, final String message) {
        this.code = code;
        this.message = message;
    }

    public ServiceException(final ErrorType errorType) {
        this.code = errorType.getCode();
        this.message = errorType.getMessage();
    }

    public ServiceException(final ErrorType errorType, final Throwable throwable) {
        super(throwable);
        this.code = errorType.getCode();
        this.message = errorType.getMessage();
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
