package com.api.testcases;

import org.apache.http.HttpRequest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.api.base.Testbase;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class TC_01_Get_all_employees extends Testbase {
	
	
	
	@BeforeClass
	void getAllEmployeesData() throws InterruptedException
	{
		
		logger.info("*****************started TC_01_Get_all_employees*************** ");
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";		
		httprequest1 =  RestAssured.given();
		response =	httprequest1.request(Method.GET,"/employees");
		Thread.sleep(3);
		
		
	}
	
	@Test
	void CheckResponseBody()
	{
		logger.info("*****************Checking Response Body************** ");
		
		String responseBody = response.getBody().asString();
		logger.info("Response Body ==> "+responseBody);
		Assert.assertTrue(responseBody!=null);
		
	}
	
	@Test
	void checkResponseStatus()
	{
		logger.info("*****************Checking Response status************** ");
		
		int responseStatus = response.getStatusCode();
		logger.info("Response Body ==> "+responseStatus);
		Assert.assertEquals(responseStatus,200);
		
	}
	

}
