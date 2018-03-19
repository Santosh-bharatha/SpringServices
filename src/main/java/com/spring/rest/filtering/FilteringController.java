package com.spring.rest.filtering;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public SomeBean retrieveSomeBean(){
	
		
		return new SomeBean("value1","value2","value3");
	}
	@GetMapping("/filtering-list")
	public SomeBean retrieveListOfSomeBeans2(){
		return new SomeBean("value1","value2","value3");
	}
}
