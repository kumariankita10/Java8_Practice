package com.java_8;

@FunctionalInterface
interface I4 {
	boolean isEven(int i);
}

public class Even_Odd {

	public static void main(String[] args) {

		// Using Lambda WITH return
//	      I4 i4=i->
//		   { 
//			   return i%2==0 ; 
//			  };
//		  System.out.println(i4.isEven(5)); 
//		  System.out.println(i4.isEven(2));
		

		// Using WITHOUT return (Expression Lambda)
		I4 i4 = i -> i % 2 == 0;
		System.out.println(i4.isEven(5));
		System.out.println(i4.isEven(4));

	}

}
