package com.predefinedfunction;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class SumOfTwoNumber {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bf =
				(a,b) ->a+b;
				System.out.println(bf.apply(20, 30));
	}


}
