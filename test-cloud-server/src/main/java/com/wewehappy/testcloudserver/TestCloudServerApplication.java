package com.wewehappy.testcloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TestCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestCloudServerApplication.class, args);
	}

}
