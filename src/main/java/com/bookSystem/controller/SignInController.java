package com.bookSystem.controller;

import com.bookSystem.model.SignIn;
import com.bookSystem.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create with IntelliJ IDEA
 * Author:zengmeng
 * Date:2018/11/18 0018
 * Time:下午 19:53
 */
@Controller
public class SignInController {
    @Autowired
    private SignInService signInService;

    @RequestMapping("/admin.htm")
    public String index(){
        return  "hello";
    }

    @RequestMapping("/add.htm")
    @ResponseBody
    public SignIn queryByCityId(){
        return signInService.queryByphone("15897858996");
    }



}
