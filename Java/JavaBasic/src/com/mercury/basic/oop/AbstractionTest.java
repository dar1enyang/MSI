package com.mercury.basic.oop;

public class AbstractionTest {

	abstract public static class Par {

		// concrete function : can exist in concrete class / abstract class
		// abstract function has no body
		// abstract function : can only exist in abstract function / interface

		// static function will be loaded at very beginning and cannot be overridden
		// so static function cannot be abstract

		// abstract static public void bar();
	}

	public static class Sub extends Par {

	}

	abstract public static class GrandChild extends Sub {

	}

	public static void main(String[] args) {
		Sub s = new Sub();
	}

}
