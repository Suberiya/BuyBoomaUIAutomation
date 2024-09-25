package com.qa.booma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.booma.utils.ElementUtil;

public class AddMultiProjectPage {

	private WebDriver driver;
	ElementUtil eleUtil;

	// Locators
	private By ProjectListheader = By.xpath("//h2[@class='m-0']");

	private By AddmultiProjectBtn = By.xpath("//button[@id='Tooltip-Add-Subject']");

	// Const
	AddMultiProjectPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);

	}

	public String getProjectHeader() {
		String addprojheader = eleUtil.waitForElementVisible(ProjectListheader, 50).getText();
		return addprojheader;
	}

	public SelectMutliProjectTypePoUp addMultiProjectBtn()
	{
		eleUtil.waitForElementPresence(AddmultiProjectBtn, 20).click();
		
		return new SelectMutliProjectTypePoUp(driver);
		
	}
}
