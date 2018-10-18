package com.realpage.ui.WidgetCheckProd;

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
public class WidgetCheckProdStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent WidgetCheckProdComponent;
	private List<WebElement> containers;
	private UIPageFactory uiPageFactory;
	private String ctatext; 
	private String widgreetingtext;
	private String TextColor;
	private String headbtnColor;
	

	/*
	 * ******************************************************
	 * ********** SELENIUM WEBDRIVER INSTANCE ***********
	 * ******************************************************
	 */
	@Autowired
	public WidgetCheckProdStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		WidgetCheckProdComponent = uiMap.getComponent("widgetcheck");
		driver.manage().window().maximize();
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */

	@When("^User opens the prod widget admin url ([^\"]+)$")
	public void User_opens_the_prod_widget_admin_url(String adminUrl) throws InterruptedException {
		try {
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			driver.get(url+adminUrl);
			Thread.sleep(300);

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to open the prod widget admin url");
		}
	}
	
	
	@When("^A chat preview is displayed in prod$")
	public void A_chat_preview_is_displayed_in_prod() throws Throwable {
		try{
			

			driver.findElement(By.className("standard-widget-preview"));
			
			
	} catch (NoSuchElementException e) {
		fail("Preview chat is not visible");
	    }
	
     }
	
	
	@When("^Call To Action Text is there$")
	public void Call_To_Action_Text_is_there() throws Throwable {
		try{
			WebElement calltoact = driver.findElement(By.id("widget_title"));
            String ctatitle = calltoact.getAttribute("value");
            System.out.println(ctatitle);
            ctatext = ctatitle.toUpperCase();
            System.out.println(ctatext);
			Thread.sleep(500);

	} catch (NoSuchElementException e) {
		fail("Call to Action Text was not there in prod");
	    }
	
     }
	
	@When("^Greeting Text is there$")
	public void Greeting_Text_is_there() throws Throwable {
		try{
			WebElement greeting = driver.findElement(By.cssSelector("#leasing_label"));
			widgreetingtext= greeting.getAttribute("value");
			System.out.println(widgreetingtext);
			Thread.sleep(500);

	} catch (NoSuchElementException e) {
		fail("Call to Action Text was not there in prod");
	    }
	
     }
	
	
	@When("^Prechat questions are there in prod$")
	public void Prechat_questions_are_there_in_prod() throws Throwable {
		try{
			
			//leasetoggle
			driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div > div.raul-box-block.px-3.py-3 > label > div"));
		
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div > div.raul-box-block.px-3.py-3 > div > div:nth-child(10) > label")));
			actions.perform();
			Thread.sleep(1000);
			
			//Text Messages check box
			WebElement textcheckbox = driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div > div.raul-box-block.px-3.py-3 > div > div:nth-child(1) > div > label:nth-child(3) > span.raul-form-input-text"));
			String texttext= textcheckbox.getText();
			System.out.println(texttext);
		    assertTrue(texttext.contains("Text Messages"));
		    Thread.sleep(1000);
		
			//first name
			WebElement fname= driver.findElement(By.className("prechat-firstname"));

			
			//firstName Mandatory
////			WebElement fnameman= driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div > div.raul-box-block.px-3.py-3 > div:nth-child(8) > div:nth-child(3) > div.col-sm-12.col-lg-6.required-section.prechat-firstname-required > label:nth-child(2) > span.raul-radio-checkmark"));
////			if (!fnameman.isSelected()) {
////				fnameman.click();
////				System.out.println("was not selected");
////			} else{
////				System.out.println("Was selected");
////			}
//			
//			
			//last name
			WebElement lname= driver.findElement(By.className("prechat-lastname"));
//		
//			
			//Email
			WebElement email= driver.findElement(By.className("prechat-email"));
//		
//			
//			
//			//phone
//			WebElement phone= driver.findElement(By.className("prechat-phonenumber"));
//		
	
		} catch (NoSuchElementException e) {
		fail("Prechat questions are not there");
	    }
	
     }
	
	
//	@When("^Maintenance section is there$")
//	public void Maintenance_section_is_there() throws Throwable {
//		try{
//			
//		WebElement maint=driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div:nth-child(2) > div.raul-box-header > h3"));
//		String maintext = maint.getText();
//		System.out.println(maintext);
//		assertTrue(maintext.equals("Maintenance"));
//			
//	} catch (NoSuchElementException e) {
//		fail("Maintenance section is not there");
//	    }
//	
//     }
//
//	
//	@When("^User turns the Maintenance toggle on$")
//	public void User_turns_the_Maintenance_toggle_on() throws Throwable {
//		try{
//			
//			WebElement maintoggle= driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div:nth-child(2) > div.raul-box-block.px-3.py-3 > label > span"));
//			if(maintoggle.isEnabled()){
//				
//			}else {
//				maintoggle.click();
//			}
//			
//		} catch (NoSuchElementException e) {
//			fail("User turns the maintenance toggle on");
//		    }
//		
//	     }
//	
//	
//	@Then("^User can select Text Messages$")
//	public void User_can_select_Text_Messages() throws Throwable {
//		try{
//			
//			//Text Messages check box
//			WebElement textcheckbox = driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div:nth-child(1) > div.raul-box-block.px-3.py-3 > div:nth-child(2) > div > label:nth-child(3) > span.raul-form-input-text"));
//			String texttext= textcheckbox.getText();
//			System.out.println(texttext);
//		    assertTrue(texttext.contains("Text Messages"));
//		    Thread.sleep(1000);
//		    
//			if (textcheckbox.isSelected()){
//				
//				System.out.println("Already selected");
//				
//			}  else{
//	
//				textcheckbox.click();
//				System.out.println("Just selected");
//		}
//		  
//		} catch (NoSuchElementException e) {
//			fail("Prechat questions are not modified");
//		    }
//		
//	     }
//	
//	
//	@Then("^an SMS Provisioned number is displayed$")
//	public void an_SMS_Provisioned_number_is_displayed() throws Throwable {
//		try{
//			WebElement smsnr= driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div:nth-child(2) > div.raul-box-block.px-3.py-3 > div.row.sms-provisioned-section.sms-provisioned-maintenance > div > input.form-control"));
//			String smsnumber = smsnr.getAttribute("value");
//			System.out.println(smsnumber);
//			assertTrue(!smsnumber.equals(null));
//			
//		} catch (NoSuchElementException e) {
//			fail("SMS Provisioned is not displayed");
//		    }
//		
//	     }
//	
//	
//	@Then("^There are prechecked questions$")
//	public void There_are_prechecked_questions() throws Throwable {
//		try{
//			WebElement mainques= driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div:nth-child(2) > div.raul-box-block.px-3.py-3 > div:nth-child(5)"));
//			String mainquestions = mainques.getText();
//			System.out.println(mainquestions);
//			assertTrue(mainquestions.contains("Maintenance Disclaimer"));
//			assertTrue(mainquestions.contains("First Name"));
//			assertTrue(mainquestions.contains("Last Name"));
//			assertTrue(mainquestions.contains("Email"));
//			assertTrue(mainquestions.contains("Phone Number"));
//			assertTrue(mainquestions.contains("Permission to Enter"));
//			assertTrue(mainquestions.contains("Entry Alarm"));
//			assertTrue(mainquestions.contains("Apartment Number"));
//			assertTrue(mainquestions.contains("Maintenance Problem Category (Integrated)"));
//			assertTrue(mainquestions.contains("Pets"));
//			assertTrue(mainquestions.contains("Issue Description"));
//			
//		} catch (NoSuchElementException e) {
//			fail("The Maintenance prechecked questions are not displayed");
//		    }
//		
//	     }


	@When("^User navigates to Appearance in prod$")
	public void User_navigates_to_Appearance_in_prod() throws Throwable {
		try{
			
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-look-feel > div > div > h3")));
			actions.perform();
			
	
		} catch (NoSuchElementException e) {
			fail("Appearance section in prod is not there");
		    }
		
	     }
	
	
	@Then("^there is a Text color field in prod$")
	public void there_is_a_Text_color_field_in_prod() throws Throwable {
		try{
			
			//Get the text color
			WebElement tcolor = driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-look-feel > div > div > div > div:nth-child(1) > div.raul-box-block > div.hex-color-panel > div > div:nth-child(1) > div:nth-child(2) > input"));
			TextColor = tcolor.getAttribute("value");
			System.out.println(TextColor);
			
		} catch (NoSuchElementException e) {
			fail("Text Color is not displayed");
		    }
		
	     }

	@Then("^there is a Header and Button color field in prod$")
	public void there_is_a_Header_and_Button_color_field_in_prod() throws Throwable {
		try{
			
			//Get the Header and Buttons color
			WebElement hbcolor = driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-look-feel > div > div > div > div:nth-child(1) > div.raul-box-block > div.hex-color-panel > div > div:nth-child(1) > div:nth-child(4) > input"));
			headbtnColor = hbcolor.getAttribute("value");
			System.out.println(headbtnColor);
			
		} catch (NoSuchElementException e) {
			fail("Header and Buttons color is not there");
		    }
		
	     }
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@When("^User opens the prod widget url  ([^\"]+)$")
	public void User_opens_the_prod_widget_url(String widgetUrl) throws InterruptedException {
		try {
			
			driver.navigate().to(widgetUrl);
			Thread.sleep(2000);
	
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to Expand The Navigation Menu");
		}
	}
	
	

	@When("^The header text is matching in prod$")
	public void The_header_text_is_matching_in_prod() throws Throwable {
		try{
	
			WebElement dd= driver.findElement(By.id("cta-button"));
			String bb = dd.getText();
			System.out.println(bb);
			Thread.sleep(1000);
			assertTrue(bb.equals(ctatext));
			
	} catch (NoSuchElementException e) {
		fail("NOT able select CHAT in the widget");
	    }
	
     }
	

	
	
	
	@When("^User clicks on the widget in prod$")
	public void User_clicks_on_the_widget_in_prod() throws InterruptedException {
		try {
			
			driver.findElement(By.cssSelector("#cta-button")).click();
			Thread.sleep(1000);

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("The widget is not click-able");
		}
	}
	

//	@When("^User selects CHAT option$")
//	public void User_selects_CHAT_option() throws Throwable {
//		try{
//			
//			driver.switchTo().frame("communicationIframe");
//			//System.out.println("******" + "switched again" + "********");
//			WebDriverWait wait = new WebDriverWait(driver, 50);
//			WebElement widchat = wait.until(ExpectedConditions.elementToBeClickable(By.className("jump-cell-1")));
//			widchat.click();
//			
//			Thread.sleep(1000);
//	} catch (NoSuchElementException e) {
//		fail("NOT able select CHAT Option in the widget");
//	    }
//	
//     }
	
	
//	@When("^The greeting text is matching in prod$")
//	public void The_greeting_text_is_matching_in_prod() throws Throwable {
//		try{
//	
//			WebElement gt= driver.findElement(By.className("form-control-label"));
//			String greett = gt.getText();
//			System.out.println(greett);
//			Thread.sleep(1000);
//			assertTrue(greett.equals(widgreetingtext));
//			
//			
//	} catch (NoSuchElementException e) {
//		fail("Greeting Text is not matching");
//	    }
//	
//     }
	
	
//	@When("^Prechat questions are matching in prod$")
//	public void Prechat_questions_are_matching_in_prod() throws Throwable {
//		try{
//	
//			WebElement fnamel = driver.findElement(By.cssSelector("#contactDetails > div.form-container > div:nth-child(1) > label"));
//			Thread.sleep(200);
//			String fnamelabl = fnamel.getText();
//			System.out.println(fnamelabl);
//			Thread.sleep(200);
//			assertTrue(fnamelabl.contains("First"));
//			assertTrue(fnamelabl.contains("Name"));
//			assertTrue(fnamelabl.contains("*"));
//			
//			
//			WebElement lnamel = driver.findElement(By.cssSelector("#contactDetails > div.form-container > div:nth-child(2) > label"));
//			Thread.sleep(200);
//			String lnamelabl = lnamel.getText();
//			System.out.println(lnamelabl);
//			Thread.sleep(200);
//			assertTrue(lnamelabl.contains("Last"));
//			assertTrue(lnamelabl.contains("Name"));
//			assertTrue(lnamelabl.contains("*"));
//			
//			WebElement emaill = driver.findElement(By.cssSelector("#contactDetails > div.form-container > div:nth-child(3) > label"));
//			Thread.sleep(200);
//			String emaillabl = emaill.getText();
//			System.out.println(emaillabl);
//			Thread.sleep(200);
//			assertTrue(emaillabl.contains("Email"));
//			assertTrue(emaillabl.contains("*"));
//			
//			
//			WebElement phonel = driver.findElement(By.cssSelector("#contactDetails > div.form-container > div.row.m-a-0 > div > div > label"));
//			Thread.sleep(200);
//			String phonelabl = phonel.getText();
//			System.out.println(phonelabl);
//			Thread.sleep(200);
//			assertTrue(phonelabl.contains("Phone"));
//			assertTrue(phonelabl.contains("*"));
			
			
//	} catch (NoSuchElementException e) {
//		fail("Greeting Text is not matching");
//	    }
//	
//     }
//	
//	
	
	
	@When("^The text color is matching in prod$")
	public void The_text_color_is_matching_in_prod() throws Throwable {
		try{
			
			driver.switchTo().frame("communicationIframe");
			Thread.sleep(2000);
			String font_color =driver.findElement(By.xpath("//*[@id='chat-btn']/span")).getCssValue("color");
			
            System.out.println(font_color);
            String color1[];
            color1 = font_color.replace("rgba(", "").split(",");
            String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()),Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim())); 
            String fontcolor = hex.toUpperCase();
            System.out.println(fontcolor);
            
           assertTrue(fontcolor.equals("#" + TextColor));
	
	} catch (NoSuchElementException e) {
		fail("Text color is not matching");
	    }
	
     }
	
	
	@When("^The header and button color is matching in prod$")
	public void The_header_and_button_is_matching_in_prod() throws Throwable {
		try{
			System.out.println(headbtnColor);
            String header_color= driver.findElement(By.xpath("/html/body/div[3]/div[1]")).getCssValue("background");
            System.out.println(header_color);
            Thread.sleep(500);
            String headerhex= header_color.substring(0, 16);
            System.out.println("#######" + headerhex);
            System.out.println("String was split");
            
            String color1[];
            color1 = headerhex.replace("rgb(", "").split(",");
            String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()),Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim())); 
            String headerbackcolor = hex.toUpperCase();
            System.out.println("*********");
            System.out.println(headerbackcolor);
            
            System.out.println(headbtnColor);
            assertTrue(headerbackcolor.equals("#" + headbtnColor));

	
			
	} catch (NoSuchElementException e) {
		fail("Button text color is not matching");
	    }
	
     }
	
	
	
	
	
	
	
	
	
	

}
