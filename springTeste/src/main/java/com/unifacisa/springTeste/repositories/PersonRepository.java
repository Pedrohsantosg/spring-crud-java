package com.unifacisa.springTeste.repositories;

import org.springframework.data.repository.CrudRepository;

import com.unifacisa.springTeste.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
