package com.first.wuapi.domain;

public abstract class WUElement implements Parsable{
	
	protected String result;
	
	@Override
	public void setResult(String result) {
		this.result = result;
	}

}
