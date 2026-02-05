package com.java_8;
@FunctionalInterface
 interface I3{
  int m1(int i);
}

public class Square {

	public static void main(String[] args) {
//		I3 i1=n-> System.out.println("The Square of the given number is Number is:"+n*n);
//		i1.m1(5);
		
		I3 i=n->{
			return n*n;
		};
		System.out.println(i.m1(5));

	}

}
