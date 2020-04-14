package com.api.testcases;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.api.base.Testbase;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC_02_Get_Single_Employee_data extends Testbase{
	
	
	
	@BeforeClass
	void getSingleEmployeeData() throws InterruptedException
	{
		
		logger.info("*******TC_2_Started_executing_Single_Employee_data*************");
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";		
		httprequest1 =  RestAssured.given();
		response =	httprequest1.request(Method.GET,"/employee/"+Empid);
		Thread.sleep(30);
	}
	
	@Test(priority=1)
	void validate_single_employee_data_returned()
	{
		
		logger.info("*******_checking status and response body*************");
		String responseBody1 = response.getBody().asString();
		System.out.println("Here is the Response Body"+responseBody1);
		logger.info("Response body ==> "+responseBody1);
		Assert.assertEquals(responseBody1.contains(Empid),true);
	}
	
	@Test(priority=2)
	void validate_Status_Code()
	{
		logger.info("*******checking status code*************");		
		logger.info("Response status code is ==> "+response.getStatusCode());
		Assert.assertEquals(+response.getStatusCode(),200);
	}
	
}
