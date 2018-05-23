package com.backupassist.mopdev.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.backupassist.mopdev.utils.GlobalVariables;
//import com.paulhammant.ngwebdriver.*;

public class POFinder {
	
	public static WebDriver WB=GlobalVariables.DRIVER;

	public static WebElement getMenu(String text) {
    	GlobalVariables.LOGGER.debug("Enter " + Thread.currentThread().getStackTrace()[1].getClassName() 
    			+ "->" + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

		try {
			WebElement searchResult =WB.findElement(By.xpath("//span[contains(text(),'"+text+"')]"));
			return searchResult;
		   
		} catch(org.openqa.selenium.ElementNotVisibleException e){
			e.printStackTrace();
			throw e;
		}
	
	}

	public static WebElement getButton(String text) {
    	GlobalVariables.LOGGER.debug("Enter " + Thread.currentThread().getStackTrace()[1].getClassName() 
    			+ "->" + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

		try {
			WebElement searchResult =WB.findElement(By.xpath("//button[contains(text(),'"+text+"')]"));// WB.findElement(By.xpath("//button[contains(text(),'"+text+"']"));//tagName("button"));//.linkText(text));
		/**	if(searchResult==null){
				searchResult =WB.findElement(By.xpath("//button//span[contains(text(),'"+text+"')]"));
			}
			*/
			TestWorkAround.waitForElementToBeVisible(searchResult);
			
			System.out.println("text is: "+searchResult.getText());
			
					
				return searchResult;
			
		} catch(org.openqa.selenium.ElementNotInteractableException e){
			e.printStackTrace();
			throw e;
		}
   }
	
	public static WebElement getButtonByClass(String className,String buttonText) {
    	GlobalVariables.LOGGER.debug("Enter " + Thread.currentThread().getStackTrace()[1].getClassName() 
    			+ "->" + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

		try {
			List<WebElement>  searchResult =WB.findElements(By.className(className));// WB.findElement(By.xpath("//button[contains(text(),'"+text+"']"));//tagName("button"));//.linkText(text));
		/**	if(searchResult==null){
				searchResult =WB.findElement(By.xpath("//button//span[contains(text(),'"+text+"')]"));
			}
			*/
			TestWorkAround.waitForElementToBeVisible(searchResult.get(0));
			
			System.out.println("text is: "+searchResult.get(0).getText());
			int index=0;
			for(int i=0;i<searchResult.size();i++){
				if (searchResult.get(i).getText().equals(buttonText)) {
					index=i;
					System.out.println("index is :"+index);
					break;
				}
			}
				return searchResult.get(index);
			
		} catch(org.openqa.selenium.ElementNotInteractableException e){
			e.printStackTrace();
			throw e;
		}
   }
	
	public static WebElement getLabel(String text) {
    	GlobalVariables.LOGGER.debug("Enter " + Thread.currentThread().getStackTrace()[1].getClassName() 
    			+ "->" + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

		try {
			WebElement searchResult =WB.findElement(By.xpath("//span[contains(text(),'"+text+"')]"));
					return searchResult;
		   
		} catch(org.openqa.selenium.ElementNotInteractableException e){
			e.printStackTrace();
			throw e;
		}
   }
	public static boolean isTableCellExist(String text,String tableID) {
    	GlobalVariables.LOGGER.debug("Enter " + Thread.currentThread().getStackTrace()[1].getClassName() 
    			+ "->" + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

		try {
	       	 WebElement table_element = WB.findElement(By.id(tableID));
		        List<WebElement> tr_collection=table_element.findElements(By.xpath("//tbody/tr"));

		       // System.out.println("NUMBER OF ROWS IN THIS TABLE = "+tr_collection.size());
		        int row_num,col_num,index,row_index,col_index;
		       
		        row_num=1;
		        index=-1;
		        row_index=-1;//no found
		        col_index=-1;//no found
		        for(WebElement trElement : tr_collection)
		        {
		            List<WebElement> td_collection=trElement.findElements(By.xpath("td"));
		            System.out.println("NUMBER OF COLUMNS="+td_collection.size());
		            col_num=1;
		            for(WebElement tdElement : td_collection)
		            {
		                System.out.println("row # "+row_num+", col # "+col_num+ "text="+tdElement.getText());
		                if(tdElement.getText().equals(text)){
		                	//index=row_num*col_num-1;
		                	row_index=row_num-1;
		                	col_index=col_num-1;
		                    System.out.println("text index for :"+ text +" is:"+index);
		                	break;
		                }
		               
		                col_num++;
		            }
		            row_num++;
		        } 
					if((row_index>=0) && (col_index>=0)) {
						return true;
					} else {
						return false;
					}
		   
		} catch(org.openqa.selenium.ElementNotInteractableException e){
			e.printStackTrace();
			throw e;
		}
   }
	
	public static WebElement getLink(String linkText){
		GlobalVariables.LOGGER.debug("Enter " + Thread.currentThread().getStackTrace()[1].getClassName() 
		    		+ "->" + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

	try {
		WebElement searchResult =WB.findElement(By.linkText(linkText));
				return searchResult;
	   
	} catch(org.openqa.selenium.ElementNotInteractableException e){
		e.printStackTrace();
		throw e;
	}
	}
	
	public static WebElement getElementByClass(String className) {
    	GlobalVariables.LOGGER.debug("Enter " + Thread.currentThread().getStackTrace()[1].getClassName() 
    			+ "->" + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

		try {
			List <WebElement> searchResult =WB.findElements(By.xpath("//*[@class='"+className+"']"));//(By.cssSelector(className));//WB.findElement(By.xpath("//div[contains(@class,'"+className+"')]"));
			if(searchResult.size()>0){
				TestWorkAround.waitForElementToBeVisible(searchResult.get(0));
				
				//System.out.println("text is: "+searchResult.get(0).getAttribute("text"));
				
				System.out.println("text is: "+searchResult.get(0).getText());
	
				
				//System.out.println("size  is: "+searchResult.size());
						}
			return searchResult.get(0);
		   
		} catch(NoSuchElementException e){
			e.printStackTrace();
			throw e;
		}
   }
  	
	public static WebElement getElementByID(String id) {
		   
		  GlobalVariables.LOGGER.debug("Enter " + Thread.currentThread().getStackTrace()[1].getClassName() 
				+ "->" + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
	
		try {
			List <WebElement> searchResult =WB.findElements(By.id(id));//*[@class='"+className+"']"));//(By.cssSelector(className));//WB.findElement(By.xpath("//div[contains(@class,'"+className+"')]"));
			if(searchResult.size()>0){
			
				TestWorkAround.waitUntilElementIsDisplayedOnScreen(By.id(id));
				System.out.println("text is: "+searchResult.get(0).getText());
				
				System.out.println(searchResult.get(0).isDisplayed());
						
				//System.out.println("size  is: "+searchResult.size());
						}
			return searchResult.get(0);
		   
		} catch(NoSuchElementException e){
			e.printStackTrace();
			throw e;
		}
    }
	/**
     * Function: Get an input area for specified label. For example: the input area for "Job Name". Please note, the tag
     *           name may be "input", "ion-textarea" or others. But for now, I assume the class always includes "text-input"
     * @param key 
	 * @throws Exception 
     */
    static WebElement getInputByName(String name) {
    	GlobalVariables.LOGGER.debug("Enter " + Thread.currentThread().getStackTrace()[1].getClassName() 
    			+ "->" + Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
    	try {
			WebElement searchResult = WB.findElement(By.name(name));
			
			if(searchResult!=null){
        		return searchResult;
			}  else {
				GlobalVariables.LOGGER.debug("The input element did not exists!");
				return null;
     		}
		   
		} catch(org.openqa.selenium.ElementNotInteractableException e){
			e.printStackTrace();
			throw e;
		}     
   
    }
    
    
  
}
