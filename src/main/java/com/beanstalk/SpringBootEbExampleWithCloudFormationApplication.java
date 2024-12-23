package com.beanstalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootEbExampleWithCloudFormationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEbExampleWithCloudFormationApplication.class, args);
	}

}
