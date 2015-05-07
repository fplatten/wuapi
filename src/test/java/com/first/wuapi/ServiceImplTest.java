package com.first.wuapi;

import static org.junit.Assert.*;

import org.junit.Test;

import com.first.wuapi.domain.WUElement;
import com.first.wuapi.domain.conditions.ConditionsResult;
import com.first.wuapi.domain.conditions.CurrentObservation;
import com.first.wuapi.domain.geolookup.GeoLookupResult;
import com.first.wuapi.domain.geolookup.Location;
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
	
	@Test
	public void testGeoLookup(){
		
		String feature = "geolookup";
		String settings = "CA";
		String query = "San_Francisco";
		String format = "json";
		
		WUndergroundService wUndergroundService = new WUndergroundServiceImpl();
		
		WUElement element = wUndergroundService.query(feature, settings, query, format);
		
		assertEquals( GeoLookupResult.class  , element.getClass());
		
		GeoLookupResult gl = (GeoLookupResult) element;
		
		Location loc = gl.getLocation();
		
		assertEquals( "94101"  , loc.getZip());
		
		
	}

}
