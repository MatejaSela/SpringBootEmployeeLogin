package io.msela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.msela.springbootstarter.employee.EmployeeRepository;
@SpringBootApplication
@ComponentScan({"io.msela"})
@EntityScan("io.msela.springbootstarter")
@EnableJpaRepositories(basePackageClasses = EmployeeRepository.class)
public class EmployeeApiDataApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApiDataApplication.class, args);
	}
}
