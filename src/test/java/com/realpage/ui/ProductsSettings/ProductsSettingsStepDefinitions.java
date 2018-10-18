package com.realpage.ui.ProductsSettings;

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
public class ProductsSettingsStepDefinitions extends PageBase{
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent ProductsSettingsComponent;
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
	public ProductsSettingsStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		ProductsSettingsComponent = uiMap.getComponent("productssettings");
		driver.manage().window().maximize();
	}

	/*
	 ******************************************************* 
	 *********** SELENIUM WEBDRIVER/CUCUMBER TESTS*********** 
	 *******************************************************
	 */

	@When("^User navigates to the Proprty Product URL ([^\"]+)$")
	public void User_navigates_to_Proprty_Product_URL(String arg1) throws Throwable {
		try{
			String url = driver.getCurrentUrl();
			System.out.println(url);
			driver.get(arg1);
			Thread.sleep(300);
			
		} catch (NoSuchElementException e) {
			fail("No able to open the Property's product URL");
		    }
		
	     }
	
	

	@When("^Five options are displayed$")
	public void Five_options_are_displayed() throws Throwable {
		try{
			
			WebElement firstop= driver.findElement(By.cssSelector("#product_selection_table > tbody > tr:nth-child(1) > td:nth-child(1) > div > span.product-name.ft-c-primary"));
			String chatlease = firstop.getText();
			System.out.println(chatlease);
			assertTrue(chatlease.contains("Chat for Leasing"));
			
			
			WebElement secondop= driver.findElement(By.cssSelector("#product_selection_table > tbody > tr:nth-child(2) > td:nth-child(1) > div > span.product-name.ft-c-primary"));
			String chatmain = secondop.getText();
			System.out.println(chatmain);
			assertTrue(chatmain.contains("Chat for Maintenance"));
			
			WebElement thirdop= driver.findElement(By.cssSelector("#product_selection_table > tbody > tr:nth-child(3) > td:nth-child(1) > div > span.product-name.ft-c-primary"));
			String textlease = thirdop.getText();
			System.out.println(textlease);
			assertTrue(textlease.contains("Text for Leasing"));
			
			WebElement firthop= driver.findElement(By.cssSelector("#product_selection_table > tbody > tr:nth-child(4) > td:nth-child(1) > div > span.product-name.ft-c-primary"));
			String textmain = firthop.getText();
			System.out.println(textmain);
			assertTrue(textmain.contains("Text for Maintenance"));
			
			WebElement fifthop= driver.findElement(By.cssSelector("#product_selection_table > tbody > tr:nth-child(5) > td:nth-child(1) > div > span.product-name.ft-c-primary"));
			String answeraut= fifthop.getText();
			System.out.println(answeraut);
			assertTrue(answeraut.contains("Answer Automation"));
			
			
		} catch (NoSuchElementException e) {
			fail("Product Page's 5 options are not displayed");
		    }
		
	     }

	@When("^User picks Chat For Leasing$")
	public void User_picks_Chat_For_Leasing() throws Throwable {
		try{
			
			Thread.sleep(500);
			WebElement chatlease = driver.findElement(By.xpath("//*[@id='product_selection_table']/tbody/tr[1]/td[2]/div/label/span"));
			
			if (chatlease.isSelected()) {
				System.out.println("Already Selected");
			} else {
				chatlease.click();
			}
			
			Thread.sleep(500);
			driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.save-footer > div.pull-right > input")).click();
			Thread.sleep(500);
			
		} catch (NoSuchElementException e) {
			fail("Chat for Leasing is not available");
		    }
		
	     }

	@When("^User navigates to Settings Page$")
	public void User_navigates_to_Settings_Page() throws Throwable {
		try{
			
			
			
		    WebElement sett= driver.findElement(By.partialLinkText("Settings"));
		    Thread.sleep(700);
		    sett.click();
			Thread.sleep(3000);
			
		} catch (NoSuchElementException e) {
			fail("Not able to navigate to Setting's page");
		    }
		
	     }

	@Then("^The Leasing settings Card is displayed$")
	public void The_Leasing_settings_Card_is_displayed() throws Throwable {
		try{
			
			WebElement leasecard= driver.findElement(By.cssSelector("#properties_view > div > div.row.p-3 > div > div > div > div > div:nth-child(4) > a > div.card-property-setting-desc > span"));
			String leasesetcard = leasecard.getText();
			System.out.println(leasesetcard);
			assertTrue(leasesetcard.contains("Leasing Settings"));
			
		} catch (NoSuchElementException e) {
			fail("Setting's leasing card is not displayed");
		    }
		
	     }

	@When("^User navigates to the widget ([^\"]+)$")
	public void User_navigates_to_the_widget(String arg1) throws Throwable {
		try{
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			driver.get(arg1);
			Thread.sleep(300);
			
			
		} catch (NoSuchElementException e) {
			fail("Not able to navigate to Widget");
		    }
		
	     }

	@Then("^The Leasing Subject is displayed$")
	public void The_Leasing_Subject_is_displayed() throws Throwable {
		try{
			
			WebElement leasingsub= driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div:nth-child(1)"));
			String leasingttext= leasingsub.getText();
			System.out.println(leasingttext);
			assertTrue(leasingttext.contains("Leasing"));
			
		} catch (NoSuchElementException e) {
			fail("Leasing object not displayed");
		    }
		
	     }
	
	@When("^User navigates back to Products$")
	public void User_navigates_back_to_Products() throws Throwable {
		try{
			
			driver.findElement(By.partialLinkText("Products")).click();
			Thread.sleep(3000);
			
		} catch (NoSuchElementException e) {
			fail("No able to open the Property's product URL");
		    }
		
	     }

	@When("^User selects Chat for Maintenance$")
	public void User_selects_Chat_for_Maintenance() throws Throwable {
		try{
			
           WebElement chatmain= driver.findElement(By.xpath("//*[@id='product_selection_table']/tbody/tr[2]/td[2]/div/label/span"));
			
			if(chatmain.isSelected()) {
				System.out.println("Already Selected");
			} else {
				chatmain.click();
			}
			Thread.sleep(500);
			
			driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.save-footer > div.pull-right > input")).click();
			Thread.sleep(500);
		} catch (NoSuchElementException e) {
			fail("Not able to select chat for maintenance");
		    }
		
	     }

	@Then("^The Maintenance settings Card is displayed$")
	public void The_Maintenance_settings_Card_is_displayed() throws Throwable {
		try{
			
			WebElement maincard= driver.findElement(By.cssSelector("#properties_view > div > div.row.p-3 > div > div > div > div > div:nth-child(5) > a"));
			String mainsetcard = maincard.getText();
			System.out.println(mainsetcard);
			assertTrue(mainsetcard.contains("Maintenance Settings"));
			
		} catch (NoSuchElementException e) {
			fail("Maintenance settings card is not displayed");
		    }
		
	     }

	@Then("^The Maintenance Subject is displayed$")
	public void The_Maintenance_Subject_is_displayed() throws Throwable {
		try{
			
			WebElement mainsub= driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div:nth-child(2)"));
			String maintext= mainsub.getText();
			System.out.println(maintext);
			assertTrue(maintext.contains("Maintenance"));
			
		} catch (NoSuchElementException e) {
			fail("The maintenance subject is not displayed");
		    }
		
	     }

	@When("^User selects Text for Leasing$")
	public void User_selects_Text_for_Leasing() throws Throwable {
		try{
			
		     WebElement textlease= driver.findElement(By.xpath("//*[@id='product_selection_table']/tbody/tr[3]/td[2]/div/label/span"));
				
				if(textlease.isSelected()) {
					System.out.println("Already Selected");
				} else {
					textlease.click();
				}
				Thread.sleep(500);
				
				driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.save-footer > div.pull-right > input")).click();
				Thread.sleep(500);
			
		} catch (NoSuchElementException e) {
			fail("Text for leasing not select-able");
		    }
		
	     }

	@Then("^The Phone Numbers card is displayed$")
	public void The_Phone_Numbers_card_is_displayed() throws Throwable {
		try{
			
			WebElement phonecard= driver.findElement(By.cssSelector("#properties_view > div > div.row.p-3 > div > div > div > div > div:nth-child(6) > a"));
			String phonesetcard = phonecard.getText();
			System.out.println(phonesetcard);
			assertTrue(phonesetcard.contains("Phone Numbers"));
			
		} catch (NoSuchElementException e) {
			fail("Phone numbers card nost displayed");
		    }
		
	     }

	@Then("^the IVR Greeting Menus is displayed$")
	public void the_IVR_Greeting_Menus_is_displayed() throws Throwable {
		try{
			
			WebElement ivrcard= driver.findElement(By.cssSelector("#properties_view > div > div.row.p-3 > div > div > div > div > div:nth-child(7) > a"));
			String ivrsetcard = ivrcard.getText();
			System.out.println(ivrsetcard);
			assertTrue(ivrsetcard.contains("IVR Greeting Menus"));
			
		} catch (NoSuchElementException e) {
			fail("IVR Greeting Menu is not displayed");
		    }
		
	     }

	@Then("^When User navigates to the widget ([^\"]+)$")
	public void When_User_navigates_to_the_widget(String arg1) throws Throwable {
		try{
			String url = driver.getCurrentUrl();
			System.out.println(url);
			driver.get(url+arg1);
			Thread.sleep(300);
			
		} catch (NoSuchElementException e) {
			fail("Not able to navigate to the widget");
		    }
		
	     }

	@Then("^Text Messages option is Enabled under Leasing subject$")
	public void Text_Messages_option_is_Enabled_under_Leasing_subject() throws Throwable {
		try{
			
//			WebElement textmsg = driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div:nth-child(1) > div.raul-box-block.px-3.py-3 > div:nth-child(2) > div > label:nth-child(3) > span.raul-form-input-text"));
//			String textmessage = textmsg.getText();
//			System.out.println(textmessage);
//			assertTrue(textmsg.isEnabled());
			
		} catch (NoSuchElementException e) {
			fail("Text messages option is not enabled");
		    }
		
	     }

	@When("^User selects Text for Maintenance$")
	public void User_selects_Text_for_Maintenance() throws Throwable {
		try{
			
			  WebElement textmain= driver.findElement(By.xpath("//*[@id='product_selection_table']/tbody/tr[4]/td[2]/div/label/span"));
				
				if(textmain.isSelected()) {
					System.out.println("selected");
				} else{
					textmain.click();
				}
				Thread.sleep(500);
				
				driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.save-footer > div.pull-right > input")).click();
				Thread.sleep(500);
		} catch (NoSuchElementException e) {
			fail("Not able to select Text Maintenance");
		    }
		
	     }

	@Then("^Text Messages option is Enabled under Maintenance subject$")
	public void Text_Messages_option_is_Enabled_under_Maintenance_subject() throws Throwable {
		try{
			
//			WebElement textmsg = driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div:nth-child(2) > div.raul-box-block.px-3.py-3 > div:nth-child(2) > div > label:nth-child(3) > span.raul-form-input-text"));
//			String textmessage = textmsg.getText();
//			System.out.println(textmessage);
//			assertTrue(textmsg.isEnabled());
//			Thread.sleep(5000);
	} catch (NoSuchElementException e) {
		fail("Text messages option is not enabled");
	    }
	
     }
	
	@Then("^User unmarks all the options$")
	public void User_unmarks_all_the_options() throws Throwable {
		try{
		
			driver.findElement(By.partialLinkText("Products")).click();
			Thread.sleep(1000);
			
			
		WebElement chatlease=driver.findElement(By.xpath("//*[@id='product_selection_table']/tbody/tr[1]/td[2]/div/label/span"));
		if (chatlease.isSelected()){
			chatlease.click();
		}
			
		
	
		 WebElement chatmain= driver.findElement(By.xpath("//*[@id='product_selection_table']/tbody/tr[2]/td[2]/div/label/span"));
			
			if(chatmain.isSelected()) {
				chatmain.click();
				
			} 
			
			  WebElement textlease= driver.findElement(By.xpath("//*[@id='product_selection_table']/tbody/tr[3]/td[2]/div/label/span"));
				
				if(textlease.isSelected()) {
					textlease.click();
					
				}
				
				
				  WebElement textmain= driver.findElement(By.xpath("//*[@id='product_selection_table']/tbody/tr[4]/td[2]/div/label/span"));
					
					if(textmain.isSelected()) {
						textmain.click();
					}
					
					
					driver.findElement(By.cssSelector("#raul-page-container > div.contentWrapper.background-white.p-a-md > div.save-footer > div.pull-right > input")).click();
					Thread.sleep(500);
					
			
	} catch (NoSuchElementException e) {
		fail("Text messages option is not enabled");
	    }
	
     }
	

	
	
	
	
	
	
	
	
	

}
