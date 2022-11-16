package com.employee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entity.People;


@Repository
public interface PeopleRepository extends JpaRepository<People, Long>{

	public Optional<People> findByfirstname(String firstname);

	public Optional<People> findBylastname(String lastname);

	public Optional<People> findByemailId(String emailId);

	public Optional<People> findBymobilenumber(Long number);

	public Optional<People> findByemployeeid(String empid);

	public Optional<People> findBygender(String gender);

	public Optional<People> findByskills(String skills);

	public Optional<People> findBybirthday(String birthday);

}
