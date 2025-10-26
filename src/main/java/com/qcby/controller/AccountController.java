package com.qcby.controller;

import com.qcby.domain.Account;
import com.qcby.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    // 注入
    @Autowired
    private AccountService accountService;
    /**
     * 查询所有
     */
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() {
        System.out.println("表现层：查询所有的账号...");

        // 调用service对象的方法
        List<Account> list = accountService.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("suc");
        return mv;
    }

    /**
     * 保存
     */
    @RequestMapping("/save.do")
    public String save(Account account){
        // 调用service，保存数据
        accountService.save(account);
        return "suc";
    }
}