package com.qcby.test;

import com.qcby.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * 测试Spring框架的环境
     */
    @Test
    public void run1(){
        // 创建工厂，加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 获取service，对象，调用方法
        AccountService service = (AccountService) ac.getBean("accountServiceImpl");
        service.findAll();
    }
}