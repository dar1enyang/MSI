package com.mercury.basic.interfaces;

// if an interface contains exact 1 abstract function(no matter how many static / default)
// this interface can be called Functional Interface
// Cannot create object from interface
@FunctionalInterface
public interface Plant {
	/*
	 * field: interface can only have public static final field
	 * 
	 * 
	 * 
	 * each function defined in interface, must only be public, and one of :
	 * 
	 * 1. abstract (default)
	 *
	 * 2. default
	 * 
	 * 3. static
	 */
	int X = 5;

	void grow();

	// static function is class level
	static void bar() {
		System.out.println("Bar");
	}

	// default is a keyword can only be used in interface
	// default function is object level
	// you can choose to override it or not
	default void goo() {

	}

	// a class(no matter abstract or not) can implements an interface
	public static class Tree implements Plant {
		@Override
		public void grow() {

		}

		@Override
		public void goo() {

		}
	}

	public static void main(String[] args) {
		System.out.println("123");
		Tree t = new Tree();

		t.goo();
		// t.bar();
		Plant.bar();

		System.out.println("******");

		Plant p = new Plant() {
			// anonymous implementation
			@Override
			public void grow() {

			}
		};

		// lambda expression : 1.8 feature
		Plant p2 = () -> System.out.println("growing");

	}
}
