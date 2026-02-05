package com.predefinedfunction;

import java.util.function.Function;
import java.util.function.Predicate;

// Write a java program to find the even number in array
//and print the Square of even number

public class Even_SquareOfEven {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		Predicate<Integer> p = i -> i % 2 == 0;
		Function<Integer, Integer> fn = i -> i * i;
		for (int n : a)
			if (p.test(n))
				System.out.println(fn.apply(n));

	}

}
