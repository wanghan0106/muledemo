package com.roy.muledemo.person.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.roy.muledemo.person.Person;

@WebService
public interface PersonService {
	
	public void save(Person person);
	
	public List<Person> findAll();
	
	@WebResult(name="view")
	public Person getOne(@WebParam(name="personId") Long id);
	
	public Person delete(Long id);
	
	public List<Person> findByName(String name);
	
	public List<Person> searchByName(String name);
	
	public List<Person> findByAgeAndSex(int age, int sex);
	
}
