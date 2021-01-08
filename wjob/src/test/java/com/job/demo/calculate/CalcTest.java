package com.job.demo.calculate;

import com.job.demo.enumtest.EnumTest;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

/**
 * Author: job
 * Date: 2019/7/2 16:15
 * 用于计算
 */
public class CalcTest {

    public static void main(String[] args) {

//        System.out.println(subtract("50495.19", "43937.16"));

//        dealPointNum();

        System.out.println("(0 % 200) = " + (0 % 200));
        System.out.println("(1 % 200) = " + (1 % 200));
        System.out.println("(2 % 200) = " + (2 % 200));
        System.out.println("(3 % 200) = " + (3 % 200));
        System.out.println("(4 % 200) = " + (4 % 200));
        System.out.println("(5 % 200) = " + (5 % 200));
        System.out.println("(10 % 200) = " + (10 % 200));
        System.out.println("(50 % 200) = " + (50 % 200));
        System.out.println("(100 % 200) = " + (100 % 200));
        System.out.println("(200 % 200) = " + (200 % 200));
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


    /**
     * 20201221
     * 因为浮点数的误差舍入导致，只有2的幂数可以使用简单的二进制表示法精确表示。
     * 不对应于2此方的数字必须四舍五入以适应有限数量的位，因此，0.1*3 是不等于 0.3 的。
     */
    private static  void dealPointNum(){

        System.out.println("(0.1 * 2 ) = " + (0.1 * 2));
        System.out.println("(0.1 * 2 == 0.2) = " + (0.1 * 2 == 0.2));
        System.out.println("(0.1 * 3 ) = " + (0.1 * 3));
        System.out.println("(0.1 * 3 == 0.3) = " + (0.1 * 3 == 0.3));

    }

}
