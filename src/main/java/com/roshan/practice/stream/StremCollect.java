package com.roshan.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StremCollect {
	
	public static void main(String[] args) {
		
		System.out.println("collect is a Terminal Operations");
	
	List<Integer> values = Arrays.asList(1,2,3,4,5,6);
	
	
	

	System.out.println("Using map with lamda to get list");
	System.out.println(values.stream().map(i -> i*5).collect(Collectors.toList()));
	
	System.out.println("Using mapToDouble with lamda");
	values.stream().mapToDouble(i -> i*5).forEach(System.out::println);
	
	System.out.println("Using map with lamda");
	values.stream().map(Double::valueOf).map(i -> i*5).forEach(System.out::println);

}
}
