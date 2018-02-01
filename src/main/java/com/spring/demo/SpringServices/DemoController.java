package com.spring.demo.SpringServices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rest")
public class DemoController {
	
	@RequestMapping(value="/hello")
	public String hello(){
		return "hello";
	}

}
