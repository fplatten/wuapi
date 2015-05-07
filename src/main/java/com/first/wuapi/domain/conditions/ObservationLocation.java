package com.first.wuapi.domain.conditions;

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
"full",
"city",
"state",
"country",
"country_iso3166",
"latitude",
"longitude",
"elevation"
})
public class ObservationLocation {

@JsonProperty("full")
private String full;
@JsonProperty("city")
private String city;
@JsonProperty("state")
private String state;
@JsonProperty("country")
private String country;
@JsonProperty("country_iso3166")
private String countryIso3166;
@JsonProperty("latitude")
private String latitude;
@JsonProperty("longitude")
private String longitude;
@JsonProperty("elevation")
private String elevation;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The full
*/
@JsonProperty("full")
public String getFull() {
return full;
}

/**
* 
* @param full
* The full
*/
@JsonProperty("full")
public void setFull(String full) {
this.full = full;
}

/**
* 
* @return
* The city
*/
@JsonProperty("city")
public String getCity() {
return city;
}

/**
* 
* @param city
* The city
*/
@JsonProperty("city")
public void setCity(String city) {
this.city = city;
}

/**
* 
* @return
* The state
*/
@JsonProperty("state")
public String getState() {
return state;
}

/**
* 
* @param state
* The state
*/
@JsonProperty("state")
public void setState(String state) {
this.state = state;
}

/**
* 
* @return
* The country
*/
@JsonProperty("country")
public String getCountry() {
return country;
}

/**
* 
* @param country
* The country
*/
@JsonProperty("country")
public void setCountry(String country) {
this.country = country;
}

/**
* 
* @return
* The countryIso3166
*/
@JsonProperty("country_iso3166")
public String getCountryIso3166() {
return countryIso3166;
}

/**
* 
* @param countryIso3166
* The country_iso3166
*/
@JsonProperty("country_iso3166")
public void setCountryIso3166(String countryIso3166) {
this.countryIso3166 = countryIso3166;
}

/**
* 
* @return
* The latitude
*/
@JsonProperty("latitude")
public String getLatitude() {
return latitude;
}

/**
* 
* @param latitude
* The latitude
*/
@JsonProperty("latitude")
public void setLatitude(String latitude) {
this.latitude = latitude;
}

/**
* 
* @return
* The longitude
*/
@JsonProperty("longitude")
public String getLongitude() {
return longitude;
}

/**
* 
* @param longitude
* The longitude
*/
@JsonProperty("longitude")
public void setLongitude(String longitude) {
this.longitude = longitude;
}

/**
* 
* @return
* The elevation
*/
@JsonProperty("elevation")
public String getElevation() {
return elevation;
}

/**
* 
* @param elevation
* The elevation
*/
@JsonProperty("elevation")
public void setElevation(String elevation) {
this.elevation = elevation;
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