package com.job.demo.entity;

import lombok.Builder;

/**
 * Author: job
 * Date: 2020/7/22 10:58
 * Description:
 */
@Builder
public class Son extends Father{

    private String name;
    private Integer age;
    private Integer gender;//性别 0 男 / 1 女

}
