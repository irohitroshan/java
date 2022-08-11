package com.roshan.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamForEach {

	public static void main(String[] args) {
		
		System.out.println("Reduce is a Terminal Operation");

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		System.out.println("Convensional way");
		for (Integer i : values) {
			System.out.println(i);
		}

		System.out.println("Using java 8 Streams");
		Consumer<Integer> c = new Consumer<Integer>() {

			public void accept(Integer i) {
				System.out.println(i);
			}

		};
		values.stream().forEach(c);

		System.out.println("Using java 8 Streams and lemda");

		values.stream().forEach(i -> System.out.println(i));

		System.out.println("Using java 8 Streams and method reference");

		values.stream().forEach(System.out::println);

	}

}
