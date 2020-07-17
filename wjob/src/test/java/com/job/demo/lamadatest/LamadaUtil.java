package com.job.demo.lamadatest;

import com.job.demo.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Author: wangjiangbo
 * Date: 2020/5/11 17:37
 * Description:
 */
public class LamadaUtil {

    public static List<Animal> filter(List<Animal> animals, Predicate<Animal> predicate){
        List <Animal> animalList = new ArrayList <>();
        for (Animal animal : animals) {
            if (predicate.test(animal)){//函数方式过滤
                animalList.add(animal);
            }
        }
        return animalList;
    }

    public static<T,R> List<R> map(List<T> animals, Function<T,R> function){
        List <R> retList = new ArrayList <>(animals.size());
        for (T t : animals) {
           retList.add(function.apply(t));
        }
        return retList;
    }
}
