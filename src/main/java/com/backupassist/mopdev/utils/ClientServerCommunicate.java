package com.backupassist.mopdev.utils;


import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.client.HttpResponseException;

import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.uuid.Generators;
import java.util.UUID;

public class ClientServerCommunicate {
	
	private String install_token = ""; // install token will get its value when authorization request is completed
	private String account_token = "";
	private String server = "http://mopnightly.backupassist.com:8000";
	private String valid_useremail = "jas.chahal@cortexit.com.au";
	private String valid_userpwd = "cortexit!42";
	private int account_id = 1; // The first people of MOP
	private int added_client_id = 0; // this will be set by add client test and will be used in other tests
	private int added_site_id = 0; // this will be set by add client test and will be used in other tests
	private UUID install_guid = Generators.randomBasedGenerator().generate();//uuid(); // create a new installation Guid, we will launch two registration request, one register second should come back with success false and a reason
	//private String client_companyname = (uuid() + "").split("-")[4]; // A new client companyname
	//private String site_name = (uuid() + "").split("-")[4]; // A new site name for client
	//private String install_token = ""; // install token will get its value when authorization request is completed
	//private String account_token = ""; // account token will get its value when authorization request is completed
	//private String request_uuid = uuid();
   public ClientServerCommunicate() {
	   System.out.println("the uuid created is: "+install_guid.toString() +" the uuid version is :"+install_guid.version());
   }
	
	public  void testAuthorizeValidPassword() {
	   
		 HttpPost post = new HttpPost(server+"/ba.ng/authorize");
		 post.addHeader("content-type", "application/x-www-form-urlencoded");
		 HttpClient client = HttpClientBuilder.create().build();
	         // Create some NameValuePair for HttpPost parameters
	        List<NameValuePair> arguments = new ArrayList<>(6);
	        arguments.add(new BasicNameValuePair("user", valid_useremail));
	        arguments.add(new BasicNameValuePair("pwd", valid_userpwd));
	        arguments.add(new BasicNameValuePair("locale", "en"));
	        arguments.add(new BasicNameValuePair("build", "mop-distri"));
	        arguments.add(new BasicNameValuePair("install_guid", install_guid.toString()));
	        arguments.add(new BasicNameValuePair("computer_name", "JAS-PC"));
	 	        

	        try {
	            post.setEntity(new UrlEncodedFormEntity(arguments));
	            HttpResponse httpResponse = client.execute(post);
	            
	            
	            System.out.println("POST Response Status:: "
	    				+ httpResponse.getStatusLine().getStatusCode());

	    		BufferedReader reader = new BufferedReader(new InputStreamReader(
	    				httpResponse.getEntity().getContent()));

	    		String inputLine;
	    		StringBuffer response = new StringBuffer();

	    		while ((inputLine = reader.readLine()) != null) {
	    			response.append(inputLine);
	    		}
	    		reader.close();

	    		// print result
	    		System.out.println(response.toString());
	    		//client.
            // Print out the response message
	           //System.out.println(EntityUtils.toString(response.getEntity()));
	        } catch (IOException  e) {
	            e.printStackTrace();
	        }
	     
	    }
		
	
    public static void main(String[] args) {
    	ClientServerCommunicate  cs=new ClientServerCommunicate();
    	cs.testAuthorizeValidPassword();
    	
}
}