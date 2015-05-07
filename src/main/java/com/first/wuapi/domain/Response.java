package com.first.wuapi.domain;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"version",
"termsofService",
"features"
})
public class Response {

@JsonProperty("version")
private String version;
@JsonProperty("termsofService")
private String termsofService;
@JsonProperty("features")
private Features features;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The version
*/
@JsonProperty("version")
public String getVersion() {
return version;
}

/**
* 
* @param version
* The version
*/
@JsonProperty("version")
public void setVersion(String version) {
this.version = version;
}

/**
* 
* @return
* The termsofService
*/
@JsonProperty("termsofService")
public String getTermsofService() {
return termsofService;
}

/**
* 
* @param termsofService
* The termsofService
*/
@JsonProperty("termsofService")
public void setTermsofService(String termsofService) {
this.termsofService = termsofService;
}

/**
* 
* @return
* The features
*/
@JsonProperty("features")
public Features getFeatures() {
return features;
}

/**
* 
* @param features
* The features
*/
@JsonProperty("features")
public void setFeatures(Features features) {
this.features = features;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}