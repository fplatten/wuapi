package com.first.wuapi.domain;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"response",
"current_observation"
})
public class ConditionsResult extends WUElement{

@JsonProperty("response")
private Response response;
@JsonProperty("current_observation")
private CurrentObservation currentObservation;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The response
*/
//@JsonProperty("response")
public Response getResponse() {
return response;
}

/**
* 
* @param response
* The response
*/
//@JsonProperty("response")
public void setResponse(Response response) {
this.response = response;
}

/**
* 
* @return
* The currentObservation
*/
//@JsonProperty("current_observation")
public CurrentObservation getCurrentObservation() {
return currentObservation;
}

/**
* 
* @param currentObservation
* The current_observation
*/
//@JsonProperty("current_observation")
public void setCurrentObservation(CurrentObservation currentObservation) {
this.currentObservation = currentObservation;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

@Override
public WUElement parse() throws JsonParseException, IOException {
	
	ObjectMapper mapper = new ObjectMapper();
	mapper.configure(Feature.AUTO_CLOSE_SOURCE, true);
	JsonFactory factory = mapper.getFactory();
	JsonParser jp = factory.createParser(result);
	
	System.out.println(result);
	
	return mapper.readValue( jp  , ConditionsResult.class);
}


}