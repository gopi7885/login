package com.employee.service.impl;

import java.util.List;

import com.employee.entity.Login;

public interface LoginService{

	public List<Login> getemployees();
	public Login getemployeeById(String emailId);
	public Login saveemployee(Login employee);
	public Login getemployeeByName(String name);

}