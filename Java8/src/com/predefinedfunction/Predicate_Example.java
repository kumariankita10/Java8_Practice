package com.predefinedfunction;

import java.util.function.Predicate;

public class Predicate_Example {
	public static void main(String[] args) {
		// Use predicate when return type is boolean
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(5));//test is method of predicate

	}

}
