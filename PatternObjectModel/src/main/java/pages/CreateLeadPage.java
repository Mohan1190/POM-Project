package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {

	
	public CreateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCmName;
	public CreateLeadPage typeCompanyName(String data)
	{
		type(eleCmName, data);
		return this;
	}
	
	
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFrName;
	public CreateLeadPage typeFirstName(String data)
	{
		type(eleFrName, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLsName;
	public CreateLeadPage typeLastName(String data)
	{
		type(eleLsName, data);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using= "smallSubmit")
	private WebElement eleCreateLead;
	public ViewLeadPage clickCreateLead()
	{
		click(eleCreateLead);
		return new ViewLeadPage();
	}
	
	
	
	
	
}
