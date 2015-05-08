package com.first.wuapi;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.first.wuapi.domain.WuApiElement;
import com.first.wuapi.domain.ResponseFormat;
import com.first.wuapi.domain.conditions.ConditionsResult;
import com.first.wuapi.domain.conditions.CurrentObservation;
import com.first.wuapi.domain.geolookup.GeoLookupResult;
import com.first.wuapi.domain.geolookup.Location;
import com.first.wuapi.services.WuApiService;
import com.first.wuapi.services.impl.WuApiServiceImpl;

public class ServiceImplTest {
	
	@Test
	public void testWeatherUndergroundApi(){
		
		String feature = "conditions";
		List<String> query = new ArrayList<>();
		query.add("CA");
		query.add("San_Francisco");
		
		WuApiService wUndergroundService = new WuApiServiceImpl();
		
		try {
			WuApiElement element = wUndergroundService.query(feature, query, ResponseFormat.JSON);
			
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
		
		WuApiService wUndergroundService = new WuApiServiceImpl();
		
		try {
			WuApiElement element = wUndergroundService.query(feature, query, ResponseFormat.JSON);
			
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
