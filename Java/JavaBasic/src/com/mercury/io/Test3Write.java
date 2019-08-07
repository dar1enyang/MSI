package com.mercury.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.mercury.beans.Dog;

public class Test3Write {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("resources/test3.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			System.out.println("Test3 write start...");

			Dog dog = new Dog(12, "Lucky");
			Dog.color = "White";
			oos.writeObject(dog);

			System.out.println("Test3 write complete!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
