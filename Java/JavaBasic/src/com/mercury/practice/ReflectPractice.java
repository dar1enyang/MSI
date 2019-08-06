package com.mercury.practice;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReflectPractice {

	private String aaa;
	private Date date;
	private double ccc;
	public int notPrivate;

	public static void main(String[] args) {
		List<Field> fields = getPrivateFields(ReflectPractice.class);
		for (Field field : fields) {
			System.out.println(field.getName());
		}
	}

	public static List<Field> getPrivateFields(Class<?> theClass) {
		List<Field> privateFields = new ArrayList<>();

		Field[] fields = theClass.getDeclaredFields();

		for (Field field : fields) {
			if (Modifier.isPrivate(field.getModifiers())) {
				privateFields.add(field);
			}
		}
		return privateFields;
	}
}