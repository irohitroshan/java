package com.roshan.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMap {

	public static void main(String[] args) {
		
		System.out.println("flatMap is a Intermediate Operation");

		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		List<Integer> list3 = Arrays.asList(7, 8, 9);

		List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

		List<Integer> finalList = listOfLists.stream().flatMap(i -> i.stream()).collect(Collectors.toList());

		System.out.println(finalList);
	}

}
