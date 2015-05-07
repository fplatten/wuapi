package com.first.wuapi.domain.geolookup;

import com.first.wuapi.domain.WUElement;

public class GeoLookupResult extends WUElement{
	
	

	@Override
	public GeoLookupResult parse() {
		
		System.out.println("CREATE NEW GeoLookup OBJECT");
		return new GeoLookupResult();
	}
	
}
