package com.qa.booma.tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.booma.base.BaseTest;
import com.qa.booma.pages.AddPlotProjectPage;


public class AddPlotProjectPageTest extends BaseTest{
	
	@BeforeClass
	public void PlotProjectSetUp() {
		DBPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void setUpPlots() throws InterruptedException {
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
	
	addPlotProjectPage.addPlotProject("DDD","Auto","Chennai", "1200","200", "20", "10000", "14/7/2024", "30/07/2024", 
			"Park", "123", "356", "001", "THempark", "3000", "Indian Bank  - 79895626", "1236", "2365");
	
	//Indian Bank  - 79895626
	//Central Bank of India - 125463889
	plotProjectView =addPlotProjectPage.clickSubmitBtn();

	Assert.assertTrue(plotProjectView.getProjectViewHeader());
	
	//"Canara Bank - 123243"

	}
}
