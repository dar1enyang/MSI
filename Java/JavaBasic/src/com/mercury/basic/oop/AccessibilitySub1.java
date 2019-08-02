package com.mercury.basic.oop;

public class AccessibilitySub1 extends Accessibility {

	// public / protected / package non-static functions can be overridden within
	// the same package
	@Override
	public void f5() {

	}

	@Override
	protected void f6() {

	}

	@Override
	void f7() {

	}

	// @Override
	// private void f8() {
	//
	// }

}
