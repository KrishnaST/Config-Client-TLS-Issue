package com.panamax.imps;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Value("${propertyA}")
	public String propertyA;
	
	@Value("${propertyB}")
	public String propertyB;

}
