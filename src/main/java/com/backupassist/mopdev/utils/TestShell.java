package com.backupassist.mopdev.utils;

import com.backupassist.mopdev.utils.*;
/**
* This class provides all common functions used for test logic. Ideally, none functions should use element(by) to locate a web element.
*/
public class TestShell {
    private static long caseNumber = 0;

    TestShell() {
      //  GlobalVariables.LOGGER.debug("Initialize constructor() of " + __filename.split("\\")[__filename.split("\\").length - 1]);
    }

    /**
     * Function: Call this from beforeAll() to do common initialization for each suite
     */
   public static void initBeforeAll(String filename ) {
            //Utils.logger.start();
        	GlobalVariables.LOGGER.info("********************************************************************************************************");
        	GlobalVariables.LOGGER.info("       Spec: " + filename);
        	GlobalVariables.LOGGER.info("********************************************************************************************************");
    
        	closeAllWindows();
    }

    /**
     * Function: Call this from beforeEach() to do common initialization for each case
     */
    public static void initBeforeEach(String casename ){
            caseNumber++;
            GlobalVariables.LOGGER.info("---------------------Test Case " + caseNumber + ": " + casename + "---------------------");
     
    }

    /**
     * Function: Call this from afterAll() to do common clean up for each suite
     * @throws Exception 
     */
    public static void cleanupAfterAll() {
     
       try{
    	   closeAllWindows();
    	  // DriverUtils.tearDown();
        } catch(Exception e){
    	   e.printStackTrace();
       }
         
       // GlobalVariables.DRIVER...executeScript("window.sessionStorage.clear()");
        // GlobalVariables.DRIVER.executeScript("window.localStorage.clear()");
    }
    
    
    public static void closeAllWindows() {
        try {
        	 if(GlobalVariables.DRIVER==null) {
       		GlobalVariables.getWebDriver();
       	 }
       	 
       	 if(GlobalVariables.DRIVER.getWindowHandles().size()>0) {
       		 
       		GlobalVariables.LOGGER.debug("current browser window handlers number is:"+GlobalVariables.DRIVER.getWindowHandles().size());
       	    for(String handle : GlobalVariables.DRIVER.getWindowHandles()) {
       	    	GlobalVariables.DRIVER.switchTo().window(handle);
       	    	GlobalVariables.DRIVER.close();
           	    }
       	    
       	 GlobalVariables.DRIVER.quit();
      	 }
   	
        } catch(Exception e){
       	 throw e;
        }
       }
    
}
