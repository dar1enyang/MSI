package com.mercury.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.mercury.beans.Dog;

public class Test3Read {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("resources/test3.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			Dog d = (Dog) ois.readObject();
			System.out.println(d);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
