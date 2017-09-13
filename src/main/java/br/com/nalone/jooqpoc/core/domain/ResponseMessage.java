package br.com.nalone.jooqpoc.core.domain;

import br.com.nalone.jooqpoc.core.enums.ErrorType;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@ApiModel(value="ResponseMessage", description="Represents model for API error reporting")
public class ResponseMessage {

    private String message;
    private int code;
    private List<Error> errors;


    public ResponseMessage(final ErrorType errorType) {
        this.code = errorType.getCode();
        this.message = errorType.getMessage();
    }

    public ResponseMessage(String message) {
        this.message = message;
    }

    public ResponseMessage(int code, String message) {
        this.message = message;
        this.code = code;
    }
}
