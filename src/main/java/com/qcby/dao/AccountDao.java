package com.qcby.dao;

import com.qcby.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {
    @Select(value = "select * from account")
    public List<Account> findAll();

    @Insert("insert into account (name,money) values (#{name},#{money})")
    void save(Account account);
}