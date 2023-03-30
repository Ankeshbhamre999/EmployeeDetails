package com.ankesh.EmploeeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ankesh.EmployeeService.EmployeeServiceImp;
import com.ankesh.Entity.Employee;
@RestController
public class EmployeeController {
	
	
	 @Autowired
	    private EmployeeServiceImp employeeService;


	    @PostMapping("/save")
	    public String saveEmployee(@RequestBody Employee employee)
	    {

	        Employee emp1= employeeService.saveEmployee(employee);
	        String message = null;
	        if(emp1!=null)
	            message = "Employee details Successfully saved";
	        else
	            message ="Employee details not save";
	        return message;
	    }


	        @GetMapping("/get/{empId}")
	    public Employee getEmployee(@PathVariable Integer empId)
	        {
	            Employee emp2 = employeeService.getEmployee(empId);

	            return  emp2;
	        }

	        @DeleteMapping("/delete/{empId}")
	    public void deleteEmployee(@PathVariable  Integer empId)
	        {
	                employeeService.deleteEmployee(empId);

	        };

}
