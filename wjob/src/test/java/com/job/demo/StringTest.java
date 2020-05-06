package com.job.demo;

import org.apache.commons.lang3.StringUtils;

/**
 * Author: job
 * Date: 2019/7/5 10:13
 */
public class StringTest {
    public static void main(String[] args) {

     /*   System.out.println(StringUtils.isNotBlank(" "));
        System.out.println(StringUtils.isBlank(" "));
        System.out.println(StringUtils.isNotEmpty(" "));
        System.out.println(StringUtils.isEmpty(""));*/


    /**当 "=="运算符的两个操作数都是 包装器类型的引用，则是比较指向的是否是同一个对象，
     * 而如果其中有一个操作数是表达式（即包含算术运算）则比较的是数值（即会触发自动拆箱的过程）。
     * 另外，对于包装器类型，equals方法并不会进行类型转换。
     */
        Integer a = 1;
        Integer b = 2;
//        Integer c = 3;
//        Integer d = 3;
//        Integer e = 321;
//        Integer f = 321;
        Long g = 3L;
        Long h = 2L;



//        System.out.println(c==d);// true
//        System.out.println(e==f);// false
//        System.out.println(c==(a+b));// true
//        System.out.println(c.equals(a+b));// true
        System.out.println(g==(a+b));//true
        System.out.println(g.equals(a+b));//false   //Long对equals方法重写，只要不是Long，就返回false
        System.out.println(g.equals(a+h));//true  算数运算会自动升级
        System.out.println(g==(a+h));//true



      /**
       * == : 它的作用是判断两个对象的地址是不是相等。即，判断两个对象是不是同一个对象(基本数据类型==比较的是值，引用数据类型==比较的是内存地址)。
       * equals() : 它的作用也是判断两个对象是否相等。但它一般有两种使用情况：
       *            情况 1：类没有覆盖 equals() 方法。则通过 equals() 比较该类的两个对象时，等价于通过“==”比较这两个对象。
       *            情况 2：类覆盖了 equals() 方法。一般，我们都覆盖 equals() 方法来比较两个对象的内容是否相等；若它们的内容相等，则返回 true (即，认为这两个对象相等)。
       * */
       /* String a = new String("ab"); // a 为一个引用
        String b = new String("ab"); // b为另一个引用,对象的内容一样
        String aa = "ab"; // 放在常量池中
        String bb = "ab"; // 从常量池中查找
        if (aa == bb) // true
            System.out.println("aa==bb");
        if (a == b) // false，非同一对象
            System.out.println("a==b");
        if (a.equals(b)) // true
            System.out.println("aEQb");
        if (42 == 42.0) { // true
            System.out.println("true");
        }*/
    }

}
