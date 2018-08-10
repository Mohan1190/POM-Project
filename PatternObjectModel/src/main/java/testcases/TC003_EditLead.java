package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_EditLead extends ProjectMethods {

	@BeforeTest
	public void setdata()
	{
		browserName = "chrome";
		testCaseName = "TC003";
		testDescription = "Edit Leads";
		testNodes = "Leads";
		category = "smoke";
		authors = "Mohan";
		dataSheetName  = "TC003";
	}
	
	@Test(dataProvider="fetchData")
	public void EditLead(String usrName, String pwd, String frName, String drop)
	{
		new LoginPage().typeUserName(usrName).typePassword(pwd).clickLogin().clickCRM().clickLeads().clickFindLead()
		.typeFirstname(frName).clickFindLeads().clickResult().clickEdit()
		.selectDropdown(drop).clickUpdateButton().verifyDropText(drop);
	}
}
