package com.first.wuapi;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





import java.util.UUID;

import org.jsonschema2pojo.SchemaMapper;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.first.wuapi.domain.conditions.CurrentObservation;
import com.first.wuapi.util.HttpUtil;
import com.sun.codemodel.JCodeModel;

public class JsonToPojoDataServiceConverter {
	
	static List<String> endpoints = new ArrayList<>();
	static String key = "";
	
	@Test
	public void testMapping(){
		
		
		for(String ep : endpoints){
			
			
			try {
				
				ObjectMapper mapper = new ObjectMapper();
				mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
				JsonFactory factory = mapper.getFactory();
				
				String result = HttpUtil.getWuResponse(ep);
				System.out.println(result);
				if(result != null && ! "".equals(result)){
					
					UUID uuid = UUID.randomUUID();
					JsonParser jp = factory.createParser(result);
					JsonNode rootNode = mapper.readTree(jp);
					File f = new File("C:/Users/fplatten/workspace/wuapi/src/test/resources/input-" 
							+ getFeature(ep ) + "-"
							+ uuid.toString() +".json");
					f.createNewFile();
					
					mapper.writeValue(f, rootNode);
					
					
				}
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
	private static String getFeature(String url){
		
		String [] words = url.split("/");
		
		return words[5];
		
	}
	
	
	static {
		
		endpoints.add("http://api.wunderground.com/api/{0}/alerts/q/IA/Des_Moines.json");
		endpoints.add("http://api.wunderground.com/api/{0}/almanac/q/CA/San_Francisco.json");
		endpoints.add("http://api.wunderground.com/api/{0}/astronomy/q/Australia/Sydney.json");
		endpoints.add("http://api.wunderground.com/api/{0}/currenthurricane/view.json");
		endpoints.add("http://api.wunderground.com/api/{0}/forecast/q/CA/San_Francisco.json");
		endpoints.add("http://api.wunderground.com/api/{0}/forecast10day/q/CA/San_Francisco.json");
		endpoints.add("http://api.wunderground.com/api/{0}/history_20060405/q/CA/San_Francisco.json");
		endpoints.add("http://api.wunderground.com/api/{0}/hourly/q/CA/San_Francisco.json");
		endpoints.add("http://api.wunderground.com/api/{0}/hourly10day/q/CA/San_Francisco.json");
		endpoints.add("http://api.wunderground.com/api/{0}/planner_07010731/q/CA/San_Francisco.json");
		endpoints.add("http://api.wunderground.com/api/{0}/rawtide/q/CA/San_Francisco.json");
		endpoints.add("http://api.wunderground.com/api/{0}/satellite/q/CA/San_Francisco.json");
		endpoints.add("http://api.wunderground.com/api/{0}/tide/q/CA/San_Francisco.json");
		endpoints.add("http://api.wunderground.com/api/{0}/webcams/q/CA/San_Francisco.json");
		endpoints.add("http://api.wunderground.com/api/{0}/yesterday/q/CA/San_Francisco.json");
//		
		
		/* 
		 * 
		 
		 
		 
		 
		 
		 alerts
		 City within the USA
		 http://api.wunderground.com/api/{0}/alerts/q/IA/Des_Moines.json
		 City within Europe
		 http://api.wunderground.com/api/{0}/alerts/q/zmw:00000.1.16172.json
		 
		 almanac
		 http://api.wunderground.com/api/{0}/almanac/q/CA/San_Francisco.json
		 
		 astronomy
		 http://api.wunderground.com/api/{0}/astronomy/q/Australia/Sydney.json
		 
		 currenthurricane
		 http://api.wunderground.com/api/{0}/currenthurricane/view.json
		 
		 forecast
		 http://api.wunderground.com/api/{0}/forecast/q/CA/San_Francisco.json
		 
		 forecast10day
		 http://api.wunderground.com/api/{0}/forecast10day/q/CA/San_Francisco.json
		 
		 history
		 http://api.wunderground.com/api/{0}/history_20060405/q/CA/San_Francisco.json
		 
		 hourly
		 http://api.wunderground.com/api/{0}/hourly/q/CA/San_Francisco.json
		 
		 hourly10day
		 http://api.wunderground.com/api/{0}/hourly10day/q/CA/San_Francisco.json
		 
		 planner
		 http://api.wunderground.com/api/{0}/planner_07010731/q/CA/San_Francisco.json
		 
		 rawtide
		 http://api.wunderground.com/api/{0}/rawtide/q/CA/San_Francisco.json
		 
		 satellite
		 http://api.wunderground.com/api/{0}/satellite/q/CA/San_Francisco.json
		 
		 tide
		 http://api.wunderground.com/api/{0}/tide/q/CA/San_Francisco.json
		 
		 webcams
		 http://api.wunderground.com/api/{0}/webcams/q/CA/San_Francisco.json
		 
		 yesterday
		 http://api.wunderground.com/api/{0}/yesterday/q/CA/San_Francisco.json
		 
		 
		 
		 
		 * */
		
			
		
	}
	

}
