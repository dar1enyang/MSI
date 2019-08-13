package com.mercury.basic.collections;

import java.util.*;
import java.util.function.Consumer;

/**
 * @program: JavaBasic
 * @description: Iteration Test
 * @author: yangdar1en
 * @create: 2019-08-12 10:56
 **/

public class IterationTest {
    public static void iterateArray() {
        int[] nums = {1, 2, 3, 4};

        // 1. traditional for loop / while
//        for (int i = 0; i < nums.length; i++) {
//            //     System.out.println(nums[i]);
//        }
//        // 2. enhanced for loop
//        for (int i : nums) {
//            //       System.out.println(i);
//        }

    }

    public static void iterateList() {
        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        // 1. traditional for loop / while
        for (int i = 0; i < nums.size(); i++) {
            //        System.out.println(nums.get(i));
        }

        // 2. enhanced for loop: use iterator internally, can be used on any Iterable object, or array[]ㄇ
        for (int num : nums) {
            //       System.out.println(num);
        }

        // 3. Iterator
        Iterator i = nums.iterator();
        // hasNext() only check if it can move forward, but does not move it
        // next(): will move the cursor 1 step forward, and return the element on the new position

        while (i.hasNext()) {
            //        System.out.println(i.next());
            //    nums.add(2);
        }
        // new CopyOnnWriteArrayList
        Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("---->" + integer);
            }
        };
        nums.forEach(c);
    }

    public static void iterateMap() {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 3);
        map.put(3, 5);
        // 1. use keySet
        Set<Integer> ks = map.keySet();
        for (int key : ks) {
            System.out.println(key);
        }
        // 2. convert the map to entrySet
        Set<Map.Entry<Integer, Integer>> es = map.entrySet();
        Iterator<Map.Entry<Integer, Integer>> i = es.iterator();

//        while (i.hasNext()) {
//            Map.Entry<Integer, Integer> me = i.next();
//            System.out.println(me.getKey() + " : " + me.getValue());
//        }
        es.forEach((e) -> System.out.println(e.getKey() + ":" + e.getValue()));

    }

    public static void main(String[] args) {
        //  iterateList();
        Set<Integer> nums = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        // nums.forEach(e -> System.out.println("--->" + e));
        //    nums.forEach((e) -> System.out.println(e));
        nums.forEach((c) -> System.out.println(c));

        iterateMap();

    }

}
