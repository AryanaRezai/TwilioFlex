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
			

				
				
				//open pamm tab
				JavascriptExecutor jss = (JavascriptExecutor) driver; 
				 jss.executeScript("window.open('https://qa-rpcc.realpage.com/');");
				 
				 ArrayList<String> tabss= new ArrayList<String>(driver.getWindowHandles());
				 System.out.println("This is Pamm" + "" + driver.switchTo().window(tabss.get(1)));
				 Thread.sleep(500);
				 WebElement pammuser= driver.findElement(By.id("txtLogin"));
				 pammuser.sendKeys("arezai");
				 
				 WebElement pammpsw= driver.findElement(By.id("txtPwd"));
				 pammpsw.sendKeys("Summon@2020");
				 
				 Thread.sleep(500);
				 WebElement pammloginbtn= driver.findElement(By.id("btnLogin"));
				 pammloginbtn.click();
				 Thread.sleep(2000);
				 
				 //open a widget
				 JavascriptExecutor jsss = (JavascriptExecutor) driver; 
				 jsss.executeScript("window.open('https://consumerwidget-uat.devplaypen.com/widget/window/?wid=l6gSG9m8NAHKW2hRrY25Wg');");
				 Thread.sleep(2000);
				 
			
				 
			  
		    	  
//				//open widget page
//				 JavascriptExecutor js = (JavascriptExecutor) driver; 
//				 js.executeScript("window.open('https://consumerwidget-uat.devplaypen.com/widget/window/?wid=l6gSG9m8NAHKW2hRrY25Wg');");
//				 ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
//				 System.out.println(tabs);
//				 driver.switchTo().window(tabs.get(2));
//				 Thread.sleep(500);
//		
//			     System.out.println("This is the widget" + driver.getWindowHandles().size());
//			      
			      
			      
			      
			      
			      
//			      //Open Flex to look for eventual existing tasks to close
//				  ArrayList<String> tabsss= new ArrayList<String>(driver.getWindowHandles());
//	        	  System.out.println("This is Flex" + driver.switchTo().window(tabsss.get(0)));
//		    	  Thread.sleep(1000);
//		    	  
//		    	  
//		    	  
//					if(driver.findElement(By.className("Twilio-TaskListBaseItem-FirstLine")).isDisplayed()){
//					
//					System.out.println("@@@@@");
//					//driver.findElement(By.id("cmdProcess")).click();
//				} else {
//					
//					System.out.println("$$$$$$");
//					 ArrayList<String> tabtab= new ArrayList<String>(driver.getWindowHandles());
//		        	 System.out.println( driver.switchTo().window(tabtab.get(2)));
//					
//				}
//		    	  
//			  
//			 // driver.get("https://consumerwidget-qa.devplaypen.com/widget/window?wid=ybB9NXFPhKFKHATTISkzw");
//			 // driver.manage().window().setSize(new Dimension(700, 1000));
//			 // driver.manage().window().setPosition(new Point(800,50));
//			  
//		//	  driver.findElement(By.className("communicationMode-inner")).click();
////			 element.sendKeys(Keys.CONTROL+"n");
////			 Thread.sleep(1000);
//			
//
//			
//			
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
			
	        
			  ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
			  driver.switchTo().window(tabs.get(2));
			  Thread.sleep(500);
			    String urls = driver.getCurrentUrl();
				System.out.println(urls);
					
			
	} catch (NoSuchElementException e) {
		fail("Cannot open flex in a new tab");
	}
}

	
//	@And("User navigates to Flex to clean up previous tasks$")
//	public void User_navigates_to_Flex_to_clean_up_previous_tasks() throws InterruptedException {
//
//		try {
//			
//			 ArrayList<String> tabss= new ArrayList<String>(driver.getWindowHandles());
//			 //switch to flex to make sure no other tasks are existing
//			  driver.switchTo().window(tabss.get(0));
//			 
//			  
//             WebElement a = driver.findElement(By.className("Twilio-TaskListsContainer"));
//			   if (a != null) {
//			   Thread.sleep(500);
//			   driver.findElement(By.className("Twilio-TaskListBaseItem-FirstLine")).click();
//			   Thread.sleep(500);
//			   
//			   //switch to PAMM iframe
//			 System.out.println(driver.switchTo().defaultContent());
//			 
//			  System.out.println("switched the iframe");
//			  
//			 driver.switchTo().frame("");
//			  System.out.println("switched the iframe");
//			  Thread.sleep(500);
//			  
//			   WebElement process=driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[5]/input"));
//			   process.click();
//			   
////				driver.findElement(By.className("Twilio-TaskListBaseItem-FirstLine")).click();
////				System.out.println("clicking");
////			//	driver.findElement(By.id("cmdProcess")).click();
//			} else {
////		
//				
//			} 
//        
////			  ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
////        	  driver.switchTo().window(tabs.get(0));
////	    	  Thread.sleep(500);
////			  String urls = driver.getCurrentUrl();
////			  System.out.println(urls);
////			  driver.manage().window().maximize();
//			
//		
//			  
//				 //switch to flex to make sure no other tasks are existing
//				  driver.switchTo().window(tabss.get(2));
//
//		} catch (NoSuchElementException e) {
//			fail("Cannot open flex in a new tab");
//		}
//	}
//	

	
	@And("User validates contacts name$")
	public void User_validates_contacts_name() throws InterruptedException {

		try {
			 ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
			  driver.switchTo().window(tabs.get(0));
			  Thread.sleep(500);
			    String urls = driver.getCurrentUrl();
				System.out.println(urls);
			
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
			  Thread.sleep(500);
			  String urls = driver.getCurrentUrl();
			  System.out.println(urls);
			
			WebDriverWait wait= new WebDriverWait(driver, 90);
			WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[3]/div[1]")));
            String agentstext = text.getText();
			System.out.println(agentstext);
			
			assertTrue(agentstext.equals("Hi Ary"));
			System.out.println("11111");
			

		} catch (NoSuchElementException e) {
			fail("Cannot open flex in a new tab");
		}
	}
	
	
	
	
	
	@And("User verifies agents nickname on the widget$")
	public void User_verifies_agents_nickname_on_the_widget() throws InterruptedException {

		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 50);
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[1]/div[1]/p[2]")));
			 WebElement agentnickname= driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div/div[1]/div[1]/p[2]"));
			 String nickname= agentnickname.getText();
			 System.out.println(nickname);
			assertTrue(nickname.equals("AutomationAgent"));
			
			 

		} catch (NoSuchElementException e) {
			fail("Cannot verify agents nickname on the widget");
		}
	}
	
	
	@And("User sends a message from the widget$")
	public void User_sends_a_message_from_the_widge() throws InterruptedException {

		try {
			WebDriverWait wait= new WebDriverWait(driver, 90);
			WebElement coninputbox= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uc-message-input")));
			 coninputbox.sendKeys("Hi there");
			 Thread.sleep(500);
			 Actions action = new Actions(driver);
			 action.sendKeys(Keys.ENTER).build().perform();
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
			
			
			WebDriverWait wait= new WebDriverWait(driver, 90);
			WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div/div[1]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/div[2]/div[1]/div/div/div[1]/div[1]/div/div[6]/div[1]/div/div[2]/div/div/div/div[2]")));
			String agentstext = text.getText();
			System.out.println(agentstext);
			

		} catch (NoSuchElementException e) {
			fail("Agent didn't received the message");
		}
	}
	
	
	@And("User verifies the info section$")
	public void User_verifies_the_info_section() throws InterruptedException {

		try {
			
			
			WebDriverWait wait= new WebDriverWait(driver, 90);
			WebElement infotab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("css-1i3d2ep")));
			infotab.click();
			 

			 
			System.out.println("flagg and unflagg tasks");
			WebDriverWait waitt= new WebDriverWait(driver, 90);
			WebElement flagconversation = waitt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div/div[1]/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div/div[1]/button")));
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
			 
			 WebElement unflag= driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div/div[1]/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div/div[1]/div[4]/button"));
			 Actions actions = new Actions(driver);
			 actions.moveToElement(unflag);
			 Thread.sleep(1000);
			 unflag.click();
			 Thread.sleep(2000);
			 System.out.println("unflagged");
			
			 
			 //verify the duration section 
			 WebElement duration = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div/div[1]/div[3]"));
             String durationcontent= duration.getText();
             System.out.println(durationcontent);
             
             //switch back to chat
             WebElement chattab = driver.findElement(By.className("css-y47si7"));
			 chattab.click();
			 Thread.sleep(3000);
             
		} catch (NoSuchElementException e) {
			fail("Cannot verify the info section");
		}
	}
	
	@And("User sends a canned response from the agent$")
	public void User_sends_a_canned_response_from_the_agent() throws InterruptedException {

		try {
		

			 
			 
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
			fail("Cannot send a canned response");
		}
	}


	@And("User ends the conversation$")
	public void User_ends_the_conversation() throws InterruptedException {

		try {
 
			 
			  WebDriverWait wait = new WebDriverWait(driver, 90);
			  WebElement endconv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("end-conversation")));	
		      endconv.click();	      
		     
		      
		    
		    
		      WebDriverWait waitt = new WebDriverWait(driver, 90);
			  WebElement confirmendconv = waitt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div/div[3]/button[2]")));
			  Thread.sleep(1000);
		      confirmendconv.click();
		      Thread.sleep(1000);
		      
		      WebElement inputbox= driver.findElement(By.id("new-message-input"));
		    //  assertTrue(!inputbox.isEnabled());
		

		} catch (NoSuchElementException e) {
			fail("Cannot send a canned response");
		}
	}

	


	}
	



