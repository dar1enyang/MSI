package com.mercury.basic.oop;

public class ExtendsTest {

	// Static function cannot be overridden

	public static class Par {
		public void x() {
			System.out.println("x....");
		}

		public static void foo() {
			System.out.println("Par foo....");
		}

		public void bar() {
			// empty implementation
		}

		public void cal() {

		}

	}

	public static class Sub extends Par {

		@Override
		public void x() {
			System.out.println("xxxxxxxxx");
		}

		public void y() {
			System.out.println("y....");
		}

		// Cannot override static method
		public static void foo() {
			System.out.println("Sub foo....");
		}

		@Override
		public void cal() {

		}

	}

	public static void main(String[] args) {
		Par p = new Par();
		p.x();
		System.out.println("**************");

		Sub s = new Sub();
		s.y();
		s.x();
		System.out.println("**************");

		Par.foo(); // not p.foo();
		p.foo();
		s.foo();
		Sub.foo();
	}
}
