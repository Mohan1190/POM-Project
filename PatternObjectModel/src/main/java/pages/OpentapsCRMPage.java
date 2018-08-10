package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class OpentapsCRMPage extends ProjectMethods {
	
	public OpentapsCRMPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.ID,using="updateLeadForm_industryEnumId")
	private WebElement eleDrop;
	public OpentapsCRMPage selectDropdown(String data)
	{
		selectDropDownUsingText(eleDrop, data);
		return this;	
	}
	
	@FindBy(how=How.CLASS_NAME,using ="smallSubmit")
	private WebElement eleUpdate;
	public ViewLeadPage clickUpdateButton()
	{
		click(eleUpdate);
		return new ViewLeadPage();
	}
	
	

}
