package br.com.nalone.jooqpoc.asset.controller;

import br.com.nalone.jooqpoc.asset.service.JooqAssetService;
import br.com.nalone.jooqpoc.asset.vo.AssetVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asset")
@Api(value = "asset", description = "Endpoint to test jOOQ with asset")
public class JooqAssetController {

    @Autowired
    private JooqAssetService assetService;

    @RequestMapping(
            value = "/wallet/{walletId}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    @ApiOperation(
            value = "Get an asset list from wallet",
            response = List.class)
    public ResponseEntity<List<AssetVO>> getAssets(@PathVariable("walletId") final Long walletId) {
        final List<AssetVO> vos = assetService.listAssetsByWalletId(walletId);

        if(vos != null && !vos.isEmpty()) {
            return new ResponseEntity(vos, HttpStatus.OK);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

}
