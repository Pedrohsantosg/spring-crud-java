package com.unifacisa.springTeste.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unifacisa.springTeste.entities.Person;
import com.unifacisa.springTeste.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository personRepository;
	
	public void addPerson(Integer id, String name, String user, Integer password  ) {
		
		Person p = new Person(null, name, user, password);
		personRepository.save(p);
		
	}
	

}
