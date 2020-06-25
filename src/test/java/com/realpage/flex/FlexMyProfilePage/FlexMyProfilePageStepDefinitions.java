package com.realpage.flex.FlexMyProfilePage;

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
public class FlexMyProfilePageStepDefinitions extends PageBase {

	
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent FlexMyProfilePageComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	

	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	
	@Autowired
	public FlexMyProfilePageStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		FlexMyProfilePageComponent = uiMap.getComponent("flexmyprofilepage");
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */
	
	
	@When("^Agent navigates to My Profile Page$")
	public void Agent_navigates_to_My_Profile_Page() throws Throwable {
		
	   try{

		   Thread.sleep(500);
		   waitForElementPresence(driver, By.xpath(FlexMyProfilePageComponent.getUIElements().get("flexprofilepage").getXpathSelector()));
		   WebElement element=driver.findElement(By.xpath(FlexMyProfilePageComponent.getUIElements().get("flexprofilepage").getXpathSelector()));
		   element.click();   	   
		   Thread.sleep(500);
		   
	   } catch (NoSuchElementException e){
		   fail("Cannot navigate to My Profile Page");
	   
	    }
	}
	
	
	@When("^Agent sees the agents info$")
	public void Agent_sees_the_agents_info() throws Throwable {
		try{
	   

		  //Verifying the header
		   WebElement element=driver.findElement(By.xpath(FlexMyProfilePageComponent.getUIElements().get("flexagentinfoheader").getXpathSelector()));
		   String aiheader= element.getText();
		   System.out.println(aiheader);
		   assertTrue(aiheader.equals("Test-Leasing Agent (Twilio Flex)"));
		   
		   //Verifying the content
		   WebElement elementt=driver.findElement(By.xpath(FlexMyProfilePageComponent.getUIElements().get("flexagentinfocontent").getXpathSelector()));
		   String aicontent= elementt.getText();
		   System.out.println(aicontent);
		   assertTrue(aicontent.contains("Roles:agent"));
		   assertTrue(aicontent.contains("Email:"));
		   assertTrue(aicontent.contains("Location:"));
		   assertTrue(aicontent.contains("Worker SID: WKd2f42f6a990b13814710fdf67eb3c004"));
		   assertTrue(aicontent.contains("Department:"));
		   assertTrue(aicontent.contains("Display Name:"));
		   
		   //Verifying agent roll info
		   WebElement elementtt=driver.findElement(By.className(FlexMyProfilePageComponent.getUIElements().get("flexagentroll").getClassName()));
		   String agentroll = elementtt.getAttribute("Value");
		   System.out.println(agentroll);
		   assertTrue(agentroll.equals("AutomationAgent"));
		   
		   
	   } catch (NoSuchElementException e){
		   fail("Cannot see the agents info on My Profile Page");
	   
	    }
	}
	   
	
	@When("^Agent sees a disabled channels section$")
	public void Agent_sees_a_disabled_channels_section() throws Throwable {
		try{
	   

//		  //Verifying the header
//		   WebElement element=driver.findElement(By.xpath(FlexMyProfilePageComponent.getUIElements().get("flexagentinfoheader").getXpathSelector()));
//		   String aiheader= element.getText();
//		   System.out.println(aiheader);
//		   assertTrue(aiheader.equals("Test-Leasing Agent (Twilio Flex)"));
//	
		   
		   
	   } catch (NoSuchElementException e){
		   fail("Cannot see the agents info on My Profile Page");
	   
	    }
	}
	
	@When("^Agent sees a disabled languages section$")
	public void Agent_sees_a_disabled_languages_section() throws Throwable {
		try{
	   

//		  //Verifying the header
//		   WebElement element=driver.findElement(By.xpath(FlexMyProfilePageComponent.getUIElements().get("flexagentinfoheader").getXpathSelector()));
//		   String aiheader= element.getText();
//		   System.out.println(aiheader);
//		   assertTrue(aiheader.equals("Test-Leasing Agent (Twilio Flex)"));
//	
		   
		   
	   } catch (NoSuchElementException e){
		   fail("Cannot see the agents info on My Profile Page");
	   
	    }
	}
	
	
	@When("^Agent sees a disabled queues section$")
	public void Agent_sees_a_disabled_queues_section() throws Throwable {
		try{
	   

//		  //Verifying the header
//		   WebElement element=driver.findElement(By.xpath(FlexMyProfilePageComponent.getUIElements().get("flexagentinfoheader").getXpathSelector()));
//		   String aiheader= element.getText();
//		   System.out.println(aiheader);
//		   assertTrue(aiheader.equals("Test-Leasing Agent (Twilio Flex)"));
//	
		   
		   
	   } catch (NoSuchElementException e){
		   fail("Cannot see the agents info on My Profile Page");
	   
	    }
	}
	
	@When("^Agent sees a disabled skills section$")
	public void Agent_sees_a_disabled_skills_section() throws Throwable {
		try{
	   

//		  //Verifying the header
//		   WebElement element=driver.findElement(By.xpath(FlexMyProfilePageComponent.getUIElements().get("flexagentinfoheader").getXpathSelector()));
//		   String aiheader= element.getText();
//		   System.out.println(aiheader);
//		   assertTrue(aiheader.equals("Test-Leasing Agent (Twilio Flex)"));
//	
		   
		   
	   } catch (NoSuchElementException e){
		   fail("Cannot see the agents info on My Profile Page");
	   
	    }
	}
	
	
	@When("^Agent sees an enabled sounds section$")
	public void Agent_sees_an_enabled_sounds_section() throws Throwable {
		try{
	   

//		  //Verifying the header
//		   WebElement element=driver.findElement(By.xpath(FlexMyProfilePageComponent.getUIElements().get("flexagentinfoheader").getXpathSelector()));
//		   String aiheader= element.getText();
//		   System.out.println(aiheader);
//		   assertTrue(aiheader.equals("Test-Leasing Agent (Twilio Flex)"));
//	
		   
		   
	   } catch (NoSuchElementException e){
		   fail("Cannot see the agents info on My Profile Page");
	   
	    }
	}
	
	
	@When("^Agent sees an enabled font size section$")
	public void Agent_sees_an_enabled_font_size_section() throws Throwable {
		try{
	   

//		  //Verifying the header
//		   WebElement element=driver.findElement(By.xpath(FlexMyProfilePageComponent.getUIElements().get("flexagentinfoheader").getXpathSelector()));
//		   String aiheader= element.getText();
//		   System.out.println(aiheader);
//		   assertTrue(aiheader.equals("Test-Leasing Agent (Twilio Flex)"));
//	
		   
		   
	   } catch (NoSuchElementException e){
		   fail("Cannot see the agents info on My Profile Page");
	   
	    }
	}
	   
	
	@When("^Agent sees a disabled teams section$")
	public void Agent_sees_an_disabled_teams_section() throws Throwable {
		try{
	   

//		  //Verifying the header
//		   WebElement element=driver.findElement(By.xpath(FlexMyProfilePageComponent.getUIElements().get("flexagentinfoheader").getXpathSelector()));
//		   String aiheader= element.getText();
//		   System.out.println(aiheader);
//		   assertTrue(aiheader.equals("Test-Leasing Agent (Twilio Flex)"));
//	
		   
		   
	   } catch (NoSuchElementException e){
		   fail("Cannot see the agents info on My Profile Page");
	   
	    }
	}
	
	@When("^Agent sees a disabled voice settings section$")
	public void Agent_sees_an_disabled_voice_settings_section() throws Throwable {
		try{
	   

//		  //Verifying the header
//		   WebElement element=driver.findElement(By.xpath(FlexMyProfilePageComponent.getUIElements().get("flexagentinfoheader").getXpathSelector()));
//		   String aiheader= element.getText();
//		   System.out.println(aiheader);
//		   assertTrue(aiheader.equals("Test-Leasing Agent (Twilio Flex)"));
//	
		   
		   
	   } catch (NoSuchElementException e){
		   fail("Cannot see the agents info on My Profile Page");
	   
	    }
	}

}
	   
	   

