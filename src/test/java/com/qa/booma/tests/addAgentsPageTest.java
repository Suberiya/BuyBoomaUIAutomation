package com.qa.booma.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.booma.base.BaseTest;
import com.qa.booma.utils.StringUtils;

import io.qameta.allure.Step;

public class addAgentsPageTest extends BaseTest {

	@BeforeClass
	public void addAgentsPageSetUp() throws InterruptedException {
		DBPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		// Thread.sleep(500);
	}

	@Test
	public void addAgent() throws InterruptedException {
		addAgentPage = DBPage.leftMenuAgent();
		addAgentsPage= addAgentPage.addAgentsBtn();

	}

	@DataProvider
	public Object[][] addAgents() {
		return new Object[][] { { "John", "test-MRKT0025", "ETPPS1870B", "Sunage90@gmail.com", "Bangalore", "IT Eng"} };
	}

	
	@Step("checking user registartion"
			+ "")
	@Test(dataProvider = "addAgents")

	
	public void addAgent(String M_Name, String T_Name, String phone, String email, String location, String Designation) throws InterruptedException
	{
		addAgentsPage.addAgents(M_Name, T_Name, StringUtils.getRandomNumber(),  email, location, Designation);
		
		addAgentsPage.sub_Btn();
		
	}
	
	
	
	
	
	
	
	
}
