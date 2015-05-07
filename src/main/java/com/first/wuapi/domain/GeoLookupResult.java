package com.first.wuapi.domain;

public class GeoLookupResult extends WUElement{
	
	

	@Override
	public GeoLookupResult parse() {
		
		System.out.println("CREATE NEW GeoLookup OBJECT");
		return new GeoLookupResult();
	}
	
}
