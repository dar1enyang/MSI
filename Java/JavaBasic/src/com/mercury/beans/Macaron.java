package com.mercury.beans;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Macaron implements Externalizable {
	private String flavor;
	private String color;
	private int price;

	public Macaron() {
		super();

	}

	public Macaron(String flavor, String color, int price) {
		super();
		this.flavor = flavor;
		this.color = color;
		this.price = price;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Macaron [flavor=" + flavor + ", color=" + color + ", price=" + price + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(flavor);
		out.writeObject(color);
		out.writeInt(price);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		this.flavor = (String) in.readObject();
		this.color = (String) in.readObject();
		this.price = in.readInt();

	}

}
