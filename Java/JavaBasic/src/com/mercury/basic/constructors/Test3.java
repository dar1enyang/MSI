package com.mercury.basic.constructors;

public class Test3 {

	public static class Par {
		public Par() {
			System.out.println("Creating Par..");
			foo();
		}

		private void foo() {
			System.out.println("Par foo");
		}

		public static void bar() {
			System.out.println("Par Bar");
		}
	}

	public static class Sub extends Par {

		public Sub() {
			super();
			foo();
		}

		public void foo() {
			System.out.println("Sub foo");
		}

		public static void bar() {
			System.out.println("Sub Bar");
		}
	}

	public static void main(String[] args) {
		Par par = new Sub();
		Sub sub = (Sub) par;

		System.out.println("*****************");

		par.bar();
		sub.bar();

		System.out.println("*****************");
		par.foo();
		sub.foo();
	}

}
