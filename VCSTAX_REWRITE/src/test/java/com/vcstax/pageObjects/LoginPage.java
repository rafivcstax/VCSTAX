package com.vcstax.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {

	private String userName = "rafi";
	private String password = "rafi1234";

	@FindBy(name = "txtLogin")
	private WebElement txtUserName;

	@FindBy(name = "txtPassword")
	private WebElement txtpassword;

	@FindBy(id = "btnLogIn")
	private WebElement loginbtn;

	// @FindBy(xpath="(//*[@id=\'user-message\']/div[2]/a)")

	@FindBy(how = How.XPATH, using = "//*[@id=\'user-message\']/div[2]/a")
	private WebElement UserMessage;
	
	private static Logger log=LogManager.getLogger(LoginPage.class.getName());
	
	public LoginPage(WebDriver rdriver){
		PageFactory.initElements(rdriver, this);
	}


	public void login() {
		clickUserMessage();
		setUserName(userName);
		setPassword(password);
		clickSubmit();
	}

	private void setUserName(String userName){
		txtUserName.sendKeys(userName);
		log.debug("User Name Entered");
	}

	private void setPassword(String password){
		txtpassword.sendKeys(password);
		log.debug("Password Entered");
	}

	private void clickSubmit(){
		loginbtn.click();
		log.debug("Clicked on Submit Button");
	}

	private void clickUserMessage(){
		UserMessage.click();
		log.debug("Clicked on OK to Continue Link");
	}

}
