package com.first.wuapi.services.impl;

import com.first.wuapi.domain.WUElement;
import com.first.wuapi.factory.WUFactory;
import com.first.wuapi.services.WUndergroundService;
import com.first.wuapi.util.WUHttpUtil;

public class WUndergroundServiceImpl implements WUndergroundService{

	@Override
	public WUElement query(String feature, String settings, String query,
			String format) {
		
		String result = WUHttpUtil.getWuResponse(feature, settings, query, format);
		
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
