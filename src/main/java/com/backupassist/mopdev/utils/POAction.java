package com.backupassist.mopdev.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.TestException;

public class POAction {

	
	/**
     * Function: Click a button for specified text.
     * @param key
     */
	
	public static Actions ACT=new Actions(GlobalVariables.getWebDriver());
    public static WebDriverWait wait = new WebDriverWait(GlobalVariables.DRIVER, GlobalVariables.WaitTIMEOUT);
      
    public static void clickButton(String buttonText) {
     	GlobalVariables.LOGGER.debug("Enter " + Thread.currentThread().getStackTrace()[1].getClassName() 
    			+ "->" + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
     	try {
     		GlobalVariables.LOGGER.debug("click Button:" + buttonText);
     		TestWorkAround.waitForElementToBeClickable(POFinder.getButton(buttonText));
     		ACT.click(POFinder.getButton( buttonText )).perform();
     		//POFinder.getButton( buttonText ).click();
     	} catch(Exception e){
        	 e.printStackTrace();
         }
    }
   
    public static void clickButtonByClass(String className,String buttonText) {
     	GlobalVariables.LOGGER.debug("Enter " + Thread.currentThread().getStackTrace()[1].getClassName() 
    			+ "->" + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
     	try {
     		GlobalVariables.LOGGER.debug("click Button:" + buttonText);
     		TestWorkAround.waitForElementToBeClickable(POFinder.getButtonByClass(className,buttonText));
     		ACT.click(POFinder.getButtonByClass(className, buttonText)).perform();
     		//POFinder.getButton( buttonText ).click();
     	} catch(Exception e){
        	 e.printStackTrace();
         }
    }
   
    public static void clickMenu( String text) {
     	GlobalVariables.LOGGER.debug("Enter " + Thread.currentThread().getStackTrace()[1].getClassName() 
    			+ "->" + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
     	try {
     		GlobalVariables.LOGGER.debug("click Menu:" + text);
     		TestWorkAround.waitForElementToBeClickable(POFinder.getMenu(text));
     		ACT.click(POFinder.getMenu(text)).perform();
     	} catch(Exception e){
        	 e.printStackTrace();
         }
    }
    public static void clickLink( String linkText) {
     	GlobalVariables.LOGGER.debug("Enter " + Thread.currentThread().getStackTrace()[1].getClassName() 
    			+ "->" + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
     	try {
     		GlobalVariables.LOGGER.debug("click Menu:" + linkText);
     		TestWorkAround.waitForElementToBeClickable(POFinder.getLink(linkText));
     		ACT.click(POFinder.getLink(linkText)).perform();
     	} catch(Exception e){
        	 e.printStackTrace();
         }
    }
      
    public static void enterTextInInput(String inputText,String inputName){
      	GlobalVariables.LOGGER.debug("Enter " + Thread.currentThread().getStackTrace()[1].getClassName() 
    			+ "->" + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
     	
     	try {
     		GlobalVariables.LOGGER.debug("input "+ inputText +"  into field:" + inputName);
     		if(POFinder.getInputByName(inputName)!=null){
     			
     			GlobalVariables.LOGGER.debug("the input element is found for :"+inputName);
     	 		//ACT.moveToElement(POFinder.getInputByName(inputName));
     	 		POFinder.getInputByName(inputName).click();
         		ACT.sendKeys(POFinder.getInputByName(inputName), inputText).perform();
      	  	
     		}  else {
     			throw new Exception("The input element did not exists!");
     		}
       	} catch(Exception e){
        	 e.printStackTrace();
         }
 
    }
    
    

    public static void sleep(final long millis) {
        System.out.println((String.format("sleeping %d ms", millis)));
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}
