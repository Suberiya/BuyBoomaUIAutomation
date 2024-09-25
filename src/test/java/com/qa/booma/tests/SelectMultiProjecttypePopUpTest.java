package com.qa.booma.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.booma.base.BaseTest;

public class SelectMultiProjecttypePopUpTest extends BaseTest {

	@BeforeClass
	public void addMultiProjectSetUp() {
		DBPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	
	//AAA --->
	//TC -- only one hard assertion or can have multiple soft assertion
	
	
	@Test
	public void SelectProjectType() {
		AddMultiProjectPage = DBPage.clickleftMenuProjects();
		String actualheader = AddMultiProjectPage.getProjectHeader();
		System.out.println("Add Project page header:" + actualheader);
		Assert.assertEquals(actualheader, "Project List");
		
		MultiProjectPouUp = AddMultiProjectPage.addMultiProjectBtn();
		String actualheaders = MultiProjectPouUp.getProjectTypeHeader();
		System.out.println("Multiproject Header :" + actualheaders);
		
		Assert.assertEquals(actualheaders, "Select your Project Type");
		
		MultiProjectPouUp.ClickPlotProjectType();
		addPlotProjectPage =MultiProjectPouUp.clicksubmitbtn();
		Assert.assertEquals(addPlotProjectPage.getPlotProjectHeader(), "Add Project - Plot");
		
	}

}
