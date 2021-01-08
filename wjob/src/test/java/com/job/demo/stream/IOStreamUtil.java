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

package com.job.demo.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 Created with IntelliJ IDEA.
 Author: 60598
 Date: 2021/1/7
 Time: 14:10
 Description: 获取编码格式
 */
public class IOStreamUtil {

    public static void main(String[] args) {

        int code = 0;
        String ecode = "";
        BufferedInputStream  bufferedInputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream("fileName"));
            code = (bufferedInputStream.read() << 8) + bufferedInputStream.read();
            ecode = "";
        switch (code){
            case 0xefbb:
                ecode = "UTFF-8";
                break;
            case 0xfffe:
                ecode = "Unicode";
                break;
            case 0xfeff:
                ecode = "UTF-16BE";
                break;
            default:
                ecode = "GBK";
                break;
        }
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }

}
