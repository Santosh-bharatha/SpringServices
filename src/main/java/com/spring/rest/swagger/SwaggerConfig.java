package com.spring.rest.swagger;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//configuration
//enable swagger
@Configuration
@EnableSwagger2
public class SwaggerConfig {

public static final Contact DEFAULT_CONTACT = new Contact("SANTOSH", "http://springservice.com", "santosh.bharatha@gmail.com");
public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Api Documentation", "Spring Api Documentation", "1.0", "urn:tos",
        DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");

private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<String>();
// Bean - Docket
	// Swagger 2
	
	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO)
				.produces(DEFAULT_PRODUCES_AND_CONSUMES)
				.consumes(DEFAULT_PRODUCES_AND_CONSUMES);
		
	}
	//localhost:8090/swagger-ui.html
	//http://localhost:8090/v2/api-docs
}
