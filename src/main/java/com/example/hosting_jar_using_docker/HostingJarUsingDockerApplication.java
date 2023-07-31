package com.example.hosting_jar_using_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HostingJarUsingDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HostingJarUsingDockerApplication.class, args);
		System.out.println("this app is working fine with openjdl 17");
	}

}
