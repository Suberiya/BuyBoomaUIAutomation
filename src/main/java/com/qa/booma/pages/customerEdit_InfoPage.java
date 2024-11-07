package com.qa.booma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.booma.utils.ElementUtil;

public class customerEdit_InfoPage {

	private WebDriver driver;
	ElementUtil eleUtil;

	customerEdit_InfoPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);

	}

	// Locators

	By cust_Name_Edit = By.xpath("//input[@id='text-0-customerName']");
	
	By editSub_btn = By.xpath("//button[@type='submit']");
	

	public void cus_name_Edit() {
		//eleUtil.doSendKeys(cust_Name_Edit, "Saha");
		eleUtil.doSendKeys(cust_Name_Edit, "saha", 50);
	}

	public void edit_sub_btn()
	{
		eleUtil.doClick(editSub_btn, 20);
	}
	
}
