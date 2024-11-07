package com.qa.booma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.booma.utils.ElementUtil;

public class customersListallPage {

	private WebDriver driver;
	ElementUtil eleUtil;

	customersListallPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

//Locators

	By cusNameView = By.xpath("//div[contains(text(),'Dinesh')]");

// actions

	public customersViewPage clickListAll() {
		eleUtil.doClick(cusNameView);
		
		return new customersViewPage(driver);
	}
}