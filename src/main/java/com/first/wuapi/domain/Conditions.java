package com.first.wuapi.domain;

import com.fasterxml.jackson.core.JsonParser;

public class Conditions extends WUElement {
	
	

	@Override
	public Conditions parse() {
		
		System.out.println("CREATE NEW Conditions OBJECT");
		//parse result String
		
		return new Conditions();
	}

}
