package com.mercury.basic;

/**
 * @program: JavaBasic
 * @description: Test singleton
 * @author: yangdar1en
 * @create: 2019-08-12 15:00
 **/

// Singleton
// If in 1 scope, 1 blueprint can have only 1 instance, then this blueprint is singleton
// Java Singleton
// If 1 class can only have 1 instance in 1 JVM, then this class is singleton




/*
 * 1. private constructor
 * 2. public static method to get this very instance, getInstance()
 * 3.
 *
 *
 * */



public class MySingleton {
    private static MySingleton ms = null;
    private MySingleton() {

    }
    synchronized public static MySingleton getInstance() {
        if (ms == null) {
            synchronized (MySingleton.class) {
                if (ms == null) {
                    MySingleton ms = new MySingleton();
                }
            }
        }
        return ms;
    }
    public static void main(String[] args) {
        MySingleton ms = MySingleton.getInstance();

    }
}
