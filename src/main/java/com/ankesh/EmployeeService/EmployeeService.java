package com.ankesh.EmployeeService;

import com.ankesh.Entity.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee employee);

    public void deleteEmployee(Integer empId);
    public Employee getEmployee(Integer empId);


}
