package com.realpage.ui.SMS;

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
import io.qameta.allure.junit4.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
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
public class SMSStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent SMSComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	private String arg2;
	WebElement phonebox; 
	WebElement searchicon;
	
	
	
	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public SMSStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		SMSComponent = uiMap.getComponent("sms");
	
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */

	
	@When("^User clicks on SMS tab \"([^\"]*)\"$")
	public void User_clicks_on_SMS_tab(String arg1) throws Throwable {
		try {
		
			WebElement smstab = driver.findElement(By.partialLinkText("SMS Status"));
			smstab.click();
			

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to click on SMS tab");
		}
	}

	

	@Then("^User is directed to the phone page \"([^\"]*)\"$")
	public void User_is_directed_to_the_phone_page(String arg1) throws Throwable {
	try {
		
			String url = driver.getCurrentUrl();
			System.out.println(url);
			assertTrue(url.contains(arg1));
			

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not directed to SMS Page");
		}
	}


	@When("^User enters a phone number \"([^\"]*)\"$")
	public void User_enters_a_phone_number(String arg2) throws Throwable {
	try {
		
			phonebox= driver.findElement(By.id("smsstatus_search"));
			System.out.println(arg2);
			phonebox.sendKeys(arg2);
			

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to enter phone number");
		}
	}


	@When("^Clicks on search$")
	public void Clicks_on_search() throws Throwable {
	try {
		
		searchicon = driver.findElement(By.id("search_submit"));
		searchicon.click();

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to click on search");
		}
	}


	@Then("^That number is displayed$")
	public void That_number_is_displayed() throws Throwable {
	try {
		
			WebElement number = driver.findElement(By.xpath("//*[@id='raul-page-container']/div[2]/div[2]/table/tbody/tr[1]/td[1]"));
			String searchednumber = number.getText();
			System.out.print(searchednumber);
			//assertTrue(searchednumber.contains(arg2));
			

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("The searched number is not displayed");
		}
	}


	@When("^User clicks search with an empty box$")
	public void User_clicks_search_with_an_empty_box() throws Throwable {
	try {
		
		driver.findElement(By.id("smsstatus_search")).clear();
		Thread.sleep(500);
		driver.findElement(By.id("search_submit")).click();
		
	
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to click on search icon");
		}
	}


	@Then("^An error message is displayed$")
	public void An_error_message_is_displayed() throws Throwable {
	try {
		
		WebElement error = driver.findElement(By.className("error"));
		String errormessage = error.getText();
		System.out.println(errormessage);
			

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Error message is not displayed");
		}
	}

 }