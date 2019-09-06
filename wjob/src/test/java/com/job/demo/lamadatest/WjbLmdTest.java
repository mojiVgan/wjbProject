package com.job.demo.lamadatest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Author: wangjiangbo
 * Date: 2019/8/30 13:54
 * Description:
 */
public class WjbLmdTest {

    public static void main(String[] args) {


        String[] arr = {"a","a","a","a","ab","b","b","b","b","b","d"};

        List <String> strList = Arrays.asList(arr);

        strList.stream().forEach(n -> System.out.println(n));//遍历

        System.out.println(strList);

        System.out.println(strList.stream().collect(Collectors.toSet()));//转成set
        System.out.println(strList);

        Optional.ofNullable(strList).isPresent();
        System.out.println();



    }
}
