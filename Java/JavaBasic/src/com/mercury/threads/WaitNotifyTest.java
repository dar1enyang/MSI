package com.mercury.threads;

public class WaitNotifyTest {

	public static class A extends Thread {

		Object x;
		int i;

		public void test() {
			synchronized (x) {
				System.out.println(Thread.currentThread().getName() + " test..." + i);

				if (i > 5) {
					try {
						x.wait(5000); // suspend self
						// wait for x, then x.wait()
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.println(Thread.currentThread().getName() + " " + i + " completed test!");

				x.notifyAll(); // only notify 1 thread back from waiting area
				// notfiyAll() will notify all threads back
			}
		}

		@Override
		public void run() {
			test();
		}
	}

	public static void main(String[] args) {

		Object x = new Object();
		// if you don't hold the lock, you can't wait
		// try {
		// x.wait();
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();

		a1.x = x;
		a2.x = x;
		a3.x = x;
		a1.i = 7;
		a2.i = 3;
		a3.i = 6;

		a1.start();
		a2.start();
		a3.start();
		// if a2 ends before a1 starts, a1 won't get notified to resume, a1 -> thread
		// hang up
	}

}
