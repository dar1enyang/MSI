package com.mercury.basic;

import java.io.FileOutputStream;

public class ExceptionHandling {
	// Throwable will cause the thread jump out of the execution of the current
	// block
	// (function/try/code block)

	// functions that declared as throws means, may throws x= xxx
	public static void testTHrowable() throws Throwable {
		// throw a Throwable object

		// try-catch block is able to handle the issue right here, right now
		// then the remaining code will be able to continue
		try {
			System.out.println(1);
			throw new Exception();

		} catch (Exception e) {
			System.out.println(2);
			e.printStackTrace();
			System.out.println(3);
		}

		throw new Throwable();
		// System.out.println(4);
	}

	// unchecked
	public static void testError() {
		throw new Error();
	}

	// exception: checked
	// RuntimeException: unchecked
	public static void testException() {
		System.out.println(1);

		throw new NullPointerException();

	}

	public static void testTryCatchFinally() {
		// multi catch for multi exception
		// try {
		//
		// FileOutputStream fileOutputStream = new FileOutputStream("c:/");
		// } catch (NullPointerException e) {
		// // only Throwable is able to be caught
		// } catch (FileNotFoundException ee) {
		// // normally, do not eat the exception
		// }
		//
		// try {
		//
		// FileOutputStream fileOutputStream = new FileOutputStream("c:/");
		// } catch (NullPointerException | FileNotFoundException ee) {
		// // only Throwable is able to be caught
		// }

		// try-finally
		// try-catch-finally
		// finally block will always be executed (after the try-catch), unless JVM shut
		// down
		// finally : normally used for close resources.
		try {
			System.out.println(1);
			if (true) {
				throw new Exception();
			}
			System.out.println(2);
		} catch (Exception e) {
			System.out.println(3);
			e.printStackTrace();
			try {
				throw new Exception();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			System.out.println(4);

			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(5);

	}

	public static void testTryWithResource() {
		// Before Java 7
		// FileOutputStream fos1 = null;
		// FileOutputStream fos2 = null;
		// FileOutputStream fos3 = null;
		// try {
		// fos1 = new FileOutputStream("c:/123.txt");
		// fos2 = new FileOutputStream("c:/123.txt");
		// fos3 = new FileOutputStream("c:/123.txt");
		// // logic
		//
		// } catch (FileNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } finally {
		//
		// try {
		// fos1.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// try {
		// fos2.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// try {
		// fos3.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }

		// After
		// as long as object in try () is a AutoCloseable
		try (AutoCloseable mys = () -> System.out.println("Closing My Resource....");
				// MyResource mys2 = new MyResource();
				FileOutputStream fos1 = new FileOutputStream("c:123");
				FileOutputStream fos2 = new FileOutputStream("c:456");
				FileOutputStream fos3 = new FileOutputStream("c:789");) {
			// logic

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public static class MyResource implements AutoCloseable {
	//
	// @Override
	// public void close() throws Exception {
	// System.out.println("Closing My Resource....");
	//
	// }
	//
	// }

	public static void main(String[] args) throws Throwable {
		// System.out.println(0);
		// testTHrowable();
		// System.out.println(5);
		// testError();
		// testException();
		// testTryCatchFinally();
		testTryWithResource();
	}

}
