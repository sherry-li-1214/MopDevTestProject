package com.backupassist.mopdev.utils;

import org.openqa.selenium.WebDriver;
//import com.paulhammant.ngwebdriver.NgWebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.*;
import com.backupassist.mopdev.utils.*;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

public class GlobalVariables {
    public static Logger LOGGER = LogManager.getRootLogger();
	public static TestProperties TESTPROP = loadTestProperty();
    public static String HOST  = TESTPROP.getProperty("test.console.host");
    public static String PORT = TESTPROP.getProperty("test.console.port");
    public static String BROWSERTYPE=TESTPROP.getProperty("test.browsertype");
    
    public static String CHROMEDRIVERPATH=TESTPROP.getProperty("test.chromedriver.path"); 
    public static String FIREFOXDRIVERPATH=TESTPROP.getProperty("test.firefoxdriver.path"); 
    public static String IEDRIVERPATH=TESTPROP.getProperty("test.iedriver.path"); 
    //public static BrowserType BROWSERTYPE=BrowserType.CHROME;
    public static String URL = "http://" + HOST + ":" + PORT;
    public static WebDriver DRIVER;
    
    public static long PageLoadTIMEOUT=Long.parseLong(TESTPROP.getProperty("test.pageload.timeout"));
    public static long ScriptTIMEOUT=Long.parseLong(TESTPROP.getProperty("test.script.timeout"));
    public static long WaitTIMEOUT=Long.parseLong(TESTPROP.getProperty("test.pageload.timeout"));
    
    
    public static String Kyn_Navigate_Dashboard=TESTPROP.getProperty("test.navigation.Dashboard");
    public static String Kyn_Navigate_ClientAndSites=TESTPROP.getProperty("test.navigation.ClientAndSites");
    public static String Kyn_Navigate_Clients=TESTPROP.getProperty("test.navigation.Clients");
    public static String Kyn_Navigate_Sites=TESTPROP.getProperty("test.navigation.Sites");
    public static String Kyn_Navigate_Installations=TESTPROP.getProperty("test.navigation.Installations");
    public static String Kyn_Navigate_Reports=TESTPROP.getProperty("test.navigation.Reports");
    public static String Kyn_Navigate_ReportsIn24=TESTPROP.getProperty("test.navigation.ReportsIn24");
    public static String Kyn_Navigate_LastStatusOfReport=TESTPROP.getProperty("test.navigation.LastStatusOfReport");
    public static String Kyn_Navigate_AllReports=TESTPROP.getProperty("test.navigation.AllReports");
    public static String Kyn_Navigate_Datagrowth=TESTPROP.getProperty("test.navigation.Datagrowth");
    public static String Kyn_Navigate_TimeAnalysis=TESTPROP.getProperty("test.navigation.TimeAnalysis");
    public static String Kyn_Navigate_BackupWarnings=TESTPROP.getProperty("test.navigation.BackupWarnings");
    
    public static long ThinkTime=Long.parseLong(TESTPROP.getProperty("test.step.thinktime"));
    
    public static JSONObject json;
    
	//public static NgWebDriver BROWSER;
	
    public static TestProperties loadTestProperty() {
      	GlobalVariables.LOGGER.debug("Enter " + Thread.currentThread().getStackTrace()[1].getClassName() 
    			+ "->" + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

    	TestProperties prop = new TestProperties();
      	
     	try {
     		LOGGER.debug("Reading test property file:" + System.getProperty("test.propertyFile"));
      		InputStream input = new FileInputStream(System.getProperty("test.propertyFile"));
      		prop.load(input);
        }
      	catch (IOException e){
      		e.printStackTrace();
      	}
  		return prop;
  	     	
  	
    }
    
    public static void sleep(long time){
      	GlobalVariables.LOGGER.debug("Enter " + Thread.currentThread().getStackTrace()[1].getClassName() 
    			+ "->" + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
   	
    	try {
    		
    	} catch(Exception e){
    		e.printStackTrace();
    	}
    }
    
    public static WebDriver getWebDriver(){
    	if(DRIVER!=null) {
    		return DRIVER;
    	}
      	GlobalVariables.LOGGER.debug("Enter " + Thread.currentThread().getStackTrace()[1].getClassName() 
    			+ "->" + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

    	LOGGER.debug("begin to get webdriver:");
		BrowserType browserType=BrowserType.CHROME;
		String driverPath=CHROMEDRIVERPATH;
		switch (BROWSERTYPE) {
		case "FIREFOX":
			browserType=BrowserType.FIREFOX;
			driverPath=FIREFOXDRIVERPATH;
			break;
		case  "IE":
			browserType=BrowserType.IE;
			driverPath=IEDRIVERPATH;
        	break;
		default:
  			browserType=BrowserType.CHROME;
			driverPath=CHROMEDRIVERPATH;
		}
		
		DRIVER=DriverUtils.getDriver(browserType, driverPath);
		DRIVER.manage().timeouts().implicitlyWait(WaitTIMEOUT, TimeUnit.SECONDS);
		DRIVER.manage().timeouts().setScriptTimeout(ScriptTIMEOUT, TimeUnit.SECONDS);
		DRIVER.manage().timeouts().pageLoadTimeout(PageLoadTIMEOUT, TimeUnit.SECONDS);
		return DRIVER;			
       	
    }
    
    /**
     * Function: read json from json file
     * @param fileName:json file name
     * @param key:json key 
     * @throws Exception
     */
     public static JSONObject readJSON(String fileName) {
    	    // Convert JSON string to JSONObject
    	      
            try {
        	    File file = new File(fileName);
        	    String content = FileUtils.readFileToString(file, "utf-8");
        
            	json = new JSONObject(content);
		    	return json;
		    } catch (Exception e) {
	           throw new RuntimeException("Failed to convert JSON String document into a JSON Object.", e);
	        }
     }
   
     
     /**
      * Function: read json string from json file
      * @param fileName:json file name
      * @param key:json key 
      * @throws Exception
      */
      public static String readJSON(String fileName, String key) throws Exception {
     	    File file = new File(fileName);
     	    String content = FileUtils.readFileToString(file, "utf-8");
     	    // Convert JSON string to JSONObject
            try {
 		    	JSONObject  documentObj = new JSONObject(content);
 		    	String value = documentObj.getString(key);
 		    	return value;
 		    } catch (Exception e) {
 	           throw new RuntimeException("Failed to convert JSON String document into a JSON Object.", e);
 	        }
      }
      
      public static void  cleanup() throws Exception {
        	GlobalVariables.LOGGER.debug("Enter " + Thread.currentThread().getStackTrace()[1].getClassName() 
      			+ "->" + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
           DRIVER.manage().deleteAllCookies();
           DRIVER.manage();
         	DRIVER.close();
        	DRIVER.quit();
        	
        	
        	
      }
}
