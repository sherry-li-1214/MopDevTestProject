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
import com.backupassist.mopdev.object.pageobject.*;
import com.backupassist.mopdev.action.*;

public class TestCase_Navigation extends TestBase {
  @Test
  public void f() {
	  try{
		  //click the "dashboard" menu and check the page element
		  DashBoardPage.clickMenuDashboard();
		  Thread.sleep(GlobalVariables.ThinkTime*1000);
		  try {
		     Assert.assertEquals(POFinder.getElementByClass("ibox-title").getText().trim(),"Snap shot of last status of your backup jobs" );//Snap shot of last status of your backup jobs
		  } catch(Throwable t){
			  t.printStackTrace();
		  }
		  //click the "client and sites" menu and check the page element
		  DashBoardPage.clickMenuClientsAndSites();
		  Thread.sleep(GlobalVariables.ThinkTime*1000);
		  
		 //click the "clients" menu and check the page element
		  DashBoardPage.clickMenuClients();
		  Thread.sleep(GlobalVariables.ThinkTime*1000);
	      Assert.assertEquals(POFinder.getButton("Add Client").isDisplayed(),true );//Snap shot of last status of your backup jobs

		  //click the "sites" menu and check the page element
		  DashBoardPage.clickMenuSites();
		  Thread.sleep(GlobalVariables.ThinkTime*1000);
		    Assert.assertEquals(POFinder.getButton("Add Site").isDisplayed(),true );//Snap shot of last status of your backup jobs
		   
		   //click the "installation" menu and check the page element
		   DashBoardPage.clickMenuInstallations();
		   Thread.sleep(GlobalVariables.ThinkTime*1000);
		   
		   Assert.assertEquals(POFinder.getElementByClass("col-sm-12").getText().trim(),"Installations" );//Snap shot of last status of your backup jobs
		  
		     //click the "reports" menu and check the page element
		   DashBoardPage.clickMenuReports();
		   Thread.sleep(GlobalVariables.ThinkTime*1000);
		
		   DashBoardPage.clickMenuJobIn24h();
		   Thread.sleep(GlobalVariables.ThinkTime*1000);
		   Assert.assertEquals(GlobalVariables.DRIVER.getCurrentUrl().contains("/#/report-24-hour"),true);	   
		
		   DashBoardPage.clickMenuLastReport();
		   Thread.sleep(GlobalVariables.ThinkTime*1000);
		   Assert.assertEquals(GlobalVariables.DRIVER.getCurrentUrl().contains("/#/report-last-job-status"),true);	   
		   
		   DashBoardPage.clickMenuAllReports();
		   Thread.sleep(GlobalVariables.ThinkTime*1000);
		   Assert.assertEquals(GlobalVariables.DRIVER.getCurrentUrl().contains("/#/backup-jobs"),true);	   
		  
		   
		   DashBoardPage.clickMenuDatagrowth();
		   Thread.sleep(GlobalVariables.ThinkTime*1000);
		   Assert.assertEquals(GlobalVariables.DRIVER.getCurrentUrl().contains("/#/report-data-growth"),true);	   
	
		   DashBoardPage.clickMenuTimeAnalysis();
		   Thread.sleep(GlobalVariables.ThinkTime*1000);
		   Assert.assertEquals(GlobalVariables.DRIVER.getCurrentUrl().contains("/#/report-time-growth"),true);	   
	
	
		   //click the "back up warnings" menu and check the page element
		   DashBoardPage.clickMenuBackupWarnings();
		 // ClientServerCommunicate  cs=new ClientServerCommunicate();
		  Thread.sleep(GlobalVariables.ThinkTime*1000);
		   Assert.assertEquals(GlobalVariables.DRIVER.getCurrentUrl().contains("/#/backup-warnings"),true);	   
			  
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
