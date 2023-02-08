package com.polymorphism;

public class EmployeeDetails {  //parent

	public void empName() {
		System.out.println("Employee name is Aravind");
	}

	public void empId(int a ) {
		System.out.println("Employee ID is "+a);
	}
	
	public void test(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		EmployeeDetails e = new Sample(); //UPcasting
		e.empName();
// 		e.empId(600);
		e.empId(500);
		e.test("JAVA");
		e.test("Hello");

	}

}
