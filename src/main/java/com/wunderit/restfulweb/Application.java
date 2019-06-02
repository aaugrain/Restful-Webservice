package com.wunderit.restfulweb;

import java.beans.BeanProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	// remove _class
	/*
	 * Define a mongo Connection to a server. MappingMongoConverter converter = new
	 * MappingMongoConverter(mongoDbFactory, new MongoMappingContext());
	 * converter.setTypeMapper(new DefaultMongoTypeMapper(null));
	 */
	// @Bean
	// public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory,
	// MongoMappingContext context) {

	// MappingMongoConverter converter = new MappingMongoConverter(new
	// DefaultDbRefResolver(mongoDbFactory), context);
	// converter.setTypeMapper(new DefaultMongoTypeMapper(null));

	// MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory, converter);

	// return mongoTemplate;

	// }

}