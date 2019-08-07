package com.mercury.beans;

import java.io.Serializable;

// Marker Interface
public class Dog implements Serializable {

	// only one static field can be serialized
	// specify, or JVM will generate one for this class
	private static final long serialVersionUID = 4704502011894853036L;

	// static field cannot be serialized, serialization is only serialize the
	// object, but not the class

	// class level
	public static String color = "Black";
	// to hide a field from serialization, use "transient"
	transient private int id;
	private String name;

	public Dog() {
		super();
	}

	public Dog(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {

		return "Dog [id: " + id + ", name: " + name + "] " + color;
	}

}
