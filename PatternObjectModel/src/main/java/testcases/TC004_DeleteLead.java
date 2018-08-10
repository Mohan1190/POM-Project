package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DeleteLead extends ProjectMethods {
	
	@BeforeTest
	public void setdata()
	{
		browserName = "chrome";
		testCaseName = "TC004";
		testDescription = "Delete Leads";
		testNodes = "Leads";
		category = "smoke";
		authors = "Mohan";
		dataSheetName  = "TC004";
	}
	
	@Test(dataProvider="fetchData")
	public void DeleteLead(String usrName, String pwd, String frName, String text )
	{
		new LoginPage().typeUserName(usrName).typePassword(pwd).clickLogin().clickCRM().clickLeads()
		.clickFindLead().typeFirstname(frName).clickFindLeads().clickResult().clickDelete()
		.clickFindLead().typeFirstname(frName).clickFindLeads()
		.deleteResult(text);
	}

}
