package com.mercury.practice;

/**
 * @program: JavaBasic
 * @description: eee
 * @author: yangdar1en
 * @create: 2019-08-13 14:09
 **/

public class TestThread {
    public static void main(String[] args) {

        new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }.start();

        System.out.println(Thread.currentThread().getName());
    }
}
