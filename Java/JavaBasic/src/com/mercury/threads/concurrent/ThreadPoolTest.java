package com.mercury.threads.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class ThreadPoolTest {
	public static class DummyTask implements Runnable {
		int id;
		public DummyTask(int id) {
			this.id = id;
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + "->" + id);
		}
	}

	public static void testThreadPool() {
		// Creating a thread pool
		// util class
		ExecutorService es = Executors.newCachedThreadPool(); // unlimited thread

		for (int i = 0; i < 100; i++) {
			es.submit(new DummyTask(i));
		}

		es.shutdown();
	}

	public static class SmartThread implements Callable<Integer> {
		int id;

		public SmartThread(int i) {
			super();
			this.id = i;
		}
		public static int factorial(int num) {
			if (num <= 1) {
				return num;
			}

			return num * factorial(num - 1);
		}


		@Override
		public Integer call() throws Exception {
			int res = factorial(id);
			return res;
		}
	}


	public static void testFuture() {
		ExecutorService es = Executors.newFixedThreadPool(5); // max 5 threads

		List<Future<Integer>> futures = new ArrayList<Future<Integer>>();
		for (int i = 0; i < 10; i++) {
			Future<Integer> f = es.submit(new SmartThread(i));
			futures.add(f);
		}

		for (Future<Integer> f : futures) {
			while(!f.isDone()) {
				// wait here, do nothing, until it is finish
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
		//testThreadPool();
		testFuture(); // the cost time is the longest task, using Future
	}
}