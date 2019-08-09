package com.mercury.threads.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest {

    public static class DummyTest implements Runnable {
        int id;

        public DummyTest(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " -> " + id);
        }
    }

    public static void testThreadPool() {
        // create a thread pool
        // ExecutorService es = Executors.newCachedThreadPool();

        ExecutorService es = Executors.newFixedThreadPool(5);
        // max 5 threads
        for (int i = 0; i < 100; i++) {
            es.submit(new DummyTest(i));
        }

        es.shutdown();
    }

    public static class SmartThread implements Callable<Integer> {

        private int id;

        public SmartThread(int id) {
            super();
            this.id = id;
        }

        public static int factorial(int num) {
            if (num <= 1) {
                return 1;
            }
            return factorial(num - 1) * num;
        }

        @Override
        public Integer call() throws Exception {
            int res = factorial(id);
            return res;
        }

    }

    public static void testFuture() {
        ExecutorService es = Executors.newFixedThreadPool(5);

        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<Integer> f = es.submit(new SmartThread(i));
            futures.add(f);
        }

        for (Future<Integer> f : futures) {
            while (!f.isDone()) {
                // wait here, do nothing until calculation is done

            }
            try {
                System.out.println(f.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        es.shutdown();
    }

    public static void main(String[] args) {
        // testThreadPool();
        testFuture();
    }

}
