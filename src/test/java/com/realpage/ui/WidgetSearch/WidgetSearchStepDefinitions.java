package com.realpage.ui.WidgetSearch;

import com.realpage.core.component.UIComponent;
import com.realpage.core.component.UIComponentMap;
import com.realpage.core.page.PageBase;
import com.realpage.core.page.UIPageFactory;
import com.foundation.selenium.DataManager;
import com.foundation.selenium.WebDriverManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/*
 ******************************************************* 
 Covering: 
 	- All Search functionality 
 *******************************************************
 */
public class WidgetSearchStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent WidgetSearchComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	
	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public WidgetSearchStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		WidgetSearchComponent = uiMap.getComponent("widgetsearch");
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */



	@And("^User clicks on Widget Search Page$")
	public void User_clicks_on_Widget_Search_Page() throws InterruptedException {

		try {
			
			driver.findElement(By.cssSelector("#raul-left-navigation-items > li:nth-child(4) > span")).click();
			driver.findElement(By.partialLinkText("Widget Search")).click();

		} catch (NoSuchElementException e) {
			fail("Cannot click on Widget Search Page");
		}
	}

	@Then("^User is directed to the Widget Search Page \"([^\"]*)\"$")
	public void User_is_directed_to_the_Widget_Search_Page(String widgetpUrl) throws Throwable  {

		try {
			Thread.sleep(1000);
			 String url =driver.getCurrentUrl();
			 System.out.println(url);
		       assertTrue(url.contains(widgetpUrl));
		
		} catch (NoSuchElementException e) {
			fail("Not on the Widget Search Page");
		}
		
	}
	
	@And("^User enters a Widget ID \"([^\"]*)\"$")
	public void User_enters_a_Widget_ID(String widgetID) throws Throwable  {

		try {
		      sendElementText(driver, By.id(WidgetSearchComponent.getUIElements().get("widgetsearchfield").getIdSelector()), widgetID);
		
		} catch (NoSuchElementException e) {
			fail("Not able to enter a Widget ID");
		}
		
	}
	
	

	@And("^User enters a Widget Name \"([^\"]*)\"$")
	public void User_enters_a_Widget_Name(String widgetName) throws Throwable  {

		try {
		      sendElementText(driver, By.id(WidgetSearchComponent.getUIElements().get("widgetsearchfield").getIdSelector()), widgetName);
		
		} catch (NoSuchElementException e) {
			fail("Not able to enter a Widget Name");
		}
		
	}
	
	
	@And("^User enters RPCC ID \"([^\"]*)\"$")
	public void User_enters_RPCC_ID(String rpccid) throws Throwable  {

		try {
		      sendElementText(driver, By.id(WidgetSearchComponent.getUIElements().get("widgetsearchfield").getIdSelector()), rpccid);
		
		} catch (NoSuchElementException e) {
			fail("Not able to enter RPCC ID");
		}
		
	}
	
	@And("^User enters RPCC property ID \"([^\"]*)\"$")
	public void User_enters_property_ID(String propid) throws Throwable  {

		try {
		      sendElementText(driver, By.id(WidgetSearchComponent.getUIElements().get("widgetsearchfield").getIdSelector()), propid);
		
		} catch (NoSuchElementException e) {
			fail("Not able to enter propert ID");
		}
		
	}
	
	
	@Then("^User sees eight column titles$")
	public void User_sees_eight_column_titles() throws Throwable  {

		try {
		
			        WebElement widgid =driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > div.row.widget-search-page > div.col-lg-12.m-t-2.widget-search-table > table > thead > tr > th:nth-child(1)"));
					String widgetid= widgid.getText();
					System.out.println(widgetid);
					assertTrue(widgetid.equals("Widget ID"));
					
					
					WebElement widgname =driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > div.row.widget-search-page > div.col-lg-12.m-t-2.widget-search-table > table > thead > tr > th:nth-child(2)"));
					String widgetname= widgname.getText();
					System.out.println(widgetname);
					assertTrue(widgetname.equals("Widget Name"));
					
					
					WebElement stat=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div:nth-child(2) > div.row.widget-search-page > div.col-lg-12.m-t-2.widget-search-table > table > thead > tr > th:nth-child(3)"));
					String status= stat.getText();
					System.out.println(status);
					assertTrue(status.equals("Status"));
					
					
					WebElement typ=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div:nth-child(2) > div.row.widget-search-page > div.col-lg-12.m-t-2.widget-search-table > table > thead > tr > th:nth-child(4)"));
					String type= typ.getText();
					System.out.println(type);
					assertTrue(type.equals("Type"));
					
					
					WebElement mod=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > div.row.widget-search-page > div.col-lg-12.m-t-2.widget-search-table > table > thead > tr > th:nth-child(5)"));
					String modes= mod.getText();
					System.out.println(modes);
					assertTrue(modes.equals("Subject/Mode Type"));
					
					WebElement proptype=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > div.row.widget-search-page > div.col-lg-12.m-t-2.widget-search-table > table > thead > tr > th:nth-child(6)"));
					String propertytype= proptype.getText();
					System.out.println(propertytype);
					assertTrue(propertytype.equals("Property Type"));
					
					WebElement id=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > div.row.widget-search-page > div.col-lg-12.m-t-2.widget-search-table > table > thead > tr > th:nth-child(7)"));
					String rpccid= id.getText();
					System.out.println(rpccid);
					assertTrue(rpccid.equals("RPCC ID"));
					
					WebElement property=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > div.row.widget-search-page > div.col-lg-12.m-t-2.widget-search-table > table > thead > tr > th:nth-child(8)"));
					String rpccprop= property.getText();
					System.out.println(rpccprop);
					assertTrue(rpccprop.equals("RPCC Property #"));
	
					WebElement time=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > div.row.widget-search-page > div.col-lg-12.m-t-2.widget-search-table > table > thead > tr > th:nth-child(9)"));
					String createdtime= time.getText();
					System.out.println(createdtime);
					assertTrue(createdtime.equals("Created Time"));
	
					WebElement act=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > div.row.widget-search-page > div.col-lg-12.m-t-2.widget-search-table > table > thead > tr > th:nth-child(10)"));
					String actions= act.getText();
					System.out.println(actions);
					assertTrue(actions.equals("Actions"));
					
					

		} catch (NoSuchElementException e) {
			fail("Cannot find the column titles");
		}
	}
	
	
	@Then("^User sees information that is related to the search$")
	public void User_sees_information_that_is_related_to_the_search() throws Throwable  {

		try {
		
			        WebElement widgetid =driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div:nth-child(2) > div.row.widget-search-page > div.col-lg-12.m-t-2.widget-search-table > table > tbody > tr:nth-child(1) > td:nth-child(1)"));
					String thewidgetid= widgetid.getText();
					System.out.println(thewidgetid);
					//assertTrue(thepropname.equals("Mills-Kris"));
					
					WebElement widgetname =driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > div.row.widget-search-page > div.col-lg-12.m-t-2.widget-search-table > table > tbody > tr:nth-child(1) > td:nth-child(2)"));
					String thewidgetname= widgetname.getText();
					System.out.println(thewidgetname);
					//assertTrue(propaddress.equals("3550 Larkin Ports Suite 732"));
					
					WebElement mode=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > div.row.widget-search-page > div.col-lg-12.m-t-2.widget-search-table > table > tbody > tr:nth-child(1) > td:nth-child(3)"));
					String themodes= mode.getText();
					System.out.println(themodes);
					//assertTrue(companyname.equals("Rath Inc"));
					
					WebElement proptype=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > div.row.widget-search-page > div.col-lg-12.m-t-2.widget-search-table > table > tbody > tr:nth-child(1) > td:nth-child(4)"));
					String theproptype= proptype.getText();
					System.out.println(theproptype);
					//assertTrue(actunits.equals("3,422"));
					
					WebElement rpccid=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > div.row.widget-search-page > div.col-lg-12.m-t-2.widget-search-table > table > tbody > tr:nth-child(1) > td:nth-child(5)"));
					String therpccid= rpccid.getText();
					System.out.println(therpccid);
					//assertTrue(actonboarded.equals("03/12/18"));
					
					WebElement rpccname=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > div.row.widget-search-page > div.col-lg-12.m-t-2.widget-search-table > table > tbody > tr:nth-child(1) > td:nth-child(6)"));
					String therpccname= rpccname.getText();
					System.out.println(therpccname);
					
					WebElement createdtime=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > div.row.widget-search-page > div.col-lg-12.m-t-2.widget-search-table > table > tbody > tr:nth-child(1) > td:nth-child(7)"));
					String thecreatedtime= createdtime.getText();
					System.out.println(thecreatedtime);
					
					
					WebElement actions=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div:nth-child(2) > div.row.widget-search-page > div.col-lg-12.m-t-2.widget-search-table > table > tbody > tr:nth-child(1) > td:nth-child(8)"));
					String theactions= actions.getText();
					System.out.println(theactions);
				

		} catch (NoSuchElementException e) {
			fail("Cannot find Element");
		}
	}
	
//	@And("^User clicks on the search submit icon$")
//	public void User_clicks_on_the_search_submit_icon() throws Throwable  {
//
//		try {
//		      clickOnElement(driver, By.className(WidgetSearchComponent.getUIElements().get("searchicon").getClassName()));
//		  Thread.sleep(2000);
//		} catch (NoSuchElementException e) {
//			fail("Not able to click on search icon");
//		}
//		
//	}
//	
	
	
	@When("^User clicks on the Preview button$")
	public void User_clicks_on_the_Preview_button() throws Throwable  {

		try {
			
			driver.findElement(By.partialLinkText("Preview")).click();
			//clickOnElement(driver, By.cssSelector(WidgetSearchComponent.getUIElements().get("embedlink").getCssSelector()));
			Thread.sleep(500);
		
		} catch (NoSuchElementException e) {
			fail("Not able to click for the embed code instructions");
		}
		
	}
	

	@And("^User sees a payload$")
	public void User_sees_a_payload() throws InterruptedException {

		try {
			
			WebElement payload = driver.findElement(By.className("widget-preview-page"));
			String wpayload = payload.getText();
			System.out.println(wpayload);
            
		} catch (NoSuchElementException e) {
			fail("The payload is not visible");
		}
	}
	
	
	@And("^A widget is opened in less than 10 seconds$")
	public void A_widget_is_opened_in_less_than_10_seconds() throws InterruptedException {

		try {
			
			WebDriverWait wait=new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#cta-button")));
			element.click();
			Thread.sleep(5000);
		} catch (NoSuchElementException e) {
			fail("The payload is not visible");
		}
	}
	

	

	
	


	}
	



