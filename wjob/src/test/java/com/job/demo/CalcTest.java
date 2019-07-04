package com.job.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created with IntelliJ IDEA.
 * Author: job
 * Date: 2019/7/2 16:15
 * 用于计算
 */
public class CalcTest {

    public static void main(String[] args) {

        System.out.println(new Long(100000L));
        System.out.println(new Float(100000));
        System.out.println(new Double(100000));

    }

    private static BigDecimal add(String num0, String num1){
        BigDecimal bigDecimal0 = new BigDecimal(num0);
        BigDecimal bigDecimal1 = new BigDecimal(num1);
        BigDecimal result = bigDecimal0.add(bigDecimal1);
        return result;
    }

    //注意避免无限循环
    private static BigDecimal divide(String num0, String num1){
        BigDecimal bigDecimal0 = new BigDecimal(num0);
        BigDecimal bigDecimal1 = new BigDecimal(num1);
        BigDecimal result = bigDecimal0.divide(bigDecimal1,BigDecimal.ROUND_FLOOR,RoundingMode.CEILING );
        return result;
    }

    private static BigDecimal multiply(String num0, String num1){
        BigDecimal bigDecimal0 = new BigDecimal(num0);
        BigDecimal bigDecimal1 = new BigDecimal(num1);
        BigDecimal result = bigDecimal0.multiply(bigDecimal1);
        return result;
    }

    //多个数字累加
    private static BigDecimal adds(String nums){
        String[] numArr = nums.split(",");
        BigDecimal resultNum = BigDecimal.ZERO;
        for (int i = 0; i < numArr.length; i++) {
            Double aDouble = new Double(numArr[i]);
            BigDecimal bigDecimal = new BigDecimal(aDouble);
            resultNum = resultNum.add(bigDecimal);
            System.out.println("第"+ (i+1) +"个月" + resultNum);
        }

        return resultNum;
    }

}
