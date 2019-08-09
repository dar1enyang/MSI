package com.mercury.threads.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

	public static class MyThread extends Thread {
		int id;
		Lock l1, l2;

		@Override
		public void run() {
			if (l1.tryLock()) {
				System.out.println(id + " get " + l1);

				// ensure there's a deadlock

				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (l2.tryLock()) {
					System.out.println(id + " get " + l2);

					l2.unlock();
				} else {
					System.out.println(id + " cannot get " + l2);
				}

				l1.unlock();
			} else {
				System.out.println(id + " cannot get " + l1);
			}
		}
	}

	public static void main(String[] args) {

		// ReentrantLock, ReadWriteLock
		Lock l1 = new ReentrantLock();
		Lock l2 = new ReentrantLock();

		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();

		mt1.id = 1;
		mt2.id = 2;

		mt1.l1 = l1;
		mt2.l1 = l2;

		mt1.l2 = l2;
		mt2.l2 = l1;

		mt1.start();
		mt2.start();

	}

}
