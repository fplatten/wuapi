package com.first.wuapi.domain;

public enum Feature {
	
	CONDITIONS("conditions", Conditions.class),
	GEOLOOKUP( "geolookup", GeoLookup.class);
	
	private final String name;
	private final Class<? extends WUElement> clazz;
	
	private Feature(String name, Class<? extends WUElement> clazz){
		
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
