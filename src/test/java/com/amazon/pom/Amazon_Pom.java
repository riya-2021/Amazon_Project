package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Pom {

	public static WebDriver driver;

	@FindBy(linkText = "Today's Deals")
	private WebElement Today;

	@FindBy(linkText = "Sign up")
	private WebElement sign;

	@FindBy(id = "ap_email")
	private WebElement email;

	@FindBy(id = "continue")
	private WebElement search;

	@FindBy(id = "ap_password")
	private WebElement pw;

	@FindBy(id = "auth-signin-button")
	private WebElement enter;

	@FindBy(id = "cvf-input-code")
	private WebElement otp;

	@FindBy(xpath = "(//span[@class=\"a-button-inner\"])[1]")
	private WebElement lg;

	public Amazon_Pom(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver2, this);
	}

	public WebElement getToday() {
		return Today;
	}

	public WebElement getSign() {
		return sign;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getPw() {
		return pw;
	}

	public WebElement getEnter() {
		return enter;
	}

	public WebElement getOtp() {
		return otp;
	}

	public WebElement getLg() {
		return lg;
	}
}