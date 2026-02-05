package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class Remove_Duplicate_char {

	public static void main(String[] args) {
		String s="javadeveloper";
		s.chars().mapToObj(i->(char)i).distinct().forEach(i-> System.out.print(i));
	}

}
