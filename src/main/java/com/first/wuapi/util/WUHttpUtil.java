package com.first.wuapi.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class WUHttpUtil {

	public static String getWuResponse(String url)
			throws ClientProtocolException, IOException {

		System.out.println(url);
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpGet getRequest = new HttpGet(url);
		getRequest.addHeader("accept", "text/plain");

		StringBuffer sb = new StringBuffer();
		String line;

		HttpResponse response = httpClient.execute(getRequest);

		if (response.getStatusLine().getStatusCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatusLine().getStatusCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
				(response.getEntity().getContent())));

		while ((line = br.readLine()) != null) {
			sb.append(line);
		}

		return sb.toString();
	}

}
