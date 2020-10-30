package com.job.demo.lamadatest;

import com.job.demo.entity.Animal;
import org.apache.commons.collections.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Author: job
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
        System.out.println("--------------------");

        List<String> collect = strList.stream().map(String::toUpperCase).collect(Collectors.toList());// map的使用
        List <String> collect1 = strList.stream().map(str -> str.toUpperCase() ).collect(Collectors.toList());// ->  和  ::  的使用
        System.out.println(collect);
        System.out.println(strList);
        System.out.println(collect1);

        Optional.ofNullable(strList).isPresent();
        System.out.println();



        //----20200511 Predicate
        List <Animal> animals = new ArrayList <>();
        animals = initAnimal(animals);
        animals = LamadaUtil.filter(animals, animal ->animal.getScore() > 50);
        System.out.println("函数式表达式过滤的用法 ： " );
        System.out.println(animals);
        //----

        //--20200512 Funcation
        animals = initAnimal(animals);
        List <String> map = LamadaUtil.map(animals, animal -> animal.getName());
        System.out.println("函数表达式转换用法 ： ");
        System.out.println(map);
        animals = initAnimal(animals);
        animals = LamadaUtil.map(animals, animal -> new Animal(animal.getName().toUpperCase(), animal.getScore()));
        System.out.println("函数表达式转换用法 name转换为大写： ");
        System.out.println(animals);
        //----20200826
        /*reduce()使用
        1.第一个参数是我们给出的初值，
        2.第二个参数是累加器，可以自己用实现接口完成想要的操作，这里使用Bigdecimal的add方法
        3.最后reduce会返回计算后的结果*/

//        BigDecimal qty = Order.getOrderItems().stream().map(p -> p.getProductQty()).reduce(BigDecimal.ZERO,BigDecimal::add);

        //---------------------- flatMap  结合streamof  将两个 list合并成一个list
        animals = initAnimal(animals);
        List<Animal> animallist = new ArrayList<>();
        animallist.add(new Animal("wuwu",57));
        animallist.add(new Animal("liuliu",67));
        List <Animal> collect2 = Stream.of(animals, animallist).flatMap(animals1 -> animals1.stream()).collect(Collectors.toList());
        System.out.println("flatMap  结合streamof  将两个 list合并成一个list");
        System.out.println(collect2);
        //--------------------- 求最大值 最小值
        animals = initAnimal(animals);
        Optional <Animal> max = animals.stream().max(Comparator.comparing(animal -> animal.getScore()));
        Optional <Animal> min = animals.stream().min(Comparator.comparing(animal -> animal.getScore()));
        //判断是否有值
        if (max.isPresent()){
            System.out.println("最大值");
            System.out.println(max);
        }
        if (min.isPresent()) {
            System.out.println("最小值");
            System.out.println(min);
        }

    }


    private static List<Animal> initAnimal(List<Animal> animals){
        if (CollectionUtils.isEmpty(animals)){
            animals = new ArrayList <>();
        }else {
            animals.clear();
        }
        animals.add(new Animal("yiyi",25));
        animals.add(new Animal("erer",55));
        animals.add(new Animal("sansan",75));
        animals.add(new Animal("sisi",65));
        return animals;
    }
}
