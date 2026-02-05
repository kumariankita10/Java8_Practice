package com.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//Remove Duplicate Words From the Given String
public class Remove_Dup_Words {

	public static void main(String[] args) {
		String s = "Java is very easy easy";
		String[] split = s.split(" ");
		List<String> l = Arrays.asList(split);
		l.stream().distinct().forEach(i -> System.out.print(i + " "));

	}

}
