
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
    "geolookup"
})
public class Features {

    @JsonProperty("geolookup")
    private Integer geolookup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The geolookup
     */
    @JsonProperty("geolookup")
    public Integer getGeolookup() {
        return geolookup;
    }

    /**
     * 
     * @param geolookup
     *     The geolookup
     */
    @JsonProperty("geolookup")
    public void setGeolookup(Integer geolookup) {
        this.geolookup = geolookup;
    }

    public Features withGeolookup(Integer geolookup) {
        this.geolookup = geolookup;
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

    public Features withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
