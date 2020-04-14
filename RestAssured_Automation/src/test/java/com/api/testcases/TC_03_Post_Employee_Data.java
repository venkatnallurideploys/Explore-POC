package com.api.testcases;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.api.base.Testbase;
import com.api.utilities.Excel_Utility;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_03_Post_Employee_Data extends Testbase {
	
	
	int rownum ,colcount ;
	String path  = "E:\\eclipse\\Yaliyomo\\Test_Data\\Employee_Data_5.xlsx";
	
	int x=1;
	@DataProvider(name = "EmployeeData")	
	String [][] getEmployeeData() throws IOException
		{
		
			logger.info("**********Posting Data*****************");
		
			//String path  = "E:\\eclipse\\Yaliyomo\\Test_Data\\Employee_Data.xlsx";				
			int rownum = Excel_Utility.intRowCount1(path, "Employee_data");
			int colcount = Excel_Utility.intCellCount1(path, "Employee_data", 1);			
			String RetailerData[][] = new String[rownum][colcount];
			
			for(int i=1 ;i<=rownum;i++)
			{	
				for(int j=0;j<colcount;j++)
				{
					RetailerData[i-1][j] = Excel_Utility.getCellData(path, "Employee_data", i, j);
				}
			}
			return (RetailerData);
		}
	
	@Test(dataProvider="EmployeeData")
	void PostEmployeeData(String name1,String salary1,String age1) throws IOException
	{
		
			RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";			
			httprequest1 = RestAssured.given();
			JSONObject requestParams = new JSONObject();
			requestParams.put("name", name1); 
			requestParams.put("salary", salary1);
			requestParams.put("age", age1);
			httprequest1.header("Content-Type","application/json");	
			httprequest1.request().body(requestParams.toJSONString());
			response = httprequest1.request(Method.POST,"/create");
			//System.out.print(response.getStatusCode());
			int getPoststatus = response.getStatusCode();
			Assert.assertEquals(getPoststatus,200);
			String responsebody = response.getBody().asString();
			System.out.println("Json Response  "+responsebody);
			logger.info("Response Body ==> "+responsebody);
			//Excel_Utility.setCellData(path,"Employee_data",x,3,responsebody);
			x++;
	}
	
	/*void copyResult_toExcel() throws IOException
	{
		int rownum = Excel_Utility.intRowCount1(path, "Employee_data");
		int colcount = Excel_Utility.intCellCount1(path, "Employee_data", 1);
		String Response_JsonData[][] = new String[rownum][colcount];
		
		for(int i =1;i<=rownum;i++)
		{
			Response_JsonData[i-1][3] = Excel_Utility.setCellData(path,"Employee_data",i-1,3,Response_Body);	
		}
	}*/
}
