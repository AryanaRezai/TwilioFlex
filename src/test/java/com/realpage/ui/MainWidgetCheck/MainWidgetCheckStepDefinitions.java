package com.realpage.ui.MainWidgetCheck;

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
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.UUID;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/*
 ******************************************************* 
 Covering: 
 	- All Search functionality 
 *******************************************************
 */
public class MainWidgetCheckStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent MainWidgetCheckComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	private String ctatext; 
	private String widgreetingtext;
	private String TextColor;
	private String headbtnColor;
	private WebElement main;

	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public MainWidgetCheckStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		MainWidgetCheckComponent = uiMap.getComponent("mainwidgetcheck");
		driver.manage().window().maximize();
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */


	@When("^User selects maintenance from drop down$")
	public void User_select_maintenance_from_drop_down() throws Throwable {
		try{
			Thread.sleep(1000);

			WebElement mainbox = driver.findElement(By.id("ccSubject"));
			mainbox.click();
			Thread.sleep(200);
	
		    WebElement element = driver.findElement(By.cssSelector("#ccSubject > option:nth-child(3)"));
		    Thread.sleep(200);
		    element.click();
		    Thread.sleep(200);
		  
		    String boxtext = mainbox.getText();
		    System.out.println("@@@@" + boxtext);
	    
	} catch (NoSuchElementException e) {
		fail("Maintenance couldn't be selected from dropdown");
	    }
	
     }
	
	
	@Then("^Maintenance Problem Category is displayed$")
	public void Maintenance_Problem_Category_is_displayed() throws Throwable {
	   try{ 
	    
		   
		  WebElement cat = driver.findElement(By.cssSelector("#contactDetails > div.form-container > div:nth-child(6) > span:nth-child(5)"));
		  String catfield = cat.getText();
		  System.out.println(catfield);
		  assertTrue(catfield.contains("Maintenance Problem Category"));
		  assertTrue(catfield.contains("*"));
		  
		  
         } catch (NoSuchElementException e) {
	      fail("Maintenance widget's phone number is not displayed");
             }

          }



	@When("^User clicks on the category drop down$")
	public void User_clicks_on_the_category_drop_down() throws Throwable {
		   try{ 
			   
			   main= driver.findElement(By.xpath("//*[@id='81e4f66cdb2c6dcee207ee3b710b7245chat']"));
			   main.click();
			   Thread.sleep(1000);
			 
		   } catch (NoSuchElementException e) {
		   	fail("Maintenance couldn't be selected from dropdown");
		       }

		    }
	
	

	@Then("^user can select a ctegory$")
	public void user_can_select_a_ctegory() throws Throwable {
		   try{ 
			   
			   
			   WebElement maincat = driver.findElement(By.xpath("//*[@id='81e4f66cdb2c6dcee207ee3b710b7245chat']/option[10]"));
			   Thread.sleep(1000);
			   maincat.click();
			   Thread.sleep(500);
			   
			    String maintext = main.getText();
			    System.out.println("######"+ maintext);
			    //assertTrue(maintext.equals("General"));
			    
			    
		   } catch (NoSuchElementException e) {
		   	fail("Maintenance couldn't be selected from dropdown");
		       }

		    }
	
	
	@Then("^user can give permission to enter$")
	public void user_can_give_permission_to_enter() throws Throwable {
		   try{ 
			   
			   WebElement perm= driver.findElement(By.cssSelector("#contactDetails > div.form-container > div:nth-child(6) > span:nth-child(7) > label"));
				  String permenter = perm.getText();
				  System.out.println(permenter);
				  assertTrue(permenter.contains("Permission to Enter?"));
				  assertTrue(permenter.contains("*"));
				  
			   
			  WebElement permiss = driver.findElement(By.cssSelector("#contactDetails > div.form-container > div:nth-child(6) > div:nth-child(9) > span > label:nth-child(2)"));
			  permiss.click();
			  
			    Thread.sleep(300);
		   } catch (NoSuchElementException e) {
		   	fail("Not able to give permission to enter");
		       }

		    }

	@Then("^there is a warning text visible$")
	public void there_is_a_warning_text_visible() throws Throwable {
		   try{ 
			   
			   WebElement warningtext = driver.findElement(By.cssSelector("#contactDetails > div.form-container > div:nth-child(6) > p > strong"));
			   String wartext = warningtext.getText();
			   System.out.println(wartext);
			   assertTrue(wartext.contains("If service request is deemed an emergency,"));
			    
		   } catch (NoSuchElementException e) {
		   	fail("There is no warning text");
		       }

		    }
	@Then("^user can select pets$")
	public void user_can_select_pets() throws Throwable {
		   try{ 
			   WebElement pet= driver.findElement(By.cssSelector("#contactDetails > div.form-container > div:nth-child(6) > span:nth-child(10) > label"));
				  String havepets = pet.getText();
				  System.out.println(havepets);
				  assertTrue(havepets.contains("Pets?"));
				  assertTrue(havepets.contains("*"));
			 WebElement pets =  driver.findElement(By.cssSelector("#contactDetails > div.form-container > div:nth-child(6) > div:nth-child(11) > span > label:nth-child(2)"));
			 pets.click();

			    
		   } catch (NoSuchElementException e) {
		   	fail("Pets couldn't be selected");
		       }

		    }

	@Then("^user can select entry alarm$")
	public void user_can_select_entry_alarm() throws Throwable {
		   try{ 
			   
			   WebElement alarm= driver.findElement(By.cssSelector("#contactDetails > div.form-container > div:nth-child(6) > span:nth-child(12) > label"));
				  String entryalarm = alarm.getText();
				  System.out.println(entryalarm);
				  assertTrue(entryalarm.contains("Entry Alarm?"));
				  assertTrue(entryalarm.contains("*"));
			   WebElement alarms = driver.findElement(By.cssSelector("#contactDetails > div.form-container > div:nth-child(6) > div:nth-child(13) > span > label:nth-child(2)"));
			   alarms.click();
			    
		   } catch (NoSuchElementException e) {
		   	fail("Entry Alarm couldn't be selected");
		       }

		    }

	@Then("^user enters issue description$")
	public void user_enters_issue_description() throws Throwable {
		   try{ 
			   WebElement des= driver.findElement(By.cssSelector("#contactDetails > div.form-container > div:nth-child(6) > span:nth-child(14) > label"));
				  String issuedes = des.getText();
				  System.out.println(issuedes);
				  assertTrue(issuedes.contains("Issue Description"));
				  assertTrue(issuedes.contains("*"));
				  WebElement desfield= driver.findElement(By.cssSelector("#d534c93af6a34ce1efeae88be7ab570dchat"));
				  desfield.sendKeys("It just broke");
				String destinfield = desfield.getAttribute("value");
				System.out.println(destinfield);
				assertTrue(destinfield.equals("It just broke"));
			    
		   } catch (NoSuchElementException e) {
		   	fail("Issues description couldn't be added");
		       }

		    }

	@When("^User deselcts any of the mandatory questions$")
	public void User_deselcts_any_of_the_mandatory_questions() throws Throwable {
		   try{ 
			    
		   } catch (NoSuchElementException e) {
		   	fail("Maintenance couldn't be selected from dropdown");
		       }

		    }

	@When("^clicks on Start Chatting$")
	public void clicks_on_Start_Chatting() throws Throwable {
		   try{ 
			    
		   } catch (NoSuchElementException e) {
		   	fail("Maintenance couldn't be selected from dropdown");
		       }

		    }

	@Then("^An error message will appear \"([^\"]*)\"$")
	public void An_error_message_will_appear(String arg1) throws Throwable {
		   try{ 
			    
		   } catch (NoSuchElementException e) {
		   	fail("Maintenance couldn't be selected from dropdown");
		       }

		    }



}
