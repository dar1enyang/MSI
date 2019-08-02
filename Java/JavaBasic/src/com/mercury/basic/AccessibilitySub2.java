package com.mercury.basic;

import com.mercury.basic.oop.Accessibility;

public class AccessibilitySub2 extends Accessibility {

	// public / protected non-static functions can be overridden even not in
	// the same package
	@Override
	public void f5() {

	}

	@Override
	protected void f6() {

	}

	// @Override
	// void f7() {
	//
	// }

	// @Override
	// private void f8() {
	//
	// }

}
