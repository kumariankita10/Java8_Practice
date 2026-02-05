package com.java_8;

@FunctionalInterface
interface I{
	int m1(int a ,int b);
}

public class Add {

	public static void main(String[] args) {
		I i=(a,b) ->//System.out.println(a+b);
		{
			return a+b;
			
		} ;
		System.out.println(i.m1(10, 20));
		I i2=(a,b)-> a+b;
				System.out.println(i2.m1(30,40));
				System.out.println(i2.m1(50,40));
		
	

	}

}
