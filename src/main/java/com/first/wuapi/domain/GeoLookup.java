package com.first.wuapi.domain;

public class GeoLookup extends WUElement{
	
	

	@Override
	public GeoLookup parse() {
		
		System.out.println("CREATE NEW GeoLookup OBJECT");
		return new GeoLookup();
	}
	
}
