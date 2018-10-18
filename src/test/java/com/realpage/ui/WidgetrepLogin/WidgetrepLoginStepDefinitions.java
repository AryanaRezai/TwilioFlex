package com.realpage.ui.WidgetrepLogin;

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
public class WidgetrepLoginStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent WidgetrepLoginComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	
	
	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public WidgetrepLoginStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		WidgetrepLoginComponent = uiMap.getComponent("widgetreplogin");
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */

	@And("User enters email \"([^\"]*)\"$")
	public void Consumer_enters_first_name(String fname) throws InterruptedException {

		try {
			
			driver.get("https://reporting.realpageuc.com/");
			
			driver.findElement(By.id("email")).sendKeys(fname);

		} catch (NoSuchElementException e) {
			fail("Cannot enter email");
		}
	}
	
	
	@And("User enters password \"([^\"]*)\"$")
	public void Consumer_enters_last_name(String lname) throws InterruptedException {

		try {
			
			driver.findElement(By.id("password")).sendKeys(lname);
			

		} catch (NoSuchElementException e) {
			fail("Cannot enter password");
		}
	}
	
	
	
	@When("^User clicks on Login button$")
	public void Consumer_clicks_the_START_CHATTING_button() throws Throwable  {

		try {
			
               driver.findElement(By.className("btn-primary")).click();
               Thread.sleep(500);

		} catch (NoSuchElementException e) {
			fail("Not able to click on login button");
		}
		
	}


 }