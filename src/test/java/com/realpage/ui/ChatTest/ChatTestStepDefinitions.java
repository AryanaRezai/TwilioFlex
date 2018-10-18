package com.realpage.ui.ChatTest;

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
public class ChatTestStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent ChatTestComponent;
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

	
	@And("Consumer selects CHAT$")
	public void Consumer_selects_CHAT() throws InterruptedException {

		try {
			driver.findElement(By.className("jump-cell-1")).click();
			Thread.sleep(500);


		} catch (NoSuchElementException e) {
			fail("Cannot select a question");
		}
	}
	
	@And("Consumer selects subject$")
	public void Consumer_selects_subject() throws InterruptedException {

		try {
			driver.findElement(By.name("subject")).click();
			Thread.sleep(500);
			WebElement s = driver.findElement(By.cssSelector(".mode-chat > option:nth-child(2)"));
			Thread.sleep(500);
			s.click();
			Thread.sleep(500);
		


		} catch (NoSuchElementException e) {
			fail("Cannot select a question");
		}
	}


	@And("Consumer enters first name \"([^\"]*)\"$")
	public void Consumer_enters_first_name(String fname) throws InterruptedException {

		try {
			
			sendElementText(driver, By.id(ChatTestComponent.getUIElements().get("fnamefield").getIdSelector()), fname);

		} catch (NoSuchElementException e) {
			fail("Cannot enter consumer first name");
		}
	}
	
	
	@And("Consumer enters last name \"([^\"]*)\"$")
	public void Consumer_enters_last_name(String lname) throws InterruptedException {

		try {
			
			sendElementText(driver, By.id(ChatTestComponent.getUIElements().get("lnamefield").getIdSelector()), lname);

		} catch (NoSuchElementException e) {
			fail("Cannot enter consumer last name");
		}
	}
	
	
	@And("Consumer enters email address \"([^\"]*)\"$")
	public void Consumer_enters_email_address(String emailadd) throws InterruptedException {

		try {
			
			sendElementText(driver, By.id(ChatTestComponent.getUIElements().get("emailfield").getIdSelector()), emailadd);

		} catch (NoSuchElementException e) {
			fail("Cannot enter consumer email address");
		}
	}
	
	@And("consumer enters phone number$")
	public void consumer_enters_phone_number() throws InterruptedException {

		try {
			
			WebElement nr= driver.findElement(By.id("chat-form-phone"));
			Thread.sleep(1000);
			nr.sendKeys("4");
			Thread.sleep(100);
			nr.sendKeys("6");
			Thread.sleep(100);
			nr.sendKeys("9");
			Thread.sleep(1000);
			nr.sendKeys("2");
			nr.sendKeys("1");
			nr.sendKeys("6");
			nr.sendKeys("5");
			Thread.sleep(100);
			nr.sendKeys("8");
			Thread.sleep(100);
			nr.sendKeys("2");
			Thread.sleep(100);
			nr.sendKeys("6");
			//sendElementText(driver, By.id(ChatTestComponent.getUIElements().get("phonenr").getIdSelector()), phonenr);

		} catch (NoSuchElementException e) {
			fail("Cannot enter consumer email address");
		}
	}
	
	@When("^Consumer clicks the START CHATTING button$")
	public void Consumer_clicks_the_START_CHATTING_button() throws Throwable  {

		try {
			
			driver.manage().window().setSize(new Dimension(500, 1000));
			clickOnElement(driver, By.id(ChatTestComponent.getUIElements().get("startchatbtn").getIdSelector()));
		    String parentHandle= driver.getWindowHandle();
		   System.out.println("Parent" +" " + parentHandle);
			Thread.sleep(5000);

		} catch (NoSuchElementException e) {
			fail("Not able to click fon START CHATTING button");
		}
		
	}
	


	@Then("^Consumer is directed to the connecting page$")
	public void Consumer_is_directed_to_the_connecting_Page() throws Throwable  {

		try {
			driver.findElement(By.className("operator-info"));
		

		Thread.sleep(1000);
		} catch (NoSuchElementException e) {
			fail("Not on the Connecting Page");
		}
		
	}
	
	
	
	
	@And("^Agent logs in to the agent desktop ([^\"]+)$")
	public void Agent_logs_in_to_the_agent_desktop(String agentDesk) throws Throwable  {

		try {
		     
			  JavascriptExecutor js = (JavascriptExecutor) driver; 
			  js.executeScript("window.open('https://uc-agent-desktop-uat.devplaypen.com/login');");
			  ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
			  driver.switchTo().window(tabs.get(1));
			 Thread.sleep(500);
		    
		     sendElementText(driver, By.id(ChatTestComponent.getUIElements().get("agentemail").getIdSelector()), "Aryana.Rezai@realpage.com"); 
		     sendElementText(driver, By.id(ChatTestComponent.getUIElements().get("agentpassword").getIdSelector()), "password"); 
		     clickOnElement(driver, By.className(ChatTestComponent.getUIElements().get("agentloginsub").getClassName()));
		
		} catch (NoSuchElementException e) {
			fail("Not able to log in to agent desktop");
		}
		
	}
		

	@And("^Agent navigates to the Tasks Page$")
	public void Agent_navigates_to_the_Tasks_Page() throws Throwable  {

		try {
//			clickOnElement(driver, By.id(ChatTestComponent.getUIElements().get("menubtn").getIdSelector()));
//			
//			Thread.sleep(600);
//			
//			clickOnElement(driver, By.cssSelector(ChatTestComponent.getUIElements().get("taskbtn").getCssSelector()));
//			Thread.sleep(1000);
			
			
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
	
		} catch (NoSuchElementException e) {
			fail("Not able to navigate to Tasks Page");
		}
		
	}
	
	

	@And("^Agent accepts the chat$")
	public void Agent_accepts_the_chat() throws Throwable  {

		try {
			
//			WebElement element = driver.findElement(By.name("MessageBody"));
//			Actions actions = new Actions(driver);
//			actions.moveToElement(textarea);
//		    actions.click();
//			driver.switchTo().frame("bridge-chat");
//			driver.switchTo().frame("left");
//			 WebElement textarea= driver.findElement(By.cssSelector("#sendNewMessageForm > div.form-group.padding-h-15.messageAreaParent"));
//		     System.out.println("$$$$$$$$here?");
//		     Actions actions = new Actions(driver);
//		     actions.moveToElement(textarea);
//		    textarea.sendKeys("HI");
//			waitForElementPresence(driver, By.className(ChatTestComponent.getUIElements().get("taskaction").getClassName()));
//		    clickOnElement(driver, By.className(ChatTestComponent.getUIElements().get("taskaction").getClassName()));
//		    Thread.sleep(7000);
		    
		   //driver.close();


		} catch (NoSuchElementException e) {
			fail("Not able to Accept the Chat");
		}
		
	}
	
	
	@Then("^Agent is directed to bridge widget$")
	public void Agent_is_directed_to_bridge_widget() throws Throwable  {

		try {
			
//			 Thread.sleep(1000);
//			 
//			 String bridgew =  driver.getCurrentUrl();
//		     System.out.println("**********" + bridgew);
//			
//		    driver.manage().window().setSize(new Dimension(700, 1000));
//		     Thread.sleep(500);
//		     driver.manage().window().setPosition(new Point(800,50));
//		     
//		     Thread.sleep(1000);
			System.out.println("**********Switching");
			    
			    ArrayList<String> tabs3= new ArrayList<String> (driver.getWindowHandles());
			   // driver.switchTo().window(tabs3.get(0));
			    
			   Thread.sleep(10000);
			   System.out.println("**********Switched");
//		     Set<String>set1=driver.getWindowHandles();
//		     Iterator<String>win1 = set1.iterator();
//		     String parent = win1.next();
//		     String child = win1.next();
//		     driver.switchTo().window(child);
//		     Thread.sleep(1000);
		     WebElement textarea= driver.findElement(By.name("MessageBody"));
		     System.out.println("$$$$$$$$here?");
		     Actions actions = new Actions(driver);
		     actions.moveToElement(textarea);
		     actions.click();
		     
		     System.out.println("$$$$$$$$ OR here?");
		     actions.sendKeys(textarea, "Hi There");
		     actions.build().perform();
		     textarea.sendKeys(Keys.RETURN);
		     //driver.findElement(By.cssSelector("#sendNewMessageForm > div.form-group.text-right.padding-h-15 > button")).click();
		     
		     driver.switchTo().window(tabs3.get(2));
		    // driver.switchTo().window(parent);
		     
		     Thread.sleep(1000);
		     
		     WebElement msg= driver.findElement(By.className("message-input"));
		     msg.sendKeys("Hello");
		     driver.findElement(By.cssSelector("#uc-send-message")).click();
		     
		     Thread.sleep(1000);
		     
		     driver.switchTo().window(tabs3.get(0));
		    // driver.switchTo().window(child);
		     Thread.sleep(1000);
		     assertTrue(driver.findElement(By.className(ChatTestComponent.getUIElements().get("checkmark").getClassName())).isDisplayed());
		     Thread.sleep(700);
		     
		    // clickOnElement(driver, By.className(ChatTestComponent.getUIElements().get("openquote").getClassName()));
		    // Thread.sleep(500);
		     
		     //clickOnElement(driver, By.cssSelector(ChatTestComponent.getUIElements().get("message").getCssSelector()));
		    // Thread.sleep(500);
		     
		    // clickOnElement(driver, By.cssSelector(ChatTestComponent.getUIElements().get("newmessage").getCssSelector()));
            // Thread.sleep(500);
            // textarea.sendKeys(Keys.RETURN);
            // Thread.sleep(500);
             
             url = driver.getCurrentUrl();
             System.out.println(url);
			 System.out.println("The URL is:" + url);
			
			 String [] arrSplit = url.split("%");
		
				 
				 
			 for (int i=63; i< 64 ; i++){
				 
			 System.out.println(arrSplit[i]);
			 String partof= arrSplit[i];
			 System.out.println("Part of the ID is:" + " " + partof);
			 
				id= partof.substring(2);
				 System.out.println(id);
				 //driver.get("https://uc-communication-history-api-dev.devplaypen.com/message_by_conversation/"+id);
			 }
			
			 
             
	
             
           //  driver.switchTo().window(parent);
             msg.sendKeys("Thank you very much");
		     msg.sendKeys(Keys.RETURN);
		     Thread.sleep(700);
		     
		     clickOnElement(driver, By.className(ChatTestComponent.getUIElements().get("closeicon").getClassName()));
		     Thread.sleep(700);
		     
		     clickOnElement(driver, By.className(ChatTestComponent.getUIElements().get("endchatbtn").getClassName()));
		     Thread.sleep(700);
		     
		     clickOnElement(driver, By.className(ChatTestComponent.getUIElements().get("stars").getClassName()));
		     Thread.sleep(700);
		     
		     sendElementText(driver, By.className(ChatTestComponent.getUIElements().get("comments").getClassName()), "Great Service");
		     Thread.sleep(700);
		     
		     
		     driver.findElement(By.cssSelector("body > div.chat-modal > div > div > div.modal-body.hide-element.fill-background.pop-screen-2 > div > div.chat-track-2.hide-element > div > div.text-centered.m-t-20 > button")).click();
		     Thread.sleep(500);
		     driver.findElement(By.id("success-feedback-button")).click();
		     Thread.sleep(1000);
             
		} catch (NoSuchElementException e) {
			fail("Not directed to bridge widget");
		}
	}
	
	
	
	
	
	@Then("^Agent logs out of agent desktop$")
	public void Agent_logs_out_of_agent_desktop() throws Throwable  {

		try {
		
//		    driver.close();
//			Thread.sleep(400);
//			
//			driver.findElement(By.id("raul-header-user-avatar")).click();
//			driver.findElement(By.cssSelector("#raul-user-context > ul > li:nth-child(2) > form > input[type='submit']:nth-child(2)")).click();
//			Thread.sleep(2000);
//	
		} catch (NoSuchElementException e) {
			fail("Cannot find Element");
		}
	}
	
	
	@Then("^The history of the chat is displayed$")
	public void The_history_of_the_chat_is_displayed() throws Throwable  {

		try {
		
			driver.get("https://uc-communication-history-api-dev.devplaypen.com/message_by_conversation/"+id);
			Thread.sleep(1000);
			WebElement y= driver.findElement(By.cssSelector("BODY"));
			String r = y.getText().trim();
			System.out.println(r);
			Thread.sleep(1000);
			assertTrue(r.contains("\"hits\":{\"total\":4"));			
			Thread.sleep(1000);


		} catch (NoSuchElementException e) {
			fail("Cannot find the chat history");
		}
	}
	
	
	
	//Maintenance Issue
	@And("Consumer selects maintenance question$")
	public void Consumer_selects_maintenance_question() throws InterruptedException {

		try {
			waitForElementPresence(driver, By.id(ChatTestComponent.getUIElements().get("questionfield").getIdSelector()));
			driver.findElement(By.id("ccSubject")).click();
			
			Thread.sleep(500);
			
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//*[@id='ccSubject']/option[3]"))).doubleClick().perform();
			
			Thread.sleep(500);

		} catch (NoSuchElementException e) {
			fail("Cannot select maintenance issue option");
		}
	}

	@And("Consumer enters unit number \"([^\"]*)\"$")
	public void Consumer_enters_unit_number(String unitn) throws InterruptedException {

		try {
			
			sendElementText(driver, By.id(ChatTestComponent.getUIElements().get("unitnumfield").getIdSelector()), unitn);

		} catch (NoSuchElementException e) {
			fail("Cannot enter consumer unit number");
		}
	}
	
	@And("Consumer enters phone number \"([^\"]*)\"$")
	public void Consumer_enters_phone_number(String phonen) throws InterruptedException {

		try {
			
			sendElementText(driver, By.id(ChatTestComponent.getUIElements().get("phonenumfield").getIdSelector()), phonen);
			
		

		} catch (NoSuchElementException e) {
			fail("Cannot enter consumer phone number");
		}
	}
	
	
	@And("Consumer selects problem category$")
	public void Consumer_selects_problem_category() throws InterruptedException {

		try {
			
			clickOnElement(driver, By.id(ChatTestComponent.getUIElements().get("probcatfield").getIdSelector()));
			Actions action = new Actions(driver);
			 action.moveToElement(driver.findElement(By.xpath("//*[@id='81e4f66cdb2c6dcee207ee3b710b7245chat']/option[6]"))).doubleClick().perform();

		} catch (NoSuchElementException e) {
			fail("Cannot enter consumer phone number");
		}
	}
	
	
	@And("Consumer selects Permission to enter$")
	public void Consumer_selects_Permission_to_enter() throws InterruptedException {

		try {
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.cssSelector("#contactDetails > div.form-container.secondary-background > div.preConversationQuestions.hide-element > div:nth-child(7) > label"))).perform();
			driver.findElement(By.cssSelector("#contactDetails > div.form-container.secondary-background > div.preConversationQuestions.hide-element > div:nth-child(5) > span > label:nth-child(2)")).click();
			//clickOnElement(driver, By.id(ChatTestComponent.getUIElements().get("permtoenteryes").getIdSelector()));
	
		} catch (NoSuchElementException e) {
			fail("Cannot select permission To Enter Option");
		}
	}
	
	
	@And("Consumer selects Pets$")
	public void Consumer_selects_Pets() throws InterruptedException {

		try {
			
			clickOnElement(driver, By.cssSelector(ChatTestComponent.getUIElements().get("petsyes").getCssSelector()));
	
		} catch (NoSuchElementException e) {
			fail("Cannot select Pets Option");
		}
	}
	
	
	@And("Consumer selects Alarms$")
	public void Consumer_selects_Alarms() throws InterruptedException {

		try {
			
			clickOnElement(driver, By.cssSelector(ChatTestComponent.getUIElements().get("alarmsno").getCssSelector()));
	
		} catch (NoSuchElementException e) {
			fail("Cannot select Alarms Option");
		}
	}
	
	
	@And("Consumer enters Issue Description$")
	public void Consumer_enters_Issue_Description() throws InterruptedException {

		try {
			
			sendElementText(driver, By.id(ChatTestComponent.getUIElements().get("issuedes").getIdSelector()), "I need a new lock");
	
		} catch (NoSuchElementException e) {
			fail("Cannot enter Issue Description");
		}
	}
	
	
	@Then("^Agent sees entered info related to maintenance$")
	public void Agent_sees_entered_info_related_to_maintenance() throws Throwable  {

		try {
			
			WebElement main= driver.findElement(By.className("conversationInfo"));
			String maininfo= main.getText();
			System.out.println(maininfo);
			
			assertTrue(maininfo.contains("Unit Number"));
			assertTrue(maininfo.contains("679"));
			assertTrue(maininfo.contains("Maintenance Problem Category"));
			assertTrue(maininfo.contains("Doors and locks"));
			assertTrue(maininfo.contains("Pte"));
			assertTrue(maininfo.contains("Pets"));
			assertTrue(maininfo.contains("Yes"));
			assertTrue(maininfo.contains("Alarms"));
			assertTrue(maininfo.contains("No"));
			assertTrue(maininfo.contains("Issue Description"));
			assertTrue(maininfo.contains("I need a new lock"));
			assertTrue(maininfo.contains("Phone Number"));
			assertTrue(maininfo.contains("469-1234567"));
			
		
		
		
		
		
		} catch (NoSuchElementException e) {
			fail("Not able to see enetered info related to maintenance");
		}
		
	}
	


	}
	



