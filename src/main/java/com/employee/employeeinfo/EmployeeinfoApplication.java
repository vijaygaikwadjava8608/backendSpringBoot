package com.employee.employeeinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.employee.*")
@EnableJpaRepositories("com.employee.repository")
@EntityScan("com.employee.entity")
public class EmployeeinfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeinfoApplication.class, args);
	}

}
