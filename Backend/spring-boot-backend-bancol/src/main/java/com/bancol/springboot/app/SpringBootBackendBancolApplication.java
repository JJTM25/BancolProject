package com.bancol.springboot.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

import com.bancol.springboot.app.models.dao.IProductoDao;
import com.bancol.springboot.app.models.entity.Producto;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class SpringBootBackendBancolApplication implements CommandLineRunner {
	
	@Autowired
	private IProductoDao dao;
	
	@Autowired
	private ReactiveMongoTemplate mongoTemplate;
	
	private static final Logger Log = LoggerFactory.getLogger(SpringBootBackendBancolApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendBancolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

		
	}
	
	

}
