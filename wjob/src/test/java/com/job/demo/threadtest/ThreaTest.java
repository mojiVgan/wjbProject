package com.job.demo.threadtest;

/**
 * Author: wangjiangbo
 * Date: 2020/1/8 14:42
 * Description:
 */
public class ThreaTest {

    public static void main(String[] args) {
        RunnableTest runnableTest = new RunnableTest();
        Thread thread = new Thread(runnableTest);
        thread.start();
    }
}
