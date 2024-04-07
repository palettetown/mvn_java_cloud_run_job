package com;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Welcome to our application amigo");
        
        HttpClient httpClient = HttpClients.createDefault();
        String serviceUrl = "https://cloudrun-srv-u7t73bxk3a-uc.a.run.app/welcome";
        HttpGet request = new HttpGet(serviceUrl);

		try {

        // Execute the request
        HttpResponse response;
			response = httpClient.execute(request);

        // Handle the response
        int statusCode = response.getStatusLine().getStatusCode();
        String responseBody = EntityUtils.toString(response.getEntity());

        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
