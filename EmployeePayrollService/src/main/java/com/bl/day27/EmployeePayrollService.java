package com.bl.day27;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	
	public enum IOService {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}

	public List<EmployeePayroll> employeePayrollList = new ArrayList<>();

	public EmployeePayrollService() {
	}

	public EmployeePayrollService(List<EmployeePayroll> employeePayrollList) {
		this.employeePayrollList = employeePayrollList;
	}

	public static void main(String[] args) throws IOException {
		System.out.println("WelCome to Employee Payroll Service");
		ArrayList<EmployeePayroll> employeePayrollList = new ArrayList<EmployeePayroll>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayrollService.readEmployeeData(consoleInputReader);
		employeePayrollService.writeEmployeeData(IOService.CONSOLE_IO);
	}

	void writeEmployeeData(IOService ioService) {
		if (ioService.equals(IOService.CONSOLE_IO))
			System.out.println("\nwriting employee payroll data to console\n" + employeePayrollList);
		else if (ioService.equals(IOService.FILE_IO))
			new EmployeePayrollFileIOService().writeData(employeePayrollList);
	}

	private void readEmployeeData(Scanner consoleInputReader) throws IOException {
		System.out.println("Enter Employee id: ");
		int id = consoleInputReader.nextInt();
		System.out.println("Enter Employee name ");
		String name = consoleInputReader.next();
		System.out.println("Enter Employee salary ");
		double salary = consoleInputReader.nextDouble();
		employeePayrollList.add(new EmployeePayroll(id, name, salary));
	}
}
