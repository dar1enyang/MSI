package com.mercury.basic.collections;

import com.mercury.beans.Dog;
import com.mercury.beans.Macaron;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: JavaBasic
 * @description: Basic for Java collections
 * @author: yangdar1en
 * @create: 2019-08-08 16:32
 **/

public class CollectionBasic {
    public static void main(String[] args) {
        // Generic
        List<Integer> l = new ArrayList<>();
        List<Integer> l2 = new LinkedList<>();

        // Unboxing: covert its wrapper class object to primitive
        // Java include auto-boxing and auto-unboxing

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> synchronizedMap = Collections.synchronizedMap(map);

        Map<Integer, Integer> ht = new Hashtable<>();
        Map<Integer, Integer> chm = new ConcurrentHashMap<>();


        chm.put(1, 1);
        // Object needs to implement comparable

        Map<Integer, String> tm = new TreeMap<>();

        // Comparable

        Queue<Macaron> q = new PriorityQueue<Macaron>(3, (a, b) -> (
            a.getPrice() - b.getPrice()
        ));
        Comparator<Macaron> q2 = (a, b) -> (a.getPrice() - b.getPrice());


        Comparator<Macaron> cmp = new Comparator<Macaron>() {
            @Override
            public int compare(Macaron o1, Macaron o2) {

                return o1.getPrice() - o2.getPrice();
            }
        };
        Queue<Macaron> pq = new PriorityQueue<>(3, cmp);

    }
}
