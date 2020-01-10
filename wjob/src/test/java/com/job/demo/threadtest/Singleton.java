package com.job.demo.threadtest;

/**
 * Author: wangjiangbo
 * Date: 2020/1/10 14:53
 * Description:
 */
public class Singleton {
    private static volatile Singleton singleton;//volatile 为了保证创建对象的原子性. 避免在下面的锁里面创建对象整个流程没有完成的时候, 判空成功从而重复的创建对象
    private Singleton(){}
    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){//两个线程同时访问,第二个线程在第一个执行完创建对象的操作之后, 会进入锁里面,判空可以避免重新创建对象
                    return new Singleton();
                }
            }
        }
        return singleton;
    }
}
