package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Login;
import com.employee.service.impl.LoginService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping("/")
	public Login saveemployee(@RequestBody Login employee) {
		return loginService.saveemployee(employee);
	}
//	@GetMapping("/b")
//	public List<login> findemployees(){
//		List<login> trainingList = loginService.getemployees();
//		return trainingList;
//	}


//	@PostMapping("/login")
//	public ResponseEntity<?> userlogin(@RequestBody login employee) {
//		login trainingResponse = loginService.getemployeeById(employee.getEmailId());
//		if (trainingResponse!=null) {
//			if (employee.getPassword().equals(trainingResponse.getPassword())){
//				return new ResponseEntity<>("Success",HttpStatus.OK);
//				
//			}
//		}
//		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	}

	@PostMapping("/login")
	public ResponseEntity<?> userlogin(@RequestBody Login Data) {
		Login Response = loginService.getemployeeById(Data.getEmailId());
		if(Response.getPassword().equals(Data.getPassword())) {
		return ResponseEntity.ok(Response);
		}
	return (ResponseEntity<?>) ResponseEntity.internalServerError();
	}
}