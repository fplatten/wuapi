package com.first.wuapi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import com.first.wuapi.domain.ResponseFormat;
import com.first.wuapi.domain.conditions.ConditionsResult;
import com.first.wuapi.util.WUHttpUtil;
import com.first.wuapi.util.WURequestBuilder;

public class HttpUtilTest {
	
	
	@Test
	public void testWeatherUndergroundApi(){
		
		String feature = "conditions";
		List<String> query = new ArrayList<>();
		query.add("CA");
		query.add("San_Francisco");
		
		WURequestBuilder builder = new WURequestBuilder(feature, query, ResponseFormat.JSON);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(org.codehaus.jackson.map.SerializationConfig.Feature.INDENT_OUTPUT, true);
		JsonFactory factory = mapper.getJsonFactory();
		
			try {
				String result = WUHttpUtil.getWuResponse(builder.build());
				JsonParser jp = factory.createJsonParser(result);
				JsonNode rootNode = mapper.readTree(jp);
				
				System.out.println(mapper.writeValueAsString(rootNode));
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
