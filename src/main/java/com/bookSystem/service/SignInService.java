package com.bookSystem.service;

import com.bookSystem.model.SignIn;

/**
 * Create with IntelliJ IDEA
 * Author:zengmeng
 * Date:2018/11/18 0018
 * Time:下午 19:18
 */
public interface SignInService {
    SignIn queryByphone(String phone);
}
