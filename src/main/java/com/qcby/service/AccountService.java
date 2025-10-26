package com.qcby.service;

import com.qcby.domain.Account;

import java.util.List;

public interface AccountService {
    // 查询所有
    public List<Account> findAll();

    public void save(Account account);
}