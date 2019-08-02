package com.mercury.basic.oop;

public class Accessibility {
	/*
	 * static function cannot be overridden, since it is class level
	 * 
	 * call: only public can be called outside of same package public / protected /
	 * package can be called within the same package
	 * 
	 * override: static function cannot be overridden, since it is class level
	 * public and protected can both be overridden outside of the same package
	 * package level function can only be overridden within the same package
	 * 
	 * 
	 * protected function can be seen / visible from same package, or sub classes
	 */
	public static void f1() {
	}

	protected static void f2() {
	}

	static void f3() {
	}

	private static void f4() {
	}

	public void f5() {
	}

	protected void f6() {
	}

	void f7() {
	}

	private void f8() {
	}

}
