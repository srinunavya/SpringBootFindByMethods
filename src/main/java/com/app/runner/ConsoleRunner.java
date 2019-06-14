package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner{
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		/*repo.findByProdCode("A")
		.forEach(System.out::println);*/
		
		/*repo.findByProdCodeIn(Arrays.asList("A","B"))
		.forEach(System.out::println);*/
		
		repo.findByProdCodeIsNotNull()
		.forEach(System.out::println);
		

		

		
		
	}

}
