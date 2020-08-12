package com.job.demo.singleton;


/**
 * Created by job on 2020/8/12
 * 枚举 就是这种写法吧 ..
 */
public enum SingletonEnum {
    INSTANCE;
    private SingletonEnum(){}

    public static SingletonEnum getInstance(){
        return SingletonEnum.INSTANCE;
    }
}
