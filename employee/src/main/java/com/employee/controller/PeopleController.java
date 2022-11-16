package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.People;
import com.employee.service.impl.PeopleService;

@RestController
@RequestMapping("/people")
@CrossOrigin(origins = "http://localhost:4200")
public class PeopleController {
	
	@Autowired
	private PeopleService Peopleservice;
	
	@PostMapping("/details")
	public People savePeople(@RequestBody People people) {
		return Peopleservice.savePople(people);
	}
	@GetMapping("/")
	public List<People>findPeople(){
		return Peopleservice.grtPeople();
		
	}

}
