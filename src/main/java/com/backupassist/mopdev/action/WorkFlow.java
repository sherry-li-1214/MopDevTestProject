package com.backupassist.mopdev.action;

import com.backupassist.mopdev.object.pageobject.*;
import com.backupassist.mopdev.utils.*;

import com.backupassist.mopdev.object.commonobject.*;

public class WorkFlow {

	public WorkFlow() {
		// TODO Auto-generated constructor stub
	}
	
	public static void logIn(String email,String password){
		//GlobalVariables.DRIVER.navigate(LogInPage.PageURL);
		GlobalVariables.DRIVER.navigate().to(LogInPage.PageURL);
		LogInPage.enterEmail(email);
		LogInPage.enterPassword(password);
		LogInPage.clickLoginButton();
		//Thread.sleep(GlobalVariables.WaitTIMEOUT);
		
	}
	public static void addClient(ClientInformation client){
		//GlobalVariables.DRIVER.navigate(LogInPage.PageURL);
		DashBoardPage.clickMenuClients();
		ClientAndSitesPage.clickButtonAddClient();
		ClientAndSitesPage.enterOrgnization(client.getCompany());
		ClientAndSitesPage.enterAddress(client.getAddress());
		ClientAndSitesPage.enterCity(client.getCity());
		ClientAndSitesPage.enterPostCode(client.getPostCode());
		ClientAndSitesPage.enterCountry(client.getCountry());
		ClientAndSitesPage.enterCompanyPhone(client.getCompanyPhone());
		ClientAndSitesPage.enterTitle(client.getTitle());
		ClientAndSitesPage.enterFirstName(client.getFirstName());
		ClientAndSitesPage.enterLastName(client.getLastName());
		ClientAndSitesPage.enterEmail(client.getEmail());
		ClientAndSitesPage.enterContactPhone(client.getPhone());
		ClientAndSitesPage.clickButtonSubmit();
		ClientAndSitesPage.clickAlertOK();
		
		//LogInPage.enterEmail(email);
		//LogInPage.enterPassword(password);
		//LogInPage.clickLoginButton();
		//Thread.sleep(GlobalVariables.WaitTIMEOUT);
		
	}
	
	public static void deleteClient(ClientInformation client){
		//GlobalVariables.DRIVER.navigate(LogInPage.PageURL);
		DashBoardPage.clickMenuClients();
		ClientAndSitesPage.clickButtonAddClient();
		ClientAndSitesPage.enterOrgnization(client.getCompany());
		ClientAndSitesPage.enterAddress(client.getAddress());
		ClientAndSitesPage.enterCity(client.getCity());
		ClientAndSitesPage.enterPostCode(client.getPostCode());
		ClientAndSitesPage.enterCountry(client.getCountry());
		ClientAndSitesPage.enterCompanyPhone(client.getCompanyPhone());
		ClientAndSitesPage.enterTitle(client.getTitle());
		ClientAndSitesPage.enterFirstName(client.getFirstName());
		ClientAndSitesPage.enterLastName(client.getLastName());
		ClientAndSitesPage.enterEmail(client.getEmail());
		ClientAndSitesPage.enterContactPhone(client.getPhone());
		ClientAndSitesPage.clickButtonSubmit();
		ClientAndSitesPage.clickAlertOK();
		
		//LogInPage.enterEmail(email);
		//LogInPage.enterPassword(password);
		//LogInPage.clickLoginButton();
		//Thread.sleep(GlobalVariables.WaitTIMEOUT);
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
