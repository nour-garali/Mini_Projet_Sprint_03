package com.nour.enseignant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.nour.enseignant.EnseignantApplication;
import com.nour.enseignant.entities.Enseignant;


@SpringBootApplication
public class EnseignantApplication implements CommandLineRunner {

	@Autowired 
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(EnseignantApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(Enseignant.class);
	}
}



