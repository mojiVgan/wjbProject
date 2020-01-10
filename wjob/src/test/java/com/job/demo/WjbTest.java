package com.job.demo;

import org.apache.commons.lang3.StringUtils;


/**
 * Author: wangjiangbo
 * Date: 2019/8/6 14:01
 * Description:
 */
public class WjbTest {

    public static void main(String[] args) throws Exception{

        System.out.println(StringUtils.isNotBlank(""));
        System.out.println(StringUtils.isNoneBlank(""));
        System.out.println(StringUtils.isNotBlank(" "));

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("1");
        System.out.println(stringBuffer);

        String str = "6666";
        System.out.println(str + "");

    }
}
