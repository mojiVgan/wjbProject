package com.job.demo.threadtest;

/**
 * Author: job
 * Date: 2020/1/8 14:42
 * Description:
 */
public class RunnableTest implements Runnable {
    @Override
    public void run() {
        System.out.println("线程名字" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        //java8 流   可以省略RunnableTest
        new Thread(()-> System.out.println(Thread.currentThread().getName())).start();

    }
}
