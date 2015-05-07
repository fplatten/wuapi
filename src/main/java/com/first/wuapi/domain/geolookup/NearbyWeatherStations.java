
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
    "airport",
    "pws"
})
public class NearbyWeatherStations {

    @JsonProperty("airport")
    private Airport airport;
    @JsonProperty("pws")
    private Pws pws;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The airport
     */
    @JsonProperty("airport")
    public Airport getAirport() {
        return airport;
    }

    /**
     * 
     * @param airport
     *     The airport
     */
    @JsonProperty("airport")
    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public NearbyWeatherStations withAirport(Airport airport) {
        this.airport = airport;
        return this;
    }

    /**
     * 
     * @return
     *     The pws
     */
    @JsonProperty("pws")
    public Pws getPws() {
        return pws;
    }

    /**
     * 
     * @param pws
     *     The pws
     */
    @JsonProperty("pws")
    public void setPws(Pws pws) {
        this.pws = pws;
    }

    public NearbyWeatherStations withPws(Pws pws) {
        this.pws = pws;
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

    public NearbyWeatherStations withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
