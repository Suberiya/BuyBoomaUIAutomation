package com.qa.booma.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.booma.base.BaseTest;

public class addVipContactsPageTest extends BaseTest{
	
	
	@BeforeClass
	public void addVipContactsSetUp()
	{
		DBPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void setUpVipContacts() throws InterruptedException
	{
		//AddMultiProjectPage =	DBPage.clickleftMenuProjects();
//		String actualheader =AddMultiProjectPage.getProjectHeader();
//		System.out.println("Add Project page header:" + actualheader);
//		Assert.assertEquals(actualheader, "Project List");
		
		
		addVipContactsPage =DBPage.clickVipContactsMenu();
//		String  actualheader =addVipContactsPage.vipHeader();
//		System.out.println("Vip Contacts Page Header " +actualheader );
//		Assert.assertEquals(actualheader, "VIP Contacts");
		
		
		
		
		
	}

}
