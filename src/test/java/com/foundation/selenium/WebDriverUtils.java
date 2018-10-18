package com.foundation.selenium;

import static org.junit.Assert.fail;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import com.realpage.core.page.UIPageFactory;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Perform common WebDriver methods
 *
 */
public class WebDriverUtils {
	public static void openPage(WebDriver localDriver, UIPageFactory uiPageFactory, String page) {
		System.out.println("\n***** WebDriverUtils ******");
		System.out.println("WebDriverUtils driver: " + localDriver);
		System.out.println("WebDriverUtils page: " + page);
		String mock = System.getProperty("run.stubMode", "false");
		String pageUrl = uiPageFactory.getPageUrl(page);
		System.out.println(pageUrl);
		try {
			System.out.println("WebDriverUtils Url: " + pageUrl);
			System.out.println("Mock Status is set: " + mock);
			localDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	// Query the DOM for 15s when trying to find element(s) if it's not immediately available
			
			// Add mock feature to pages for UI testing
			if(mock.equalsIgnoreCase("true")){
				pageUrl = pageUrl + "?stubMode=true";
			}

			localDriver.get(pageUrl);
			System.out.println("Able to find page url "+pageUrl);

		} catch (Exception e) {
			e.printStackTrace();
			fail(String.format("Unable to open page: %s", pageUrl));
		}
	}

	public static void refreshPage(WebDriver driver) {
		try {
			driver.navigate().refresh();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	// Query the DOM for 10s when trying to find element(s) if it's not immediately available
		} catch (Exception e) {
			fail(String.format("Unable to refresh page: %s"));
		}
	}

	public static WebDriver getWebDriverInstance() {
		System.out.println("\n***** WebDriverUtils ******");

		String DEFAULT_SELENIUM_STARTING_URL = "https://www.realpage.com/" ;
		System.setProperty("DEFAULT_SELENIUM_STARTING_URL", DEFAULT_SELENIUM_STARTING_URL);

		WebDriver driver = null;

		try {
				String embeddedRcDriver = String.format("embedded-rc:%s", System.getProperty("RC_BROWSERS", "*mac.10.6_firefox.29")); //*mac.10.6_firefox.29
				String localDriver = System.getProperty("RC_BROWSERS","firefox");   //"firefox
				System.out.println("WebDriverUtils embeddedRcDriver: " + embeddedRcDriver);
				System.out.println("WebDriverUtils RC_BROWSERS: " + System.getProperty("RC_BROWSERS","*firefox"));  //"*firefox"

				/*
				 * NOTE: Chrome driver requires local executable file location before Selenium RC can launch it. Ignore it for now since it's only for Dev use
				 */
				System.out.println("WebDriverUtils localDriver: " + localDriver);
				if(localDriver.equalsIgnoreCase("safari")) {
					driver = new SafariDriver();
				}
				if(localDriver.equalsIgnoreCase("chrome")) {
					System.out.println(System.getProperty("user.dir"));
					System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/win/chromedriver.exe"); 
					driver = new ChromeDriver();
					System.out.println("End WebDriverUtils localDriver: " + localDriver);

				}
				if(localDriver.equalsIgnoreCase("ie")) {
					System.out.println(System.getProperty("user.dir"));
					System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/win/IEDriverServer.exe");
					DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
					capabilities.setCapability("requireWindowFocus", true);
					driver = new InternetExplorerDriver(capabilities);
					System.out.println("End WebDriverUtils localDriver: " + localDriver);

				}
				if(localDriver.equalsIgnoreCase("firefox")) {
					System.out.println(System.getProperty("user.dir"));
					driver = new FirefoxDriver();
					System.out.println("End WebDriverUtils localDriver: " + localDriver);

				}
				

				System.out.println("End WebDriverUtils localDriver: " + localDriver);

		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("WebDriverUtils error: " + e.getMessage());
		}
		return driver;
	}

}
