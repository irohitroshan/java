package com.roshan.practice.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTerminalOperations {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		System.out.println("Some more Terminal Operations");
		System.out.println();
		System.out.println("findFirst");

		System.out.println(values.stream().findFirst());
		values.stream().findFirst().ifPresent(System.out::println);

		System.out.println("max");

		System.out.println(values.stream().max((i, j) -> i.compareTo(j)));

		System.out.println("min");

		System.out.println(values.stream().min((i, j) -> i.compareTo(j)));

		System.out.println("anyMatch");

		System.out.println(values.stream().anyMatch(i -> i % 2 == 0));
		
		System.out.println("Count");

		System.out.println(values.stream().count());
	}

}
