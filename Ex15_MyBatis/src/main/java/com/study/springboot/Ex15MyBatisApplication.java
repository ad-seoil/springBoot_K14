package com.study.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.study.springboot.jdbc")
public class Ex15MyBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex15MyBatisApplication.class, args);
	}

}
