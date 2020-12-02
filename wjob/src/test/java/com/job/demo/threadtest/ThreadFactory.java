package com.job.demo.threadtest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Author: wangjiangbo
 * Date: 2020/11/19 15:44
 * Description:
 */
public class ThreadFactory {

    public static ExecutorService newFixedThreadPool(int nThreads) {
        return new ThreadPoolExecutor(nThreads, nThreads,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue <Runnable>());
    }

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor =(ThreadPoolExecutor) newFixedThreadPool(10);
        for (int i = 0; i < 50; i++) {
            RunnableTest runnableTest = new RunnableTest();
            threadPoolExecutor.execute(runnableTest);

        }

    }
}
