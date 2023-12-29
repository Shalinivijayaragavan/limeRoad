package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucu.sample_Project.Base;

public class Log_In extends Base {
	
	public Log_In() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='SHOP MEN']")
	private WebElement shopmen;

	public WebElement getShopmen() {
		return shopmen;
	}

}
