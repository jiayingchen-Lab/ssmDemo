package com.qcby.service.impl;

import com.qcby.dao.AccountDao;
import com.qcby.domain.Account;
import com.qcby.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        System.out.println("业务层：查询所有的账号...");
        return accountDao.findAll();
    }

    /**
     * 保存
     */
    public void save(Account account) {
        accountDao.save(account);
    }
}

