package com.mmtbank.microservices.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MMTBankSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MMTBankSpringCloudConfigServerApplication.class, args);
	}

}
