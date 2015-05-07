package com.first.wuapi;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
//import org.codehaus.jackson.JsonFactory;
//import org.codehaus.jackson.JsonNode;
//import org.codehaus.jackson.JsonParser;
//import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
//import com.fasterxml.jackson.core.JsonFactory.Feature;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.first.wuapi.domain.ConditionsResult;
import com.first.wuapi.domain.CurrentObservation;
import com.first.wuapi.domain.ConditionsResult;

public class WUInitialTest {
	
	@Test
	public void testWeatherUndergroundApi(){
		
		String key = ""; //get from local prop file
		//http://www.wunderground.com/weather/api/d/docs?d=data/index&MR=1
			
			String url = "http://api.wunderground.com/api/"+ key + "/conditions/q/GA/Atlanta.json";
			
			//            http://api.wunderground.com/api/18d2fdceb2650b34/conditions/CA/q/San_Francisco.json
			
			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpGet getRequest = new HttpGet( url );
			getRequest.addHeader("accept", "text/plain");
				
				try {
					HttpResponse response = httpClient.execute(getRequest);
					
					if (response.getStatusLine().getStatusCode() != 200) {
						throw new RuntimeException("Failed : HTTP error code : "
						   + response.getStatusLine().getStatusCode());
					}
					
					StringBuffer sb = new StringBuffer();
					String line;

					BufferedReader br = new BufferedReader(
					                 new InputStreamReader((response.getEntity().getContent())));
					
					while ((line = br.readLine()) != null) {
						sb.append(line);
					}
					
					
					ObjectMapper mapper = new ObjectMapper();
					mapper.configure(Feature.AUTO_CLOSE_SOURCE, true);
					//mapper.configure(org.codehaus.jackson.map.SerializationConfig.Feature.INDENT_OUTPUT, true);
					JsonFactory factory = mapper.getFactory();
					JsonParser jp = factory.createParser(sb.toString());
					
					ConditionsResult c = mapper.readValue( jp  , ConditionsResult.class);
					
					System.out.println(c.getCurrentObservation().getStationId());
					
					
				} catch (IllegalStateException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			
			
			
		}
	

}
