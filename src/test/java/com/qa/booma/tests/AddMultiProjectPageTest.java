package com.qa.booma.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.booma.base.BaseTest;

public class AddMultiProjectPageTest extends BaseTest{

	@BeforeClass
	public void addProjectSetUp()
	{
		DBPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void getAddprojectPageTest()
	{
		AddMultiProjectPage =	DBPage.clickleftMenuProjects();
		String actualheader =AddMultiProjectPage.getProjectHeader();
		System.out.println("Add Project page header:" + actualheader);
		Assert.assertEquals(actualheader, "Project List");
		
	}
	
}
