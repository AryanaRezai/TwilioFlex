package com.realpage.lp.FloorPlans;

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
import java.util.Date;
import java.util.List;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


public class FloorPlansStepDefinitions extends PageBase {
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent FloorPlansComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	
	
	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public FloorPlansStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		FloorPlansComponent = uiMap.getComponent("floorplans");
	
	}
	
	
	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */
	


	@When("^User clicks on Floor Plans in the sub nav$")
	public void User_clicks_on_Floor_Plans_in_the_sub_nav() throws Throwable {
		try{
			
			WebElement comlink= driver.findElement(By.id("tab-floor-plans"));
			String community= comlink.getText();
			assertTrue(community.equals("Floor Plans"));
			comlink.click();
			Thread.sleep(500);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to click on Floor Plans link");
		}
	}

	@Then("^User is directed to Floor Plans page \"([^\"]*)\"$")
	public void User_is_directed_to_Floor_Plans_page(String arg1) throws Throwable {
		try{
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			assertTrue(url.contains(arg1));
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not on the Welcome Page");
		}
	}
	
	
	@Then("^User selects a move in date$")
	public void User_selects_a_move_in_date() throws Throwable {
		
	try{
		
		    
		   
			WebElement movein = driver.findElement(By.id("moveInDate"));
			String todaysdate = movein.getAttribute("value");
			System.out.println(todaysdate);
			
//			
//			DateFormat format = new SimpleDateFormat("mm/dd");
//			String date = format.format(todaysdate);
//			System.out.println(date);
//			
			DateFormat dateFormat = new SimpleDateFormat("dd");
		    Date date = new Date();
		    String date1 = dateFormat.format(date);
		    System.out.println(date1);
		    
		    assertTrue(todaysdate.contains(date1));
			
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		fail("Not able to select move in dates");
	}
}

	
	@Then("^User selects number of bedrooms$")
	public void User_selects_number_of_bedrooms() throws Throwable {
		
	try{
			WebElement bedroom = driver.findElement(By.id("beds"));
			bedroom.click();
			
			WebElement bed = driver.findElement(By.cssSelector("#beds > option:nth-child(3)"));
			bed.click();
			Thread.sleep(300);
			String actbedroom =bedroom.getAttribute("value");
			System.out.println("Number of Bedrooms chosen:" + "" + actbedroom);
		    assertTrue(actbedroom.equals("2"));
			Thread.sleep(200);
			
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		fail("Not able to select number of bedrooms");
	}
}

	@Then("^User selects price range$")
	public void User_selects_price_range() throws Throwable {
		
	try{
			WebElement pricefield = driver.findElement(By.id("price"));
			pricefield.click();
			driver.findElement(By.cssSelector("#price > option:nth-child(3)")).click();
			String theprice = pricefield.getAttribute("value");
			System.out.println(theprice);
		    assertTrue(theprice.equals("3800"));
		    pricefield.click();
			
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		fail("Not able to select price range");
	}
}


	@When("^User clicks on the view availability button$")
	public void User_clicks_on_the_view_availability_button() throws Throwable {
	try{
		
		WebElement viewability = driver.findElement(By.cssSelector("#floorplanId1785051 > div.col-sm-3.col-md-3.col-lg-3.grid-rooms.text-centered.p-t-20.floorplans-actions-col > div:nth-child(1) > div > button"));
		viewability.click();
		Thread.sleep(500);

	} catch (NoSuchElementException e) {
		e.printStackTrace();
		fail("The Apartment Availability button is not displayed");
	}
}
	

	@Then("^Available apartments are displayed$")
	public void Available_apartments_are_displayed() throws Throwable {
	try{
		driver.findElement(By.className("tableList"));
		Thread.sleep(1000);
			
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		fail("The Apartment Availabilities are not displayed");
	}
}

	@When("^User selects View Amenities$")
	public void User_selects_View_Amenities() throws Throwable {
	try{
			
		WebElement viewaminities = driver.findElement(By.cssSelector("#floorplanId1785051 > div.col-sm-3.col-md-3.col-lg-3.grid-rooms.text-centered.p-t-20.floorplans-actions-col.pull-right > div:nth-child(2) > div"));
		viewaminities.click();
		Thread.sleep(500);
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		fail("View Amenities is not diplayed");
	}
}

	@Then("^Amenities are displayed$")
	public void Amenities_are_displayed() throws Throwable {
	try{
			driver.findElement(By.cssSelector("#floorplanId1785051 > div.amenities-row.row.color.black.m-t-5 > div"));
			
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		fail("The Amenities is not displayed");
	}
}

	@When("^User selects the property image$")
	public void User_selects_the_property_image() throws Throwable {
	try{
			WebElement imagecamera= driver.findElement(By.cssSelector("#floorplanId1785051 > div.col-sm-2.col-md-3.col-lg-3.floorplanBox-image-clip.relative.floorplanBox-horizontal > div.floorplan-img-container > a > div"));
			imagecamera.click();
			Thread.sleep(500);
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		fail("The Property image is not displayed");
	}
}

	@Then("^a window is opened with all the images$")
	public void a_window_is_opened_with_all_the_images() throws Throwable {
		try{
			
			driver.findElement(By.className("fancybox-enabled"));
			Thread.sleep(300);
			
			//closes the fancy box
			driver.findElement(By.className("qv-close")).click();
			Thread.sleep(300);

			
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		fail("The property images are not opened");
	}
}

	
	
	

}