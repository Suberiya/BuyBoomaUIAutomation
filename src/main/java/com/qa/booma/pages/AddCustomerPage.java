package com.qa.booma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.booma.utils.ElementUtil;

public class AddCustomerPage {
	
	private WebDriver driver;
	
	ElementUtil eleUtil;
	
	AddCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		
		eleUtil= new ElementUtil(driver);
	}

	
	private By custmePageHeader = By.xpath("//span[normalize-space()='My Customer']");
	
	private By addCutBtn = By.id("Tooltip-Add-Customer");

	
	public String getCustomerHeader()
	{
	String header= eleUtil.waitForElementPresence(custmePageHeader, 20).getText();
	
	System.out.println("customer header page" + header);
	return header;
	}
	
	
	public addCustomersPage clickaddcustomer()
	{
		eleUtil.doClick(addCutBtn, 50);
		
		return new addCustomersPage(driver);
	}
	
	
}


