package com.mercury.beans;

/**
 * @program: jdbcDemoJ
 * @description: User
 * @author: yangdar1en
 * @create: 2019-08-14 14:13
 **/

public class User {
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User input = (User) obj;
            if (name.equals(input.getName()) && age == input.getAge()) {
                return true;
            }
        }

        return false;
    }
}
