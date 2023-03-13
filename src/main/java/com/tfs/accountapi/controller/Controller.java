package com.tfs.accountapi.controller;

import com.tfs.accountapi.model.Account;
import com.tfs.accountapi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {

    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts")
    public List<Account> getAccounts(){
        return accountService.getAccounts();
    }

}
