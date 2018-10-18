package com.realpage.ui.RollnRights;

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
import junit.framework.Assert;

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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

/*
 ******************************************************* 
 Covering: 
 	- All Search functionality 
 *******************************************************
 */
public class RollnRightsStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent OnboardingComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	
	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public RollnRightsStepDefinitions(WebDriverManager webDriver, DataManager data) {
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
	
	@Then("^User navigates to People Page$")
	public void User_navigates_to_People_Page() throws Throwable {
	try {
			
			WebElement people = driver.findElement(By.partialLinkText("People"));
			people.click();
			

		} catch (NoSuchElementException e) {
			fail("Not able to navigate to People's page");
		}
	}
	

	@Then("^finds an specific agent \"([^\"]*)\"$")
	public void finds_an_specific_agent(String arg1) throws Throwable {
try {
	
	        WebElement usersrch = driver.findElement(By.id("userSearch"));
	        usersrch.sendKeys(arg1);
			
			driver.findElement(By.id("search_submit")).click();
			

		} catch (NoSuchElementException e) {
			fail("Cannot find an specific agent");
		}
	}

	@Then("^Verifies that agents roll$")
	public void Verifies_that_agents_roll() throws Throwable {
try {
			
			WebElement agent = driver.findElement(By.id("btnGroupDrop0"));
			agent.click();
			Thread.sleep(300);
			driver.findElement(By.partialLinkText("Edit")).click();
			
			Thread.sleep(500);
			
			WebElement admincheck = driver.findElement(By.id("omegaAdministrator"));
			assertTrue(!admincheck.isSelected());
			
			WebElement implementation = driver.findElement(By.id("implementationTeam"));
			assertTrue(!implementation.isSelected());
			
			WebElement intuser = driver.findElement(By.id("internalUser"));
			assertTrue(!intuser.isSelected());
			
			WebElement support = driver.findElement(By.id("support"));
			assertTrue(support.isSelected());
             
		} catch (NoSuchElementException e) {
			fail("Not able to verify agent's roll");
		}
	}
	



	@And("^User clicks on navigation button$")
	public void User_clicks_on_navigation_button() throws InterruptedException {

		try {
			
			driver.findElement(By.cssSelector("#raul-header-menu-button")).click();
			

		} catch (NoSuchElementException e) {
			fail("Cannot click on Navigation button");
		}
	}
	
	
	@Then("^User is directed to roles and rights page \"([^\"]*)\"$")
	public void User_is_directed_to_roles_and_rights_page(String arg1) throws Throwable {
		try{
			
			String URL= driver.getCurrentUrl();
			System.out.println(URL);
			assertTrue(URL.contains(arg1));
			
	} catch (NoSuchElementException e) {
		fail("Not directed tobroles and rights");
	}
}
	
	
	
	@Then("^User is able to see Properties and Onboarding only$")
	public void User_is_able_to_see_Properties_and_Onboarding_only() throws Throwable {
		try{
			
			WebElement list = driver.findElement(By.id("raul-left-navigation-items"));
			String menulist = list.getText();
			System.out.println(menulist);
			
			 assertTrue(menulist.contains("Onboarding"));
			 assertTrue(menulist.contains("Properties"));
			
		     assertTrue(!menulist.contains("People"));
		     assertTrue(!menulist.contains("Products & Services"));
		     assertTrue(!menulist.contains("SMS Status"));
		     assertTrue(!menulist.contains("Roles & Rights"));
		     assertTrue(!menulist.contains("Settings"));
		     assertTrue(!menulist.contains("Omega"));
		     assertTrue(!menulist.contains("Company"));
		
			
			
	} catch (NoSuchElementException e) {
		fail("Agent sees too much or too little");
	}
}
	


 }