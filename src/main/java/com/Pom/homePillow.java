package com.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucu.sample_Project.Base;

public class homePillow extends Base {
	
	public  homePillow()  {

		
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//a[@id='home_category']")
		private WebElement click_Home;
		
		@FindBy(xpath="(//a[text()='pillow covers'])[1]")
		private WebElement click_pillow;
		
		@FindBy(xpath="(//img[@loading='eager']//parent::a)[2]")
		private WebElement select_pillow;
		
		@FindBy(xpath="/html/body/div[1]/main/div/div/div[2]/div[1]/div/div[2]/div[4]/div[2]/select")
		private WebElement change_quantity;
		
		@FindBy(xpath="//option[text()='4 ']")
		private WebElement change_quantity1;
		
		@FindBy(xpath="//div[@class='lLogo dIb vM']")
		private WebElement go_Home;

		
		
		
		public WebElement getGo_Home() {
			return go_Home;
		}

		public void setGo_Home(WebElement go_Home) {
			this.go_Home = go_Home;
		}

		public WebElement getChange_quantity() {
			return change_quantity;
		}

		public void setChange_quantity(WebElement change_quantity) {
			this.change_quantity = change_quantity;
		}

		public WebElement getChange_quantity1() {
			return change_quantity1;
		}

		public void setChange_quantity1(WebElement change_quantity1) {
			this.change_quantity1 = change_quantity1;
		}

		public WebElement getClick_Home() {
			return click_Home;
		}

		public void setClick_Home(WebElement click_Home) {
			this.click_Home = click_Home;
		}

		public WebElement getClick_pillow() {
			return click_pillow;
		}

		public void setClick_pillow(WebElement click_pillow) {
			this.click_pillow = click_pillow;
		}

		public WebElement getSelect_pillow() {
			return select_pillow;
		}

		public void setSelect_pillow(WebElement select_pillow) {
			this.select_pillow = select_pillow;
		}
		

}
