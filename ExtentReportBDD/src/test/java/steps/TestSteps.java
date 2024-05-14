package steps;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.plugin.event.HookTestStep;
import io.cucumber.plugin.event.PickleStepTestStep;
import io.cucumber.plugin.event.TestSourceRead;
import pages.Ecommerce;

public class TestSteps {
	static WebDriver driver;
	static Ecommerce ec = new Ecommerce(driver);
	
	
//	@Given("I want to write a step with precondition")
//	public void I_want_to_write_a_step_with_precondition() {
//	    System.out.println("Hello");
//	}
//	
//	@And("some other precondition")
//	public void some_other_precondition() {
//	    System.out.println("Hi");
//	    //Getting current step name
//	    
//	    ExtentTest k = ExtentCucumberAdapter.getCurrentStep();
//       String j =  k.getModel().getName();
//       System.out.println("JJJJJJJJJJJJJJ "+j);
//
//	}
	
	@Given("user is opening the web browser")
	public void user_is_opening_the_web_browser() {
	    ec.openBrowser();
	}
	
	@Given("Navigate to the URL of {string}")
	public void navigate_to_the_url_of(String string) {
		ec.navigateToUrl(string);
	}
	
	@Then("Verify that the homepage of Amazon.in is displayed correctly.")
	public void verify_that_the_homepage_of_amazon_in_is_displayed_correctly() {
	    ec.verifyHomePage();
	}
	
	@When("user Click on the {string} button\\/link.")
	public void user_click_on_the_button_link(String string) {
	    ec.clickSigInButtonLandingPage();
	}
	
	@Then("user Enter valid login credentials")
	public void user_enter_valid_login_credentials() {
	    ec.enterCredentials();
	}
	
	@When("user Click on the {string} button.")
	public void user_click_on_the_button(String string) {
	    //real creadentials are not used
	}
	
	@When("Verify that the user is successfully logged in and redirected to the homepage.")
	public void verify_that_the_user_is_successfully_logged_in_and_redirected_to_the_homepage() {
	    ec.verifyLoginSuccess();
	}
	
	@Then("In the search bar, search {string}")
	public void in_the_search_bar_search(String string) {
	    ec.searchProduct(string);
	}
	
	@Then("verify the product text and price")
	public void verify_the_product_text_and_price() {
	    ec.verifyProduct();
	}


}
