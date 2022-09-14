package com.pro.wings.string;

public class Employee {

	String name;
	int roll_no;
	String City;
	double salary;

	public Employee() {
		super();
	}

	public Employee(String name, int roll_no, String city, double salary) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		City = city;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", roll_no=" + roll_no + ", City=" + City + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
	Employee e1= new Employee ("Marish",21,"Pune",75000);
	Employee e2= new Employee ("Vaibhav",22,"Pune",100000);
	
	System.out.println(e1);
	System.out.println(e2);
	
	}
}
