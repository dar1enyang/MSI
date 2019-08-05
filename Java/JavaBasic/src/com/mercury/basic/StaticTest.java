package com.mercury.basic;

import com.mercury.basic.constructors.Test1;

// static is a keyword, can be added in front of a function / block/ field / inner class
// static cannot be added in front of an outer class

// static : class level, will be loaded at the very beginning of the program run
// non-static : object level, only available when object is created, can only be called from an object
public class StaticTest {

	// field
	static int x = 5;

	public void foo() {
		System.out.println("foo");
	}

	public static void bar() {
		System.out.println("bar");

		StaticTest st = new StaticTest();
		st.foo();
	}

	public void cal() {
		System.out.println("Cal");
		this.foo(); // this: this object
	}

	public static void main(String[] args) {
		bar();
		Test1 t = new Test1(x);
	}

}
