package com.unifacisa.springTeste;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.unifacisa.springTeste.services.PersonService;

@SpringBootApplication
public class SpringTesteApplication implements CommandLineRunner {
	
	@Autowired
	PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(SpringTesteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		String user = sc.nextLine();
		Integer password = sc.nextInt();
		personService.addPerson(null, name, user, password);
		sc.close();
		
	}

}
