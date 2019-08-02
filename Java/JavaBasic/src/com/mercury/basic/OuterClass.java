package com.mercury.basic;

public class OuterClass {

	public class InnerClass1 {

	}

	// static inner class can be treated as an outer class, same way to use
	public static class InnerClass2 {

	}

	public static void main(String[] args) {
		OuterClass.InnerClass2 ic2 = new OuterClass.InnerClass2();

		// Important!!!
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass1 ic1 = oc.new InnerClass1();

	}

}
