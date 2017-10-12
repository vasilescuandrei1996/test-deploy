package net.metrosystems.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages="net.metrosystems.controller")
public class TestDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestDeployApplication.class, args);
	}
}
