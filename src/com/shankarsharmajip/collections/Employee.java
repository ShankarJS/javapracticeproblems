package com.shankarsharmajip.collections;
class Employee {
    String name;
    String department;
    double salary;
    
	public Employee(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
    
    
}