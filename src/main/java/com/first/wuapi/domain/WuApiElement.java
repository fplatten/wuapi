package com.first.wuapi.domain;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class WuApiElement implements Parsable{
	
	protected String result;
	
	@Override
	public void setResult(String result) {
		this.result = result;
	}
	
	@Override
	public WuApiElement parse() throws JsonParseException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(Feature.AUTO_CLOSE_SOURCE, true);
		JsonFactory factory = mapper.getFactory();
		JsonParser jp = factory.createParser(result);
		
		System.out.println(result);
		
		return mapper.readValue( jp  , this.getClass());
	}

}
