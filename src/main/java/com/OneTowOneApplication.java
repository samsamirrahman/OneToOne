package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

@SpringBootApplication
public class OneTowOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(OneTowOneApplication.class, args);
		
		Repo repo = run.getBean("repo",Repo.class);
   
		Address ad=new Address(121, "patna", "bahir", "india");
		User u=new User(1, "samir", ad);
		repo.save(u);
		
	
		
	System.out.println("OneTowOneApplication.main()");
		
		
		
	}

}
