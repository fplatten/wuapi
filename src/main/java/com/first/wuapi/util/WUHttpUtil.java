package com.first.wuapi.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class WUHttpUtil {
	
	
	private static final String key = ""; // get key from local property file
	private static final String template = "http://api.wunderground.com/api/{0}/{1}/{2}/q/{3}.{4}";
	
	
	public static String getWuResponse(String feature, String settings, String query,
			String format){
		
		String url = MessageFormat.format(
				template,
			      new Object[] { key , feature, settings, query, format});
		
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpGet getRequest = new HttpGet( url );
		getRequest.addHeader("accept", "text/plain");
		
		StringBuffer sb = new StringBuffer();
		String line;
		
			
			try {
				
				
				HttpResponse response = httpClient.execute(getRequest);
				
				if (response.getStatusLine().getStatusCode() != 200) {
					throw new RuntimeException("Failed : HTTP error code : "
					   + response.getStatusLine().getStatusCode());
				}

				BufferedReader br = new BufferedReader(
				                 new InputStreamReader((response.getEntity().getContent())));		
				
				
				
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}
				
				
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return sb.toString();
	}

}
