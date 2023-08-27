package com.e2etests.automation.utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.cucumber.java.Before;

public class Setup {

	public static WebDriver driver;

	/** 
	 * 
	 */
	@Before
	public void setWebDriver() {

		String browser = System.getProperty("browser");
		if (browser == null) {
			browser = "chrome";
		}
		switch (browser) {

		case "chrome":
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/win/chromedriver.exe");
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
			//driver.manage().window().setSize(new Dimension(1920,1200));
			chromeOptions.addArguments("['start-maximized']");

			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/win/geckodriver.exe");
			FirefoxProfile profile = new FirefoxProfile();
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setCapability("platform", Platform.WIN10);
			firefoxOptions.setProfile(profile);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;

		default:
			throw new IllegalArgumentException("Browser \"" + browser + "\" isn't supported");
		}

	}
}