package com.realpage.flex.FlexLogin;

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
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/*
 ******************************************************* 
 Covering: 
 	- All Search functionality 
 *******************************************************
 */
public class FlexLoginStepDefinitions extends PageBase {

	
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent FlexLoginComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	

	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	
	@Autowired
	public FlexLoginStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		FlexLoginComponent = uiMap.getComponent("flexlogin");
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */
	
	
	@When("^Agent enters User name ([^\"]+)$")
	public void Agent_enters_User_name(String userName) throws Throwable {
		
	   try{
		  
		waitForElementPresence(driver, By.name(FlexLoginComponent.getUIElements().get("flexemail").getName()));
		WebElement element=driver.findElement(By.name(FlexLoginComponent.getUIElements().get("flexemail").getName()));
		element.sendKeys(userName);
		   
		
		   WebElement nextbtn = driver.findElement(By.id(FlexLoginComponent.getUIElements().get("flexnextbutton").getIdSelector()));
		   nextbtn.click();
		   
		   Thread.sleep(1000);
		   
	   } catch (NoSuchElementException e){
		   fail("Cannot enter the userName");
	   
	    }
	}
	   
	   
		@When("^Agent enters password ([^\"]+)$")
		public void Agent_enters_password(String passWord) throws Throwable {
			
		   try{
			
			   WebElement password = driver.findElement(By.name(FlexLoginComponent.getUIElements().get("flexpassword").getName()));
			   password.sendKeys(passWord);
		   } catch (NoSuchElementException e){
			   fail("Cannot enter the password");
		   
		}
	}
		
			@When("^Agent selects Sign In$")
			public void Agent_selects_Sign_In() throws Throwable {
				
			   try{
				   waitForElementPresence(driver, By.id(FlexLoginComponent.getUIElements().get("flexsubmit").getIdSelector()));
				   WebElement element = driver.findElement(By.id(FlexLoginComponent.getUIElements().get("flexsubmit").getIdSelector()));
				   element.click();
				   
				   Thread.sleep(500);
				   WebElement nextbtn = driver.findElement(By.id(FlexLoginComponent.getUIElements().get("flexnextbutton").getIdSelector()));
				   nextbtn.click();
				   Thread.sleep(300);
			   } catch (NoSuchElementException e){
				   fail("Cannot select the Sign In button");
			   
			}
		}
			   
				@When("^Agent is logged in$")
				public void Agent_is_logged_in() throws Throwable {
					
				   try{
					  driver.findElement(By.className(FlexLoginComponent.getUIElements().get("flexmenubtn").getClassName()));

					  Thread.sleep(500);
					  System.out.println("#####");
					  
//					if(driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div/div[1]/div/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/div/div[2]/div/div[2]")).isDisplayed()){
//						
//						Thread.sleep(500);
//						System.out.println("@@@@@");
//						driver.findElement(By.id("cmdProcess")).click();
//					} else {
//						
//					}
					   
				   } catch (NoSuchElementException e){
					   fail("Menu button is not there");
				   
				}
			}
	   
}
	   
	   
	   

