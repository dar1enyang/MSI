package com.mercury.basic.constructors;

public class Test2 {
	// the very first line of a constructor is always super(), no matter specify or
	// not
	// to choose any parent constructor to invoke, you need to provide corresponding
	// parameters
	public static class Par {
		public Par() {
			super();
			System.out.println("Creating Par..");
		}

		public Par(int x) {
			System.out.println("Creating Par.. " + x);
		}
	}

	public static class Sub extends Par {
		public Sub() {
			super();
			System.out.println("Creating sub..");
		}

		public Sub(int x) {
			super(x);
			System.out.println("Creating Sub.. " + x);
		}
	}

	public static void main(String[] args) {
		new Sub(3);
	}

}
