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
"image",
"display_location",
"observation_location",
"estimated",
"station_id",
"observation_time",
"observation_time_rfc822",
"observation_epoch",
"local_time_rfc822",
"local_epoch",
"local_tz_short",
"local_tz_long",
"local_tz_offset",
"weather",
"temperature_string",
"temp_f",
"temp_c",
"relative_humidity",
"wind_string",
"wind_dir",
"wind_degrees",
"wind_mph",
"wind_gust_mph",
"wind_kph",
"wind_gust_kph",
"pressure_mb",
"pressure_in",
"pressure_trend",
"dewpoint_string",
"dewpoint_f",
"dewpoint_c",
"heat_index_string",
"heat_index_f",
"heat_index_c",
"windchill_string",
"windchill_f",
"windchill_c",
"feelslike_string",
"feelslike_f",
"feelslike_c",
"visibility_mi",
"visibility_km",
"solarradiation",
"UV",
"precip_1hr_string",
"precip_1hr_in",
"precip_1hr_metric",
"precip_today_string",
"precip_today_in",
"precip_today_metric",
"icon",
"icon_url",
"forecast_url",
"history_url",
"ob_url",
"nowcast"
})

public class CurrentObservation {

@JsonProperty("image")
private Image image;
@JsonProperty("display_location")
private DisplayLocation displayLocation;
@JsonProperty("observation_location")
private ObservationLocation observationLocation;
@JsonProperty("estimated")
private Estimated estimated;
@JsonProperty("station_id")
private String stationId;
@JsonProperty("observation_time")
private String observationTime;
@JsonProperty("observation_time_rfc822")
private String observationTimeRfc822;
@JsonProperty("observation_epoch")
private String observationEpoch;
@JsonProperty("local_time_rfc822")
private String localTimeRfc822;
@JsonProperty("local_epoch")
private String localEpoch;
@JsonProperty("local_tz_short")
private String localTzShort;
@JsonProperty("local_tz_long")
private String localTzLong;
@JsonProperty("local_tz_offset")
private String localTzOffset;
@JsonProperty("weather")
private String weather;
@JsonProperty("temperature_string")
private String temperatureString;
@JsonProperty("temp_f")
private Double tempF;
@JsonProperty("temp_c")
private Double tempC;
@JsonProperty("relative_humidity")
private String relativeHumidity;
@JsonProperty("wind_string")
private String windString;
@JsonProperty("wind_dir")
private String windDir;
@JsonProperty("wind_degrees")
private Double windDegrees;
@JsonProperty("wind_mph")
private Double windMph;
@JsonProperty("wind_gust_mph")
private Double windGustMph;
@JsonProperty("wind_kph")
private Double windKph;
@JsonProperty("wind_gust_kph")
private Double windGustKph;
@JsonProperty("pressure_mb")
private String pressureMb;
@JsonProperty("pressure_in")
private String pressureIn;
@JsonProperty("pressure_trend")
private String pressureTrend;
@JsonProperty("dewpoint_string")
private String dewpointString;
@JsonProperty("dewpoint_f")
private Double dewpointF;
@JsonProperty("dewpoint_c")
private Double dewpointC;
@JsonProperty("heat_index_string")
private String heatIndexString;
@JsonProperty("heat_index_f")
private String heatIndexF;
@JsonProperty("heat_index_c")
private String heatIndexC;
@JsonProperty("windchill_string")
private String windchillString;
@JsonProperty("windchill_f")
private String windchillF;
@JsonProperty("windchill_c")
private String windchillC;
@JsonProperty("feelslike_string")
private String feelslikeString;
@JsonProperty("feelslike_f")
private String feelslikeF;
@JsonProperty("feelslike_c")
private String feelslikeC;
@JsonProperty("visibility_mi")
private String visibilityMi;
@JsonProperty("visibility_km")
private String visibilityKm;
@JsonProperty("solarradiation")
private String solarradiation;
@JsonProperty("UV")
private String UV;
@JsonProperty("precip_1hr_string")
private String precip1hrString;
@JsonProperty("precip_1hr_in")
private String precip1hrIn;
@JsonProperty("precip_1hr_metric")
private String precip1hrMetric;
@JsonProperty("precip_today_string")
private String precipTodayString;
@JsonProperty("precip_today_in")
private String precipTodayIn;
@JsonProperty("precip_today_metric")
private String precipTodayMetric;
@JsonProperty("icon")
private String icon;
@JsonProperty("icon_url")
private String iconUrl;
@JsonProperty("forecast_url")
private String forecastUrl;
@JsonProperty("history_url")
private String historyUrl;
@JsonProperty("ob_url")
private String obUrl;
@JsonProperty("nowcast")
private String nowcast;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The image
*/
@JsonProperty("image")
public Image getImage() {
return image;
}

/**
* 
* @param image
* The image
*/
@JsonProperty("image")
public void setImage(Image image) {
this.image = image;
}

/**
* 
* @return
* The displayLocation
*/
@JsonProperty("display_location")
public DisplayLocation getDisplayLocation() {
return displayLocation;
}

/**
* 
* @param displayLocation
* The display_location
*/
@JsonProperty("display_location")
public void setDisplayLocation(DisplayLocation displayLocation) {
this.displayLocation = displayLocation;
}

/**
* 
* @return
* The observationLocation
*/
@JsonProperty("observation_location")
public ObservationLocation getObservationLocation() {
return observationLocation;
}

/**
* 
* @param observationLocation
* The observation_location
*/
@JsonProperty("observation_location")
public void setObservationLocation(ObservationLocation observationLocation) {
this.observationLocation = observationLocation;
}

/**
* 
* @return
* The estimated
*/
@JsonProperty("estimated")
public Estimated getEstimated() {
return estimated;
}

/**
* 
* @param estimated
* The estimated
*/
@JsonProperty("estimated")
public void setEstimated(Estimated estimated) {
this.estimated = estimated;
}

/**
* 
* @return
* The stationId
*/
@JsonProperty("station_id")
public String getStationId() {
return stationId;
}

/**
* 
* @param stationId
* The station_id
*/
@JsonProperty("station_id")
public void setStationId(String stationId) {
this.stationId = stationId;
}

/**
* 
* @return
* The observationTime
*/
@JsonProperty("observation_time")
public String getObservationTime() {
return observationTime;
}

/**
* 
* @param observationTime
* The observation_time
*/
@JsonProperty("observation_time")
public void setObservationTime(String observationTime) {
this.observationTime = observationTime;
}

/**
* 
* @return
* The observationTimeRfc822
*/
@JsonProperty("observation_time_rfc822")
public String getObservationTimeRfc822() {
return observationTimeRfc822;
}

/**
* 
* @param observationTimeRfc822
* The observation_time_rfc822
*/
@JsonProperty("observation_time_rfc822")
public void setObservationTimeRfc822(String observationTimeRfc822) {
this.observationTimeRfc822 = observationTimeRfc822;
}

/**
* 
* @return
* The observationEpoch
*/
@JsonProperty("observation_epoch")
public String getObservationEpoch() {
return observationEpoch;
}

/**
* 
* @param observationEpoch
* The observation_epoch
*/
@JsonProperty("observation_epoch")
public void setObservationEpoch(String observationEpoch) {
this.observationEpoch = observationEpoch;
}

/**
* 
* @return
* The localTimeRfc822
*/
@JsonProperty("local_time_rfc822")
public String getLocalTimeRfc822() {
return localTimeRfc822;
}

/**
* 
* @param localTimeRfc822
* The local_time_rfc822
*/
@JsonProperty("local_time_rfc822")
public void setLocalTimeRfc822(String localTimeRfc822) {
this.localTimeRfc822 = localTimeRfc822;
}

/**
* 
* @return
* The localEpoch
*/
@JsonProperty("local_epoch")
public String getLocalEpoch() {
return localEpoch;
}

/**
* 
* @param localEpoch
* The local_epoch
*/
@JsonProperty("local_epoch")
public void setLocalEpoch(String localEpoch) {
this.localEpoch = localEpoch;
}

/**
* 
* @return
* The localTzShort
*/
@JsonProperty("local_tz_short")
public String getLocalTzShort() {
return localTzShort;
}

/**
* 
* @param localTzShort
* The local_tz_short
*/
@JsonProperty("local_tz_short")
public void setLocalTzShort(String localTzShort) {
this.localTzShort = localTzShort;
}

/**
* 
* @return
* The localTzLong
*/
@JsonProperty("local_tz_long")
public String getLocalTzLong() {
return localTzLong;
}

/**
* 
* @param localTzLong
* The local_tz_long
*/
@JsonProperty("local_tz_long")
public void setLocalTzLong(String localTzLong) {
this.localTzLong = localTzLong;
}

/**
* 
* @return
* The localTzOffset
*/
@JsonProperty("local_tz_offset")
public String getLocalTzOffset() {
return localTzOffset;
}

/**
* 
* @param localTzOffset
* The local_tz_offset
*/
@JsonProperty("local_tz_offset")
public void setLocalTzOffset(String localTzOffset) {
this.localTzOffset = localTzOffset;
}

/**
* 
* @return
* The weather
*/
@JsonProperty("weather")
public String getWeather() {
return weather;
}

/**
* 
* @param weather
* The weather
*/
@JsonProperty("weather")
public void setWeather(String weather) {
this.weather = weather;
}

/**
* 
* @return
* The temperatureString
*/
@JsonProperty("temperature_string")
public String getTemperatureString() {
return temperatureString;
}

/**
* 
* @param temperatureString
* The temperature_string
*/
@JsonProperty("temperature_string")
public void setTemperatureString(String temperatureString) {
this.temperatureString = temperatureString;
}

/**
* 
* @return
* The tempF
*/
@JsonProperty("temp_f")
public Double getTempF() {
return tempF;
}

/**
* 
* @param tempF
* The temp_f
*/
@JsonProperty("temp_f")
public void setTempF(Double tempF) {
this.tempF = tempF;
}

/**
* 
* @return
* The tempC
*/
@JsonProperty("temp_c")
public Double getTempC() {
return tempC;
}

/**
* 
* @param tempC
* The temp_c
*/
@JsonProperty("temp_c")
public void setTempC(Double tempC) {
this.tempC = tempC;
}

/**
* 
* @return
* The relativeHumidity
*/
@JsonProperty("relative_humidity")
public String getRelativeHumidity() {
return relativeHumidity;
}

/**
* 
* @param relativeHumidity
* The relative_humidity
*/
@JsonProperty("relative_humidity")
public void setRelativeHumidity(String relativeHumidity) {
this.relativeHumidity = relativeHumidity;
}

/**
* 
* @return
* The windString
*/
@JsonProperty("wind_string")
public String getWindString() {
return windString;
}

/**
* 
* @param windString
* The wind_string
*/
@JsonProperty("wind_string")
public void setWindString(String windString) {
this.windString = windString;
}

/**
* 
* @return
* The windDir
*/
@JsonProperty("wind_dir")
public String getWindDir() {
return windDir;
}

/**
* 
* @param windDir
* The wind_dir
*/
@JsonProperty("wind_dir")
public void setWindDir(String windDir) {
this.windDir = windDir;
}

/**
* 
* @return
* The windDegrees
*/
@JsonProperty("wind_degrees")
public Double getWindDegrees() {
return windDegrees;
}

/**
* 
* @param windDegrees
* The wind_degrees
*/
@JsonProperty("wind_degrees")
public void setWindDegrees(Double windDegrees) {
this.windDegrees = windDegrees;
}

/**
* 
* @return
* The windMph
*/
@JsonProperty("wind_mph")
public Double getWindMph() {
return windMph;
}

/**
* 
* @param windMph
* The wind_mph
*/
@JsonProperty("wind_mph")
public void setWindMph(Double windMph) {
this.windMph = windMph;
}

/**
* 
* @return
* The windGustMph
*/
@JsonProperty("wind_gust_mph")
public Double getWindGustMph() {
return windGustMph;
}

/**
* 
* @param windGustMph
* The wind_gust_mph
*/
@JsonProperty("wind_gust_mph")
public void setWindGustMph(Double windGustMph) {
this.windGustMph = windGustMph;
}

/**
* 
* @return
* The windKph
*/
@JsonProperty("wind_kph")
public Double getWindKph() {
return windKph;
}

/**
* 
* @param windKph
* The wind_kph
*/
@JsonProperty("wind_kph")
public void setWindKph(Double windKph) {
this.windKph = windKph;
}

/**
* 
* @return
* The windGustKph
*/
@JsonProperty("wind_gust_kph")
public Double getWindGustKph() {
return windGustKph;
}

/**
* 
* @param windGustKph
* The wind_gust_kph
*/
@JsonProperty("wind_gust_kph")
public void setWindGustKph(Double windGustKph) {
this.windGustKph = windGustKph;
}

/**
* 
* @return
* The pressureMb
*/
@JsonProperty("pressure_mb")
public String getPressureMb() {
return pressureMb;
}

/**
* 
* @param pressureMb
* The pressure_mb
*/
@JsonProperty("pressure_mb")
public void setPressureMb(String pressureMb) {
this.pressureMb = pressureMb;
}

/**
* 
* @return
* The pressureIn
*/
@JsonProperty("pressure_in")
public String getPressureIn() {
return pressureIn;
}

/**
* 
* @param pressureIn
* The pressure_in
*/
@JsonProperty("pressure_in")
public void setPressureIn(String pressureIn) {
this.pressureIn = pressureIn;
}

/**
* 
* @return
* The pressureTrend
*/
@JsonProperty("pressure_trend")
public String getPressureTrend() {
return pressureTrend;
}

/**
* 
* @param pressureTrend
* The pressure_trend
*/
@JsonProperty("pressure_trend")
public void setPressureTrend(String pressureTrend) {
this.pressureTrend = pressureTrend;
}

/**
* 
* @return
* The dewpointString
*/
@JsonProperty("dewpoint_string")
public String getDewpointString() {
return dewpointString;
}

/**
* 
* @param dewpointString
* The dewpoint_string
*/
@JsonProperty("dewpoint_string")
public void setDewpointString(String dewpointString) {
this.dewpointString = dewpointString;
}

/**
* 
* @return
* The dewpointF
*/
@JsonProperty("dewpoint_f")
public Double getDewpointF() {
return dewpointF;
}

/**
* 
* @param dewpointF
* The dewpoint_f
*/
@JsonProperty("dewpoint_f")
public void setDewpointF(Double dewpointF) {
this.dewpointF = dewpointF;
}

/**
* 
* @return
* The dewpointC
*/
@JsonProperty("dewpoint_c")
public Double getDewpointC() {
return dewpointC;
}

/**
* 
* @param dewpointC
* The dewpoint_c
*/
@JsonProperty("dewpoint_c")
public void setDewpointC(Double dewpointC) {
this.dewpointC = dewpointC;
}

/**
* 
* @return
* The heatIndexString
*/
@JsonProperty("heat_index_string")
public String getHeatIndexString() {
return heatIndexString;
}

/**
* 
* @param heatIndexString
* The heat_index_string
*/
@JsonProperty("heat_index_string")
public void setHeatIndexString(String heatIndexString) {
this.heatIndexString = heatIndexString;
}

/**
* 
* @return
* The heatIndexF
*/
@JsonProperty("heat_index_f")
public String getHeatIndexF() {
return heatIndexF;
}

/**
* 
* @param heatIndexF
* The heat_index_f
*/
@JsonProperty("heat_index_f")
public void setHeatIndexF(String heatIndexF) {
this.heatIndexF = heatIndexF;
}

/**
* 
* @return
* The heatIndexC
*/
@JsonProperty("heat_index_c")
public String getHeatIndexC() {
return heatIndexC;
}

/**
* 
* @param heatIndexC
* The heat_index_c
*/
@JsonProperty("heat_index_c")
public void setHeatIndexC(String heatIndexC) {
this.heatIndexC = heatIndexC;
}

/**
* 
* @return
* The windchillString
*/
@JsonProperty("windchill_string")
public String getWindchillString() {
return windchillString;
}

/**
* 
* @param windchillString
* The windchill_string
*/
@JsonProperty("windchill_string")
public void setWindchillString(String windchillString) {
this.windchillString = windchillString;
}

/**
* 
* @return
* The windchillF
*/
@JsonProperty("windchill_f")
public String getWindchillF() {
return windchillF;
}

/**
* 
* @param windchillF
* The windchill_f
*/
@JsonProperty("windchill_f")
public void setWindchillF(String windchillF) {
this.windchillF = windchillF;
}

/**
* 
* @return
* The windchillC
*/
@JsonProperty("windchill_c")
public String getWindchillC() {
return windchillC;
}

/**
* 
* @param windchillC
* The windchill_c
*/
@JsonProperty("windchill_c")
public void setWindchillC(String windchillC) {
this.windchillC = windchillC;
}

/**
* 
* @return
* The feelslikeString
*/
@JsonProperty("feelslike_string")
public String getFeelslikeString() {
return feelslikeString;
}

/**
* 
* @param feelslikeString
* The feelslike_string
*/
@JsonProperty("feelslike_string")
public void setFeelslikeString(String feelslikeString) {
this.feelslikeString = feelslikeString;
}

/**
* 
* @return
* The feelslikeF
*/
@JsonProperty("feelslike_f")
public String getFeelslikeF() {
return feelslikeF;
}

/**
* 
* @param feelslikeF
* The feelslike_f
*/
@JsonProperty("feelslike_f")
public void setFeelslikeF(String feelslikeF) {
this.feelslikeF = feelslikeF;
}

/**
* 
* @return
* The feelslikeC
*/
@JsonProperty("feelslike_c")
public String getFeelslikeC() {
return feelslikeC;
}

/**
* 
* @param feelslikeC
* The feelslike_c
*/
@JsonProperty("feelslike_c")
public void setFeelslikeC(String feelslikeC) {
this.feelslikeC = feelslikeC;
}

/**
* 
* @return
* The visibilityMi
*/
@JsonProperty("visibility_mi")
public String getVisibilityMi() {
return visibilityMi;
}

/**
* 
* @param visibilityMi
* The visibility_mi
*/
@JsonProperty("visibility_mi")
public void setVisibilityMi(String visibilityMi) {
this.visibilityMi = visibilityMi;
}

/**
* 
* @return
* The visibilityKm
*/
@JsonProperty("visibility_km")
public String getVisibilityKm() {
return visibilityKm;
}

/**
* 
* @param visibilityKm
* The visibility_km
*/
@JsonProperty("visibility_km")
public void setVisibilityKm(String visibilityKm) {
this.visibilityKm = visibilityKm;
}

/**
* 
* @return
* The solarradiation
*/
@JsonProperty("solarradiation")
public String getSolarradiation() {
return solarradiation;
}

/**
* 
* @param solarradiation
* The solarradiation
*/
@JsonProperty("solarradiation")
public void setSolarradiation(String solarradiation) {
this.solarradiation = solarradiation;
}

/**
* 
* @return
* The UV
*/
@JsonProperty("UV")
public String getUV() {
return UV;
}

/**
* 
* @param UV
* The UV
*/
@JsonProperty("UV")
public void setUV(String UV) {
this.UV = UV;
}

/**
* 
* @return
* The precip1hrString
*/
@JsonProperty("precip_1hr_string")
public String getPrecip1hrString() {
return precip1hrString;
}

/**
* 
* @param precip1hrString
* The precip_1hr_string
*/
@JsonProperty("precip_1hr_string")
public void setPrecip1hrString(String precip1hrString) {
this.precip1hrString = precip1hrString;
}

/**
* 
* @return
* The precip1hrIn
*/
@JsonProperty("precip_1hr_in")
public String getPrecip1hrIn() {
return precip1hrIn;
}

/**
* 
* @param precip1hrIn
* The precip_1hr_in
*/
@JsonProperty("precip_1hr_in")
public void setPrecip1hrIn(String precip1hrIn) {
this.precip1hrIn = precip1hrIn;
}

/**
* 
* @return
* The precip1hrMetric
*/
@JsonProperty("precip_1hr_metric")
public String getPrecip1hrMetric() {
return precip1hrMetric;
}

/**
* 
* @param precip1hrMetric
* The precip_1hr_metric
*/
@JsonProperty("precip_1hr_metric")
public void setPrecip1hrMetric(String precip1hrMetric) {
this.precip1hrMetric = precip1hrMetric;
}

/**
* 
* @return
* The precipTodayString
*/
@JsonProperty("precip_today_string")
public String getPrecipTodayString() {
return precipTodayString;
}

/**
* 
* @param precipTodayString
* The precip_today_string
*/
@JsonProperty("precip_today_string")
public void setPrecipTodayString(String precipTodayString) {
this.precipTodayString = precipTodayString;
}

/**
* 
* @return
* The precipTodayIn
*/
@JsonProperty("precip_today_in")
public String getPrecipTodayIn() {
return precipTodayIn;
}

/**
* 
* @param precipTodayIn
* The precip_today_in
*/
@JsonProperty("precip_today_in")
public void setPrecipTodayIn(String precipTodayIn) {
this.precipTodayIn = precipTodayIn;
}

/**
* 
* @return
* The precipTodayMetric
*/
@JsonProperty("precip_today_metric")
public String getPrecipTodayMetric() {
return precipTodayMetric;
}

/**
* 
* @param precipTodayMetric
* The precip_today_metric
*/
@JsonProperty("precip_today_metric")
public void setPrecipTodayMetric(String precipTodayMetric) {
this.precipTodayMetric = precipTodayMetric;
}

/**
* 
* @return
* The icon
*/
@JsonProperty("icon")
public String getIcon() {
return icon;
}

/**
* 
* @param icon
* The icon
*/
@JsonProperty("icon")
public void setIcon(String icon) {
this.icon = icon;
}

/**
* 
* @return
* The iconUrl
*/
@JsonProperty("icon_url")
public String getIconUrl() {
return iconUrl;
}

/**
* 
* @param iconUrl
* The icon_url
*/
@JsonProperty("icon_url")
public void setIconUrl(String iconUrl) {
this.iconUrl = iconUrl;
}

/**
* 
* @return
* The forecastUrl
*/
@JsonProperty("forecast_url")
public String getForecastUrl() {
return forecastUrl;
}

/**
* 
* @param forecastUrl
* The forecast_url
*/
@JsonProperty("forecast_url")
public void setForecastUrl(String forecastUrl) {
this.forecastUrl = forecastUrl;
}

/**
* 
* @return
* The historyUrl
*/
@JsonProperty("history_url")
public String getHistoryUrl() {
return historyUrl;
}

/**
* 
* @param historyUrl
* The history_url
*/
@JsonProperty("history_url")
public void setHistoryUrl(String historyUrl) {
this.historyUrl = historyUrl;
}

/**
* 
* @return
* The obUrl
*/
@JsonProperty("ob_url")
public String getObUrl() {
return obUrl;
}

/**
* 
* @param obUrl
* The ob_url
*/
@JsonProperty("ob_url")
public void setObUrl(String obUrl) {
this.obUrl = obUrl;
}

/**
* 
* @return
* The nowcast
*/
@JsonProperty("nowcast")
public String getNowcast() {
return nowcast;
}

/**
* 
* @param nowcast
* The nowcast
*/
@JsonProperty("nowcast")
public void setNowcast(String nowcast) {
this.nowcast = nowcast;
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