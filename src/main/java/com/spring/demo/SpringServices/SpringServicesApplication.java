package com.spring.demo.SpringServices;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@EnableAutoConfiguration
@EnableCaching
@ComponentScan(basePackages = {"com.spring.demo.examples", "com.spring.rest.user","com.spring.rest.swagger", "com.spring.rest.filtering", "com.spring.rest.versioning"})
@SpringBootApplication
public class SpringServicesApplication {

	public static void main(String[] args) {
		/*ApplicationContext applicationContext =*/ 
		SpringApplication.run(SpringServicesApplication.class, args);

		/*for(String name : applicationContext.getBeanDefinitionNames()){
			System.out.println(name);
		}*/
	}
	
	@Bean
	public LocaleResolver localeResolver(){
		SessionLocaleResolver localeResolver = new SessionLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		return localeResolver;
		
	}
	
	@Bean
	public ResourceBundleMessageSource bundleMessageSource(){
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}
	
	
}
