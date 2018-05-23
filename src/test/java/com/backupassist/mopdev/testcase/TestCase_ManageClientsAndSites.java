package com.backupassist.mopdev.testcase;

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
import org.testng.Assert;

//import org.openqa.selenium.WebDriver;

import com.backupassist.mopdev.utils.*;
import com.backupassist.mopdev.object.commonobject.ClientInformation;
import com.backupassist.mopdev.object.pageobject.*;
import com.backupassist.mopdev.action.*;

public class TestCase_ManageClientsAndSites extends TestBase {
  @Test
  public void f() {
	  try{
		  //click the "dashboard" menu and check the page element
		  DashBoardPage.clickMenuDashboard();
		  Thread.sleep(GlobalVariables.ThinkTime*1000);
		  DashBoardPage.clickMenuClientsAndSites();
		  Thread.sleep(GlobalVariables.ThinkTime*1000);
		  
		 //click the "clients" menu and check the page element
		  DashBoardPage.clickMenuClients();
		  Thread.sleep(GlobalVariables.ThinkTime*1000);
	      Assert.assertEquals(POFinder.getButton("Add Client").isDisplayed(),true );//Snap shot of last status of your backup jobs
          
	      ClientInformation client=new ClientInformation();
	      client.loadClientFromJSON(GlobalVariables.readJSON(GlobalVariables.TESTPROP.getProperty("test.testdatafile.clientsandsites")));
	      
	      WorkFlow.addClient(client);
	      
	      
		  Thread.sleep(GlobalVariables.ThinkTime*1000);
		  
			  
	      Assert.assertEquals(POFinder.isTableCellExist(client.getCompany(),"clients-management"),true );//Snap shot of last status of your backup jobs
	      
		 // cs.testAuthorizeValidPassword();
		
		
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

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  
   // super.beforeSuite();
  
  }

  @AfterSuite
  public void afterSuite() {
	//super.afterTest();	  
	 // super.afterSuite();
	  
  }

}
