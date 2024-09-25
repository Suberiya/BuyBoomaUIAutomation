package com.qa.booma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.qa.booma.utils.ElementUtil;
import com.qa.booma.utils.JavaScriptUtil;

public class AddPlotProjectPage {
	private WebDriver driver;
	ElementUtil eleUtil;
	JavaScriptUtil jsUtil;

	AddPlotProjectPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
		
		jsUtil= new JavaScriptUtil(driver);
	}


	private By PlotProjectPageHeader = By.xpath("//h4[normalize-space()='Add Project - Plot']");

	private By projectName = By.xpath("//input[@id='text-0-projectName']");
	private By Description = By.xpath("//input[@id='text-1-projectDesc']");
	private By Location = By.xpath("//input[@placeholder='Enter Location']");
	private By TotalArea = By.xpath("//input[@id='number-3-totalArea']");
	private By TotalValuePerSqfeet = By.xpath("//input[@id='number-4-valuePerSqrFeet']");
	private By GuideLinePerSqt = By.xpath("//input[@id='number-5-guideLineValuePerSqFt']");
	private By TotalProjectValue = By.xpath("//input[@id='number-6-projectValue']");
	private By StartDate = By.xpath("//input[@id='date-7-startDate']");
	private By ExpectedEndDate = By.xpath("//input[@id='date-8-expectedEndDate']");
	private By Amenities = By.xpath("//input[@class='MuiInputBase-input MuiInput-input jss7 jss10']");
	private By ProjectApprovalNO = By.xpath("//input[@id='text-10-projectApprovalNo']");
	private By ProjectSurveyNo = By.xpath("//input[@id='text-11-surveyNo']");
	private By ProjectShortCode = By.xpath("//input[@id='text-12-shortCode']");
	private By Projecttheme = By.xpath("//input[@id='text-13-theme']");
	private By DeveloperCost = By.xpath("//input[@id='number-14-developerValue']");
	//private By DebitBankclick = By.xpath("//div[@class=' css-1wa3eu0-placeholder']");
	
	private By DebitBankclick=
			By.xpath("//body/div[@id='root']/div[@class='app']/div[@class='app-body']/main[@class='main']/div[@class='p-1 mb-0 container-fluid']/div[@class='row']/div[@class='col-md-12']/div[@class='card']/div[@class='card-body']/form/div[@class='row']/div[16]/div[1]/div[1]");
	
	//body/div[@id='root']/div[@class='app']/div[@class='app-body']/main[@class='main']/div[@class='p-1 mb-0 container-fluid']/div[@class='row']/div[@class='col-md-12']/div[@class='card']/div[@class='card-body']/form/div[@class='row']/div[16]/div[1]/div[1]
	private By DebitBank = By.xpath("//div[@class=' css-1wa3eu0-placeholder']");
	private By LandPurchaseCost = By.xpath("//input[@id='number-16-landPurchaseCost']");
	private By Construction = By.xpath("//input[@id='number-17-constructionCost']");

	private By PlotPorojectSubmitBtn = By.xpath("//button[@type='submit']");
	

	private By projectViweHeader = By.xpath("//label[normalize-space()='Project Name']");

	// Action methods
	public String getPlotProjectHeader() {
		String header = eleUtil.waitForElementPresence(PlotProjectPageHeader, 10).getText();
		System.out.println(header);
		
		return header;
		

	}

	public void addPlotProject(String ProjectName, String Description, String Location, String TotalArea,
			String TotalValuePerSqfeet, String GuideLinePerSqt, String TotalProjectValue, String StartDate,
			String ExpectedEndDate, String Amenities, String ProjectApprovalNO, String ProjectSurveyNo,
			String ProjectShortCode, String Projecttheme, String DeveloperCost, String debitBank, String LandPurchaseCost,
			String Construction) throws InterruptedException

	{
		eleUtil.waitForElementVisible(this.projectName, 20).sendKeys(ProjectName);
		eleUtil.doSendKeys(this.Description, Description);
		eleUtil.doSendKeys(this.Location, Location);
		eleUtil.doSendKeys(this.TotalArea, TotalArea);
		eleUtil.doSendKeys(this.TotalValuePerSqfeet, TotalValuePerSqfeet);
		eleUtil.doSendKeys(this.GuideLinePerSqt, GuideLinePerSqt);
		eleUtil.doSendKeys(this.TotalProjectValue, TotalProjectValue);
		eleUtil.doSendKeys(this.StartDate, StartDate);
		eleUtil.doSendKeys(this.ExpectedEndDate, ExpectedEndDate);
		eleUtil.doSendKeys(this.Amenities, Amenities);
		eleUtil.doSendKeys(this.ProjectApprovalNO, ProjectApprovalNO);
		eleUtil.doSendKeys(this.ProjectSurveyNo, ProjectSurveyNo);
		eleUtil.doSendKeys(this.ProjectShortCode, ProjectShortCode);
		eleUtil.doSendKeys(this.Projecttheme, Projecttheme);
		eleUtil.doSendKeys(this.DeveloperCost, DeveloperCost);
		
		//eleUtil.doClick(DebitBankclick);
		//eleUtil.waitForElementPresence(DebitBank, 0).click();
		//eleUtil.DoSelectValueFromDropDown(this.DebitBank, debitBank);
		//eleUtil.doSelectByVisibleText(DebitBank, debitBank);
		//eleUtil.DoSelectValueFromDropDownString(this.DebitBank, debitBank);
		
		//eleUtil.waitForElementsVisible(DebitBank, 50);
		//eleUtil.waitForElementsPresence(this.DebitBank, 50);
		//eleUtil.DoSelectValueFromDropDown(this.DebitBank, debitBank);
		//eleUtil.DoSelectValueFromDropDown1(this.DebitBank, debitBank);
		
		eleUtil.getdroDownValues(DebitBank, debitBank);
		
		//eleUtil.DoSelectValueFromDropDownWait(this.DebitBank, debitBank);
		
		//eleUtil.DoSelectValueFromDropDownString(DebitBank, debitBank);
		
		
		//doSelectByVisibleText
		
		//DoSelectValueFromDropDownString

		eleUtil.doSendKeys(this.LandPurchaseCost, LandPurchaseCost);
		eleUtil.doSendKeys(this.Construction, Construction);
		String  HeadrProjectView =eleUtil.waitForElementVisible(projectViweHeader, 5).getText();
		
		System.out.println("Project view Header :" +HeadrProjectView);
	}
	public PlotProjectView clickSubmitBtn() {
		
		System.out.println("HIIIIII");
		//eleUtil.waitForElementVisible(PlotPorojectSubmitBtn, 50).click();
		
		jsUtil.clickElementByJS1(PlotPorojectSubmitBtn);
		

		return new PlotProjectView(driver);
		
		
	}

}
