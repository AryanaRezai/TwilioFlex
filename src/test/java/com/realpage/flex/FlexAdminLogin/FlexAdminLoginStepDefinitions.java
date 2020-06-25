package com.realpage.flex.FlexAdminLogin;

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
public class FlexAdminLoginStepDefinitions extends PageBase {

	
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent FlexAdminLoginComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	

	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	
	@Autowired
	public FlexAdminLoginStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		FlexAdminLoginComponent = uiMap.getComponent("flexadminlogin");
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */
	
	
	@When("^Admin enters User name ([^\"]+)$")
	public void Admin_enters_User_name(String userName) throws Throwable {
		
	   try{
		   
		  
		waitForElementPresence(driver, By.name(FlexAdminLoginComponent.getUIElements().get("flexemail").getName()));
		WebElement element=driver.findElement(By.name(FlexAdminLoginComponent.getUIElements().get("flexemail").getName()));
		element.sendKeys(userName);
		   
		 Thread.sleep(1000);
		   WebElement nextbtn = driver.findElement(By.id(FlexAdminLoginComponent.getUIElements().get("flexnextbutton").getIdSelector()));
		   nextbtn.click();
		   
		   Thread.sleep(1000);
		   
	   } catch (NoSuchElementException e){
		   fail("Admin Cannot enter the userName");
	   
	    }
	}
	
	
	   
	   
		@When("^Admin enters password ([^\"]+)$")
		public void Admin_enters_password(String passWord) throws Throwable {
			
		   try{
			
			   WebElement password = driver.findElement(By.id(FlexAdminLoginComponent.getUIElements().get("flexpassword").getIdSelector()));
			   password.sendKeys(passWord);
			   
			   
			   
		   } catch (NoSuchElementException e){
			   fail("Admin Cannot enter the password");
		   
		}
	}
		
			@When("^Admin selects Sign In$")
			public void Admin_selects_Sign_In() throws Throwable {
				
			   try{
				   waitForElementPresence(driver, By.id(FlexAdminLoginComponent.getUIElements().get("flexsubmit").getIdSelector()));
				   WebElement element = driver.findElement(By.id(FlexAdminLoginComponent.getUIElements().get("flexsubmit").getIdSelector()));
				   element.click();
				   System.out.println("Signed In");
				   Thread.sleep(500);
				   WebElement nextbtn = driver.findElement(By.id(FlexAdminLoginComponent.getUIElements().get("flexnextbutton").getIdSelector()));
				   nextbtn.click();
				   Thread.sleep(300);
			   } catch (NoSuchElementException e){
				   fail("Cannot select the Sign In button");
			   
			}
		}
			   
				@When("^Admin is logged in$")
				public void Admin_is_logged_in() throws Throwable {
					
				   try{
					  driver.findElement(By.className(FlexAdminLoginComponent.getUIElements().get("flexmenubtn").getClassName()));

					  Thread.sleep(500);					  

					   
				   } catch (NoSuchElementException e){
					   fail("Admin failed to log in");
				   
				}
			}
	   
}
	   
	   
	   

