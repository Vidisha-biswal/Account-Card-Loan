package com.eazybytes.accounts.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController 
public class AccountsController {
    @GetMapping("/sayhello")
    public String sayHello() {
        return "helloOk";
    }
    
}
