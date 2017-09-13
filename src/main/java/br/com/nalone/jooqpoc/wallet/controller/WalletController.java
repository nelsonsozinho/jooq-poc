package br.com.nalone.jooqpoc.wallet.controller;


import br.com.nalone.jooqpoc.core.domain.ResponseMessage;
import br.com.nalone.jooqpoc.core.enums.ErrorType;
import br.com.nalone.jooqpoc.core.exception.ServiceException;
import br.com.nalone.jooqpoc.wallet.service.JooqWalletService;
import br.com.nalone.jooqpoc.wallet.service.WalletService;
import br.com.nalone.jooqpoc.wallet.vo.WalletVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Api(value = "wallet", description = "Endpoint for wallet")
@RestController
@RequestMapping("/wallet")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @RequestMapping(
            value = "/user/{userId}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    @ApiOperation(value = "Get a user wallet", response = Void.class)
    @ApiResponses(value = {
            @ApiResponse(code = 401, message = "Not found", response = ResponseMessage.class)
    })
    public ResponseEntity<WalletVO> getWallet( @PathVariable("userId") final Long userId) {
        final WalletVO wallet = walletService.getWallet(userId);

        if(wallet != null) {
            return new ResponseEntity<WalletVO>(wallet, HttpStatus.OK);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }


    @RequestMapping(
            value = "/user/{userId}",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    @ApiOperation(value = "Creates a new ", response = Void.class)
    @ApiResponses(value = {
            @ApiResponse(code = 401, message = "Not found", response = ResponseMessage.class)
    })
    public ResponseEntity newWallet(@PathVariable("userId") final Long userId, @RequestBody final WalletVO walletVO) {
        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.CREATED);

        if(null == walletVO) {
            responseEntity = new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        try {
            walletService.newWallet(userId, walletVO);
        } catch (ServiceException e) {
            if(e.getCode() == ErrorType.EMPTY_RESULT.getCode()) {
                responseEntity = new ResponseEntity(new ResponseMessage(e.getCode(), e.getMessage()), HttpStatus.NOT_FOUND);
            } else {
                responseEntity = new ResponseEntity<>(new ResponseMessage(e.getCode(), e.getMessage()), HttpStatus.BAD_REQUEST);
            }
        }

        return responseEntity;
    }

}
