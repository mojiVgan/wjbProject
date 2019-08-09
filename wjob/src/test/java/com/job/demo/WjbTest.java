package com.job.demo;

import com.example.demo.entity.ScoreOrder;

import java.util.Objects;

/**
 * Author: wangjiangbo
 * Date: 2019/8/6 14:01
 * Description:
 */
public class WjbTest {

    public static void main(String[] args) {
        ScoreOrder scoreOrder = new ScoreOrder();
        Long scoreOrderId = scoreOrder.getId();
        if (Objects.nonNull(scoreOrderId)){
            System.out.println("....");
        }
        System.out.println(scoreOrderId);
    }
}
