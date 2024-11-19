package com.qa.booma.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.booma.base.BaseTest;

public class addticketsPageTest extends BaseTest{

	public void addTicketsPageSetUp() {
		DBPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
		
	
	@Test
	public void addtickets()
	{
		
		addTicketPage = DBPage.leftmenuTicket();
		String actulaHeader = addTicketPage.getHeader();
		Assert.assertEquals(actulaHeader, "E-Ticket");
		addticketsPage = addTicketPage.clickAddticketPage();
	}
	
	
}
