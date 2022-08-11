package com.roshan.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {

	public static void main(String[] args) {
		
		System.out.println("sorted is a Intermediate Operation");

		List<Integer> values = Arrays.asList(3, 2, 1, 4, 6, 5);

		List<Integer> sortedList = values.stream().sorted().collect(Collectors.toList());
		System.out.println("Accending order sorted list " + sortedList);

		List<Integer> reversSortedList = values.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println("Reverse order sorted list " + reversSortedList);

		List<Integer> naturalSortedList = values.stream().sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());

		System.out.println("natural order sorted list " + naturalSortedList);
		
		
		Student s1 = new Student("Rohit", 12345);
		Student s2 = new Student("Arun", 54321);
		Student s3 = new Student("GS", 34567);
		Student s4 = new Student("Badri", 67890);
		
		List<Student>  ls = new ArrayList<>();
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		ls.add(s4);
		
		
		

		List<Student> sortedOnName = ls.stream().sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());

		System.out.println("Sorted students by name " + sortedOnName);
		
		List<Student> sortedOnRollNo = ls.stream().sorted(Comparator.comparing(Student::getRollNo))
				.collect(Collectors.toList());

		System.out.println("Sorted students by roll no " + sortedOnRollNo);

		ls.add(new Student("Rohit", 23456));
		List<Student> sortedtwice = ls.stream().sorted(Comparator.comparing(Student::getName)
				                                                 .thenComparing(Student::getRollNo))
				                                                 .collect(Collectors.toList());

		System.out.println("Sorted students by name and then by roll no " + sortedtwice);


	}

}

class Student {

	private String name;
	private int rollNo;
	
	

	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}

	
}
