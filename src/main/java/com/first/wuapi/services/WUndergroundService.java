package com.first.wuapi.services;

import com.first.wuapi.domain.WUElement;

public interface WUndergroundService {
	
	public WUElement query(String feature, String settings, String query, String format );

}
