package com.backupassist.mopdev.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.TestException;

public class TestWorkAround {

	
	/**
     * Function: Click a button for specified text.
     * @param key
     */
	
	public static Actions ACT=new Actions(GlobalVariables.getWebDriver());
    public static WebDriverWait wait = new WebDriverWait(GlobalVariables.DRIVER, GlobalVariables.WaitTIMEOUT);
      
    
    public  static void waitForElementToBeVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            throw new NoSuchElementException(String.format("The following element was not visible: %s", element));
        }
    }
    
    public void waitForElementToBeVisible(By selector) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(selector));
        } catch (Exception e) {
            throw new NoSuchElementException(String.format("The following element was not visible: %s", selector));
        }
    }

    public static void waitUntilElementIsDisplayedOnScreen(By selector) {
        try {
           // wait = new WebDriverWait(webDriver, timeout);
            wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
        } catch (Exception e) {
            throw new NoSuchElementException(String.format("The following element was not visible: %s ", selector));
        }
    }

    public static void waitForElementToBeClickable(By selector) {
        try {
           // wait = new WebDriverWait(webDriver, timeout);
            wait.until(ExpectedConditions.elementToBeClickable(selector));
        } catch (Exception e) {
            throw new TestException("The following element is not clickable: " + selector);
        }
    }
    public static void waitForElementToBeClickable(WebElement element) {
        try {
           // wait = new WebDriverWait(webDriver, timeout);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            throw new TestException("The following element is not clickable: " + element.getText());
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
