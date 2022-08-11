package com.roshan.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SteamMap {
	
	public static void main(String[] args) {
		
		System.out.println("map is a Intermediate Operation");
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		Function<Integer, Integer> f = new Function<Integer, Integer>() {
			
		public Integer apply(Integer i) {
			
			return i*5;
		}
		};
		
		values.stream().map(f).forEach(System.out::println);
		System.out.println("Using map with lamda");
        values.stream().map(i -> i*5).forEach(System.out::println);
		
		
	}

}
