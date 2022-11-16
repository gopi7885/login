package com.employee.service.impl;

import java.util.List;
import java.util.Optional;

import com.employee.entity.People;

public interface PeopleService {

	public People savePople(People people);

	public List<People> grtPeople();

	public Optional<People> getPeopleByfirstname(String firstname);

	public Object getPeopleBylastname(String lastname);

	public People getPeopleBybirthday(String birthday);

	public People getPeopleByemailId(String emailId);

	public People getPeopleBymobilenumber(Long number);

	public People getPeopleByemployeeid(String empid);

	public Optional<People> getPeopleBygender(String gender);

	public People getPeopleByskills(String skills);

	

	
}
