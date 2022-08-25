package com.ironhack.security;

import com.ironhack.security.models.Role;
import com.ironhack.security.models.User;
import com.ironhack.security.repositories.RoleRepository;
import com.ironhack.security.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class SecurityApplication implements CommandLineRunner {


	@Autowired
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {


	}
}
