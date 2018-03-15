package com.spring.rest.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//configuration
//enable swagger
@Configuration
@EnableSwagger2
public class SwaggerConfig {
// Bean - Docket
	// Swagger 2
	
	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2);
		
	}
	//localhost:8090/swagger-ui.html
	//http://localhost:8090/v2/api-docs
}
