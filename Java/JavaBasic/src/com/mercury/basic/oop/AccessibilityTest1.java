package com.mercury.basic.oop;

public class AccessibilityTest1 {

	public static void main(String[] args) {
		// public / protected / package functions can be directly called within the same
		// package
		Accessibility.f1();
		Accessibility.f2();
		Accessibility.f3();

	}

}
