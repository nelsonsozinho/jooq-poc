package br.com.nalone.jooqpoc.core.enums;

public enum ErrorType {

    EMPTY_RESULT(1, "Invalid wallet data");

    private int code;
    private String message;

    ErrorType(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
