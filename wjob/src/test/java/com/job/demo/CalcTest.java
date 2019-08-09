package com.job.demo;

import com.job.demo.enumtest.EnumTest;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Author: job
 * Date: 2019/7/2 16:15
 * 用于计算
 */
public class CalcTest {

    public static void main(String[] args) {
        System.out.println(divide("47360","81238.03"));//亿*10000  平方米   桃源里卖8000都不亏
        System.out.println(divide("55930","91832.91"));
        System.out.println(divide("44000","24799.99")); System.out.print("8075");System.out.println();
        System.out.println(multiply("8075","2"));
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
    private static BigDecimal addExt(String nums){
        String[] numArr = nums.split(",");
        BigDecimal resultNum = BigDecimal.ZERO;
        for (int i = 0; i < numArr.length; i++) {
            Double aDouble = new Double(numArr[i]);
            BigDecimal bigDecimal = new BigDecimal(aDouble);
            resultNum = resultNum.add(bigDecimal);
            System.out.println("加完第"+ (i+1) +"个值, 结果是 " + resultNum);
        }
        return resultNum;
    }

    /**
     * 输入值 获取它的范围 eg: 87 --> 80到90范围(60-70,70-80,80-90,90-100)
     */
    private static String compareRange(Integer num){
        if (num != null){
            if (num >= 80){
                if (num >= 90){
                    return "0";
                }else{
                    return "1";
                }
            }else {
                if (num >= 70){
                    return "2";
                }else {
                    if (num >=60){
                        return "3";
                    }else {
                        return "4";
                    }
                }
            }
        }
        return "";//默认级别值
    }

}
