package com.roshan.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question1 {
	
	public static void main(String[] args) {
		
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8);
		
		System.out.println("Find Second largest in list of integer in stream "+values);

		
		values.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().ifPresent(System.out::println);
	}

}
