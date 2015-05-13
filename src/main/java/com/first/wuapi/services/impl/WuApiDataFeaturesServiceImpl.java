package com.first.wuapi.services.impl;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import com.first.wuapi.domain.WuApiElement;
import com.first.wuapi.domain.ResponseFormat;
import com.first.wuapi.factory.WuFactory;
import com.first.wuapi.services.WuApiDataFeaturesService;
import com.first.wuapi.util.HttpUtil;
import com.first.wuapi.util.WuApiRequestBuilder;

public class WuApiDataFeaturesServiceImpl implements WuApiDataFeaturesService {

	@Override
	public WuApiElement query(String feature, List<String> query,
			ResponseFormat format) throws ClientProtocolException, IOException,
			InstantiationException, IllegalAccessException {

		WuApiRequestBuilder builder = new WuApiRequestBuilder(feature, query, format);
		String result = HttpUtil.getWuResponse(builder.build());

		WuApiElement wuElement = null;

		wuElement = WuFactory.getFeatureResult(result, feature);

		return wuElement;
	}

}
