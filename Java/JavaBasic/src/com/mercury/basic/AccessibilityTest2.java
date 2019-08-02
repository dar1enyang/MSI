package com.mercury.basic;

import com.mercury.basic.oop.Accessibility;

public class AccessibilityTest2 {

	public static void main(String[] args) {
		// Only public function can be directly called outside the same package
		Accessibility.f1();
		// Accessibility.f2();
		// Accessibility.f3();

	}

}
