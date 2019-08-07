package com.mercury.beans;

import java.util.List;

public class RedBean implements Cloneable {
	public static final String COLOR = "Red";

	private String source;
	private int price;
	private List<String> info;

	public RedBean() {
		super();

	}

	public RedBean(String source, int price, List<String> info) {
		super();
		this.source = source;
		this.price = price;
		this.info = info;

	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<String> getInfo() {
		return info;
	}

	public void setInfo(List<String> info) {
		this.info = info;
	}

	// Shadow copy vs Deep copy
	@Override
	public RedBean clone() {
		// deep copy
		// return new RedBean(new String(source), price, new ArrayList<>(info));
		// shallow copy
		RedBean newRedBean = null;
		try {
			// if use super.clone(), must implement Cloneable
			newRedBean = (RedBean) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return newRedBean;
	}

	@Override
	public String toString() {
		return "RedBean [source= " + source + ", price= " + price + ", info= " + info + "]";
	}
}
