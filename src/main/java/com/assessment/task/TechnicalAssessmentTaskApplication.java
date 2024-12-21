package com.assessment.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
@ComponentScan(basePackages = "com.assessment.task")
public class TechnicalAssessmentTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnicalAssessmentTaskApplication.class, args);
	}

}
