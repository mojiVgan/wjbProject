package com.job.demo;

import org.apache.commons.lang3.StringUtils;

/**
 * Author: job
 * Date: 2019/7/5 10:13
 */
public class StringTest {
    public static void main(String[] args) {

        System.out.println(StringUtils.isNotBlank(" "));
        System.out.println(StringUtils.isBlank(" "));
        System.out.println(StringUtils.isNotEmpty(" "));
        System.out.println(StringUtils.isEmpty(""));
    }

}
