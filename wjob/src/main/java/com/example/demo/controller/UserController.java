/**
 * *************************************************************************
 * * Licensed Material - Property of ShangHai I2finance.                   *
 * * Copyright (c) ShangHai I2finance Inc. 2009-2017 All rights reserved.  *
 * * (<http://www.i2finance.net>)                                          *
 * *
 * * This file contains proprietary intellectual property of               *
 * * ShangHai I2finance Inc. The contents of and information in this file  *
 * * is only to be used in conjunction with a valid I2finance license      *
 * * as specified in the  I2finance  license agreement. All other use      *
 * * is prohibited.                                                        *
 * *************************************************************************
 */

package com.example.demo.controller;

import com.example.demo.entity.UserLoginInfo;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.naming.Name;

/**
 Author: job
 Date: 2019/3/8
 Time: 10:14
 */
@Controller
//@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/select")
    @ResponseBody
    public String select(){
        String name = "lisi";
        UserLoginInfo userLoginInfo = userService.selectName(name);
        return userLoginInfo.toString();
    }


}
