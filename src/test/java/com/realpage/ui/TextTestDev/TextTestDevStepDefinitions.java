package com.realpage.ui.TextTestDev;

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
public class TextTestDevStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent TextTestDevComponent;
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
	public TextTestDevStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		TextTestDevComponent = uiMap.getComponent("texttest");
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */

	
//	@And("Consumer selects Text for dev$")
//	public void Consumer_selects_Text_for_dev() throws InterruptedException {
//
//		try {
//			driver.findElement(By.className("communicationMode-text")).click();
//			Thread.sleep(5000);
//
//
//		} catch (NoSuchElementException e) {
//			fail("Cannot select a question");
//		}
//	}

//
//	@And("Consumer enters the first name for dev \"([^\"]*)\"$")
//	public void Consumer_enters_the_first_name_for_dev(String fname) throws InterruptedException {
//
//		try {
//			
//			//driver.findElement(By.cssSelector("#ccSubject")).click();
//			//driver.findElement(By.cssSelector("#ccSubject > option:nth-child(2)")).click();
//			Thread.sleep(500);
//			driver.findElement(By.id("textform-first-name")).sendKeys(fname);
//			//sendElementText(driver, By.id(TextTestDevComponent.getUIElements().get("fnamefield").getIdSelector()), fname);
//			
//			Thread.sleep(1000);
//		} catch (NoSuchElementException e) {
//			fail("Cannot enter consumer first name");
//		}
//	}
//	
//	
//	@And("Consumer enters the last name for dev \"([^\"]*)\"$")
//	public void Consumer_enters_the_last_name_for_dev(String lname) throws InterruptedException {
//
//		try {
//			
//			driver.findElement(By.id("textform-last-name")).sendKeys(lname);
//			Thread.sleep(1000);
//		} catch (NoSuchElementException e) {
//			fail("Cannot enter consumer last name");
//		}
//	}
//	
//	
//	@And("Consumer enters the phone nrs for dev$")
//	public void Consumer_enters_the_phone_nrs_for_dev() throws InterruptedException {
//
//		try {
//			
//			Thread.sleep(1000);
//			WebElement nr =driver.findElement(By.id("textform-phone-number"));
//			Thread.sleep(1000);
//			nr.sendKeys("4");
//			Thread.sleep(100);
//			nr.sendKeys("6");
//			Thread.sleep(100);
//			nr.sendKeys("9");
//			Thread.sleep(1000);
//			nr.sendKeys("2");
//			nr.sendKeys("1");
//			nr.sendKeys("6");
//			nr.sendKeys("5");
//			Thread.sleep(100);
//			nr.sendKeys("8");
//			Thread.sleep(100);
//			nr.sendKeys("2");
//			Thread.sleep(100);
//			nr.sendKeys("6");
//	
//			//nr.sendKeys("2165826");
//			//sendElementText(driver, By.id(TextTestComponent.getUIElements().get("phonenumfield").getIdSelector()), phonenr);
//            
//			
//            
//			
//			
//		} catch (NoSuchElementException e) {
//			fail("Cannot enter consumer phone number");
//		}
//	}
//	
//	
//	@When("^Consumer marks the opt in box for dev$")
//	public void Consumer_marks_the_opt_in_box_for_dev() throws Throwable  {
//
//		try {
//			Thread.sleep(1000);
//			
//			WebElement element = driver.findElement(By.id("startTextBtn"));
//			Actions actions = new Actions(driver);
//			actions.moveToElement(element);
//			actions.perform();
//			Thread.sleep(1000);
//
//			WebElement opt = driver.findElement(By.name("optin-label"));
//			opt.click();
//			Thread.sleep(1000);
//
//		} catch (NoSuchElementException e) {
//			fail("Not able to click fon START CHATTING button");
//		}
//		
//	}
//	
//	
//	@When("^Consumer clicks the START TEXTING button for dev$")
//	public void Consumer_clicks_the_START_TEXTING_button_for_dev() throws Throwable  {
//
//		try {
//			
//			driver.manage().window().setSize(new Dimension(500, 1000));
//			
//			driver.findElement(By.id("startTextBtn")).click();
//			//clickOnElement(driver, By.id(TextTestDevComponent.getUIElements().get("starttextbtn").getIdSelector()));
//		   String parentHandle= driver.getWindowHandle();
//			System.out.println("Parent" +" " + parentHandle);
//			
//
//		} catch (NoSuchElementException e) {
//			fail("Not able to click fon START CHATTING button");
//		}
//		
//	}
//	
//
//	@Then("^Consumer is directed to connecting page for dev$")
//	public void Consumer_is_directed_to_connecting_Page() throws Throwable  {
//
//		try {
//			
//			WebDriverWait wait = new WebDriverWait (driver,50);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("text-success-img")));
//			
//			
//		  System.out.println("Found the text success image");
//		  Thread.sleep(2000);
//		
//		} catch (NoSuchElementException e) {
//			fail("Not on the Connecting Page");
//		}
//		
//	}
//	
//	
	
	
	@And("^Agent logs in to agent desktop in dev ([^\"]+)$")
	public void Agent_logs_in_to_agent_desktop_in_dev(String agentDesk) throws Throwable  {

		try {
			  JavascriptExecutor js = (JavascriptExecutor) driver; 
			  js.executeScript("window.open('https://uc-agent-desktop-dev.devplaypen.com/login');");
			  ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
			  driver.switchTo().window(tabs.get(1));
			 Thread.sleep(500);
			
		     sendElementText(driver, By.id(TextTestDevComponent.getUIElements().get("agentemail").getIdSelector()), "Aryana.Rezai@realpage.com"); 
		     sendElementText(driver, By.id(TextTestDevComponent.getUIElements().get("agentpassword").getIdSelector()), "password"); 
		     clickOnElement(driver, By.className(TextTestDevComponent.getUIElements().get("agentloginsub").getClassName()));
		
		} catch (NoSuchElementException e) {
			fail("Not able to log in to agent desktop");
		}
		
	}
		
//
//	@And("^Agent navigates to Tasks Page for dev$")
//	public void Agent_navigates_to_Tasks_Page_for_dev() throws Throwable  {
//
//		try {
//			clickOnElement(driver, By.id(TextTestDevComponent.getUIElements().get("menubtn").getIdSelector()));
//			
//			Thread.sleep(600);
//			
//			clickOnElement(driver, By.cssSelector(TextTestDevComponent.getUIElements().get("taskbtn").getCssSelector()));
//			Thread.sleep(1000);
//			
//			if(driver.findElement(By.className("complete-task")).isDisplayed()) {
//				WebElement completebtn = driver.findElement(By.className("complete-task"));
//				completebtn.click();
//				completebtn.click();
//				Thread.sleep(1000);
//				driver.navigate().refresh();
//			}
//			
//			else {
//				Thread.sleep(1000);
//				driver.navigate().refresh();
//
//			}
//	
//		} catch (NoSuchElementException e) {
//			fail("Not able to navigate to Tasks Page");
//		}
//		
//	}
	
	
//
//	@And("^Agent accepts text for dev$")
//	public void Agent_accepts_chat_for_dev() throws Throwable  {
//
//		try {
//			
//			waitForElementPresence(driver, By.className(TextTestDevComponent.getUIElements().get("taskaction").getClassName()));
//		    clickOnElement(driver, By.className(TextTestDevComponent.getUIElements().get("taskaction").getClassName()));
//	        
//		    Thread.sleep(1000);
//		  //  driver.close();
//  
//     	   // Actions action= new Actions(driver);
//			//action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys(Keys.TAB);
//			//action.build().perform();
//
//		} catch (NoSuchElementException e) {
//			fail("Not able to Accept the Chat");
//		}
//		
//	}
	
	
//	@Then("^Agent is directed to the bridge widget for dev$")
//	public void Agent_is_directed_to_the_bridge_widget_for_dev() throws Throwable  {
//
//		try {
//			
//			 Thread.sleep(1000);
//			 
//			 String bridgew =  driver.getCurrentUrl();
//		     System.out.println("**********" + bridgew);
//			
//		     driver.manage().window().setSize(new Dimension(700, 1000));
//		     Thread.sleep(500);
//		     driver.manage().window().setPosition(new Point(800,50));
//		     
//		     Thread.sleep(3000);
//		     
//		     Set<String>set1=driver.getWindowHandles();
//		     Iterator<String>win1 = set1.iterator();
//		     String parent = win1.next();
//		     String child = win1.next();
//		     driver.switchTo().window(child);
//		     System.out.println("@@@@@@@@" + driver.getCurrentUrl());
//		     Thread.sleep(1000);
//		     
//		     
//		     
//		     
//		     WebElement textarea= driver.findElement(By.className("messageAreaParent"));
//		 
//		     Actions actions = new Actions(driver);
//		     Thread.sleep(1000);
//		     actions.sendKeys(textarea, "Hi There");
//		     actions.build().perform();
//		     Thread.sleep(1000);
//	
//	     
//		     
//		     
//		     
//		     driver.findElement(By.cssSelector("#sendNewMessageForm > div.form-group.text-right.padding-h-15 > button")).click();
//		     
//		     driver.switchTo().window(parent);
//		     Thread.sleep(1000);
//
//		} catch (NoSuchElementException e) {
//			fail("Not directed to bridge widget");
//		}
//	}
//	
	

//		}
//		
//	}
//	


	}
	



