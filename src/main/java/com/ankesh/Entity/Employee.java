package com.ankesh.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeDetails")
public class Employee {


	    @Id()
	    @Column(name="eid")
	    private int empId ;
	    @Column(name="empName")
	    private String ename;
	    private String email;
	    private String salary;


	    public Employee() {
	      super();
	    }
	    
	  
	    public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}


		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}


		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}


		public String getSalary() {
			return salary;
		}

		public void setSalary(String salary) {
			this.salary = salary;
		}


		public Employee(int empId, String ename, String email, String salary) {
			super();
			this.empId = empId;
			this.ename = ename;
			this.email = email;
			this.salary = salary;
		}

		@Override
	    public String toString() {
	        return "Employee{" + "empId=" + empId +", ename='" + ename + '\'' + ", email='" + email + '\'' + ", salary='" + salary + '\'' + '}';
	    }

}
