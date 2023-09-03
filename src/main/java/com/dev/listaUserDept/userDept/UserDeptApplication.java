package com.dev.listaUserDept.userDept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = "com.dev.listaUserDept.entity")
@SpringBootApplication
public class UserDeptApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserDeptApplication.class, args);
	}
}
