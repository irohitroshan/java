package com.roshan.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToMap {
	
	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<>(Arrays.asList(
                new Employee(1, "A", 100),
                new Employee(2, "A", 200),
                new Employee(3, "B", 300),
                new Employee(4, "B", 400),
                new Employee(5, "C", 500),
                new Employee(6, "C", 600)));
		
		//toMap
		System.out.println(employeeList.stream().collect(Collectors.toMap(Employee::getId, Employee::getName)));
		
		//groupBy
		
		System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getName)));
		
		System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getName ,Collectors.counting())));
		
		//partition by
		
		System.out.println(employeeList.stream().collect(Collectors.partitioningBy(e->e.getSalary()>300)));

		
	}
	
	

}

class Employee {
	
	private int id;
	private String name;
	private int salary;
	
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
