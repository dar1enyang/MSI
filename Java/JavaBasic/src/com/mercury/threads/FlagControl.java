package com.mercury.threads;

public class FlagControl {
	static boolean flag = false;

	public static void main(String[] args) {
		new Thread(() -> {
			if (!flag) {
				System.out.println(123);
				flag = true;
			}

		}).start();

		while (flag) {
			System.out.println(456);
			flag = false;
		}
	}
}
