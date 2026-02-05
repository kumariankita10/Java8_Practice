package com.java_8;

@FunctionalInterface
interface I1 {
	void m1(int i);
}

public class Test {

	public static void main(String[] args) {
		I1 i1 = i -> System.out.println(i);
		i1.m1(10);
		i1.m1(20);

	}

}
