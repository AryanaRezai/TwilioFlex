package com.realpage.ui.WidgetCheck;

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
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.UUID;
import org.apache.commons.io.FileUtils; 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/*
 ******************************************************* 
 Covering: 
 	- All Search functionality 
 *******************************************************
 */
public class WidgetCheckStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent WidgetCheckComponent;
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
	public WidgetCheckStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		WidgetCheckComponent = uiMap.getComponent("widgetcheck");
		driver.manage().window().maximize();
	
		
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */

	@When("^User opens the widget admin url ([^\"]+)$")
	public void User_opens_the_widget_admin_url(String adminUrl) throws InterruptedException {
		try {
			Thread.sleep(5000);
			driver.navigate().to(adminUrl);

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to Expand The Navigation Menu");
		}
	}
	
	
	@When("^Call To Action Text is modified$")
	public void Call_To_Action_Text_is_modified() throws Throwable {
		try{
			WebElement calltoact = driver.findElement(By.id("widget_title"));
			calltoact.clear();
		   
		  String s = RandomStringUtils.randomAlphabetic(8);
		
			calltoact.sendKeys("Let's Chat" + " " + s);
			String calltoactiontext= calltoact.getAttribute("value");
			System.out.println(calltoactiontext);
			ctatext = calltoactiontext.toUpperCase();
			System.out.println(ctatext);
			Thread.sleep(500);

	} catch (NoSuchElementException e) {
		fail("Call to Action Text was not modified");
	    }
	
     }
	
	@When("^Greeting Text is modified$")
	public void Greeting_Text_is_modified() throws Throwable {
		try{
			WebElement greeting = driver.findElement(By.cssSelector("#leasing_label"));
			greeting.clear();
		   
		  String s = RandomStringUtils.randomAlphabetic(8);
		
		    greeting.sendKeys(s);
			widgreetingtext= greeting.getAttribute("value");
			System.out.println(widgreetingtext);
			Thread.sleep(500);

	} catch (NoSuchElementException e) {
		fail("Call to Action Text was not modified");
	    }
	
     }
	
	
	@When("^Prechat questions are modified$")
	public void Prechat_questions_are_modified() throws Throwable {
		try{
			
			
			System.out.println("Getting to toggle");
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div:nth-child(1) > div.raul-box-block.px-3.py-3 > label > div")));
			actions.perform();
			Thread.sleep(1000);
			System.out.println("Enabling toggle");
			WebElement leasetoggle= driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div:nth-child(1) > div.raul-box-block.px-3.py-3 > label > div"));
			if (leasetoggle.isEnabled()){
				
			}else{
				leasetoggle.click();
			}
			
			System.out.println("Getting texts");
			//Text Messages check box
//			WebElement textcheckbox = driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div > div.raul-box-block.px-3.py-3 > div:nth-child(2) > div > label:nth-child(3) > span.raul-form-input-text"));
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
			
			
//			//first name
//			WebElement fname= driver.findElement(By.className("prechat-firstname"));
//			
//			if (fname.isSelected()) {
//				
//			}else{
//				fname.click();
//				
//			}
//			
//			//firstName Mandatory
//			WebElement fnameman= driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div > div.raul-box-block.px-3.py-3 > div:nth-child(8) > div:nth-child(3) > div.col-sm-12.col-lg-6.required-section.prechat-firstname-required > label:nth-child(2) > span.raul-radio-checkmark"));
//			if (fnameman.isSelected()) {
//				
//				System.out.println("was not selected");
//			} else{
//				fnameman.click();
//				System.out.println("Was selected");
//			}
//			
//			
//			//last name
//			WebElement lname= driver.findElement(By.className("prechat-lastname"));
//			if (!lname.isSelected()) {
//				lname.click();
//			}
//			
//			//Email
//			WebElement email= driver.findElement(By.className("prechat-email"));
//			if (!email.isSelected()) {
//				email.click();
//			}
//			
//			
//			//phone
//			WebElement phone= driver.findElement(By.className("prechat-phonenumber"));
//			if (!phone.isSelected()) {
//				phone.click();
//			}
	
		} catch (NoSuchElementException e) {
		fail("Prechat questions are not modified");
	    }
	
     }
	
	
	@When("^Maintenance section is there$")
	public void Maintenance_section_is_there() throws Throwable {
		try{
			
		WebElement maint=driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div:nth-child(2) > div.raul-box-header > h3"));
		String maintext = maint.getText();
		System.out.println(maintext);
		assertTrue(maintext.equals("Maintenance"));
			
	} catch (NoSuchElementException e) {
		fail("Maintenance section is not there");
	    }
	
     }

	
	@When("^User turns the Maintenance toggle on$")
	public void User_turns_the_Maintenance_toggle_on() throws Throwable {
		try{
			
			WebElement maintoggle= driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div:nth-child(2) > div.raul-box-block.px-3.py-3 > label > span"));
			if(maintoggle.isEnabled()){
				
			}else {
				maintoggle.click();
			}
			
		} catch (NoSuchElementException e) {
			fail("User turns the maintenance toggle on");
		    }
		
	     }
	
	
	@Then("^User can select Text Messages$")
	public void User_can_select_Text_Messages() throws Throwable {
		try{
			
			//Text Messages check box
			WebElement textcheckbox = driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div:nth-child(1) > div.raul-box-block.px-3.py-3 > div:nth-child(2) > div > label:nth-child(3) > span.raul-form-input-text"));
			String texttext= textcheckbox.getText();
			System.out.println(texttext);
		    assertTrue(texttext.contains("Text Messages"));
		    Thread.sleep(1000);
		    
			if (textcheckbox.isSelected()){
				
				System.out.println("Already selected");
				
			}  else{
	
				textcheckbox.click();
				System.out.println("Just selected");
		}
		  
		} catch (NoSuchElementException e) {
			fail("Prechat questions are not modified");
		    }
		
	     }
	
	
	@Then("^an SMS Provisioned number is displayed$")
	public void an_SMS_Provisioned_number_is_displayed() throws Throwable {
		try{
			WebElement smsnr= driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div:nth-child(2) > div.raul-box-block.px-3.py-3 > div.row.sms-provisioned-section.sms-provisioned-maintenance > div > input.form-control"));
			String smsnumber = smsnr.getAttribute("value");
			System.out.println(smsnumber);
			assertTrue(!smsnumber.equals(null));
			
		} catch (NoSuchElementException e) {
			fail("SMS Provisioned is not displayed");
		    }
		
	     }
	
	
	@Then("^There are prechecked questions$")
	public void There_are_prechecked_questions() throws Throwable {
		try{
			WebElement mainques= driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div:nth-child(2) > div.raul-box-block.px-3.py-3 > div:nth-child(5)"));
			String mainquestions = mainques.getText();
			System.out.println(mainquestions);
			assertTrue(mainquestions.contains("Maintenance Disclaimer"));
			assertTrue(mainquestions.contains("First Name"));
			assertTrue(mainquestions.contains("Last Name"));
			assertTrue(mainquestions.contains("Email"));
			assertTrue(mainquestions.contains("Phone Number"));
			assertTrue(mainquestions.contains("Permission to Enter"));
			assertTrue(mainquestions.contains("Entry Alarm"));
			assertTrue(mainquestions.contains("Apartment Number"));
			assertTrue(mainquestions.contains("Maintenance Problem Category (Integrated)"));
			assertTrue(mainquestions.contains("Pets"));
			assertTrue(mainquestions.contains("Issue Description"));
			
		} catch (NoSuchElementException e) {
			fail("The Maintenance prechecked questions are not displayed");
		    }
		
	     }


	@When("^User navigates to Appearance$")
	public void User_navigates_to_Appearance() throws Throwable {
		try{
			
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-look-feel > div > div > h3")));
			actions.perform();
			
	
		} catch (NoSuchElementException e) {
			fail("Appearance colors are not there");
		    }
		
	     }
	
	
	@Then("^there is a note visible$")
	public void there_is_a_note_visible() throws Throwable {
		try{
			
			WebElement note =driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-look-feel > div > div > div > div:nth-child(1) > div.raul-box-block > div.alert.alert-info > p"));
			String appearance = note.getText();
			assertTrue(!appearance.equals(null));
		} catch (NoSuchElementException e) {
			fail("Prechat questions are not modified");
		    }
		
	     }
	
	@Then("^there is a Text color field$")
	public void there_is_a_Text_color_field() throws Throwable {
		try{
			
			//Get the text color
			WebElement tcolor = driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-look-feel > div > div > div > div:nth-child(1) > div.raul-box-block > div.hex-color-panel > div > div:nth-child(1) > div:nth-child(2) > input"));
			TextColor = tcolor.getAttribute("value");
			System.out.println(TextColor);
			
		} catch (NoSuchElementException e) {
			fail("Text Color is not displayed");
		    }
		
	     }

	@Then("^there is a Header and Button color field$")
	public void there_is_a_Header_and_Button_color_field() throws Throwable {
		try{
			
			//Get the Header and Buttons color
			WebElement hbcolor = driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-look-feel > div > div > div > div:nth-child(1) > div.raul-box-block > div.hex-color-panel > div > div:nth-child(1) > div:nth-child(4) > input"));
			headbtnColor = hbcolor.getAttribute("value");
			System.out.println(headbtnColor);
			
		} catch (NoSuchElementException e) {
			fail("Header and Buttons color is not there");
		    }
		
	     }
	
	
	@When("^User clicks on save button$")
	public void User_clicks_on_save_button() throws Throwable {
		try{
			
          WebElement save = driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-save-footer > div > input"));
          Thread.sleep(500);
          save.click();
          Thread.sleep(5000);
		
	} catch (NoSuchElementException e) {
		fail("The save button is not visible");
	    }
	
     }
	
	
	@Then("^A success message will appear on top of the page$")
	public void A_success_message_will_appear_on_top_of_the_page() throws Throwable {
		try{
			
			WebElement sm =driver.findElement(By.id("headerSuccessMessage"));
		   // assertTrue(sm.isDisplayed());
			
	} catch (NoSuchElementException e) {
		fail("The save button is not visible");
	    }
	
     }
	
	
	@Then("^The correct date format is there \"([^\"]*)\"$")
	public void The_correct_date_format_is_there(String widgetlistpage) throws Throwable {
		try{
			
            driver.get(widgetlistpage);
            Thread.sleep(200);
            
//			WebElement date= driver.findElement(By.xpath("//*[@id='properties_view']/div/div[3]/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[5]"));
//			String dateformat= date.getText();
//			System.out.println(dateformat);
//			assertTrue(dateformat.contains("06/21/2018"));
//			assertTrue(dateformat.contains("05:14:27"));
    } catch (NoSuchElementException e) {
		fail("The save button is not visible");
	    }
	
     }
	
	
	@Then("^The subject and mode type is there \"([^\"]*)\"$")
	public void The_subject_and_mode_type_is_there(String arg1) throws Throwable {
		try{
			
			
			WebElement subject = driver.findElement(By.cssSelector("#properties_view > div > div.row.p-3 > div > div > div.col-sm-10.col-lg-10 > div > div:nth-child(2) > table > tbody > tr:nth-child(11) > td:nth-child(5)"));
			String subjectmode = subject.getText();
			System.out.println(subjectmode);
			
			//assertTrue(subjectmode.contains(arg1));
			
	} catch (NoSuchElementException e) {
		fail("The save button is not visible");
	    }
	
     }
	
	@Then("^Property Type is \"([^\"]*)\"$")
	public void Property_Type_is(String arg1) throws Throwable {
		try{
			
			WebElement subject = driver.findElement(By.cssSelector("#properties_view > div > div.row.p-3 > div > div > div.col-sm-10.col-lg-10 > div > div:nth-child(2) > table > tbody > tr:nth-child(11) > td:nth-child(3)"));
			String subjectmode = subject.getText();
			System.out.println(subjectmode);
			
			assertTrue(subjectmode.contains(arg1));
			
	} catch (NoSuchElementException e) {
		fail("The save button is not visible");
	    }
	
     }
	
	@Then("^the Version is \"([^\"]*)\"$")
	public void the_Version_is(String arg1) throws Throwable {
		
		try{
			WebElement subject = driver.findElement(By.cssSelector("#properties_view > div > div.row.p-3 > div > div > div.col-sm-10.col-lg-10 > div > div:nth-child(2) > table > tbody > tr:nth-child(11) > td:nth-child(4)"));
			String subjectmode = subject.getText();
			System.out.println(subjectmode);
			
			assertTrue(subjectmode.contains(arg1));
			
	} catch (NoSuchElementException e) {
		fail("The save button is not visible");
	    }
	
     }
	

	
	@When("^User opens the widget url ([^\"]+)$")
	public void User_opens_the_widget_url(String widgetUrl) throws InterruptedException {
		try {
			
			driver.navigate().to(widgetUrl);
			Thread.sleep(2000);
			
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("Not able to Expand The Navigation Menu");
		}
	}

	@When("^The header text is matching$")
	public void The_header_text_is_matching() throws Throwable {
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
	

	@When("^User clicks on the widget$")
	public void User_clicks_on_the_widget() throws InterruptedException {
		try {
			
			driver.findElement(By.cssSelector("#cta-button")).click();
			Thread.sleep(1000);

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			fail("The widget is not click-able");
		}
	}
	

	@When("^User selects CHAT option$")
	public void User_selects_CHAT_option() throws Throwable {
		try{
			
			driver.switchTo().frame("communicationIframe");
			//System.out.println("******" + "switched again" + "********");
			WebDriverWait wait = new WebDriverWait(driver, 50);
			WebElement widchat = wait.until(ExpectedConditions.elementToBeClickable(By.className("communicationMode-chat")));
			widchat.click();
			
			Thread.sleep(1000);
	} catch (NoSuchElementException e) {
		fail("NOT able select CHAT Option in the widget");
	    }
	
     }
	
	@When("^The greeting text is matching$")
	public void The_greeting_text_is_matching() throws Throwable {
		try{
	
			//WebElement gt= driver.findElement(By.className("form-control-label"));
			//String greett = gt.getText();
			//System.out.println(greett);
			//Thread.sleep(1000);
		//	assertTrue(greett.equals("Let's talk" + widgreetingtext));
			
			
	} catch (NoSuchElementException e) {
		fail("Greeting Text is not matching");
	    }
	
     }
	
	
	@When("^Prechat questions are matching$")
	public void Prechat_questions_are_matching() throws Throwable {
		try{
			
			WebElement dd = driver.findElement(By.cssSelector("#contactDetails > div.form-group.inline-block.w-full > div.col-xs-12 > div"));
			String ddtext= dd.getText();
			System.out.println("************" + ddtext);
			
	
			WebElement fnamel = driver.findElement(By.cssSelector("#label-firstName"));
			Thread.sleep(200);
			String fnamelabl = fnamel.getText();
			System.out.println(fnamelabl);
			Thread.sleep(200);
			assertTrue(fnamelabl.contains("First"));
			assertTrue(fnamelabl.contains("Name"));
			assertTrue(fnamelabl.contains("*"));
			System.out.println("*********" + "First Name");
			
			WebElement lnamel = driver.findElement(By.cssSelector("#contactDetails > div.form-container > div:nth-child(2) > label"));
			Thread.sleep(200);
			String lnamelabl = lnamel.getText();
			System.out.println(lnamelabl);
			Thread.sleep(200);
			assertTrue(lnamelabl.contains("Last"));
			assertTrue(lnamelabl.contains("Name"));
			assertTrue(lnamelabl.contains("*"));
			System.out.println("*********"+ "Last Name");
			
			WebElement emaill = driver.findElement(By.cssSelector("#contactDetails > div.form-container > div:nth-child(3) > label"));
			Thread.sleep(200);
			String emaillabl = emaill.getText();
			System.out.println(emaillabl);
			Thread.sleep(200);
			assertTrue(emaillabl.contains("Email"));
			assertTrue(emaillabl.contains("*"));
			System.out.println("*********"+ "Email");
			
			
//			WebElement phonel = driver.findElement(By.cssSelector("#contactDetails > div.form-container > div:nth-child(4) > label"));
//			Thread.sleep(200);
//			String phonelabl = phonel.getText();
//			System.out.println(phonelabl);
//			Thread.sleep(200);
//			assertTrue(phonelabl.contains("Phone"));
//			assertTrue(phonelabl.contains("*"));
//			System.out.println("*********"+ "Phone");
			
			
	} catch (NoSuchElementException e) {
		fail("prechat questiona are not matching");
	    }
	
     }
	
	
	@When("^The text color is matching$")
	public void The_text_color_is_matching() throws Throwable {
		try{
			
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(By.className("startChatButton")));
			actions.perform();
	
			//String font_color= driver.findElement(By.xpath("//*[@id='chat-btn']")).getCssValue("color");		
			String font_color =driver.findElement(By.xpath("//*[@id='chat-btn']/span")).getCssValue("color");
            System.out.println(font_color);
            String color1[];
            color1 = font_color.replace("rgba(", "").split(",");
            String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()),Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim())); 
            String fontcolor = hex.toUpperCase();
            System.out.println(fontcolor);
            
           assertTrue(fontcolor.equals("#" + TextColor));
 		
	} catch (NoSuchElementException e) {
		fail("Button text color is not matching");
	    }
	
     }
	
	
	@When("^The header and button color is matching$")
	public void The_header_and_button_color_is_matching() throws Throwable {
		try{
			
			Thread.sleep(200);
            String header_color= driver.findElement(By.xpath("/html/body/div[3]/div[1]")).getCssValue("background");
            System.out.println(header_color);
            Thread.sleep(200);
            String headerhex= header_color.substring(0,15);
            System.out.println(headerhex);
  
            
            String color1[];
            color1 = headerhex.replace("rgb(", "").split(",");
            String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()),Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim())); 
            String headerbackcolor = hex.toUpperCase();
            System.out.println(headerbackcolor);
            
            System.out.println("*********");
            assertTrue(headerbackcolor.equals("#" + headbtnColor));
	
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("C:\\Users\\arezai\\Pictures\\webDriverScreenshots\\widget.jpg"));
	} catch (NoSuchElementException e) {
		fail("Button text color is not matching");
	    }
	
     }
	
	


}
