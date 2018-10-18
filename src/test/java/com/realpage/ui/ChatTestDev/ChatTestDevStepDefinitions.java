package com.realpage.ui.ChatTestDev;

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
import org.openqa.selenium.remote.server.DriverFactory;
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
public class ChatTestDevStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent ChatTestDevComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	private String url;
	private String id;
	
	

	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public ChatTestDevStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		ChatTestDevComponent = uiMap.getComponent("chattestdev");
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */

	
	@And("^Agent desktop is logged in to$")
	public void Agent_desktop_is_logged_in_to() throws Throwable  {

		try {
			
			  JavascriptExecutor js = (JavascriptExecutor) driver; 
			  js.executeScript("window.open('https://uc-agent-desktop-dev.devplaypen.com/login');");
			  ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
			  driver.switchTo().window(tabs.get(1));
			 Thread.sleep(500);
		    
		     sendElementText(driver, By.id(ChatTestDevComponent.getUIElements().get("agentemail").getIdSelector()), "Aryana.Rezai@realpage.com"); 
		     sendElementText(driver, By.id(ChatTestDevComponent.getUIElements().get("agentpassword").getIdSelector()), "password"); 
		     clickOnElement(driver, By.className(ChatTestDevComponent.getUIElements().get("agentloginsub").getClassName()));
		
		} catch (NoSuchElementException e) {
			fail("Not able to log in to agent desktop");
		}
		
	}
	


	}
	



