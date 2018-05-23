package com.backupassist.mopdev.testcase;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
//import org.testng.Reporter;

//import org.openqa.selenium.WebDriver;

import com.backupassist.mopdev.utils.*;
import com.backupassist.mopdev.object.pageobject.*;
import com.backupassist.mopdev.action.*;

public class TestCase_Login extends TestBase{
  
	
  public static String TestDataFile=GlobalVariables.loadTestProperty().getProperty("test.testdatafile.account");
  public static JSONObject json=GlobalVariables.readJSON(TestDataFile);
	  
	@Test
  public void f() {
		JSONObject login=json.getJSONObject("Login");
		WorkFlow.logIn(login.getString("Email"),login.getString("Password"));
		 Assert.assertTrue(true);
      try{
		  Thread.sleep(GlobalVariables.WaitTIMEOUT);
	  } catch(Exception e){
		  e.printStackTrace();
	  }
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest(alwaysRun=true)
  public void afterTest() {
	//  super.afterTest();
  }

  @BeforeSuite
  public void beforeSuite() {
  
   // super.beforeSuite();
  
  }

  @AfterSuite
  public void afterSuite() {
	//super.afterTest();	  
	  super.afterSuite();
	  
  }

}
