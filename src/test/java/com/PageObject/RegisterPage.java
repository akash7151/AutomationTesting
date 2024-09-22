package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='gender-male']")
	WebElement maleRedioButtonElement;
	
	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement firstNamElement;
	
	@FindBy(xpath = "//input[@id='LastName']")
	WebElement lastNamElement;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement emailElement;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement passwordElement;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	WebElement confirmPasswordElement;
	
	@FindBy(xpath = "//input[@id='register-button']")
	WebElement registerButtonElement;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement continueButtonElement;
	
	
	public void setMaleButton() {
		maleRedioButtonElement.click();
	}
	
	public void setFirstName(String fname) {
		firstNamElement.sendKeys(fname);
	}
	public void setLastName(String lname) {
		lastNamElement.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		emailElement.sendKeys(email);
	}
	
    public void setPassword(String password) {
	passwordElement.sendKeys(password);
}
    public void setConfPassword(String ConPassword) {
    	confirmPasswordElement.sendKeys(ConPassword);
    }
    
    public void setRegisterButton() {
    	registerButtonElement.click();
    }
    
    public void setContinueButton() {
    	continueButtonElement.click();
    }
}
