package com.mercury.practice;

class Base {
	public static void A() {
		System.out.println("First A");
	}

	public void B() {
		System.out.println("First B");
	}
}

class Ext extends Base {
	public static void A() {
		System.out.println("Second A");
	}

	@Override
	public void B() {
		System.out.println("Second B");
	}
}

public class Test {

	public static void main(String[] args) {
		Base a = new Ext();
		a.B();
	}
}
