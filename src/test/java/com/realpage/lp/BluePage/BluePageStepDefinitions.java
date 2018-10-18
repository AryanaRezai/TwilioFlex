package com.realpage.lp.BluePage;

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


public class BluePageStepDefinitions extends PageBase {
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent BluePageComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	
	
	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public BluePageStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		BluePageComponent = uiMap.getComponent("login");
	
	}
	
	
	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */
	@When("^User is on the welcome page \"([^\"]*)\"$")
	public void User_is_on_the_welcome_page(String arg1) throws Throwable {
		try {
			
			String Url = driver.getCurrentUrl();
			System.out.println("*********" + Url);
			assertTrue(Url.contains("welcome"));
		
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not on the Welcome Page");
		}
	}
	

	@Then("^Property Name is displayed$")
	public void Property_Name_is_displayed() throws Throwable {
		try {
			
			driver.findElement(By.className("propertyName"));
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Property NAme is not displayed");
		}
	}
	

	@Then("^Property Phone number is displayed$")
	public void Property_Phone_number_is_displayed() throws Throwable {
		try {
			
			driver.findElement(By.className("propertyContact"));
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Property phone number is not displayed");
		}
	}
	

	@Then("^Visit Website icon is displayed$")
	public void Visit_Website_icon_is_displayed() throws Throwable {
		try {
			
			driver.findElement(By.cssSelector("#mainHeader-content > div > div > div > div > div > div.header-icons.pull-left > a:nth-child(2)"));
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Visit website icon is not displayed");
		}
	}
	

	@Then("^View on Map icon is displayed$")
	public void View_on_Map_icon_is_displayed() throws Throwable {
		try {
			
			driver.findElement(By.cssSelector("#mainHeader-content > div > div > div > div > div > div.header-icons.pull-left > a:nth-child(1)"));
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("View om Map is not displayed");
		}
	}
	

	@Then("^Scheduale Tour box is displayed$")
	public void Scheduale_Tour_box_is_displayed() throws Throwable {
		try {
			
			WebElement stour = driver.findElement(By.id("sched-sidebarCollapsed"));
			String sttext = stour.getText();
			System.out.println("########################" + sttext);
			assertTrue(sttext.equals("Schedule Tour"));
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Scheduale Tour is not displayed");
		}
	}
	
	@Then("^Navigation Menu on the bottom left side is displayed$")
	public void Navigation_Menu_on_the_bottom_left_side_is_displayed() throws Throwable {
		try {
			
			WebElement navmenu = driver.findElement(By.className("sidebarNavLinks"));
			String subnav = navmenu.getText();
			System.out.println(subnav);
			assertTrue(subnav.contains("Welcome"));
			assertTrue(subnav.contains("Community"));
			assertTrue(subnav.contains("Floor Plans"));
			assertTrue(subnav.contains("Neighborhood"));
			assertTrue(subnav.contains("Lifestyles & Interests"));
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Navigation Menu is not displayed");
		}
	}
	

	@Then("^Apply Now box on the right corner is displayed$")
	public void Apply_Now_box_on_the_right_corner_is_displayed() throws Throwable {
		try {
			
			WebElement apply = driver.findElement(By.cssSelector("#mainHeader-content > div > div > div > div > div > div.pull-right.contact-cont"));
			//String applynow = apply.getText();


		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Apply Now box is not displayed");
		}
	}
	

	@Then("^Five images on the right side of the page are displayed$")
	public void Five_images_on_the_right_side_of_the_page_are_displayed() throws Throwable {
		try {
			
			WebElement images = driver.findElement(By.className("blue-beams"));
			String blueimages = images.getAttribute("value");
			System.out.println(blueimages);
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("The five image on the right side are not displayed");
		}
	}
	
	
	@When("^Schedule Tour is clicked$")
	public void Schedule_Tour_is_clicked() throws Throwable {
	try {
			
		    WebElement stour = driver.findElement(By.id("sched-sidebarCollapsed"));
			stour.click();
			Thread.sleep(200);
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to click on Schedule Tour on Blue Page");
		}
	}
	

	@Then("^A calendar is displayed$")
	public void A_calendar_is_displayed() throws Throwable {
	try {
		
		driver.findElement(By.id("schedule-tour"));
		System.out.println("*");
		Thread.sleep(1000);
		
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("The calendar is not displayed after clicking on Schedule Tour on BluePage");
		}
	}
	
	
	@Then("^User picks date and time$")
	public void User_picks_date_and_time() throws Throwable {
	try {
		
		driver.findElement(By.id("schedule-tour"));
		System.out.println("*");
		Thread.sleep(1000);
		
		
		WebElement date = driver.findElement(By.xpath("//*[@id='carouselSchedule']/div/div[1]/div[2]"));
		date.click();
		System.out.println("**");
		Thread.sleep(1000);
		
		
		
		WebElement time = driver.findElement(By.cssSelector("#carouselTime > div > div.carousel-item.active > div:nth-child(3) > div > p"));
		time.click();
		System.out.println("***");
		Thread.sleep(1000);
		
		
		WebElement book = driver.findElement(By.className("btnBook-tour"));
		book.click();
		Thread.sleep(1000);
		System.out.println("****");
		
	
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("The calendar is not displayed after clicking on Schedule Tour on BluePage");
		}
	}
	
	
	@Then("^User schedules a tour$")
	public void User_schedules_a_tour() throws Throwable {
	try {
		
		driver.findElement(By.id("fname")).sendKeys("Ary");
		System.out.println("*");
		Thread.sleep(100);
		driver.findElement(By.id("lname")).sendKeys("Rez");
		System.out.println("*");
		Thread.sleep(100);
		driver.findElement(By.id("email")).sendKeys("aryana.rezai@realpage.com");
		System.out.println("*");
		Thread.sleep(100);
		driver.findElement(By.id("phoneNo")).sendKeys("4692165728");
		System.out.println("*");
		Thread.sleep(100);
		
		driver.findElement(By.className("btnConfirm-tour")).click();
		Thread.sleep(500);
	
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("The calendar is not displayed after clicking on Schedule Tour on BluePage");
		}
	}
	
	
	@Then("^User sees a confirmation box$")
	public void User_sees_a_confirmation_box() throws Throwable {
	try {
		
		driver.findElement(By.cssSelector("#tour-scheduled-container > div > div.confirm-date"));
		System.out.println("*");
		Thread.sleep(100);

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("The calendar is not displayed after clicking on Schedule Tour on BluePage");
		}
	}
	
	
	
	@When("^images are clicked on$")
	public void images_are_clicked_on() throws Throwable {
	try {
		
		WebElement img1= driver.findElement(By.className("img-1"));
		img1.click();
	

			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to click on images on the BluePage");
		}
	}

	@Then("^They will expand in a new window$")
	public void They_will_expand_in_a_new_window() throws Throwable {
try {
	   Thread.sleep(1000);
	   WebElement browse= driver.findElement(By.className("fa-angle-right"));
	   browse.click();
	   Thread.sleep(500);
	   browse.click();
	   Thread.sleep(500);
	   browse.click();
	   
	   //closes the image
   	   driver.findElement(By.className("pointer")).click();
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("The images were not opened in a new window");
		}
	}

	
}
