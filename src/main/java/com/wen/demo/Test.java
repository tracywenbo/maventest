package com.wen.demo;

/**
 * @Ddescription: Test
 * @Ddate: 2019/8/12 0:39
 * @Author: WENBO
 * @Version: 1.0
 */
public class Test {
    public static void f1(){
        System.out.println("one");
        System.out.println("two");
        System.out.println("three");
    }
    public static void f2(){
        for (char c=0;c<128;c++){
            if (Character.isLowerCase(c)){
                System.out.println("value:"+(int)c+"character:"+c);
                f1();
            }
        }
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}
