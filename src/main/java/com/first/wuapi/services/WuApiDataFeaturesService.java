package com.first.wuapi.services;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import com.first.wuapi.domain.ResponseFormat;
import com.first.wuapi.domain.WuApiElement;

public interface WuApiDataFeaturesService {

	public WuApiElement query(String feature, List<String> query,
			ResponseFormat format) throws ClientProtocolException, IOException,
			InstantiationException, IllegalAccessException;

}
