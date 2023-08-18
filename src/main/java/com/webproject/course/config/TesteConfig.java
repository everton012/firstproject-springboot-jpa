package com.webproject.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.webproject.course.entities.User;
import com.webproject.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "9888888", "1234");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "9877778", "3456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
}
