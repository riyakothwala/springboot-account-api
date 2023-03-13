package com.tfs.accountapi.impl;

import com.tfs.accountapi.model.Account;
import com.tfs.accountapi.service.AccountService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class AccountServiceImpl implements AccountService {

    List<Account> accountList= Arrays.asList(new Account(100),new Account(101),new Account(102),new Account(104));

    @Override
    public List<Account> getAccounts() {
        return accountList;
    }
}
