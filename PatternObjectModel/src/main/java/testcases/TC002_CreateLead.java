package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateLead extends ProjectMethods {
	
	@BeforeTest
	public void setdata()
	{
		browserName = "chrome";
		testCaseName = "TC002";
		testDescription = "Create Leads";
		testNodes = "Leads";
		category = "smoke";
		authors = "Mohan";
		dataSheetName  = "TC002";
	}
	
	
	@Test(dataProvider="fetchData")
	public void createLead(String usrNmae, String pwd, String cpName, String frName, String lsName)
	{
		new LoginPage().typeUserName(usrNmae).typePassword(pwd).clickLogin().clickCRM().clickLeads()
		.clickCreateLeads().typeCompanyName(cpName).typeFirstName(frName).typeLastName(lsName).clickCreateLead()
		.verifyText(frName);
	}
}
