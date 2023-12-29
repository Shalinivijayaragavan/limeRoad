package com.step;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Pom.Log_In;
import com.Pom.homePillow;
import com.Pom.womenShirt;
import com.cucu.sample_Project.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

public class step_Definition extends Base {

	Log_In f = new Log_In();
	womenShirt s = new womenShirt();
	homePillow h = new homePillow();

	@When("user launch the url {string}")
	public void user_launch_the_url(String string) {

		launchUrl(string);

	}

	@When("user clicks on shop men")
	public void user_clicks_on_shop_men() throws InterruptedException {
		Thread.sleep(3000);
		f.getShopmen().click();
	}

	@When("User search the shirts in search box")
	public void user_search_the_shirts_in_search_box() {
		Explict(s.getClick_women());
		action(s.getClick_women());

	}

	@Then("Select one shirt")
	public void select_three_shirt() {

		Explict(s.getSelect_women());
		click_Method(s.getSelect_women());

	}

	@Then("change the size as large")
	public void change_the_size_as_large() {

		Explict(s.getS1_women());
		click_Method(s.getS1_women());
		Explict(s.getClick_large());
		click_Method(s.getClick_large());

	}

	@Then("Add to cart")
	public void add_to_cart() {

		Explict(s.getClick_cart());
		click_Method(s.getClick_cart());

	}

	@Then("Remove the item cart")
	public void remove_the_shirt_in_the_cart() {

		Explict(s.getRemove_Cart());
		click_Method(s.getRemove_Cart());
		Explict(s.continue1);
		click_Method(s.continue1);

	}

	@When("User clik on Homes")
	public void user_clik_on_homes() {

		Explict(h.getClick_Home());
		action(h.getClick_Home());

	}

	@Then("Select pillow covers")
	public void select_pillow_covers() {
		Explict(h.getClick_pillow());
		click_Method(h.getClick_pillow());
		Explict(h.getSelect_pillow());
		click_Method(h.getSelect_pillow());

	}

	@Then("Change the quantity")
	public void change_the_quantity() throws InterruptedException {

		try {
			Explict(h.getChange_quantity());
			click_Method(h.getChange_quantity());
			Explict(h.getChange_quantity1());
			click_Method(h.getChange_quantity1());
		} catch (Exception e) {

			e.wait();

		}

		finally {
			Thread.sleep(2000);
			System.out.println("Quantity selected");
		}

	}

	@Then("Go to home page")
	public void Go_to_home_page() {

		Explict(h.getGo_Home());
		click_Method(h.getGo_Home());

	}

}
