package com.mercury.basic.interfaces;

public interface Shade {
	public void shadow();

	// Java allows multiple implements
	// Java allows multiple interface extends
	// but Java does not allow multiple class extends
	public static class LongGrass implements Plant, Shade {

		@Override
		public void shadow() {
			// TODO Auto-generated method stub

		}

		@Override
		public void grow() {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {

	}
}
