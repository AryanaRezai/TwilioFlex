package com.realpage.flex.FlexPammChat;

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
import org.openqa.selenium.chrome.ChromeDriver;
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
public class FlexPammChatStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent FlexPammChatComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	
	

	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public FlexPammChatStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		FlexPammChatComponent = uiMap.getComponent("flexpammchat");
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */
	

	
	
	@Then("^Agent opens a widget in a new window$")
	public void Agent_opens_a_widget_in_a_new_window() throws Throwable {
		try{
			
//			WebElement agentdesktop= driver.findElement(By.cssSelector("#root > div > div.Twilio-RootContainer-default.css-18ljn0d > div.Twilio.Twilio-MainContainer.css-a9ubwn > div.Twilio-MainContainer-default.css-wct8tc > div.Twilio-MainContainer-Content.css-kspy0u > div > div.Twilio.Twilio-ViewCollection.css-1rz1a0b > div.Twilio-View.Twilio-View-agent-desktop.css-11jpuyb > div.Twilio-AgentDesktopView-default.css-wct8tc > div > div:nth-child(1) > div > div.Twilio-AgentDesktopView\.Panel1-default.css-18ljn0d > div.Twilio.Twilio-NoTasksCanvas.css-1018htb"));
//			agentdesktop.click();
//			Thread.sleep(500);
//
//			
//			  WebElement status = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div[1]/div/select"));
//			  String statustext=status.getAttribute("value");
//			  System.out.println(statustext);
//			  
//			 
//			  if (!statustext.equals("Available")){
//				  
//				  status.click();
//				  Thread.sleep(500);
//				  Select available= new Select(driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div[1]/div/select")));
//				  available.selectByVisibleText("Available");
//				  status.click();
//				  Thread.sleep(500);
//				
//			  }
//			
			 
			
			
//              WebDriverWait waitt = new WebDriverWait(driver, 30);
//			  WebElement element = waitt.until(ExpectedConditions.elementToBeClickable(By.className("Twilio-TaskListBaseItem-FirstLine")));
//			  Thread.sleep(500);
//			  System.out.println("found the element");
//			
//			  element.click();
//			  driver.manage().window().maximize();
//			  
//			    //driver.manage().window().setSize(new Dimension(700, 1000));
//			    Thread.sleep(500);
//			    String url = driver.getCurrentUrl();
//				System.out.println(url);
				
				
				//open pamm tab
				JavascriptExecutor jss = (JavascriptExecutor) driver; 
				 jss.executeScript("window.open('https://qa-rpcc.realpage.com/');");
				 ArrayList<String> tabss= new ArrayList<String>(driver.getWindowHandles());
				 driver.switchTo().window(tabss.get(1));
				 Thread.sleep(500);
				 WebElement pammuser= driver.findElement(By.id("txtLogin"));
				 pammuser.sendKeys("arezai");
				 
				 WebElement pammpsw= driver.findElement(By.id("txtPwd"));
				 pammpsw.sendKeys("MaheMan@2020");
				 
				 Thread.sleep(500);
				 WebElement pammloginbtn= driver.findElement(By.id("btnLogin"));
				 pammloginbtn.click();
				 Thread.sleep(500);
				
				//open widget page
				 JavascriptExecutor js = (JavascriptExecutor) driver; 
				 js.executeScript("window.open('https://consumerwidget-uat.devplaypen.com/widget/window/?wid=l6gSG9m8NAHKW2hRrY25Wg');");
				 ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
				 driver.switchTo().window(tabs.get(2));
				 Thread.sleep(500);
		
			      System.out.println(driver.getWindowHandles().size());
			  
			 // driver.get("https://consumerwidget-qa.devplaypen.com/widget/window?wid=ybB9NXFPhKFKHATTISkzw");
			 // driver.manage().window().setSize(new Dimension(700, 1000));
			 // driver.manage().window().setPosition(new Point(800,50));
			  
		//	  driver.findElement(By.className("communicationMode-inner")).click();
//			 element.sendKeys(Keys.CONTROL+"n");
//			 Thread.sleep(1000);
			

			
			
//			Set<String> windows = driver.getWindowHandles();
//			String agentpage = driver.getWindowHandle();
//			((JavascriptExecutor)driver).executeScript("windw.open();");
//			Set<String> consumerWindow = driver.getWindowHandles();
//			consumerWindow.removeAll(windows);
//			String consumerSiteHandle = ((String)consumerWindow.toArray()[0]);
//			driver.switchTo().window(consumerSiteHandle);
//			driver.get("https://consumerwidget-qa.devplaypen.com/widget/window?wid=ybB9NXFPhKFKHATTISkzw");
//			//driver.switchTo().window(adminToolHandle);
//		

////			
//			 ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
//			 driver.switchTo().window(tabs.get(1));
//			driver.manage().window().setSize(new Dimension(500, 1000));
//			driver.manage().window().setPosition(new Point(800,50));
//			Thread.sleep(500);
//			
			
//	        
//			  ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
//			  driver.switchTo().window(tabs.get(1));
//			  Thread.sleep(500);
			    String urls = driver.getCurrentUrl();
				System.out.println(urls);
					
			
	} catch (NoSuchElementException e) {
		fail("Cannot open flex in a new tab");
	}
}

	
	@And("User logs in to PAMM$")
	public void User_logs_in_to_PAMM() throws InterruptedException {

		try {
			
        
			  ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
        	  driver.switchTo().window(tabs.get(0));
	    	  Thread.sleep(500);
			  String urls = driver.getCurrentUrl();
			  System.out.println(urls);
			  driver.manage().window().maximize();
			
		


		} catch (NoSuchElementException e) {
			fail("Cannot open flex in a new tab");
		}
	}
	

	
	@And("User validates contacts name$")
	public void User_validates_contacts_name() throws InterruptedException {

		try {
			
		WebElement contactname= driver.findElement(By.className("Twilio-TaskListBaseItem-FirstLine"));
		String nameofcontact = contactname.getText();
		System.out.println(nameofcontact);
			 assertTrue(nameofcontact.contains("Ary Rez"));
			 
			 

		} catch (NoSuchElementException e) {
			fail("The name of contact is not matching");
		}
	}
	
	
	@And("User enters a message from the Agent$")
	public void User_enters_a_message_from_the_Agent() throws InterruptedException {

		try {
			
			//Agent clicks on the task
		WebElement task=driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/div/div[2]"));
		task.click();	
		
			 WebElement chatinputbox = driver.findElement(By.id("new-message-input"));
			 chatinputbox.sendKeys("Hi Ary");
			 Thread.sleep(500);
			 Actions action = new Actions(driver);
			 action.sendKeys(Keys.ENTER).build().perform();
			 Thread.sleep(1000);

		} catch (NoSuchElementException e) {
			fail("Agent is not able to send a message");
		}
	}
	
	
	@And("User verifies that the contact received the message$")
	public void User_verifies_that_the_contact_received_the_message() throws InterruptedException {

		try {
			
			ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(2));
			 Thread.sleep(2000);
			
//			WebElement text = driver.findElement(By.xpath("//*[@id='IM0f4291af0ac3485d9d69ffde38b41f68']/div[2]"));
//			String agentstext = text.getText();
//			System.out.println(agentstext);
			
//			assertTrue(agentstext.contains("Hi Ary"));
//			System.out.println("11111");
			

		} catch (NoSuchElementException e) {
			fail("Cannot open flex in a new tab");
		}
	}
	
	@And("User verifies agents nickname on the widget$")
	public void User_verifies_agents_nickname_on_the_widget() throws InterruptedException {

		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 50);
			  WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#uc-chat-messages > div:nth-child(2) > div.operator-presentation.m-b-2 > p.font-20.text-l-h.font-bold.text-dark-grey.m-b-10.operator-name")));
					//  (By.cssSelector("#uc-chat-messages > div:nth-child(2) > div.operator-presentation.m-b-2 > p.font-20.text-l-h.font-bold.text-dark-grey.m-b-10.operator-name")));
			 //WebElement agentnickname= driver.findElement(By.cssSelector("#uc-chat-messages > div:nth-child(2) > div.operator-presentation.m-b-2 > p.font-20.text-l-h.font-bold.text-dark-grey.m-b-10.operator-name"));
			 String nickname= element.getText();
			 System.out.println(nickname);
			// assertTrue(nickname.equals("Aryana Rezai"));
			
			 

		} catch (NoSuchElementException e) {
			fail("Cannot verify agents nickname on the widget");
		}
	}
	
	
	@And("User sends a message from the widget$")
	public void User_sends_a_message_from_the_widge() throws InterruptedException {

		try {
			Thread.sleep(500);
			WebElement coninputbox= driver.findElement(By.id("uc-message-input"));
			 coninputbox.sendKeys("Hi there");
			 Thread.sleep(400);
			 Actions action = new Actions(driver);
			 action.sendKeys(Keys.ENTER).build().perform();;
			 Thread.sleep(500);
			 

		} catch (NoSuchElementException e) {
			fail("Cannot send a message from the widget");
		}
	}
	
	
	
	
	@And("User verifies that the agent received the message$")
	public void User_verifies_that_the_agent_received_the_message() throws InterruptedException {

		try {
			 Thread.sleep(500);
			ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(0));
			Thread.sleep(1000);
			
			WebElement text = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/div[2]/div[1]/div/div/div[1]/div[1]/div/div[6]/div[1]/div/div[2]/div/div/div/div[2]"));
			String agentstext = text.getText();
			System.out.println(agentstext);
			
			//assertTrue(agentstext.contains("Hi there"));
			//System.out.println("11111");
			//Thread.sleep(30000);

		} catch (NoSuchElementException e) {
			fail("Cannot open flex in a new tab");
		}
	}
	
	@And("User verifies the info section$")
	public void User_verifies_the_info_section() throws InterruptedException {

		try {
			
			 WebElement infotab = driver.findElement(By.className("css-1i3d2ep"));
			 infotab.click();
			 Thread.sleep(3000);

			 
			System.out.println("flagg and unflagg tasks");
		
			 WebElement flagconversation= driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div/div[1]/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div/div[1]/button"));
			 flagconversation.click();
			 Thread.sleep(1000);
			 System.out.println("flagg conv");
			 
			 
			 WebElement flag= driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div/div[1]/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div/div[1]/div[2]/button"));
			 Thread.sleep(1000);
			 flag.click();
			 System.out.println("flag");
			 Thread.sleep(1000);
			 WebElement ok= driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div/div[1]/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/button"));
			 Thread.sleep(1000);
			 ok.click();
			 System.out.println("ok");
			 Thread.sleep(1000);
			 
			 //Agent unflags the conversation
			 WebElement unflag= driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div/div[1]/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div/div[1]/div[3]/button"));
			 Thread.sleep(1000);
			 unflag.click();
	
			 WebElement chattab = driver.findElement(By.className("css-y47si7"));
			 chattab.click();
			 Thread.sleep(3000);
			 System.out.println("unflagged");
			

		} catch (NoSuchElementException e) {
			fail("Cannot open flex in a new tab");
		}
	}
	
	@And("User sends a canned response from the agent$")
	public void User_sends_a_canned_response_from_the_agent() throws InterruptedException {

		try {
		
//			 WebElement chatinputbox = driver.findElement(By.id("new-message-input"));
//			 chatinputbox.click();
//			 System.out.println("input box found");
//			 Thread.sleep(1000);
			 
			 
			  WebDriverWait wait = new WebDriverWait(driver, 500);
			  WebElement canned = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='new-message-wrapper']/div/button[2]/i")));	
		      canned.click();
			  System.out.println("canned response found");
			  
			  
			Thread.sleep(500);
			WebElement closecan = driver.findElement(By.className("fa-times"));
			closecan.click();
		 
		//	driver.findElement(By.xpath("#canned_menu > div > div.canned-responses-left > div:nth-child(1)")).click();
			 
			
		//	Select greeting = new Select(driver.findElement(By.cssSelector("#canned_menu")));
		//	greeting.getFirstSelectedOption();
			

			
			Thread.sleep(500);


		} catch (NoSuchElementException e) {
			fail("Cannot open flex in a new tab");
		}
	}



	


	}
	



