package com.restAssured.employee.base;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import static io.restassured.RestAssured.*;

/**
 * 
89 * @author NISARGA
 *
 */
public class BaseLib implements IConstants
{
public static ExtentReports extentreports;
public static ExtentTest extenttest;
public static ExtentHtmlReporter extenthtmlreporter;
public String testCaseName;

/**
 * to initialize the URI,port and authentication
 */
@BeforeSuite
public void congig()
{
	baseURI=BASE_URI;
	//port=4444;
	//given().auth().basic(username.password);
}
}
