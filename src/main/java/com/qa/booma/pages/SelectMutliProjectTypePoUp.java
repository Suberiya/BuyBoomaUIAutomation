package com.qa.booma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.booma.utils.ElementUtil;

public class SelectMutliProjectTypePoUp {

	private WebDriver driver;
	ElementUtil eleUtil;

	SelectMutliProjectTypePoUp(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);

	}

	private By selectProjectTypeHeader = By.xpath("//h5[@class='modal-title']");

	private By selectPlotProject = By.xpath("//input[@id='aa25cf98-0bb9-43d5-9f43-2653de6a4cae']");
	private By plotSubMit_Btn = By.xpath("//button[normalize-space()='Submit']");

	// method action
	public String getProjectTypeHeader() {
		String ProjectTypeHeader = eleUtil.waitForElementVisible(selectProjectTypeHeader, 20).getText();
		System.out.println("Project Headr" + ProjectTypeHeader);
		return ProjectTypeHeader;

	}

	public void ClickPlotProjectType() {
		eleUtil.waitForElementVisible(selectPlotProject, 30).click();

	}

	public AddPlotProjectPage clicksubmitbtn() {
		eleUtil.waitForElementVisible(plotSubMit_Btn, 20).click();

		return new AddPlotProjectPage(driver);
	}

}
