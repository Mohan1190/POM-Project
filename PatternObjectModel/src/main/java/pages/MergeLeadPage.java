package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods {

	public MergeLeadPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//table[@id = 'widget_ComboBox_partyIdFrom']/following::img")
	private WebElement eleFrIcon;
	public FindLeadPage1 clickFrIcon()
	{
		click(eleFrIcon);
		switchToWindow(1);
		return new FindLeadPage1();
	}
	
	@FindBy(how=How.XPATH,using="//table[@id = 'widget_ComboBox_partyIdTo']/following::img")
	private WebElement eleSeIcon;
	public FindLeadPage1 clickSeIcon()
	{
		click(eleSeIcon);
		switchToWindow(1);
		return new FindLeadPage1();
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='buttonDangerous']")
	private WebElement eleMergeButton;
	public ViewLeadPage clickMergeButton()
	{
		click(eleMergeButton);
		acceptAlert();
		return new ViewLeadPage();
	}
	
}
