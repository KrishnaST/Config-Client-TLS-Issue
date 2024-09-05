package com.panamax.imps;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws IOException, SQLException {
		SpringApplication application = new SpringApplication(Application.class);
		ApplicationContext context = application.run(args);
		AppConfig appConfig = context.getBean(AppConfig.class);
		System.out.println("appConfig propertyA : "+appConfig.propertyA);
		System.out.println("appConfig propertyB : "+appConfig.propertyB);
	}

}
