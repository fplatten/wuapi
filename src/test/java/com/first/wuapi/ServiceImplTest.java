package com.first.wuapi;

import static org.junit.Assert.*;

import org.junit.Test;

import com.first.wuapi.domain.WUElement;
import com.first.wuapi.domain.conditions.ConditionsResult;
import com.first.wuapi.domain.conditions.CurrentObservation;
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
		
		assertEquals( ConditionsResult.class  , element.getClass());
		
		ConditionsResult cr = (ConditionsResult) element;
		
		CurrentObservation co = cr.getCurrentObservation();
		
		
		assertEquals( "KCASANFR58"  , co.getStationId());
		
		
	}

}
