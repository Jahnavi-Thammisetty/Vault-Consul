package com.ty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;



@SpringBootApplication
@EnableConfigurationProperties(Credentials.class)
public class VaultProjectApplication implements CommandLineRunner {

	private Logger logger= LoggerFactory.getLogger(VaultProjectApplication.class);

	private Credentials credentials;

	public VaultProjectApplication(Credentials credentials)
	{
		this.credentials=credentials;
	}

	public static void main(String[] args) {
		SpringApplication.run(VaultProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
     logger.info("username :"+credentials.getUsername());
		logger.info("password :"+credentials.getPassword());

	}
}
