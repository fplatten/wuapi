package com.first.wuapi.factory;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.first.wuapi.domain.Parsable;
import com.first.wuapi.domain.WUElement;
import com.first.wuapi.domain.Feature;

public class WUFactory {

	@SuppressWarnings("unchecked")
	public static <T> T getFeatureResult(String result, String feature)
			throws InstantiationException, IllegalAccessException,
			JsonParseException, IOException {
		Parsable element = null;

		Class<? extends WUElement> clazz = Feature.valueOf(
				feature.toUpperCase()).getClazz();
		element = clazz.newInstance();
		element.setResult(result);

		element = element.parse();

		return (T) element;
	}
}
