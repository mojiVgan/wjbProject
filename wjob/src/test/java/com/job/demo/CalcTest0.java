package com.job.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Author: job
 * Date: 2019/7/2 16:15
 * 用于计算
 */
public class CalcTest0 {

    public static void main(String[] args) {

        /**
         * 计算我的fund
         */
        //___start___
        String NewfundRate = "1.0325";
        String dreamFundRate = "1.04";
        String OldfundRate = "0.9935";
        String myLove = "8500";
        System.out.println(divide(myLove,OldfundRate).multiply(toBigDecimal(NewfundRate)).subtract(toBigDecimal(myLove)));
        System.out.println(divide(myLove,OldfundRate).multiply(toBigDecimal(dreamFundRate)).subtract(toBigDecimal(myLove)));
        //___end____
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
   /* private static BigDecimal multiplyAnOther(String num0){
        BigDecimal bigDecimal1 = new BigDecimal(num1);
        BigDecimal result = bigDecimal0.multiply(bigDecimal1);
        return result;
    }*/

    private static BigDecimal subtract(String num0, String num1){
        BigDecimal bigDecimal0 = new BigDecimal(num0);
        BigDecimal bigDecimal1 = new BigDecimal(num1);
        BigDecimal result = bigDecimal0.subtract(bigDecimal1);
        return result;
    }
    private static BigDecimal toBigDecimal(String num0){
        BigDecimal bigDecimal = new BigDecimal(num0);
        return bigDecimal;
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
