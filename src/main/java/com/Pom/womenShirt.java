package com.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucu.sample_Project.Base;

public class womenShirt extends Base {

	public womenShirt() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='women_category']")
	private WebElement click_women;
	
	@FindBy(xpath="(//a[text()='shirts'])[1]")
	private WebElement select_women;
	
	@FindBy(xpath="(//img[@loading='eager']//parent::a)[2]")
	private WebElement s1_women;
	
	
	@FindBy(xpath="//span[text()=' L ']")
	private WebElement click_large;
	
	@FindBy(xpath="//div[text()='ADD TO CART']")
	private WebElement click_cart;
	
	@FindBy(xpath="(//div[@onclick='$$.click(this,event);'])[1]")
	private WebElement remove_Cart;
	
	@FindBy(xpath="//a[text()='CONTINUE']")
	public WebElement continue1;

	public WebElement getRemove_Cart() {
		return remove_Cart;
	}

	public void setRemove_Cart(WebElement remove_Cart) {
		this.remove_Cart = remove_Cart;
	}

	public WebElement getClick_women() {
		return click_women;
	}

	public void setClick_women(WebElement click_women) {
		this.click_women = click_women;
	}

	public WebElement getSelect_women() {
		return select_women;
	}

	public void setSelect_women(WebElement select_women) {
		this.select_women = select_women;
	}

	public WebElement getS1_women() {
		return s1_women;
	}

	public void setS1_women(WebElement s1_women) {
		this.s1_women = s1_women;
	}

	
	public WebElement getClick_large() {
		return click_large;
	}

	public void setClick_large(WebElement click_large) {
		this.click_large = click_large;
	}

	public WebElement getClick_cart() {
		return click_cart;
	}

	public void setClick_cart(WebElement click_cart) {
		this.click_cart = click_cart;
	}
	
	
}
