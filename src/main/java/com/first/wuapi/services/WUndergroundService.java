package com.first.wuapi.services;

import java.util.List;

import com.first.wuapi.domain.ResponseFormat;
import com.first.wuapi.domain.WUElement;

public interface WUndergroundService {
	
	public WUElement query( String feature, List<String> query, ResponseFormat format );

}
