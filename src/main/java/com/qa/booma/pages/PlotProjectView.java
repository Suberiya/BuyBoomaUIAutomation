package com.qa.booma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.booma.utils.ElementUtil;

public class PlotProjectView {

	private WebDriver driver;
	ElementUtil eleUtil;

	private By projectViweHeader = By.xpath("//label[normalize-space()='Project Name']");

	PlotProjectView(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	//Action 
	
	public boolean getProjectViewHeader()
	{
		return eleUtil.waitForElementVisible(projectViweHeader, 30).isDisplayed();
	}
	
}