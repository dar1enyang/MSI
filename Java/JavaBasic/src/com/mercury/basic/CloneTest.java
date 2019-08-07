package com.mercury.basic;

import java.util.ArrayList;
import java.util.List;

import com.mercury.beans.RedBean;

public class CloneTest {

	public static void main(String[] args) {
		List<String> info = new ArrayList<>();
		info.add("Hard Core");

		RedBean rb1 = new RedBean("China", 1000, info);
		RedBean rb2 = rb1.clone();

		System.out.println(rb1);
		System.out.println(rb2);
		System.out.println(rb1 == rb2);

		System.out.println(rb1.getSource() == rb2.getSource());
		System.out.println(rb1.getInfo() == rb2.getInfo());
	}

}
