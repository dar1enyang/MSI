package com.mercury.practice;

/**
 * @program: JavaBasic
 * @description: Practice for question set 1
 * @author: yangdar1en
 * @create: 2019-08-10 21:13
 **/


class Egg2 {
    protected class Yolk {
        public Yolk() {
            System.out.println("Egg2.Yolk");
        }
        public void f() {
            System.out.println("Egg2.Yolk.f");
        }
    }
    private Yolk y = new Yolk();
    public Egg2() {
        System.out.println("New Egg2");
    }
    public void insertYolk(Yolk yy) {
        y = yy;
    }
    public void g() {
        y.f();
    }
}
class BigEgg2 extends Egg2 {
    public class Yolk extends Egg2.Yolk {
        public Yolk() {
            System.out.println("BigEgg2.Yolk");
        }
        @Override
        public void f() {
            System.out.println("BigEgg2.Yolk.f");
        }
    }
    public BigEgg2() {
        insertYolk(new Yolk());
    }
}


public class QuestionSet1 {


    public static void main(String[] args) {
        Egg2 egg2 = new BigEgg2();
        egg2.g();
    }

}
