package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {

	public FindLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH,using ="(//input[@name='firstName'])[3]")
	private WebElement eleFrname;
	public FindLeadsPage typeFirstname(String data)
	{
		type(eleFrname, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeads;	
	public FindLeadsPage clickFindLeads()
	{
		click(eleFindLeads);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleResult;	
	public ViewLeadPage clickResult()
	{
		click(eleResult);
		return new ViewLeadPage();
	}
	
	public MergeLeadPage switchToWindow()
	{
		switchToWindow(0);
		return new MergeLeadPage();
	}
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'records')]")
	private WebElement eleText;
	public FindLeadsPage deleteResult(String expectedText)
	{
		//verifyExactText(eleText, expectedText);
		verifyPartialText(eleText, expectedText);
		return this;
	}
}










