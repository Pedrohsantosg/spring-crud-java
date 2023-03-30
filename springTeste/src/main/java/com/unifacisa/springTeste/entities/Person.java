package com.unifacisa.springTeste.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String user;
	private Integer password;
	
	public Person(Integer id, String user, String name, Integer password) {
		this.id = id;
		this.user = user;
		this.name = name;
		this.password = password;
	}
	

	public Person () {
		
	}
	
	public String getAge() {
		return user;
	}
	public void setAge(String user) {
		this.user = user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Person [user=" + user + ", name=" + name + ", password=" + password + "]";
	}
	

}
