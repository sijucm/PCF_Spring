package com.abnamro.nl.nmeer.sijumathew_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.annotation.IntegrationComponentScan;

@EnableBinding(MessageSource.class)
@SpringBootApplication
@IntegrationComponentScan
public class SijumathewTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SijumathewTestApplication.class, args);
	}
}
