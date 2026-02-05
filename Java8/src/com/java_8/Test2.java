package com.java_8;

@FunctionalInterface
interface I2 {
	void m1(int i, int j);

}

public class Test2 {

	public static void main(String[] args) {
		I2 i1 = (a, b) -> System.out.println(a + "," + b);
		i1.m1(10, 20);

	}

}
