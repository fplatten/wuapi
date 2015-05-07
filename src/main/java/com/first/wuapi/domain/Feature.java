package com.first.wuapi.domain;

import com.first.wuapi.domain.conditions.ConditionsResult;
import com.first.wuapi.domain.geolookup.GeoLookupResult;


public enum Feature {
	
	CONDITIONS("conditions", ConditionsResult.class),
	GEOLOOKUP( "geolookup", GeoLookupResult.class);
	
	private final String name;
	private final Class<? extends WUElement> clazz;
	
	private Feature(String name, Class clazz){
		
		this.name = name;
		this.clazz = clazz;
	}
	
	public Class<? extends WUElement> getClazz(){
		return clazz;
	}
	
	public String getName(){
		return name;
	}

}
