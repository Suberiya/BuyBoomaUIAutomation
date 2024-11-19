package com.qa.booma.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.booma.base.BaseTest;

public class addTicketPageTest extends BaseTest {

	@BeforeClass
	public void addTicketPageSetUp() {
		DBPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
//		 addTicketPage= DBPage.leftmenuTicket();
//		 addTicketPage.clickAddticketPage();
	}

	@Test
	public void addTickets() {
		//System.out.println("hiiii printt ");
		addTicketPage = DBPage.leftmenuTicket();
		addTicketPage.clickAddticketPage();
		System.out.println("hhhhhhhhhhhhhi");

//		String actualHader = addTicketPage.getHeader();
//
//		//System.out.println("E-Ticket" + E - Ticket);
//		System.out.println("hiiiiiiiii");
//		Assert.assertEquals("E-Ticket", actualHader);
//
//		
	}

}