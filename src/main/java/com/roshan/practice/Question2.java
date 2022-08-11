package com.roshan.practice;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Question2 {

	public static void main(String[] args) {

		String s = "rohitroshan";

		System.out.println(s.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).get('r'));
		
		System.out.println(s.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		
		
		
	}

}
