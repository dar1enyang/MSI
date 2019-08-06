
//Created:	2019/08/05

package com.mercury.beans;

import java.lang.reflect.Field;

public final class Computer {
	/*
	 * java bean - POJO bean (plain old java object)
	 * 
	 * 1. private all fields
	 * 
	 * 2. provide constructors
	 * 
	 * 3. getters / setters
	 * 
	 * 4. toString, and any other functions defined in Object class
	 */
	private String brand;
	private int size;
	private int price;

	// static final field normally have no getter / setter, directly use;
	private static final String TYPE = "Laptop";

	public Computer() {
		super();
	}

	public Computer(String brand, int size, int price) {
		super();
		this.brand = brand;
		this.size = size;
		this.price = price;
	}

	// getter:
	// method name: getXyz() (xyz is the field name)
	// no parameter
	// return type: same as the field type
	// accessibility: follow business requirement, normally public
	public String getBrand() {
		return brand;
	}

	// setter should return void
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSize() {
		// return should follow the business logic
		// normally should have no logic
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public static String getType() {
		return TYPE;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// toString() normally used to return the object information, describe what the
	// object looks like
	@Override
	public String toString() {
		return "Brand: " + this.getBrand() + ", size: " + this.getSize() + ", price: " + this.getPrice() + ", type: "
				+ Computer.getType();
	}

	public static void main(String[] args) {
		Computer computer = new Computer("Apple", 20, 20);
		System.out.println(computer.hashCode() + ": " + computer);
		Class<Computer> computerClass = Computer.class;
		Field[] valueFields = computerClass.getDeclaredFields();

	}
}
