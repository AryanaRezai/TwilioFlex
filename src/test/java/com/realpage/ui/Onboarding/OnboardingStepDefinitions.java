package com.realpage.ui.Onboarding;

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
import org.openqa.selenium.Keys;
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
public class OnboardingStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent OnboardingComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	WebElement searchfield;
	
	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public OnboardingStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		OnboardingComponent = uiMap.getComponent("onboarding");
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */


	@And("^User clicks on Onboarding$")
	public void User_clicks_on_Onboarding() throws InterruptedException {

		try {
			
			driver.findElement(By.partialLinkText("Onboarding")).click();

		} catch (NoSuchElementException e) {
			fail("Cannot click on Onboarding");
		}
	}

	
	@Then("^User is directed to the Onboarding Page \"([^\"]*)\"$")
	public void User_is_directed_to_the_Onboarding_Page(String propUrl) throws Throwable  {

		try {
			Thread.sleep(1000);
			 String url =driver.getCurrentUrl();
			 System.out.println(url);
		       assertTrue(url.contains(propUrl));
		
		} catch (NoSuchElementException e) {
			fail("Not on the Onboarding Page");
		}
		
	}
	
	
	@When("^User clicks on the onboarding property search drop down$")
	public void User_clicks_on_the_onboarding_property_search_drop_down() throws InterruptedException {

		try {
			//select between prop/ company
			WebElement propdd= driver.findElement(By.cssSelector("#onboardForm > div > div:nth-child(1)"));
			propdd.click();
			Thread.sleep(500);
			WebElement prop =driver.findElement(By.name("property"));
			prop.click();
			
			//select between Lvl1/ OS
			WebElement lvl1dd= driver.findElement(By.cssSelector("#onboardForm > div > div:nth-child(2) > button"));
			lvl1dd.click();
			Thread.sleep(500);

			WebElement lvl1 =driver.findElement(By.name("LVL1"));
			lvl1.click();
			
			
			
			Thread.sleep(500);
		} catch (NoSuchElementException e) {
			fail("Cannot open the onboarding prop search drop down");
		}
	}
	

//	@And("^User picks LVL1")
//	public void User_picks_LVL1() throws InterruptedException {
//
//		try {
//			
//			driver.findElement(By.name("LVL1")).click();
//            Thread.sleep(500);
//		} catch (NoSuchElementException e) {
//			fail("Cannot select the LVL1 option from the drop down");
//		}
//	}
	
	@And("^User enters a Property ID to onboard \"([^\"]*)\"$")
	public void User_enters_a_Property_ID_to_onboard(String propID) throws Throwable  {

		try {
			
			searchfield = driver.findElement(By.id("source_id"));
			searchfield.clear();
			searchfield.sendKeys(propID);
			
			searchfield.sendKeys(Keys.RETURN);
		      Thread.sleep(500);
		     
		} catch (NoSuchElementException e) {
			fail("Not able to enter a Property ID");
		}
		
	}
	
	@And("^User sees a Matching Property message \"([^\"]*)\"$")
	public void User_sees_a_Matching_Property_message(String mmsg) throws InterruptedException {

		try {
			
			WebElement msg = driver.findElement(By.className("alert-info"));
			String matchingmsg = msg.getText();
			System.out.println(matchingmsg);
			assertTrue(matchingmsg.equals(mmsg));
			
            Thread.sleep(500);
		} catch (NoSuchElementException e) {
			fail("Matching Property Message is not visible");
		}
	}
	
	 

	@When("^User sees eight titles$")
	public void User_sees_eight_titles() throws Throwable  {

		try {		
			        WebElement prop =driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.row.p-1.onboard-page > div.col-lg-12.m-t-2 > div > div > div > div > table:nth-child(2) > thead > tr > th:nth-child(1)"));
					String property= prop.getText();
					System.out.println(property);
					assertTrue(property.equals("Property Name"));
					
					WebElement id =driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.row.p-1.onboard-page > div.col-lg-12.m-t-2 > div > div > div > div > table:nth-child(2) > thead > tr > th:nth-child(2)"));
					String propid= id.getText();
					System.out.println(propid);
					assertTrue(propid.equals("Property Address"));
					
					
					WebElement comp=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.row.p-1.onboard-page > div.col-lg-12.m-t-2 > div > div > div > div > table:nth-child(2) > thead > tr > th:nth-child(3)"));
					String company= comp.getText();
					System.out.println(company);
					assertTrue(company.equals("RPCC Property ID"));
					
					WebElement un=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.row.p-1.onboard-page > div.col-lg-12.m-t-2 > div > div > div > div > table:nth-child(2) > thead > tr > th:nth-child(4)"));
					String units= un.getText();
					System.out.println(units);
					assertTrue(units.equals("Type"));
					
					
					//Company part
					WebElement compn =driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.row.p-1.onboard-page > div.col-lg-12.m-t-2 > div > div > div > div > table:nth-child(4) > thead > tr > th:nth-child(1)"));
					String companyname= compn.getText();
					System.out.println(companyname);
					assertTrue(companyname.equals("Company Name"));
					
					WebElement compadd =driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.row.p-1.onboard-page > div.col-lg-12.m-t-2 > div > div > div > div > table:nth-child(4) > thead > tr > th:nth-child(2)"));
					String companyaddress= compadd.getText();
					System.out.println(companyaddress);
					assertTrue(companyaddress.equals("Company Address"));
					
					
					WebElement compid=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.row.p-1.onboard-page > div.col-lg-12.m-t-2 > div > div > div > div > table:nth-child(4) > thead > tr > th:nth-child(3)"));
					String companyid= compid.getText();
					System.out.println(companyid);
					assertTrue(companyid.equals("RPCC Company ID"));
					
					WebElement ty=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.row.p-1.onboard-page > div.col-lg-12.m-t-2 > div > div > div > div > table:nth-child(4) > thead > tr > th:nth-child(4)"));
					String type= ty.getText();
					System.out.println(type);
					assertTrue(type.equals("Type"));

		} catch (NoSuchElementException e) {
			fail("Cannot find the column titles");
		}
	}
	
//	
//	@When("^User sees information related to the search$")
//	public void User_sees_information_related_to_the_search() throws Throwable  {
//
//		try {
//		
//			        WebElement theprop =driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > table > tbody > tr > td:nth-child(1) > div > div:nth-child(1) > a"));
//					String thepropname= theprop.getText();
//					System.out.println(thepropname);
//					//assertTrue(thepropname.equals("Mills-Kris"));
//					
//					WebElement propid =driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > table > tbody > tr:nth-child(1) > td:nth-child(2)"));
//					String actpropid= propid.getText();
//					System.out.println(actpropid);
//					//assertTrue(propaddress.equals("3550 Larkin Ports Suite 732"));
//					
//					
//					WebElement compn=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > table > tbody > tr > td:nth-child(3)"));
//					String companyname= compn.getText();
//					System.out.println(companyname);
//					//assertTrue(companyname.equals("Rath Inc"));
//					
//					WebElement actun=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > table > tbody > tr > td:nth-child(4)"));
//					String actunits= actun.getText();
//					System.out.println(actunits);
//					//assertTrue(actunits.equals("3,422"));
//					
//					WebElement actonboard=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > table > tbody > tr > td:nth-child(5)"));
//					String actonboarded= actonboard.getText();
//					System.out.println(actonboarded);
//					//assertTrue(actonboarded.equals("03/12/18"));
//					
//					WebElement actprod=driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div > table > tbody > tr > td.ft-dropdown > ul > li > a"));
//					String actproducts= actprod.getText();
//					System.out.println(actproducts);
//					//assertTrue(actproducts.equals("2"));
//					
//					
//
//		} catch (NoSuchElementException e) {
//			fail("Cannot find Element");
//		}
//	}
//	
//	
	
	@And("^User sees an Onboarding button$")
	public void User_sees_an_Onboarding_button() throws InterruptedException {

		try {
			driver.findElement(By.className("button"));
            Thread.sleep(500);
            driver.findElement(By.id("source_id")).clear();
		} catch (NoSuchElementException e) {
			fail("Onboarding button is not visible");
		}
	}
	
	
	@And("^User sees a missMatching Property message \"([^\"]*)\"$")
	public void User_sees_a_missMatching_Property_message(String mmsg) throws InterruptedException {

		try {
			
			WebElement msg = driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.row.p-1.onboard-page > div.col-lg-12.m-t-2 > div > div > div > p"));
			String matchingmsg = msg.getText();
			System.out.println(matchingmsg);
			assertTrue(matchingmsg.equals(mmsg));
			
            driver.findElement(By.id("source_id")).clear();
            Thread.sleep(1000);
		} catch (NoSuchElementException e) {
			fail("MissMatching Property Message is not visible");
		}
	}
	
	@And("^User sees an unable to locate message \"([^\"]*)\"$")
	public void User_sees_an_unable_to_locate_message(String onboardmsg) throws InterruptedException {

		try {
			
			WebElement msg = driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.row.p-1.onboard-page > div.col-lg-12.m-t-2 > div > div"));
			String matchingmsg = msg.getText();
			System.out.println(matchingmsg);
			assertTrue(matchingmsg.contains(onboardmsg));
			driver.findElement(By.id("source_id")).clear();
            Thread.sleep(500);
            
		} catch (NoSuchElementException e) {
			fail("Already onboarded Property Message is not visible");
		}
	}
	
	@Then("^User clicks on the onboarding company search drop down$")
	public void User_clicks_on_the_onboarding_company_search_drop_down() throws Throwable {
		try {
			//select between prop/ company
			WebElement compdd= driver.findElement(By.cssSelector("#onboardForm > div > div:nth-child(1)"));
			compdd.click();
			Thread.sleep(500);
			WebElement prop =driver.findElement(By.name("company"));
			prop.click();
			
			//select between Lvl1/ OS
			WebElement lvl1dd= driver.findElement(By.cssSelector("#onboardForm > div > div:nth-child(2) > button"));
			lvl1dd.click();
			Thread.sleep(500);

			WebElement lvl1 =driver.findElement(By.name("LVL1"));
			lvl1.click();
			
			
			
			Thread.sleep(500);
		} catch (NoSuchElementException e) {
			fail("Cannot open the onboarding Company search drop down");
		}
	}

	@Then("^User enters a Company ID to onboard \"([^\"]*)\"$")
	public void User_enters_a_Company_ID_to_onboard(String arg1) throws Throwable {
	try {
			
			searchfield = driver.findElement(By.id("source_id"));
			searchfield.clear();
			searchfield.sendKeys(arg1);
			
			searchfield.sendKeys(Keys.RETURN);
		      Thread.sleep(500);
		} catch (NoSuchElementException e) {
			fail("Not able to enter a Property ID");
		}
		
	}
	
	
	@Then("^User sees an already onboarded message \"([^\"]*)\"$")
	public void User_sees_an_already_onboarded_message(String arg1) throws Throwable {
try {
			
		
		} catch (NoSuchElementException e) {
			fail("Not able to see an already onboarded message");
		}
		
	}
		
}
