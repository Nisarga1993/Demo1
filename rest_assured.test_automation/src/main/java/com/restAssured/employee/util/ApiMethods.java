package com.restAssured.employee.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

import org.apache.poi.EncryptedDocumentException;

import io.restassured.http.ContentType;
import io.restassured.internal.util.IOUtils;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

/**
 * 
 * @author NISARGA
 *
 */
public class ApiMethods 
{
public static Response executeRequest(String testCaseName,String excelPath,String sheetName) throws EncryptedDocumentException, IOException
{
	LinkedHashMap reqPara = ExcelLib.getRequestParameters(testCaseName, excelPath, sheetName);
	String httpMethod= reqPara.get("HTTPMethod").toString();
	
	switch (httpMethod)
	{
	case "GET":
		
	return 
		given()
		.queryParam("queryPara", reqPara.get("QueryParameter").toString())
        .when()
        .get(reqPara.get("EndPoint").toString());
		
	case "POST":
		try
		{
			FileInputStream fis = new FileInputStream(
			System.getProperty("user.dir")+"\\src\\test\\resources\\json\\" +testCaseName +".json");
	  return 
		 given()
		 .contentType(ContentType.JSON)
		 .and()
		 .body(IOUtils.toByteArray(fis))
		 .when()
		 .post(reqPara.get("EndPoint").toString());
		}
		catch (IOException e)
		{
          }
	
	case "PUT":
	case "Delete":
}
return null;
}
}
