package com.mercury.practice;

import java.io.Serializable;

/**
 * @program: JavaBasic
 * @description: k
 * @author: yangdar1en
 * @create: 2019-08-13 13:29
 **/


class Food {
    Food() {
        System.out.println("1");
    }
}
class Fruit extends Food implements Serializable {
    Fruit() {
        System.out.println("2");
    }
}

public class Banana {
    int size = 42;

    public static void main(String[] args) {
        Banana b = new Banana();
   //     serializeBanana(b);
   //     b = deserializeBanana(b);
        System.out.println("restoreed" + b.size);
    }
}
