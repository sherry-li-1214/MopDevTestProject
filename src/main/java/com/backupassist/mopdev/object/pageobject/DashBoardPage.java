package com.backupassist.mopdev.object.pageobject;

import org.testng.TestException;

import com.backupassist.mopdev.utils.GlobalVariables;
import com.backupassist.mopdev.utils.POAction;

public class DashBoardPage extends PageBase{
	
	   public static void clickMenuDashboard() {
	          try {
	        	POAction.clickMenu(GlobalVariables.Kyn_Navigate_Dashboard);
	          } catch (Exception e) {
	              System.out.println("navigation to Dashboard failed ");
	              throw new TestException("URL did not load");
	          }
	      }

	      public static void  clickMenuClientsAndSites() {
	          try {
	        	  POAction.clickMenu(GlobalVariables.Kyn_Navigate_ClientAndSites);
	          } catch (Exception e) {
	              System.out.println("navigation to Clients&Sites failed ");
	              throw new TestException("URL did not load");
		          }
	      }
	      public static void  clickMenuClients() {
	          try {
	        	  POAction.clickLink(GlobalVariables.Kyn_Navigate_Clients);
	          } catch (Exception e) {
	              System.out.println("navigation to Clients failed ");
	              throw new TestException("URL did not load");
		          }
	      }
	      public static void  clickMenuSites() {
	          try {
	        	  POAction.clickLink(GlobalVariables.Kyn_Navigate_Sites);
	          } catch (Exception e) {
	              System.out.println("navigation to Sites failed ");
	              throw new TestException("URL did not load");
		          }
	      }

	      public  static void clickMenuInstallations(){
	          try {
	        	  POAction.clickMenu(GlobalVariables.Kyn_Navigate_Installations);
	          } catch (Exception e) {
	              System.out.println("navigation to Installations failed ");
	              throw new TestException("URL did not load");
		          }
		      }
	      public  static void clickMenuManageAccounts() {
	          try {
	        	  POAction.clickMenu("ManageAccounts");
	          } catch (Exception e) {
	              System.out.println("navigation to ManageAccounts failed ");
	              throw new TestException("URL did not load");
		          }
	      }

	      public static void clickMenuReports() {
	          try {
	        	  POAction.clickMenu(GlobalVariables.Kyn_Navigate_Reports);
	          } catch (Exception e) {
	              System.out.println("navigation to Reports failed ");
	              throw new TestException("URL did not load");
		          }
		      }
	      
	      public static void clickMenuJobIn24h() {
	          try {
	        	  POAction.clickLink(GlobalVariables.Kyn_Navigate_ReportsIn24);
	          } catch (Exception e) {
	              System.out.println("navigation to URL failed ");
	              throw new TestException("URL did not load");
		          }
	      }
	      public static void clickMenuLastReport() {
	          try {
	        	  POAction.clickLink(GlobalVariables.Kyn_Navigate_LastStatusOfReport);
	          } catch (Exception e) {
	              System.out.println("navigation to URL failed ");
	              throw new TestException("URL did not load");
		          }
	      }
	      public static void clickMenuAllReports() {
	          try {
	        	  POAction.clickLink(GlobalVariables.Kyn_Navigate_AllReports);
	          } catch (Exception e) {
	              System.out.println("navigation to URL failed ");
	              throw new TestException("URL did not load");
		          }
	      }
	      public static void clickMenuDatagrowth() {
	          try {
	        	  POAction.clickLink(GlobalVariables.Kyn_Navigate_Datagrowth);
	          } catch (Exception e) {
	              System.out.println("navigation to URL failed ");
	              throw new TestException("URL did not load");
		          }
	      }
	      
	      public static void clickMenuTimeAnalysis() {
	          try {
	        	  POAction.clickLink(GlobalVariables.Kyn_Navigate_TimeAnalysis);
	          } catch (Exception e) {
	              System.out.println("navigation to URL failed ");
	              throw new TestException("URL did not load");
		          }
	      }
	      
	      public static void clickMenuBackupWarnings() {
	          try {
	        	  POAction.clickLink(GlobalVariables.Kyn_Navigate_BackupWarnings);
	          } catch (Exception e) {
	              System.out.println("navigation to URL failed ");
	              throw new TestException("URL did not load");
		          }
	      }
}
