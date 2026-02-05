package com.predefinedfunction;

import java.util.function.Function;

public class Function_Example {

	public static void main(String[] args) {
		Function<Integer,Integer> f=i-> i*i;
		System.out.println(f.apply(5));
		
		Function<String,Integer> fn=i->i.length();
		System.out.println(fn.apply("Ankita"));
		

	}

}
