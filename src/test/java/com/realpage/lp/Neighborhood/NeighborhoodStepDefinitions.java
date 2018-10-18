package com.realpage.lp.Neighborhood;

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
import org.openqa.selenium.interactions.Action;
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
import java.util.Date;
import java.util.List;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


public class NeighborhoodStepDefinitions extends PageBase {
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent NeighborhoodComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	
	
	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public NeighborhoodStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		NeighborhoodComponent = uiMap.getComponent("neighborhood");
	
	}
	
	
	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */
	
	@When("^User clicks on Neighborhood in the sub nav$")
	public void User_clicks_on_Neighborhood_in_the_sub_nav() throws Throwable {
		try{
			
			WebElement comlink= driver.findElement(By.id("tab-neighborhood"));
			String community= comlink.getText();
			assertTrue(community.equals("Neighborhood"));
			comlink.click();
			Thread.sleep(500);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to click on Floor Plans link");
		}
	}


	@Then("^User is directed to Neighborhood page \"([^\"]*)\"$")
	public void User_is_directed_to_Neighborhood_page(String arg1) throws Throwable {
		try{
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			assertTrue(url.contains(arg1));
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not on the Welcome Page");
		}
	}
	
	
	@Then("^Neighborhood search bar is displayed$")
	public void Neighborhood_search_bar_is_displayed() throws Throwable {
		try{
			
			driver.findElement(By.id("neighborhood-search-bar"));

			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Search bar in not displayed on neighborhood page");
		}
	}
	
	
	
	@Then("^A map is displayed$")
	public void A_map_is_displayed() throws Throwable {
		try{
			driver.findElement(By.id("nmap"));

			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Map in not displayed on neighborhood page");
		}
	}

	@When("^User extends the bar$")
	public void User_extend_the_bar() throws Throwable {
		try{
			
//			WebElement barhandle = driver.findElement(By.className("neighborhood-widget__handle"));
//			barhandle.click();
//			Thread.sleep(200);
//			barhandle.click();
//            Thread.sleep(200);
//			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to extend the bar on neighborhood page");
		}
	}
	
	
	@Then("^Few options are displayed$")
	public void Few_options_are_displayed() throws Throwable {
	try{
		 
		WebElement list = driver.findElement(By.id("neighborhood-search-bar"));
		String listoptions = list.getText();
		System.out.println(listoptions);
		
        Thread.sleep(300);
		
		driver.findElement(By.cssSelector("#neighborhood-search-bar > div.neighborhood-widget__categories > ul > li:nth-child(1) > span")).click();
		Thread.sleep(200);
		driver.findElement(By.cssSelector("#neighborhood-search-bar > div.neighborhood-widget__categories > ul > li:nth-child(2) > span")).click();
		Thread.sleep(200);
		driver.findElement(By.cssSelector("#neighborhood-search-bar > div.neighborhood-widget__categories > ul > li.active > span")).click();
		Thread.sleep(200);
		driver.findElement(By.cssSelector("#neighborhood-search-bar > div.neighborhood-widget__categories > ul > li:nth-child(4) > span")).click();	
		Thread.sleep(200);
		driver.findElement(By.cssSelector("#neighborhood-search-bar > div.neighborhood-widget__categories > ul > li:nth-child(5) > span")).click();	
		Thread.sleep(200);
		driver.findElement(By.cssSelector("#neighborhood-search-bar > div.neighborhood-widget__categories > ul > li:nth-child(6) > span")).click();
		Thread.sleep(200);
		driver.findElement(By.cssSelector("#neighborhood-search-bar > div.neighborhood-widget__categories > ul > li:nth-child(7) > span")).click();
		Thread.sleep(200);
	
	} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Map options not visibble on neighborhood page");
		}
	}
	
	
	@Then("^User minimizes the search bar window$")
	public void User_minimizes_the_search_bar_window() throws Throwable {
	try{
		
		WebElement barhandle = driver.findElement(By.className("neighborhood-widget__handle"));
		barhandle.click();
		Thread.sleep(300);

	} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to minimize the search bar window");
		}
	}
	
	
	@Then("^There is a Transportation section$")
	public void There_is_a_Transportation_section() throws Throwable {
	try{
		WebElement transport = driver.findElement(By.id("walk-datascore"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(transport);
		actions.perform();
	
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Transportation section is not displayed");
		}
	}

	@Then("^There is Walk score icon \"([^\"]*)\"$")
	public void There_is_Walk_score_icon(String arg1) throws Throwable {
	try{
		
		driver.findElement(By.className("icon-walk"));
		WebElement link= driver.findElement(By.partialLinkText("Walk Score"));
		String walk = link.getText();
		System.out.println(walk);
		assertTrue(walk.equals("Walk Score ©"));

	} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("The Walk Score icon is not there");
		}
	}
	
	@Then("^There is transit Score icon \"([^\"]*)\"$")
	public void There_is_transit_Score_icon(String arg1) throws Throwable {
	try{
		
		

		driver.findElement(By.className("icon-transit"));
		WebElement link= driver.findElement(By.partialLinkText("Transit Score ©"));
		String transit = link.getText();
		System.out.println(transit);
		assertTrue(transit.equals("Transit Score ©"));
	
	} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Transit Score ison is not there");
		}
	}
	

	@Then("^There is Transportation map$")
	public void There_is_Transportation_map() throws Throwable {
	try{
			
		driver.findElement(By.id("wmap"));
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Transportation map is not on neighborhood page");
		}
	}

	@Then("^There is Travel Time$")
	public void There_is_Travel_Time() throws Throwable {
	try{
		
		WebElement trans= driver.findElement(By.className("btnTravel"));
		Actions actions = new Actions(driver);
		actions.moveToElement(trans);
		actions.perform();
		
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Travel time not displayed on map on neighborhood page");
		}
	}

	@Then("^There is Transit$")
	public void There_is_Transit() throws Throwable {
	try{
			WebElement trans =driver.findElement(By.className("btnTransit"));
			trans.click();
			

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Transit not displayed on map on neighborhood page");
		}
	}
	
	
	@Then("^There is a School section$")
	public void There_is_a_School_section() throws Throwable {
	try{
			
          WebElement school = driver.findElement(By.className("m-schools-neighborhood"));
          String schoolcon= school.getText();
          System.out.println(schoolcon);
          
          driver.findElement(By.partialLinkText("Serves This Home"));
          Thread.sleep(100);
          driver.findElement(By.partialLinkText("Elementary")).click();
          Thread.sleep(100);
          driver.findElement(By.partialLinkText("Middle School")).click();
          Thread.sleep(100);
         // driver.findElement(By.partialLinkText("High School")).click();
          Thread.sleep(300);
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("School section not displayed on neighborhood page");
		}
	}
	
	
	@Then("^The school section has different categories$")
	public void The_school_section_has_different_categories() throws Throwable {
	try{
			

			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("School's different categories not displayed on neighborhood page");
		}
	}

	
	

	
	
	

}