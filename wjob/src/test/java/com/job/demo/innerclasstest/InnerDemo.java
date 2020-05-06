package com.job.demo.innerclasstest;

/**
 * Author: wangjiangbo
 * Date: 2020/5/6 12:00
 * Description:
 */
public class InnerDemo {

    public class OneDemo{

    }

    public static class TwoDemo{

    }

    public static void main(String[] args) {

        InnerDemo innerDemo = new InnerDemo();
        OneDemo oneDemo = innerDemo.new OneDemo();// 普通内部类

        TwoDemo twoDemo = new TwoDemo();//静态内部类
    }
}
