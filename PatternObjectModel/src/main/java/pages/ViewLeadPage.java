package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {

	public ViewLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleActualText;
	public ViewLeadPage verifyText(String expectedText)
	{
		verifyExactText(eleActualText, expectedText);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using ="Edit")
	private WebElement eleEdit;
	public OpentapsCRMPage clickEdit()
	{
		click(eleEdit);
		return new OpentapsCRMPage();
	}
	
	@FindBy(how=How.CLASS_NAME,using ="subMenuButtonDangerous")
	private WebElement eleDelete;
	public MyLeadsPage clickDelete()
	{
		click(eleDelete);
		return new MyLeadsPage();
	}
	
	@FindBy(how=How.ID,using="viewLead_industryEnumId_sp")
	private WebElement eleActualText1;
	public ViewLeadPage verifyDropText(String expectedText)
	{
		verifyExactText(eleActualText1, expectedText);
		return this;
	}
	
}
