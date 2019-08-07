package com.mercury.io;

import java.io.FileOutputStream;

public class Test1Write {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("resources/test1.dat")) {
			System.out.println("Test1 write start....");

			int[] nums = { -1, 2, 3, 4, 9186214 };
			for (int i : nums) {
				fos.write(i);
			}

			System.out.println("Test1 write complete!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
