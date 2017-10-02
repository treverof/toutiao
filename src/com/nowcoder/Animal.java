package com.nowcoder;

public class Animal implements Talking {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void say() {
        System.out.println("This is Animal");
    }
}
