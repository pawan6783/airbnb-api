package com.example.airbnbClone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.airbnbClone.dao.UserRepository;


@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@SpringBootApplication
public class AirbnbCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirbnbCloneApplication.class, args);
	}

}
