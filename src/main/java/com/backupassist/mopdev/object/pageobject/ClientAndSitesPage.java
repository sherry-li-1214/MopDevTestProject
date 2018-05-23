package com.backupassist.mopdev.object.pageobject;

import org.testng.TestException;

import com.backupassist.mopdev.utils.POAction;

public class ClientAndSitesPage extends PageBase{
	
	   public static void clickButtonAddClient() {
	          try {
	        	POAction.clickButton("Add Client");
	          } catch (Exception e) {
	              System.out.println("navigation to Dashboard failed ");
	              throw new TestException("URL did not load");
	          }	      }

	     

	      public static void enterOrgnization(String organization) {
	          try {
	        	POAction.enterTextInInput(organization,"company");
	          } catch (Exception e) {
	              System.out.println("Enter company failed");
	              throw new TestException("URL did not load");
	          }
	      }
	 
	     public static void enterAddress(String address) {
	          try {
	        	POAction.enterTextInInput(address,"address");
	          } catch (Exception e) {
	              System.out.println("enter address failed ");
	              throw new TestException("URL did not load");
	          }
	     }
	     
	     public static void enterCity(String city) {
	          try {
	        	POAction.enterTextInInput(city,"city");
	          } catch (Exception e) {
	              System.out.println("enter city failed ");
	              throw new TestException("URL did not load");
	          }
	     }
	 
	     public static void enterPostCode(String post_code) {
	          try {
	        	POAction.enterTextInInput(post_code,"post_code");
	          } catch (Exception e) {
	              System.out.println("enter post code failed ");
	              throw new TestException("URL did not load");
	          }
	     }
	     
	     public static void enterCountry(String country) {
	          try {
	        	POAction.enterTextInInput(country,"country");
	          } catch (Exception e) {
	              System.out.println("enter country failed ");
	              throw new TestException("URL did not load");
	          }
	     }
	     
	     public static void enterCompanyPhone(String company_phone) {
	          try {
	        	POAction.enterTextInInput(company_phone,"company_phone");
	          } catch (Exception e) {
	              System.out.println("enter company phone failed ");
	              throw new TestException("URL did not load");
	          }
	     }
	     

	     
	     public static void enterTitle(String title) {
	          try {
	        	POAction.enterTextInInput(title,"title");
	          } catch (Exception e) {
	              System.out.println("enter title failed ");
	              throw new TestException("URL did not load");
	          }
	     }
	     
	     public static void enterFirstName(String first_name) {
	          try {
	        	POAction.enterTextInInput(first_name,"first_name");
	          } catch (Exception e) {
	              System.out.println("enter first name failed ");
	              throw new TestException("URL did not load");
	          }
	     }
	     
	     public static void enterLastName(String last_name) {
	          try {
	        	POAction.enterTextInInput(last_name,"last_name");
	          } catch (Exception e) {
	              System.out.println("enter last name failed ");
	              throw new TestException("URL did not load");
	          }
	     }
	     
	     public static void enterEmail(String email) {
	          try {
	        	POAction.enterTextInInput(email,"email");
	          } catch (Exception e) {
	              System.out.println("enter email failed ");
	              throw new TestException("URL did not load");
	          }
	     }
	     public static void enterContactPhone(String phone) {
	          try {
	        	POAction.enterTextInInput(phone,"phone");
	          } catch (Exception e) {
	              System.out.println("enter phone failed ");
	              throw new TestException("URL did not load");
	          }
	     }    
	     
	     public static void clickButtonSubmit() {
	          try {
	        	  POAction.clickButtonByClass("btn-success","Submit");
	          } catch (Exception e) {
	              System.out.println("Click submit button failed ");
	              throw new TestException("URL did not load");
		      }
		 }
	     
	     public static void clickButtonDiscard() {
	          try {
	        	  POAction.clickButtonByClass("btn-danger","Discard");
	          } catch (Exception e) {
	              System.out.println("Click discard button failed ");
	              throw new TestException("URL did not load");
		      }
		 }
	     
	     
	     public static void clickAlertOK() {
	         try {
	        	  POAction.clickButton("OK");
	          } catch (Exception e) {
	              System.out.println("Click discard button failed ");
	              throw new TestException("URL did not load");
		      }
		 }    	 
	     
	     
}
