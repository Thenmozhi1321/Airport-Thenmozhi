package com.springboot.Airport.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVerionUID=1L;
	
	private String resourceNmae;
	private String feildName;
	private Object feildvalue;
	
	public ResourceNotFoundException(String resourceNmae, String feildName, Object feildvalue) {
		super();
		this.resourceNmae = resourceNmae;
		this.feildName = feildName;
		this.feildvalue = feildvalue;
	}

	public static long getSerialverionuid() {
		return serialVerionUID;
	}

	public String getResourceNmae() {
		return resourceNmae;
	}

	public String getFeildName() {
		return feildName;
	}

	public Object getFeildvalue() {
		return feildvalue;
	}
	
	
	

}
