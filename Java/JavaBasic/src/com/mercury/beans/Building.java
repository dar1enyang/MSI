package com.mercury.beans;

import java.util.Collections;
import java.util.List;

// why need immutable class?
// in multi-thread environment, object of immutable class cannot be changed, so thread-safe

// immutable class: the object of this class cannot be changed, then we say this class is immutable
// 1. private all fields
// 2. only getters, no setters
// 3. use constructor to assign values for fields
// 4. use Collections.unmodifiableList/Set/Map to implement the getters for these fields
// 5. for any customized field, need to make them immutable as well, or no getter at all
// 6. should not provide any functions that is able to be used for modifying fields
// 7. should not allow any extends, otherwise functions may be overridden - final the class

// Immutable vs Final
// Immutable class: object cannot be modified
// final field: reference cannot be reassigned

// Java has no immutable class, because reflection can be used to modify every object
public final class Building {

	private int id;
	private String address;
	private int size;
	private List<String> info;
	private Computer pc;

	public Building() {
		super();
	}

	public Building(int id, String address, int size, List<String> info, Computer pc) {
		super();
		this.id = id;
		this.address = address;
		this.size = size;
		this.info = info;
		this.pc = pc;
	}

	public int getId() {
		return id;
	}

	// String is an immutable type, so returned string cannot be modified
	public String getAddress() {
		return address;
	}

	public int getSize() {
		return size;
	}

	public List<String> getInfo() {
		// below function will return a read-only copy of the info list
		return Collections.unmodifiableList(info);
	}

	public Computer getPc() {
		return pc;
	}

	public void updateId() {
		id++;
	}

	@Override
	public String toString() {
		return "Building [id=" + id + ", address= " + address + ", size= " + size + ", info= " + info + ", Computer= "
				+ pc;
	}
}
