package com.lc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lc.mapper")
public class LichenInvoiceSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(LichenInvoiceSysApplication.class, args);
	}

}
