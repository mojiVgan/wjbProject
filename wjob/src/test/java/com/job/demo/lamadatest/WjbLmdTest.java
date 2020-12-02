package com.job.demo.lamadatest;

import com.job.demo.entity.Animal;
import com.job.demo.entity.Score;
import org.apache.commons.collections.CollectionUtils;

import java.math.BigDecimal;
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




       /* Optional<BigDecimal> reduce = extractCashList.stream().map(LifeCityPaymentRecord::getAmount).reduce(BigDecimal::add);
        if (reduce.isPresent()) {
            return reduce.get();
        }*/
       deal0();
//        deal2();
    }
    private static void deal0(){
        List<Animal> animalList = new ArrayList <>();
        animalList.add(new Animal("version",12.10));
        animalList.add(new Animal("version",12.19));
        animalList.add(new Animal("version1",6.28));
        System.out.println("-----------animalList.stream().collect(Collectors.toSet())");
        System.out.println(animalList.stream().collect(Collectors.toSet()));
        System.out.println("-----------animalList.stream().collect(Collectors.toList()");
        System.out.println(animalList.stream().collect(Collectors.toList()));
        System.out.println("animalList.stream().collect(Collectors.toMap(Animal::getName, Animal::getScore, (v1, v2) -> v2)) = " + animalList.stream().collect(Collectors.toMap(Animal::getName, Animal::getScore, (v1, v2) -> v2)));
        //下面这个非法  IllegalStateException
        System.out.println("animalList.stream().collect(Collectors.toMap(Animal::getName, Animal::getScore)) = " + animalList.stream().collect(Collectors.toMap(Animal::getName, Animal::getScore)));

    }
    private static void deal2(){
        //----20200826   reduce() 累加
        /*reduce()使用
        1.第一个参数是我们给出的初值，
        2.第二个参数是累加器，可以自己用实现接口完成想要的操作，这里使用Bigdecimal的add方法
        3.最后reduce会返回计算后的结果*/

//        BigDecimal qty = Order.getOrderItems().stream().map(p -> p.getProductQty()).reduce(BigDecimal.ZERO,BigDecimal::add);
        List<Score> scoreList = new ArrayList <>();
        scoreList.add(new Score("张三",new BigDecimal(20)));
        scoreList.add(new Score("李四",new BigDecimal(30)));
        scoreList.add(new Score("王五",new BigDecimal(50)));
        System.out.println("scoreList.stream().map(score -> score.getScoreNum()).reduce(BigDecimal::add) = "
                + scoreList.stream().map(score -> score.getScoreNum()).reduce(BigDecimal::add));
        System.out.println("scoreList.stream().map(score -> score.getScoreNum()).reduce(BigDecimal::add).isPresent() = " + scoreList.stream().map(score -> score.getScoreNum()).reduce(BigDecimal::add).isPresent());
        System.out.println("scoreList.stream().map(score -> score.getScoreNum()).reduce(BigDecimal::add).toString() = " + scoreList.stream().map(score -> score.getScoreNum()).reduce(BigDecimal::add).toString());
        System.out.println("scoreList.stream().map(score -> score.getScoreNum()).reduce(BigDecimal::add).get() = " + scoreList.stream().map(score -> score.getScoreNum()).reduce(BigDecimal::add).get());
        System.out.println("scoreList.stream().map(score -> score.getName()).collect(Collectors.toSet()) = " + scoreList.stream().map(score -> score.getName()).collect(Collectors.toSet()));
        scoreList.stream().forEach(score -> {
            System.out.println("score.toString() = " + score.toString());
        });
    }

    private static void deal1(){
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
        //判断是否有值   可以使用max.orElse(new Student())，当值为null时就使用给定值；也可以使用max.orElseGet(() -> new Student());这需要传入一个Supplier的lambda表达式。
        if (max.isPresent()){
            System.out.println("最大值");
            System.out.println(max.get());
            System.out.println(max);
        }
        if (min.isPresent()) {
            System.out.println("最小值");
            System.out.println(min.get());
        }
        //-----累加-------------

        Integer reduce = Stream.of(1, 2, 3, 4).reduce(0, (acc, x) -> acc+ x);
        System.out.println("累加 初始值为 0的累加器");
        System.out.println(reduce);
    }

    private static void dealMap(){
        //处理map.froeach()
        System.out.println("java8_Map.foreach()");
        Map<String,Integer> map = new HashMap();
        map.put("1",1);
        map.put("11",11);
        map.put("111",111);
        map.forEach((key , value) ->{
            System.out.println(key + " : "+ value);
        });
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
