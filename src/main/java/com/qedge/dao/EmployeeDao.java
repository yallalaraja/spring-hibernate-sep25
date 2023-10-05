package com.qedge.dao;

import com.qedge.model.Employee;

public interface EmployeeDao {
	
	public void saveEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public void deleteEmployee(Integer empId);
	public Employee getEmployee(Integer empId);
		
}
