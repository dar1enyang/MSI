package com.mercury.basic.constructors;

public class Test1 {
	// when any customized constructor is defined, default constructor will longer
	// exist
	// unless manually specify : constructor can be overloaded
	// cannot be directly called, only can be invoked by new
	// constructor are object level functions
	// constructor can be public / protected / package / private
	// all other functions except constructors have to have return type
	// constructors cannot be overridden

	public Test1(int x) {
		System.out.println(x);
	}

	private Test1() {
		System.out.println("Private");
	}

	public static class Par {
		public Par() {
			super();
			System.out.println("Creatinng Par..");
		}
	}

	public static class Sub extends Par {
		public Sub() {
			super();
			System.out.println("Creating sub..");
		}
	}

	public static void main(String[] args) {

	}

}
