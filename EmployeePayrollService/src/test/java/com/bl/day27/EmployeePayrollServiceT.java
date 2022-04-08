package com.bl.day27;


import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import com.bl.day27.EmployeePayrollService.IOService;

import junit.framework.Assert;

public class EmployeePayrollServiceT {

	@Test
	public void given3Employees_WhenWrittenToFile_ShouldMatchEmployeeEntries() throws IOException
	{
		EmployeePayroll[] arrayOfEmployees = {
				new EmployeePayroll(1, "Jeff Bezos", 100000.0),
				new EmployeePayroll(2, "Bill Gates", 200000.0),
				new EmployeePayroll(3, "Mark Zuckerberg", 300000.0)
		};
		EmployeePayrollService employeePayrollService;
		employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmployees));
		employeePayrollService.writeEmployeeData(IOService.FILE_IO);
		
		employeePayrollService.printData(IOService.FILE_IO);
		long entries = employeePayrollService.countEntries(IOService.FILE_IO);
		Assert.assertEquals(3, entries);

	}
}
