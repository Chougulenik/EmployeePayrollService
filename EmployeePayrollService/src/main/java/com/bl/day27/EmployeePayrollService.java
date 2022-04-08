package com.bl.day27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

	private List<EmployeePayroll> emplyeePayrollList;
	
	public EmployeePayrollService() {
		
	}
	
	public EmployeePayrollService(List<EmployeePayroll> emplyeePayrollList) {
		this.emplyeePayrollList = emplyeePayrollList;
	}
	
	private void showData() {
		System.out.println("Employee data is : " +emplyeePayrollList);
	}
	
	private void writeData(Scanner data) {
		
		System.out.println("Enter your name : ");
	    String name = data.nextLine();
	    System.out.println("Enter your ID : ");
	    int id = data.nextInt();
	    System.out.println("Enter your salary : ");
	    double salary = data.nextDouble();
	   
		EmployeePayroll empData = new EmployeePayroll(id, name, salary);
		emplyeePayrollList.add(empData);
	}
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<EmployeePayroll> emplyeePayrollList = new ArrayList<EmployeePayroll>();
		
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(emplyeePayrollList);
		employeePayrollService.writeData(input);
		employeePayrollService.showData();
		
		

	}
}
