package com.e2etests.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RegisterPage {
	
	private ConfigFileReader configFileReader;
	
	/* @FindBy */
	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement firstName;
	
	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastName;
	
	@FindBy(how = How.NAME, using = "phone")
	public static WebElement phoneNmbr;
	
	@FindBy(how = How.ID, using = "userName")
	public static WebElement emailAdress;
	
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnRegister;
	
	@FindBy(how = How.TAG_NAME, using = "a")
	public static WebElement thankyouMessage;

	/* Initialization of elements */
	public RegisterPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader(); 	
}
	
	/* Create Method */
	public void goToUrlRegister() {
		Setup.driver.get(configFileReader.getProperties("register.url"));
	}
	
	public void fillFirstName(String firstname) {
		Setup.driver.manage().deleteAllCookies();
		WebDriverWait wait = new WebDriverWait(Setup.driver, Duration.ofSeconds(30));
		firstName = wait.until(ExpectedConditions.visibilityOf(firstName));
		firstName.sendKeys(firstname);
	}
	
	public void fillLastName(String lastname) {
		Setup.driver.manage().deleteAllCookies();
		WebDriverWait wait = new WebDriverWait(Setup.driver, Duration.ofSeconds(30));
		lastName = wait.until(ExpectedConditions.visibilityOf(lastName));
		lastName.sendKeys(lastname);
	}
	
	public void fillPhone(String phone) {
		phoneNmbr.sendKeys(phone);
	}
	
	public void fillEmailAdress(String email) {
		emailAdress.sendKeys(email);
	}
	
	public void clickBtnRegister() {
		btnRegister.click();
	}
	
}
