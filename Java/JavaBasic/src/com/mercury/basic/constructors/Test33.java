package com.mercury.basic.constructors;

import com.mercury.basic.constructors.Test3.Par;
import com.mercury.basic.constructors.Test3.Sub;

public class Test33 {

	public static void main(String[] args) {
		Par par = new Sub();
		Sub sub = (Sub) par;

		System.out.println("*****************");

		par.bar();
		sub.bar();

		System.out.println("*****************");
		// par.foo();
		sub.foo();

	}

}
