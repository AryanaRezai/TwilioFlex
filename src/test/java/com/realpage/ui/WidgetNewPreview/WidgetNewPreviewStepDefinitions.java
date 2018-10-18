package com.realpage.ui.WidgetNewPreview;

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
import org.junit.Test;
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
import io.qameta.allure.*;


/*
 ******************************************************* 
 Covering: 
 	- All Search functionality 
 *******************************************************
 */
public class WidgetNewPreviewStepDefinitions extends PageBase{
	
	
	private WebDriver driver;
	private UIComponentMap uiMap;
	private UIComponent WidgetCheckOnlyUatComponent;
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
	public WidgetNewPreviewStepDefinitions(WebDriverManager webDriver, DataManager data) {
		this.driver = webDriver.getWebDriver();
		uiMap = data.getUIComponentMap();
		uiPageFactory = data.getUIPageFactory();
		WidgetCheckOnlyUatComponent = uiMap.getComponent("widgetcheckonlyuat");
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
	
	
	
	@When("^Chat preview is displayed in uat$")
	public void A_chat_preview_is_displayed_in_uat() throws Throwable {
		try{
			

			driver.findElement(By.className("standard-widget-preview"));
			
			
	} catch (NoSuchElementException e) {
		fail("Preview chat is not visible");
	    }
	
     }
	

	
	@When("^Leasing subject is selected$")
	public void Leasing_subject_is_selected() throws Throwable {
		try{
			
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(By.xpath("//*[@id='widgetDetail']/div[3]/div[2]/div/div/div[2]/label/span")));
			actions.perform();
			Thread.sleep(5000);
			
			WebElement leasetoggle= driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div > div.raul-box-block.px-3.py-3 > label > div > span"));
		    
	
		} catch (NoSuchElementException e) {
		fail("Prechat questions are not there");
	    }
	
     }
	

	@Then("^User checks Text Messages$")
	public void User_checks_Text_Messages() throws Throwable {
		try{
			
			//Text Messages check box
			WebElement textcheckboxlabel = driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div > div.raul-box-block.px-3.py-3 > div > div:nth-child(1)"));
			String texttextlabel= textcheckboxlabel.getText();
			System.out.println(texttextlabel);
		    assertTrue(texttextlabel.contains("Text Messages"));
            System.out.println("*");
		   
		// driver.findElement(By.cssSelector("#widgetDetail > div.widget-details-subjects > div:nth-child(2) > div > div > div.raul-box-block.px-3.py-3 > div > div:nth-child(1) > div > label:nth-child(3)")).click();
		  
		} catch (NoSuchElementException e) {
			fail("Prechat questions are not modified");
		    }
		
	     }


}
