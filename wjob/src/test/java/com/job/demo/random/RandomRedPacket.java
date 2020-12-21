/**
 * *************************************************************************
 * * Licensed Material - Property of ShangHai I2finance.                   *
 * * Copyright (c) ShangHai I2finance Inc. 2009-2017 All rights reserved.  *
 * * (<http://www.i2finance.net>)                                          *
 * *
 * * This file contains proprietary intellectual property of               *
 * * ShangHai I2finance Inc. The contents of and information in this file  *
 * * is only to be used in conjunction with a valid I2finance license      *
 * * as specified in the  I2finance  license agreement. All other use      *
 * * is prohibited.                                                        *
 * *************************************************************************
 */

package com.job.demo.random;

import java.util.Random;

/**
 Created with IntelliJ IDEA.
 Date: 2020/12/20
 Time: 15:31
 description: 这是一个 红包demo
              维护剩余总金额和总数量，分配时，如果数量等于1，直接返回总金额，如果大于1，则计算平均值，
        并设定随机最大值为平均值的两倍，然后取一个随机值，如果随机值小于0.01，则为0.01.这个随机值就是下一个红包的金额。
 */
public class RandomRedPacket {
    private int leftMoney;
    private int leftNum;
    private Random rnd;

    public RandomRedPacket(int total, int num) {
        this.leftMoney = total;
        this.leftNum = num;
        this.rnd = new Random();
    }
    public synchronized int nextMoney() {
        if (this.leftNum <= 0) {
            throw new IllegalStateException("抢光了");
        }
        if (this.leftNum == 1) {
            return this.leftMoney;
        }
        double max = this.leftMoney / this.leftNum * 2d;
        int money = (int) (rnd.nextDouble() * max);
        money = Math.max(1, money);
        this.leftMoney -= money;
        this.leftNum--;
        return money;

    }


    public static void main(String[] args) {
        RandomRedPacket randomRedPacket = new RandomRedPacket(1000, 10);
        for (int i = 0; i < 10; i++) {
            System.out.println(randomRedPacket.nextMoney());
        }
    }
}
