package com.realpage.flex.ChatTest;

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
public class ChatTestStepDefinitions extends PageBase {

	
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent ChatTestComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	

	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	
	@Autowired
	public ChatTestStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		ChatTestComponent = uiMap.getComponent("chattest");
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */
	
	
	@When("^Consumer selects CHAT$")
	public void Consumer_selects_CHAT() throws Throwable {
		
	   try{
		   WebElement chat = driver.findElement(By.className("communicationMode-chat"));
		   chat.click();
	   
	   } catch (NoSuchElementException e){
		   fail("Cannot enter the userName");
	   
	    }
	}
	
	
	@When("^Consumer enters first name \"([^\"]*)\"$")
	public void Consumer_enters_first_name(String arg1) throws Throwable {
			
		   try{
			
			   WebElement name = driver.findElement(By.name("firstName"));
			   name.sendKeys(arg1);
			   
		   } catch (NoSuchElementException e){
			   fail("Cannot enter the first name");
		   
		}
	}
	
	
	@When("^Consumer enters last name \"([^\"]*)\"$")
	public void Consumer_enters_last_name(String arg1) throws Throwable {
				
			   try{
				   WebElement lname = driver.findElement(By.name("lastName"));
				   lname.sendKeys(arg1);
				   
				   
			   } catch (NoSuchElementException e){
				   fail("Cannot enter the last name");
			   
			}
		}
	
	
	@When("^Consumer enters email address \"([^\"]*)\"$")
	public void Consumer_enters_email_address(String arg1) throws Throwable {

				   try{
					   
					   
					 WebElement emailadd= driver.findElement(By.name("email"));
					 emailadd.sendKeys(arg1);

					

				   } catch (NoSuchElementException e){
					   fail("Menu button is not there");
				   
				}
			}
	   
	
	@When("^consumer enters phone number$")
	public void consumer_enters_phone_number() throws Throwable {

				   try{
					   

						 WebElement emailadd= driver.findElement(By.id("chat-form-phone"));
						 emailadd.sendKeys("4692165826");
						 Thread.sleep(500);
 
					   
				   } catch (NoSuchElementException e){
					   fail("Menu button is not there");
				   
				}
			}
	
	
	@When("^Consumer clicks the START CHATTING button$")
	public void Consumer_clicks_the_START_CHATTING_button() throws Throwable {

				   try{
					   
					  WebElement chatbtn = driver.findElement(By.id("chat-btn"));
					  chatbtn.click();
					  
					

					   
				   } catch (NoSuchElementException e){
					   fail("Menu button is not there");
				   
				}
			}
	
	
	@When("^Consumer is directed to the connecting page$")
	public void Consumer_is_directed_to_the_connecting_page() throws Throwable {

				   try{
//					  driver.findElement(By.className(FlexLoginComponent.getUIElements().get("flexmenubtn").getClassName()));
//
//					
//					  // WebElement menubtn = driver.findElement(By.className("Twilio-Dropdown"));
//					   
				   } catch (NoSuchElementException e){
					   fail("Menu button is not there");
				   
				}
			}
	
	
	
	@Then("^Agent logs in to the agent desktop https://uc-agent-desktop-uat.devplaypen.com/login$")
	public void Agent_logs_in_to_the_agent_desktop_https_uc_agent_desktop_uat_devplaypen_com_login() throws Throwable {

				   try{
//					  driver.findElement(By.className(FlexLoginComponent.getUIElements().get("flexmenubtn").getClassName()));
//
//					
//					  // WebElement menubtn = driver.findElement(By.className("Twilio-Dropdown"));
//					   
				   } catch (NoSuchElementException e){
					   fail("Menu button is not there");
				   
				}
			}
}
	   
	   
	   

