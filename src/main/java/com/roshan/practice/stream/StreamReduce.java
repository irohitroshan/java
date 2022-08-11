package com.roshan.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class StreamReduce {

	public static void main(String[] args) {
		
		System.out.println("Reduce is a Terminal Operation");

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		// apply method available under @FunctionalInterface BiFunction which is
		// extended by @FunctionalInterface BinaryOperator

		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {

			public Integer apply(Integer i, Integer j) {

				return i + j;
			}
		};
		
		//reduce returns Optional Class object

		System.out.println(values.stream().map(i -> i * 5).reduce(b));
		
		System.out.println(values.stream().map(i -> i * 5).reduce(0, (i,j) -> i+j));

	}

}
