package com.first.wuapi.services.impl;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import com.first.wuapi.domain.WUElement;
import com.first.wuapi.domain.ResponseFormat;
import com.first.wuapi.factory.WUFactory;
import com.first.wuapi.services.WUndergroundService;
import com.first.wuapi.util.WUHttpUtil;
import com.first.wuapi.util.WURequestBuilder;

public class WUndergroundServiceImpl implements WUndergroundService {

	@Override
	public WUElement query(String feature, List<String> query,
			ResponseFormat format) throws ClientProtocolException, IOException,
			InstantiationException, IllegalAccessException {

		WURequestBuilder builder = new WURequestBuilder(feature, query, format);
		String result = WUHttpUtil.getWuResponse(builder.build());

		WUElement wuElement = null;

		wuElement = WUFactory.getFeatureResult(result, feature);

		return wuElement;
	}

}
