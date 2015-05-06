package com.first.wuapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

public class WUInitialTest {
	
	@Test
	public void NotestGoggleScrape(){
		
		String key = ""; //get from local prop file
			
			String url = "http://api.wunderground.com/api/18d2fdceb2650b34/conditions/q/CA/San_Francisco.json";
			
			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpGet getRequest = new HttpGet( url );
			getRequest.addHeader("accept", "text/plain");

			try {
				
				
				HttpResponse response = httpClient.execute(getRequest);
				
				if (response.getStatusLine().getStatusCode() != 200) {
					throw new RuntimeException("Failed : HTTP error code : "
					   + response.getStatusLine().getStatusCode());
				}

				BufferedReader br = new BufferedReader(
				                 new InputStreamReader((response.getEntity().getContent())));		
				
				ObjectMapper mapper = new ObjectMapper();
				mapper.configure(org.codehaus.jackson.map.SerializationConfig.Feature.INDENT_OUTPUT, true);
				JsonFactory factory = mapper.getJsonFactory();
				JsonParser jp = factory.createJsonParser(br);
				JsonNode rootNode = mapper.readTree(jp);
				
				System.out.println(mapper.writeValueAsString(rootNode));
				
				
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	

}
