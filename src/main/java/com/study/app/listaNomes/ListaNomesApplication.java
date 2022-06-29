package com.study.app.listaNomes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.study.app.listaNomes.models.User;
import com.study.app.listaNomes.repository.UserRepository;


@SpringBootApplication
public class ListaNomesApplication implements CommandLineRunner{

	
	private final UserRepository userRepository;
	
	@Autowired
	public  ListaNomesApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ListaNomesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		if(userRepository.findAll().isEmpty()) {
			userRepository.save(new User("Anderson", "Matos"));
			userRepository.save(new User("Santos", "Silva"));
			
		}
		for(User user : userRepository.findAll()) {
			System.out.println(user);
		}
	}

}
