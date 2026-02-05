package com.StreamApi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Occurance_Character {

	public static void main(String[] args) {
		String s = "javadeveloper";
		Map<Character, Long> m = s.chars().mapToObj(i -> (char) i).collect(
				Collectors.groupingBy(i -> i, () -> new LinkedHashMap<Character, Long>(), Collectors.counting()));
		m.forEach((i, j) -> System.out.println(i + "-" + j));

	}

}
