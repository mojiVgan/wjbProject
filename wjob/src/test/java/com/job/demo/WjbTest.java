package com.job.demo;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;


/**
 * Author: job
 * Date: 2019/8/6 14:01
 * Description:
 */
@SpringBootTest
public class WjbTest {

    public static void main(String[] args) throws Exception{

        System.out.println("(0.1 * 2 ) = " + (0.1 * 2));
        System.out.println("(0.1 * 2 == 0.2) = " + (0.1 * 2 == 0.2));
        System.out.println("(0.1 * 3 ) = " + (0.1 * 3));
        System.out.println("(0.1 * 3 == 0.3) = " + (0.1 * 3 == 0.3));
    }
}
