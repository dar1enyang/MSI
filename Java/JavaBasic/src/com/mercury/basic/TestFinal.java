package com.mercury.basic;

// final is a keyword, can be added in front of a class / function / variable
// 1. final class cannot be extended (same as final all non-private non-static functions)
// 2. final function cannot be overridden
// 3. final variable cannot be changed / reassigned (primitive type cannot be changed, object type cannot be reassigned)
public class TestFinal {

	public static class User {
		String name;
		int age;

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

		public User(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

	}
	// How many ways to provide value to a static field ?

	// 1. assign the value when define
	static final int a = 8;

	// 2. assign the value in static block
	static final int b;
	static {
		// static block is class level, will be executed when class is loaded
		b = 2;
	}
	// how many ways to provide value for a non-static field?

	// 1. assign value when define
	final int c = 23;
	final int d;
	// 2. assign value in block (non-static)
	{
		// block is object level, will be executed when object created
		d = 39;
	}

	// 3. assign value in all constructors
	final int e;

	public TestFinal() {
		super();
		e = 321;
	}

	public TestFinal(int e) {
		super();
		this.e = e;
	}

	public static void main(String[] args) {
		final User u = new User("Bob", 15);

		u.age = 1;

	}
}
