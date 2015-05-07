package com.first.wuapi;

import java.io.IOException;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import com.first.wuapi.util.WUHttpUtil;

public class HttpUtilTest {
	
	
	@Test
	public void testWeatherUndergroundApi(){
		
		String feature = "conditions";
		String settings = "CA";
		String query = "San_Francisco";
		String format = "json";
		
		
		String result = WUHttpUtil.getWuResponse(feature, settings, query, format);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(org.codehaus.jackson.map.SerializationConfig.Feature.INDENT_OUTPUT, true);
		JsonFactory factory = mapper.getJsonFactory();
		
			try {
				JsonParser jp = factory.createJsonParser(result);
				JsonNode rootNode = mapper.readTree(jp);
				
				System.out.println(mapper.writeValueAsString(rootNode));
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
