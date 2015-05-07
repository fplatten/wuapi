
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
    "neighborhood",
    "city",
    "state",
    "country",
    "id",
    "distance_km",
    "distance_mi"
})
public class Station_ {

    @JsonProperty("neighborhood")
    private String neighborhood;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("country")
    private String country;
    @JsonProperty("id")
    private String id;
    @JsonProperty("distance_km")
    private Integer distanceKm;
    @JsonProperty("distance_mi")
    private Integer distanceMi;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The neighborhood
     */
    @JsonProperty("neighborhood")
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * 
     * @param neighborhood
     *     The neighborhood
     */
    @JsonProperty("neighborhood")
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public Station_ withNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
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

    public Station_ withCity(String city) {
        this.city = city;
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

    public Station_ withState(String state) {
        this.state = state;
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

    public Station_ withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Station_ withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The distanceKm
     */
    @JsonProperty("distance_km")
    public Integer getDistanceKm() {
        return distanceKm;
    }

    /**
     * 
     * @param distanceKm
     *     The distance_km
     */
    @JsonProperty("distance_km")
    public void setDistanceKm(Integer distanceKm) {
        this.distanceKm = distanceKm;
    }

    public Station_ withDistanceKm(Integer distanceKm) {
        this.distanceKm = distanceKm;
        return this;
    }

    /**
     * 
     * @return
     *     The distanceMi
     */
    @JsonProperty("distance_mi")
    public Integer getDistanceMi() {
        return distanceMi;
    }

    /**
     * 
     * @param distanceMi
     *     The distance_mi
     */
    @JsonProperty("distance_mi")
    public void setDistanceMi(Integer distanceMi) {
        this.distanceMi = distanceMi;
    }

    public Station_ withDistanceMi(Integer distanceMi) {
        this.distanceMi = distanceMi;
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

    public Station_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
