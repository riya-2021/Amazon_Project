package com.amazon.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.org.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\amazon\\feature",
                 glue = "com\\amazon\\stepdefinition",
				 monochrome = true)

public class Amazon_runner {

	public static WebDriver driver;

	@BeforeClass
	
	public static void setup() {
		driver = Baseclass.getDriver("chrome");
	}

}
