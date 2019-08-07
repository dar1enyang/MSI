package com.mercury.io;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Test2Write {

	public static void main(String[] args) {
		try (FileOutputStream fileOutputStream = new FileOutputStream("resources/test2.dat");
				BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);
				DataOutputStream dos = new DataOutputStream(bos)) {

			System.out.println("Test 2 write start...");

			dos.writeInt(-5);

			dos.writeDouble(3.141592654);
			dos.writeBoolean(true);

			System.out.println("Test 2 write complete!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
