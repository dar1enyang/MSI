package com.mercury.threads;

public class SyncTest {
	// synchronized (sync), can be used in front of a function, or a code block
	// the particular code can only be executed one by one

	// In java, every class and every object can be used as a lock
	// to execute a synchronized function, the thread has to acquire the
	// lock(wherever the function is defined from)
	synchronized public static void F1() {

		System.out.println(Thread.currentThread().getName() + " F1...");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " completed F1!");
	}

	synchronized public static void F2() {
		System.out.println(Thread.currentThread().getName() + " F2...");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " completed F2!");
	}

	synchronized public void F3() {
		System.out.println(Thread.currentThread().getName() + " F3...");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " completed F3!");
	}

	public void F4() {
		System.out.println(Thread.currentThread().getName() + " F4...");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " completed F4!");
	}

	public void F5() {
		System.out.println("************");
		synchronized (SyncTest.class) {
			System.out.println(Thread.currentThread().getName() + " F5...");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + " completed F5!");
		}

	}

	public static class MyThread implements Runnable {
		SyncTest st;

		@Override
		public void run() {
			st.F1();

		}

	}

	public static void main(String[] args) {

		// MyThread mt = new MyThread();
		// new Thread(mt).start();
		// // new Thread(() -> System.out.println("Thread starts")).start();
		// MyThread mt2 = new MyThread();
		// new Thread(mt2).start();
		// F1();

		// for (int i = 0; i < 10; i++) {
		// MyThread mt = new MyThread();
		// new Thread(mt).start();
		// }
		// F1();

		SyncTest st = new SyncTest();

		MyThread mt = new MyThread();
		mt.st = st;

		new Thread(mt).start();

		st.F5();
	}

}
