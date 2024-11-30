package com.qa.booma.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.booma.utils.ElementUtil;

public class DBMenuPage {
	private WebDriver driver;
	ElementUtil eleUtil;

	// Locator

	private By logoLink = By.xpath("//img[@class='navbar-brand-full']");

	private By sideMenuBarList = By.xpath(
			"//div[@class='scrollbar-container sidebar-nav ps ps-container ps--active-y']//ul[@class='nav']//li[@class='nav-item']//a[@class='nav-link']");

	// "(//div[@class='scrollbar-container sidebar-nav ps ps-container
	// ps--active-y']//ul[@class='nav']//li[@class='nav-item']//a[@class='nav-link'])[1]");

	private By DashBoardTopLead = By.xpath("//i[@class='fa fa-users']");
	private By leftMenuProjects = By.xpath("//i[@class='nav-icon icon-location-pin']");

	private By vipContacts = By.xpath("//span[normalize-space()='Today Leads']");

	private By vipContactPageHeader = By.xpath("//h2[normalize-space()='VIP Contacts']");

	private By leftcustomerMenu = By.xpath("//i[@class='nav-icon icon-people']");

	// private By sss = By.cssSelector(".nav-icon.cui-comment-square");

	//private By leftTicket = By.xpath("//a[contains(text(),'Ticket')]");

	private By leftmenuBooking = By.xpath("//a[contains(text(),'Booking')]");
	
	private By leftAgent= By.xpath("//i[@class='nav-icon icon-user']");
	
	private By scroll = By.xpath("//div[@class='ps__thumb-y']");
	private By allMenuListTop =By.xpath("//ul[@class='hide-on-mobile-tablet navbar-nav']//li[@class='nav-item']");
	
	
	
	

	// Constructor
	DBMenuPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);

	}

	// Action Method
	public String getDBPageTitle() {
		String title = eleUtil.waitForTitleIs("buyBooma", 5);
		System.out.println("DashBoard Page Title" + title);
		return title;
	}

	public String getDBURL() {
		String url = eleUtil.waitForURLContains("http://dev.buybooma.in/#/dashboard", 5);
		System.out.println("Login Page URL :" + url);
		return url;
	}

	public boolean isLogoImageExist() {
		return eleUtil.waitForElementVisible(logoLink, 10).isDisplayed();

	}

	public boolean isDBTopMenuLeadIsExist() {
		return eleUtil.waitForElementVisible(DashBoardTopLead, 10).isDisplayed();
	}

//	public List<String> getDBPageLeftMenuList() {
//		List<WebElement> leftEleEleMenuList = eleUtil.getElements(sideMenuBarList);
//		
//		List<String> menusList = new ArrayList<String>();
//		for (WebElement e : leftEleEleMenuList) {
//
//			String menuList = e.getText();
//
//			menusList.add(menuList);
//		}
//		return menusList;
//	}

	public int getLeftMenuList() {

//		String LeftMenuList =eleUtil.doGetElementText(sideMenuBarList);
//		System.out.println("Left Menu List " + LeftMenuList);
//		return LeftMenuList;

		int totalleftmenus = eleUtil.waitForElementsVisible(sideMenuBarList, 30).size();
		System.out.println(totalleftmenus);
		return totalleftmenus;
	}

	public AddMultiProjectPage clickleftMenuProjects() {
		eleUtil.waitForElementVisible(leftMenuProjects, 20).click();
//		String addProjectPage = eleUtil.waitForElementVisible(ProjectList, 10).getText();
//		System.out.println("Project List Header Page " + addProjectPage);
		return new AddMultiProjectPage(driver);
	}

	public void getContactsheader() {
		String header = eleUtil.waitForElementPresence(vipContactPageHeader, 20).getText();

	}

//	public addVipContactsPage vipContactsLeftMenu() {
//		eleUtil.waitForElementVisible(vipContacts, 50).click();
//		
//		return new addVipContactsPage(driver);
//
//	}

	public addVipContactsPage clickVipContactsMenu() throws InterruptedException {

		Actions act = new Actions(driver);
		Thread.sleep(3000);

//		act.sendKeys(Keys.CONTROL.DOWN).build().perform();
//		act.sendKeys(Keys.CONTROL.HOME).build().perform();

		// act.sendKeys(Keys.LEFT_CONTROL.DOWN).build().perform();

		act.scrollToElement(driver.findElement(scroll)).build().perform();

		// (driver.findElement(vipContacts)).click()
		return new addVipContactsPage(driver);

	}

	public AddCustomerPage leftCustomerMenu() {
		eleUtil.waitForElementVisible(leftcustomerMenu, 20).click();

		return new AddCustomerPage(driver);
	}

	public customersListallPage listallPage() {
		return null;
	}
	public addTicketPage leftmenuTicket() {
		eleUtil.waitForElementPresence(leftmenuBooking, 50);
		return new addTicketPage(driver);
	}
	
	public addAgentPage leftMenuAgent() throws InterruptedException
	{
		
		Thread.sleep(500);
		//eleUtil.waitForElementPresence(allMenuListTop, 50);
		eleUtil.doClick(leftAgent, 50);
		return new addAgentPage(driver);
	}
}


