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

package com.example.demo.mapper;

import com.example.demo.entity.UserLoginInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 Date: 2019/3/8
 Time: 10:09
 Description: 
 */
@Mapper
public interface UserLoginInfoMapper {

    UserLoginInfo selectByName(String name);


//    @Bean(name = "sqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactoryBean() {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//
//        try {
//            return bean.getObject();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }

}
