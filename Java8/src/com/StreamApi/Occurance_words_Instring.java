package com.StreamApi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Occurance words in given string 

public class Occurance_words_Instring {

	public static void main(String[] args) {
		String s="Java is very very very easy";
		String[] split=s.split(" ");
		List<String> asList=Arrays.asList(split);
		 Map<String,Long>m=asList.stream().collect(Collectors.groupingBy(i->i,()->new LinkedHashMap<String,Long>(),Collectors.counting()));
		 m.forEach((i,j) -> System.out.println(i+" -"+j));

	}

}
