package com.job.demo.threadtest;

/**
 * Author: job
 * Date: 2020/1/8 14:42
 * Description:
 */
public class ThreaTest {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {

            }).start();
        }

       /* for (int i = 0; i < 10; i++) {
            RunnableTest runnableTest = new RunnableTest();
            new Thread(runnableTest).start();
        }*/
    }
}
