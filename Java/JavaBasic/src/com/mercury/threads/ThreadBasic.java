package com.mercury.threads;

public class ThreadBasic {

	// Multi-Thread could raise up the performance of the CPU
	// May have risk of conflict on the shared resource

	// Strategy to solve shared resource conflict
	// 1. Synchronized
	// 2. Copy of shared resource <- Less interviews asked
	// 2.5 Immutable

	public static void test() {
		System.out.println(Thread.currentThread().getName() + " testing...");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " completed test!");
	}

	// To start a thread in Java
	// Way 1: extend from Thread class
	// 1. Create a class extends from Thread
	// 2. Override run() function to define the logic for this thread
	// 3. Create an object from this class
	// 4. call start() function from this object, to start a new thread to execute
	// run()

	// Way 2: implement Runnable interface
	// 1. Create a class implements Runnable
	// 2. Override run() function to define the logic for this thread
	// 3. Create an object from this class, eg called obj
	// 4. new Thread(obj).start();

	public static class MyThread extends Thread {

		@Override
		public void run() {
			// define the logic for this thread in here
			test();
		}
	}

	public static void main(String[] args) {
		System.out.println("*******************");

		MyThread myThread = new MyThread();
		myThread.setDaemon(true);
		// make this thread is a daemon thread
		myThread.start();
		// create a new thread to execute run()
		// myThread.run();

		// test();
		System.out.println("**********************");
		//
		Runnable r = () -> System.out.println(123);
		Thread thread = new Thread(r);
		//
		Thread t = new Thread(() -> {
			System.out.println(123);
		});
		t.start();
		System.out.println("main completed!");

		// Daemon Thread: JVM will shut down if there has only Daemon Thread exist
		// JVM won't shut down if any non-daemon thread still running
		// GC is a daemon thread
	}

}
