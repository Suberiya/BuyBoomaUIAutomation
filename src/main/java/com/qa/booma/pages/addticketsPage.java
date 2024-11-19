package com.qa.booma.pages;

import org.openqa.selenium.WebDriver;

import com.qa.booma.utils.ElementUtil;

public class addticketsPage {

	private WebDriver driver;

	ElementUtil eleUtil;

	public addticketsPage(WebDriver driver2) {
		
		this.driver=driver;
		eleUtil = new ElementUtil(driver);
	}

	public void addtickets(WebDriver driver) {
			
	this.driver= driver;
	
	eleUtil = new ElementUtil(driver);
	
	}
	
	
	
	

}
