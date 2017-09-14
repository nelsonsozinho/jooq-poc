package br.com.nalone.jooqpoc.wallet.controller;

import br.com.nalone.jooqpoc.core.domain.ResponseMessage;
import br.com.nalone.jooqpoc.wallet.service.JooqWalletService;
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

@RestController
@RequestMapping("/jooq-wallet")
@Api(value = "jooq-wallet", description = "Endpoint to test jOOQ")
public class JooqWalletController {

    @Autowired
    private JooqWalletService jooqWalletService;


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
    public ResponseEntity<WalletVO> getWallet(@PathVariable("userId") final Long investId) {
        final WalletVO wallet = jooqWalletService.getPersonalWalletByUserId(investId);

        if(wallet != null) {
            return new ResponseEntity<WalletVO>(wallet, HttpStatus.OK);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }



}
