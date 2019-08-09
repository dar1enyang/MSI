package com.mercury.threads;

public class DeadLockTest {

    public static class MyThread extends Thread {
        int id;
        Object l1, l2;

        @Override
        public void run() {
            synchronized (l1) {
                System.out.println(id + " got " + l1);

                // Can't use Throws
                // Because only methods can Throws, but it's override
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                synchronized (l2) {
                    System.out.println(id + " got" + l2);
                }
            }
        }
    }

    public static void main(String[] args) {
        Object l1 = new Object();
        Object l2 = new Object();

        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.id = 1;
        mt2.id = 2;

        mt1.l1 = l1;
        mt1.l2 = l2;

        mt2.l1 = l2;
        mt2.l2 = l1;

        mt1.start();
        mt2.start();

    }

}
