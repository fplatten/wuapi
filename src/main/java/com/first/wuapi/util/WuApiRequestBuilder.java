package com.first.wuapi.util;

import java.util.List;
import com.first.wuapi.domain.ResponseFormat;

public class WuApiRequestBuilder {
	
	private String host = "http://api.wunderground.com/api";
	private String key = "";
	private String feature;
	private List<String> query;
	private ResponseFormat format;
	private static final String SEP = "/";
	private static final String Q = "q";
	private static final String DOT = ".";
	
	public WuApiRequestBuilder(String feature, List<String> query, ResponseFormat format ){
		
		this.feature = feature;
		this.query = query;
		this.format = format;
	}
	
	public String build(){
		
		if(!validate()){return null;}
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(host);
		sb.append(SEP + key);
		sb.append(SEP + feature + SEP + Q);
		
		for(String q : query ){
			sb.append(SEP + q);
		}
		
		sb.append(DOT + format.getType());
		
		return sb.toString();
	}
	
	private boolean validate(){
		//TODO: add validation here
		return true;
	}

}
