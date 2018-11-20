package com.bookSystem.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Create with IntelliJ IDEA
 * Author:zengmeng
 * Date:2018/11/18 0018
 * Time:下午 19:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"/spring-mybatis.xml"})
public class SignInServiceImpTest {

    @Autowired
    private SignInServiceImp signInServiceImp;

    @Test
    public void queryByphone() {
        System.out.println(signInServiceImp.queryByphone("15897858996"));
    }
}