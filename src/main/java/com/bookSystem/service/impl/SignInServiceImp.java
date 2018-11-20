package com.bookSystem.service.impl;

import com.bookSystem.dao.SignInDao;
import com.bookSystem.model.SignIn;
import  com.bookSystem.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create with IntelliJ IDEA
 * Author:zengmeng
 * Date:2018/11/18 0018
 * Time:下午 19:19
 */
@Service
public class SignInServiceImp implements SignInService {

    @Autowired
    private SignInDao signInDao;


    @Override
    public SignIn queryByphone(String phone) {
        return signInDao.queryByphone(phone);
    }
}
