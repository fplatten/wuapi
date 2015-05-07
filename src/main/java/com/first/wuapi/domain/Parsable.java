package com.first.wuapi.domain;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;

public interface Parsable {
	
	public WUElement parse() throws JsonParseException, IOException;
	
	public void setResult(String result);

}
