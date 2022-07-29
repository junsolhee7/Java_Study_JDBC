package com.iu.employees;

public class EmployeesDTO {
	private Integer employee_id;
	
	private Integer salary;
	private Integer msalary;
	private String last_name;
	private String mlast_name;
	
	public String getMlast_name() {
		return mlast_name;
	}
	public void setMlast_name(String mlast_name) {
		this.mlast_name = mlast_name;
	}
	public Integer getMsalary() {
		return msalary;
	}
	public void setMsalary(Integer msalary) {
		this.msalary = msalary;
	}
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	
	

}
