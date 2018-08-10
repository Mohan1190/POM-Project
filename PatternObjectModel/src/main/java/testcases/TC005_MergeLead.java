package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods {

	@BeforeTest
	public void setdata()
	{
		browserName = "chrome";
		testCaseName = "TC005";
		testDescription = "Merge Leads";
		testNodes = "Leads";
		category = "smoke";
		authors = "Mohan";
		dataSheetName  = "TC005";
	}
	
	@Test(dataProvider="fetchData")
	public void MergeLead(String usrName, String pwd, String frName, String seName)
	{
		new LoginPage().typeUserName(usrName).typePassword(pwd).clickLogin().clickCRM().clickLeads()
		.clickMergeLead().clickFrIcon().typeFrname(frName).clickFindLead().clickResult().clickSeIcon()
		.typeFrname(seName).clickFindLead().clickResult().clickMergeButton().verifyText(seName);
	}
}
