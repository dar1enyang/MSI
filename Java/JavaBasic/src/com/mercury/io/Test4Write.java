package com.mercury.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.mercury.beans.Macaron;

public class Test4Write {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("resources/test4.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			System.out.println("Test4 write start...");

			Macaron m = new Macaron("Caramel", "White", 2);
			oos.writeObject(m);

			System.out.println("Test4 write complete!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
