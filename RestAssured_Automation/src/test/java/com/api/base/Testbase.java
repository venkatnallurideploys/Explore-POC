package com.api.base;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Testbase {

	public static RequestSpecification httprequest1;
	public static Response response;
	
	public String Empid ="14";
	
	public Logger logger;
	
	@BeforeClass
	public void setup()
	{
		logger = Logger.getLogger("EmployeeRestAPI");
		PropertyConfigurator.configure("E:\\eclipse\\Yaliyomo\\log4j.properties");
		logger.setLevel(Level.DEBUG);
	}
	
	
	
}
