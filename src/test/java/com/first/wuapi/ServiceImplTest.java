package com.first.wuapi;

import static org.junit.Assert.*;

import org.junit.Test;

import com.first.wuapi.domain.Conditions;
import com.first.wuapi.domain.WUElement;
import com.first.wuapi.services.WUndergroundService;
import com.first.wuapi.services.impl.WUndergroundServiceImpl;

public class ServiceImplTest {
	
	@Test
	public void testWeatherUndergroundApi(){
		
		String feature = "conditions";
		String settings = "CA";
		String query = "San_Francisco";
		String format = "json";
		
		WUndergroundService wUndergroundService = new WUndergroundServiceImpl();
		
		WUElement element = wUndergroundService.query(feature, settings, query, format);
		
		assertEquals( Conditions.class  , element.getClass());
		
		
	}

}
