package com.first.wuapi.domain;

public enum ResponseFormat {
	
	JSON("json"),
	XML("xml");
	
	private final String type;
	
	private ResponseFormat(String type){
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	
}
