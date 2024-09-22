package com.TestCases;

import org.testng.annotations.Test;

import com.PageObject.RegisterPage;
import com.TestBase.BaseClass;

public class TC001_RegisterPage extends BaseClass {
	
	
	
	@Test
	public void verifyRegisterPage() {
		
		try {
		RegisterPage r1=new RegisterPage(driver);
		logger.info("Start The Test Execution");

		r1.setMaleButton();
		r1.setFirstName(randomeString().toUpperCase());
		r1.setLastName(randomeString().toUpperCase());
		r1.setEmail(randomeString()+"@gmail.com");
		
		
		r1.setPassword("Dell@1234");
		r1.setConfPassword("Dell@1234");
		r1.setRegisterButton();
		
		r1.setContinueButton();
		logger.info("RegisterPage verify");
		
	}
		catch(Exception e) {
			logger.debug("Test Case fil");
		}

}
}