package com.roshan.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOperations {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 5);

		System.out.println("Some more Intermediate Operations");
		System.out.println();
		System.out.println("distinct");

		System.out.println(values.stream().distinct().collect(Collectors.toList()));

		System.out.println("limit to size 4");

		System.out.println(values.stream().distinct().limit(4).collect(Collectors.toList()));
		
		System.out.println("Skip first 2 ");

		System.out.println(values.stream().distinct().limit(4).skip(2).collect(Collectors.toList()));

	}

}
