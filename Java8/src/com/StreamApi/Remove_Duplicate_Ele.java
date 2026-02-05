package com.StreamApi;

import java.util.Arrays;

public class Remove_Duplicate_Ele {

	public static void main(String[] args) {
		int[] a= {1,2,2,3,3,4,5};
		int[]arr=Arrays.stream(a).distinct().toArray();
		System.out.println(Arrays.toString(arr));
	}

}
