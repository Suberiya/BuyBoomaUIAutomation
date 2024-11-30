package com.qa.booma.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.booma.base.BaseTest;

public class addAgentPageTest extends BaseTest{
	
	
	
	@BeforeClass
	public void addAgentSetUp() throws InterruptedException
	{
		DBPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		//Thread.sleep(500);
	}
	@Test
	public void addAgent() throws InterruptedException
	{
		addAgentPage= DBPage.leftMenuAgent();
		
		System.out.println("hiiiiiiiiiiiii");
		 
		
		   
		    
	} 
	
	
	

}
