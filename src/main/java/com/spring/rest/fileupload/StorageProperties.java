package com.spring.rest.fileupload;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {
	
	private String location = "";
	
	String getLocation(){
		return location;
	}
	private void setLocation(String location){
		this.location=location;
	}

}
