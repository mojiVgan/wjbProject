package com.job.demo.lomboktest;

import lombok.Getter;
import lombok.Setter;

/**
 * Author: job
 * Date: 2019/12/3 10:13
 * Description:
 */
@Getter@Setter
public class LombokTest {

    private String name;
    private int age;
    private boolean female; // boolean
    private Boolean male; // Boolean


    public static void main(String[] args) {
        LombokTest lombokTest = new LombokTest();
        System.out.println(lombokTest.isFemale());
        System.out.println(lombokTest.getMale());
        System.out.println(lombokTest.getAge());
    }
}
