package com.mercury.basic.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

/**
 * @program: JavaBasic
 * @description: New features introduced in Java 8
 * @author: yangdar1en
 * @create: 2019-08-12 14:18
 **/

public class Java8Test {
    public static void main(String[] args) {
        // java.util.function
        Supplier s; // T get()
        Consumer c; // void accept(T t)
        Function f; // R apply(T t)
        // foresee
        Predicate p; // boolean test(T t)
        BiConsumer bc;

        // Stream API
        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        // 1. convert the collection to a stream (stream(), parallelStream())
        // 2. define all operations
        // 3. collect the result
        List<Integer> res = nums.stream()
                .filter(e -> {
                    return (e % 2) == 0 ? true : false;
                })
                .map(e -> e * 10)
                .collect(Collectors.toList());

        System.out.println(nums);
        System.out.println(res);

        // benefits: dont need to implement thread yourself, parallelStream can do it for you.

    }
}
