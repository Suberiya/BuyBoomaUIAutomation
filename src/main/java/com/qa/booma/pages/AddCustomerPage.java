package com.qa.booma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.booma.utils.ElementUtil;

public class AddCustomerPage {

	private WebDriver driver;

	ElementUtil eleUtil;

	AddCustomerPage(WebDriver driver) {
		this.driver = driver;

		eleUtil = new ElementUtil(driver);
	}

	private By custmePageHeader = By.xpath("//span[normalize-space()='My Customer']");

	private By addCutBtn = By.id("Tooltip-Add-Customer");

	//private By listallPage = By.xpath("//div[contains(text(),'Dinesh')]");
	private By listallPage= By.xpath("//div[contains(text(),'7657895045')]");
	
	
	

	public String getCustomerHeader() {
		String header = eleUtil.waitForElementPresence(custmePageHeader, 20).getText();

		System.out.println("customer header page" + header);
		return header;
	}

	public addCustomersPage clickaddcustomer() {
		eleUtil.doClick(addCutBtn, 50);

		return new addCustomersPage(driver);
	}

	public customersViewPage clickListAll()
	{
		//eleUtil.doClick(listallPage);
		eleUtil.doClick(listallPage, 20);
	
		return new customersViewPage(driver);

	}

}
