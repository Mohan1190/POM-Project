package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage1 extends ProjectMethods {
	
	public FindLeadPage1()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using ="//input[@name = 'firstName']")
	private WebElement eleFrname;
	public FindLeadPage1 typeFrname(String data)
	{
		type(eleFrname, data);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using ="//button[text() = 'Find Leads']")
	private WebElement eleFindLead;
	public FindLeadPage1 clickFindLead()
	{
		click(eleFindLead);
		return this;
	}
	
	@FindBy(how=How.XPATH,using ="//a [contains (@class,'text')][1]")
	private WebElement eleResult;
	public MergeLeadPage clickResult()
	{
	   click(eleResult);
	   switchToWindow(0);
	   return new MergeLeadPage();
	}

}
