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

package com.example.demo.service;

import com.example.demo.entity.UserLoginInfo;
import com.example.demo.mapper.UserLoginInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 Author: job
 Date: 2019/3/8
 Time: 10:12
 */
@Service("userService")
public class UserService {

    @Autowired
    private UserLoginInfoMapper userLoginInfoMapper;

    public UserLoginInfo selectName(String name){
        return userLoginInfoMapper.selectByName(name);
    }
}
