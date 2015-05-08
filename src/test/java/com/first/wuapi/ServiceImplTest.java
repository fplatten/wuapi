package com.first.wuapi;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.first.wuapi.domain.WUElement;
import com.first.wuapi.domain.ResponseFormat;
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
		List<String> query = new ArrayList<>();
		query.add("CA");
		query.add("San_Francisco");
		
		WUndergroundService wUndergroundService = new WUndergroundServiceImpl();
		
		try {
			WUElement element = wUndergroundService.query(feature, query, ResponseFormat.JSON);
			
			assertEquals( ConditionsResult.class  , element.getClass());
			
			ConditionsResult cr = (ConditionsResult) element;
			
			CurrentObservation co = cr.getCurrentObservation();
			
			assertEquals( "KCASANFR58"  , co.getStationId());
		} catch (InstantiationException | IllegalAccessException | IOException e) {
			fail();
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testGeoLookup(){
		
		String feature = "geolookup";
		List<String> query = new ArrayList<>();
		query.add("CA");
		query.add("San_Francisco");
		
		WUndergroundService wUndergroundService = new WUndergroundServiceImpl();
		
		try {
			WUElement element = wUndergroundService.query(feature, query, ResponseFormat.JSON);
			
			assertEquals( GeoLookupResult.class  , element.getClass());
			
			GeoLookupResult gl = (GeoLookupResult) element;
			
			Location loc = gl.getLocation();
			
			assertEquals( "94101"  , loc.getZip());
		} catch (InstantiationException | IllegalAccessException | IOException e) {
			fail();
			e.printStackTrace();
		}
		
		
	}

}
