package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.People;
import com.employee.repository.PeopleRepository;
import com.employee.service.impl.PeopleService;


@Service
public class PeopleServiceImpl implements PeopleService{
	
	@Autowired
	private PeopleRepository peoplerepository;

	@Override
	public People savePople(People people) {
		People response = peoplerepository.save(people);
		return response;
	}

	@Override
	public List<People> grtPeople() {
		List<People> peopleList = peoplerepository.findAll();
		return peopleList;
	}
	@Override
	public Optional<People> getPeopleByfirstname(String firstname) {
		Optional<People> ppl = peoplerepository.findByfirstname(firstname);
		return ppl;
	}
	@Override
	public Object getPeopleBylastname(String lastname) {
		Optional<People>ppl= peoplerepository.findBylastname(lastname);
		return ppl;
	}
	@Override
	public People getPeopleBybirthday(String birthday) {
		Optional<People> employee = peoplerepository.findBybirthday(birthday);
        return employee.get();
	}
	@Override
	public People getPeopleByemailId(String emailId) {
		Optional<People> employee = peoplerepository.findByemailId(emailId);
		return employee.get();
	}
	@Override
	public People getPeopleBymobilenumber(Long number) {
		Optional<People> employee = peoplerepository.findBymobilenumber(number);
		return employee.get();
	}
	@Override
	public People getPeopleByemployeeid(String empid) {
		Optional<People> employee = peoplerepository.findByemployeeid(empid);
        return employee.get();
	}
	@Override
	public Optional<People> getPeopleBygender(String gender) {
		Optional<People> ppl = peoplerepository.findBygender(gender);
		return ppl;
	}
	@Override
	public People getPeopleByskills(String skills) {
		Optional<People> employee = peoplerepository.findByskills(skills);
        return employee.get();
	}
}
