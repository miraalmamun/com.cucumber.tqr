package com.qtpselenium.practice;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qtpselenium.util.ExtentManager;

public class Temp {

	public static void main(String[] args) 
	{
		
		ExtentReports rep = ExtentManager.getInstance(System.getProperty("user.dir")+"\\ExtentReports\\");
		ExtentTest test = rep.createTest("TestA");
		test.log(Status.INFO, "Starting test A");
		test.log(Status.INFO, "Executing");
		test.log(Status.FAIL, "Failed");
		

		ExtentReports rep1 = ExtentManager.getInstance("C:\\Users\\Mir\\eclipse-workspace\\ExtentReports\\");
		ExtentTest test1 = rep1.createTest("TestA");
		test1.log(Status.INFO, "Starting test A");
		test1.log(Status.INFO, "Executing");
		test1.log(Status.FAIL, "Failed");
		
		
		rep.flush();
		
	}

}
