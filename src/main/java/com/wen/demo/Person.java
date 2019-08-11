package com.wen.demo;

import lombok.Data;

/**
 * @Ddescription: Person
 * @Ddate: 2019/8/12 1:28
 * @Author: WENBO
 * @Version: 1.0
 */
@Data
public class Person {
    private int id;
    private String name;
    private String sex;
    private float height;

    public Person() {
    }
}
