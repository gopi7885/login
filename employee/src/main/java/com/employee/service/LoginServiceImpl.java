package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Login;
import com.employee.repository.LoginRepository;
import com.employee.service.impl.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginRepository EmployeeRepository;
		
	@Override
	public Login saveemployee(Login employee) {
		return EmployeeRepository.save(employee);
	}
	
	@Override
	public List<Login> getemployees(){
		return EmployeeRepository.findAll();
	}
	
	@Override
	public Login getemployeeById(String emailId) {
		Optional<Login> employee = EmployeeRepository.findByemailId(emailId);
		return employee.get();
	}
	
	@Override
	public Login getemployeeByName(String name) {
		return EmployeeRepository.findBypassword(name);
	}
}

