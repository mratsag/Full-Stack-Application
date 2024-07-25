package com.project.SocialQuestApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com/project/SocialQuestApp/entities")

@SpringBootApplication
public class SocialQuestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialQuestAppApplication.class, args);
	}

}
