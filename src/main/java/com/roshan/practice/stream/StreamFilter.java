package com.roshan.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilter {
	
	public static void main(String[] args) {
		
		System.out.println("Filter is a Intermediate Operation");
		
	List<Integer> values = Arrays.asList(1,2,3,4,5,6);
	
	System.out.println("Filter even numbers and multiply by 5 and simply print without using lamda");
		
		Predicate<Integer> p = new Predicate<Integer>() {
			
			public boolean test(Integer i) {
				
				return i%2==0;
			}
			
		};
		
        values.stream().filter(p)
        .map(i -> i*5).forEach(System.out::println);
        
        System.out.println("Filter odd numbers and multiply by 5 and collect list using lamda");
        
        System.out.println(values.stream().filter(i->i%2!=0).map(i->i*5).collect(Collectors.toList()));
        
        
	}
	


}
