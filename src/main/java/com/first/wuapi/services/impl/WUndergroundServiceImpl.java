package com.first.wuapi.services.impl;

import java.util.List;

import com.first.wuapi.domain.WUElement;
import com.first.wuapi.domain.ResponseFormat;
import com.first.wuapi.factory.WUFactory;
import com.first.wuapi.services.WUndergroundService;
import com.first.wuapi.util.WUHttpUtil;
import com.first.wuapi.util.WURequestBuilder;

public class WUndergroundServiceImpl implements WUndergroundService{

	@Override
	public WUElement query(String feature, List<String> query, ResponseFormat format) {
		
		WURequestBuilder builder = new WURequestBuilder(feature, query, format);
		String result = WUHttpUtil.getWuResponse(builder.build());
		
		WUElement wuElement = null;
		
			try {
				
				wuElement = WUFactory.getFeatureResult(result, feature);
				
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return wuElement;
	}

}
