package com.adtheorent.Testing;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;



public class RequestCSVs {

	public static String request (String AdRequest) throws ParseException, IOException {
	//public static void request () throws ParseException, IOException {	
		
	HttpClient httpClient = HttpClientBuilder.create().build();
	String uri = "http://10.0.0.98:9987/BidRequest/MoPub";
	HttpPost request = new HttpPost(uri);
	StringEntity params =new StringEntity(AdRequest);
	request.addHeader("content-type", "application/json");
	request.setEntity(params);
	HttpResponse response = httpClient.execute(request);

	 if(!response.getStatusLine().toString().contains("204")){
		HttpEntity entity = response.getEntity();
		String responseString = EntityUtils.toString(entity, "UTF-8");
		System.out.println("BidResponse: " + responseString); 
		return("BidResponse: " + responseString);
	} else {
	System.out.println("No Bid");
		return("No Bid");
	}
}	
	
}
