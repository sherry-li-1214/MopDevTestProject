package com.backupassist.mopdev.object.pageobject;

import org.testng.TestException;

import com.backupassist.mopdev.utils.POAction;
import com.backupassist.mopdev.utils.GlobalVariables;

public class LogInPage extends PageBase{
	public static String PageURL=GlobalVariables.URL+"/login";
	   public static void enterEmail(String email) {
	          try {
	        	POAction.enterTextInInput(email,"email");
	          } catch (Exception e) {
	              System.out.println("Enter email failed");
	              throw new TestException("URL did not load");
	          }
	      }
	     public static void enterPassword(String password) {
	          try {
	        	POAction.enterTextInInput(password,"password");
	          } catch (Exception e) {
	              System.out.println("enter password failed ");
	              throw new TestException("URL did not load");
	          }
	     }
	     public static void clickLoginButton() {
	          try {
	        	  POAction.clickButton("Login");
	          } catch (Exception e) {
	              System.out.println("navigation to Dashboard failed ");
	              throw new TestException("URL did not load");
		      }
		 }
	
	     public static void clickForgotPassword() {
	          try {
	        	  POAction.clickLink("Forgot Password");
	          } catch (Exception e) {
	              System.out.println("navigation to Dashboard failed ");
	              throw new TestException("URL did not load");
		      }
		 }
	     	}
