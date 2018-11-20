package com.bookSystem.dao;

import com.bookSystem.model.SignIn;
import org.apache.ibatis.annotations.Param;

/**
 * Create with IntelliJ IDEA
 * Author:zengmeng
 * Date:2018/11/17 0017
 * Time:下午 16:22
 */
public interface SignInDao {
    SignIn queryByphone(@Param("PHONE") String phone);
}
