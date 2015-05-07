
package com.first.wuapi.domain.geolookup;

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
    "type",
    "country",
    "country_iso3166",
    "country_name",
    "state",
    "city",
    "tz_short",
    "tz_long",
    "lat",
    "lon",
    "zip",
    "magic",
    "wmo",
    "l",
    "requesturl",
    "wuiurl",
    "nearby_weather_stations"
})
public class Location {

    @JsonProperty("type")
    private String type;
    @JsonProperty("country")
    private String country;
    @JsonProperty("country_iso3166")
    private String countryIso3166;
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("state")
    private String state;
    @JsonProperty("city")
    private String city;
    @JsonProperty("tz_short")
    private String tzShort;
    @JsonProperty("tz_long")
    private String tzLong;
    @JsonProperty("lat")
    private String lat;
    @JsonProperty("lon")
    private String lon;
    @JsonProperty("zip")
    private String zip;
    @JsonProperty("magic")
    private String magic;
    @JsonProperty("wmo")
    private String wmo;
    @JsonProperty("l")
    private String l;
    @JsonProperty("requesturl")
    private String requesturl;
    @JsonProperty("wuiurl")
    private String wuiurl;
    @JsonProperty("nearby_weather_stations")
    private NearbyWeatherStations nearbyWeatherStations;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Location withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The country
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public Location withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * 
     * @return
     *     The countryIso3166
     */
    @JsonProperty("country_iso3166")
    public String getCountryIso3166() {
        return countryIso3166;
    }

    /**
     * 
     * @param countryIso3166
     *     The country_iso3166
     */
    @JsonProperty("country_iso3166")
    public void setCountryIso3166(String countryIso3166) {
        this.countryIso3166 = countryIso3166;
    }

    public Location withCountryIso3166(String countryIso3166) {
        this.countryIso3166 = countryIso3166;
        return this;
    }

    /**
     * 
     * @return
     *     The countryName
     */
    @JsonProperty("country_name")
    public String getCountryName() {
        return countryName;
    }

    /**
     * 
     * @param countryName
     *     The country_name
     */
    @JsonProperty("country_name")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Location withCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    /**
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public Location withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Location withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 
     * @return
     *     The tzShort
     */
    @JsonProperty("tz_short")
    public String getTzShort() {
        return tzShort;
    }

    /**
     * 
     * @param tzShort
     *     The tz_short
     */
    @JsonProperty("tz_short")
    public void setTzShort(String tzShort) {
        this.tzShort = tzShort;
    }

    public Location withTzShort(String tzShort) {
        this.tzShort = tzShort;
        return this;
    }

    /**
     * 
     * @return
     *     The tzLong
     */
    @JsonProperty("tz_long")
    public String getTzLong() {
        return tzLong;
    }

    /**
     * 
     * @param tzLong
     *     The tz_long
     */
    @JsonProperty("tz_long")
    public void setTzLong(String tzLong) {
        this.tzLong = tzLong;
    }

    public Location withTzLong(String tzLong) {
        this.tzLong = tzLong;
        return this;
    }

    /**
     * 
     * @return
     *     The lat
     */
    @JsonProperty("lat")
    public String getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    @JsonProperty("lat")
    public void setLat(String lat) {
        this.lat = lat;
    }

    public Location withLat(String lat) {
        this.lat = lat;
        return this;
    }

    /**
     * 
     * @return
     *     The lon
     */
    @JsonProperty("lon")
    public String getLon() {
        return lon;
    }

    /**
     * 
     * @param lon
     *     The lon
     */
    @JsonProperty("lon")
    public void setLon(String lon) {
        this.lon = lon;
    }

    public Location withLon(String lon) {
        this.lon = lon;
        return this;
    }

    /**
     * 
     * @return
     *     The zip
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * 
     * @param zip
     *     The zip
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public Location withZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * 
     * @return
     *     The magic
     */
    @JsonProperty("magic")
    public String getMagic() {
        return magic;
    }

    /**
     * 
     * @param magic
     *     The magic
     */
    @JsonProperty("magic")
    public void setMagic(String magic) {
        this.magic = magic;
    }

    public Location withMagic(String magic) {
        this.magic = magic;
        return this;
    }

    /**
     * 
     * @return
     *     The wmo
     */
    @JsonProperty("wmo")
    public String getWmo() {
        return wmo;
    }

    /**
     * 
     * @param wmo
     *     The wmo
     */
    @JsonProperty("wmo")
    public void setWmo(String wmo) {
        this.wmo = wmo;
    }

    public Location withWmo(String wmo) {
        this.wmo = wmo;
        return this;
    }

    /**
     * 
     * @return
     *     The l
     */
    @JsonProperty("l")
    public String getL() {
        return l;
    }

    /**
     * 
     * @param l
     *     The l
     */
    @JsonProperty("l")
    public void setL(String l) {
        this.l = l;
    }

    public Location withL(String l) {
        this.l = l;
        return this;
    }

    /**
     * 
     * @return
     *     The requesturl
     */
    @JsonProperty("requesturl")
    public String getRequesturl() {
        return requesturl;
    }

    /**
     * 
     * @param requesturl
     *     The requesturl
     */
    @JsonProperty("requesturl")
    public void setRequesturl(String requesturl) {
        this.requesturl = requesturl;
    }

    public Location withRequesturl(String requesturl) {
        this.requesturl = requesturl;
        return this;
    }

    /**
     * 
     * @return
     *     The wuiurl
     */
    @JsonProperty("wuiurl")
    public String getWuiurl() {
        return wuiurl;
    }

    /**
     * 
     * @param wuiurl
     *     The wuiurl
     */
    @JsonProperty("wuiurl")
    public void setWuiurl(String wuiurl) {
        this.wuiurl = wuiurl;
    }

    public Location withWuiurl(String wuiurl) {
        this.wuiurl = wuiurl;
        return this;
    }

    /**
     * 
     * @return
     *     The nearbyWeatherStations
     */
    @JsonProperty("nearby_weather_stations")
    public NearbyWeatherStations getNearbyWeatherStations() {
        return nearbyWeatherStations;
    }

    /**
     * 
     * @param nearbyWeatherStations
     *     The nearby_weather_stations
     */
    @JsonProperty("nearby_weather_stations")
    public void setNearbyWeatherStations(NearbyWeatherStations nearbyWeatherStations) {
        this.nearbyWeatherStations = nearbyWeatherStations;
    }

    public Location withNearbyWeatherStations(NearbyWeatherStations nearbyWeatherStations) {
        this.nearbyWeatherStations = nearbyWeatherStations;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Location withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
