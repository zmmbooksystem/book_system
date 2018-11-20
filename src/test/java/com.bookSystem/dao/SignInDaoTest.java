package com.bookSystem.dao;

import com.bookSystem.model.SignIn;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Create with IntelliJ IDEA
 * Author:zengmeng
 * Date:2018/11/17 0017
 * Time:下午 16:51
 */
@RunWith(SpringJUnit4ClassRunner. class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class SignInDaoTest {
    @Resource
    private SignInDao m;
    @Test
    public void queryByphone() {
        String phone = "15897858996";
        SignIn signIn = m.queryByphone(phone);
        System.out.println(signIn.toString());

    }
}