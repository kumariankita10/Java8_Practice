package com.predefinedfunction;

import java.util.function.Consumer;

public class Consumer_Example {

	public static void main(String[] args) {
		Consumer<String> c=s->
		System.out.println("My name is:"+s);
         c.accept("Ankita Singh");
         c.accept("Ashish Singh");
	}

}
