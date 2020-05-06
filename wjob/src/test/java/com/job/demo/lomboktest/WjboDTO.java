package com.job.demo.lomboktest;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: wangjiangbo
 * Date: 2020/3/30 17:39
 * Description:
 */
@Data
@Builder
public class WjboDTO {
    private String name;
    private Integer age;

    public static void main(String[] args) {
        List <WjboDTO> list = new ArrayList();
        list.add(new WjboDTO("11",1));
        list.add(new WjboDTO("22",2));
        list.add(new WjboDTO("33",3));
        System.out.println(list.stream().mapToInt(WjboDTO::getAge).sum());
    }
}
