package com.mercury.basic;

import java.util.ArrayList;

import com.mercury.beans.Building;
import com.mercury.beans.Computer;

public class ImmutableTest {

	// public static class B2 extends Building {
	// public B2() {
	// super();
	// }
	//
	// public B2(int id, String address, int size, List<String> info, Computer pc) {
	// super(id, address, size, info, pc);
	// }
	//
	// @Override
	// public int getSize() {
	// return 10;
	// }
	// }

	public static void main(String[] args) {
		Building building = new Building(1, "55", 1000, new ArrayList<>(), new Computer("Apple", 20, 20));

		System.out.println(building);
		Computer pComputer = building.getPc();
		pComputer.setBrand("Dell");

		// Building b2 = new B2(1, "55", 1000, new ArrayList<>(), new Computer("Apple",
		// 20, 20));
		// System.out.println(b2.getSize());
	}

}
