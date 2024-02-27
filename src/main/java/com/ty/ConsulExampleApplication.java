package com.ty;

import com.ty.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigurationProperties(value= MyConfig.class)
public class ConsulExampleApplication {
	@Autowired
	private MyConfig myConfig;
    @GetMapping("/getConfig")
	public MyConfig getMyConfig()
	{
		return myConfig;
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsulExampleApplication.class, args);
	}

}
