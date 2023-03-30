package com.ankesh.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankesh.EmployeeRepo.EmployeeRepo;
import com.ankesh.Entity.Employee;
@Service
public class EmployeeServiceImp implements EmployeeService {
	 @Autowired
	    private EmployeeRepo employeeRepo;

	    @Override
	    public Employee saveEmployee(Employee employee) {
	        Employee employee1 = employeeRepo.save(employee);
	        return employee1;
	    }

	    @Override
	    public void deleteEmployee(Integer empId) {
	        employeeRepo.deleteById(empId);
	    }


	    @Override
	    public Employee getEmployee(Integer empId) {
	        Employee employee2 = employeeRepo.findById(empId).get();
	        return employee2;
	    }




}
