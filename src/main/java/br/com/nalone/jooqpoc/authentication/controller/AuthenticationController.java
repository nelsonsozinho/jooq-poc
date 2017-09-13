package br.com.nalone.jooqpoc.authentication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
        value = "/wallet",
        method = RequestMethod.POST, produces = "application/json")
public class AuthenticationController {

}
