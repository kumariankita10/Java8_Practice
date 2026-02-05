package com.predefinedfunction;

import java.util.function.BiPredicate;

public class Check {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> s1 = (a,b) -> a+b >=50;
		BiPredicate<Integer, Integer> s2 = (a,b) -> a+b <=80;
		BiPredicate<Integer, Integer> a = s1.or(s2);
		System.out.println(a.test(40, 50));
		System.out.println(a.test(10, 20));
	}

}
