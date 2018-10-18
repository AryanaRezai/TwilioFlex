package com.realpage.lp.Community;

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


public class CommunityStepDefinitions extends PageBase {
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent CommunityComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	
	
	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public CommunityStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		CommunityComponent = uiMap.getComponent("community");
	
	}
	
	
	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */
	
	
	@When("^User is directed to welcome page \"([^\"]*)\"$")
	public void User_is_on_the_welcome_page(String arg1) throws Throwable {
		
		try{
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			assertTrue(url.contains(arg1));
			
			
	} catch (NoSuchElementException e) {
		e.printStackTrace();
		fail("Not on the welcome page");
	}
}

	@When("^User clicks on Community in the sub nav$")
	public void User_clicks_on_Community_in_the_sub_nav() throws Throwable {
		try{
			
			WebElement comlink= driver.findElement(By.id("tab-community"));
			String community= comlink.getText();
			assertTrue(community.equals("Community"));
			comlink.click();
			Thread.sleep(500);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to click on Community lin");
		}
	}

	@Then("^User is directed to community page \"([^\"]*)\"$")
	public void User_is_directed_to_community_page(String arg1) throws Throwable {
		try{
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			assertTrue(url.contains(arg1));
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not on the Welcome Page");
		}
	}

	@Then("^The Apply Now button is displayed$")
	public void The_Apply_Now_button_is_displayed() throws Throwable {
		try{
		WebElement applynow = driver.findElement(By.className("btnApply-now"));
		System.out.println(applynow);
		Thread.sleep(200);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Apply Now button is not there");
		}
	}

	@Then("^The Request a Tour calendar is open$")
	public void The_Request_a_Tour_calendar_is_open() throws Throwable {
		try{
			
			driver.findElement(By.id("schedule-tour"));
			driver.findElement(By.className("header-bg"));
			driver.findElement(By.id("carouselSchedule"));
			driver.findElement(By.id("carouselTime"));
			driver.findElement(By.className("btnBook-tour"));
			driver.findElement(By.className("fa-chevron-right"));
			driver.findElement(By.className("fa-chevron-left"));
			Thread.sleep(200);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("The request a tour calendar is not open");
		}
	}
	
	@Then("^Community text is there$")
	public void Community_text_is_there() throws Throwable {
		try{
			
			WebElement title = driver.findElement(By.className("container"));
			String comtitle = title.getText();
			System.out.println(comtitle);
			//assertTrue(comtitle.equals("Community"));
			
			    //driver.findElement(By.className("welcome-message"));
			
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("community text is not there");
		}
	}

	@Then("^Community Amenities are there$")
	public void Community_Amenities_are_there() throws Throwable {
		try{
			
			driver.findElement(By.id("desktop-amenities"));
			Thread.sleep(200);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Comunity Ammenity is not there");
		}
	}

	@Then("^Media Gallery is there$")
	public void Media_Gallery_is_there() throws Throwable {
		try{
			
			driver.findElement(By.className("mediaGallery"));
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Media Gallery is not there");
		}
	}

	@Then("^Your Neighbors section is there$")
	public void Your_Neighbors_section_is_there() throws Throwable {
		try{
			
			driver.findElement(By.id("desktop-demographics"));
			Thread.sleep(200);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Neighbors section is not there");
		}
	}
	
	@When("^User clicks on the calendar icon$")
	public void User_clicks_on_the_calendar_icon() throws Throwable {
		try{
			
			WebElement calicon = driver.findElement(By.className("pointer"));
			calicon.click();
			Thread.sleep(200);
	
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Calendar ison not on the community page");
		}
	}

	@Then("^the calendar will open$")
	public void the_calendar_will_open() throws Throwable {
		try{
			assertTrue(driver.findElement(By.id("schedule-tour")).isDisplayed());
			Thread.sleep(500);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("The calendar won't open");
		}
	}

	@Then("^a Live chat widget is visible$")
	public void a_Live_chat_widget_is_visible() throws Throwable {
		try{
			driver.findElement(By.id("cta-button"));
			Thread.sleep(1000);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Live Chat widget not displayed on Community page");
		}
	}
	
}
