package com.first.wuapi.factory;

import java.io.IOException;

import com.first.wuapi.domain.Parsable;
import com.first.wuapi.domain.WUElement;
import com.first.wuapi.domain.Feature;

public class WUFactory {
	
	@SuppressWarnings("unchecked")
	public static <T> T getFeatureResult(String result,  String feature) throws InstantiationException, IllegalAccessException
	{
		 Parsable element = null;

		 Class<? extends WUElement> clazz = Feature.valueOf(feature.toUpperCase()).getClazz();
		 element = clazz.newInstance();
		 element.setResult(result);
		 
		 try {
			element = element.parse();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return (T) element;
	}
}
