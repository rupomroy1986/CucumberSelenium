package StepDefinations;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import pageObjects.CheckOutPage;
import pageObjects.HomePage;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import MavenCucumber.MavenJavaRestAssured.Base;

public class MyStepDefinitions {
	public WebDriver driver;
	HomePage h;
	CheckOutPage cp;

	@Given("^User is on Greencart Landing page$")
	public void user_is_on_greencart_landing_page() throws Throwable {
		driver = Base.getDriver();

	}
	
	
	//if we use regular expression(.+) it can be used for both examples and without double quotes
    @When("^User searched for (.+) Vegetable$")
    public void user_searched_for_vegetable(String name) throws Throwable {
    	Thread.sleep(5000);
		h = new HomePage(driver);
        h.getSearch().sendKeys(name);
        
    }

	
	
	@Then("^\"([^\"]*)\" results are displayed$")
	public void something_results_are_displayed(String strArg1) throws Throwable {
	System.out.println(h.getProductName().getText());
	Assert.assertTrue(h.getProductName().getText().contains(strArg1));
	
		      
	}

	@And("^Added items to cart$")
	public void added_items_to_cart() throws Throwable {
		h.increment().click();
		h.addToCart().click();
		
	}

	@And("^User proceeded to Checkout page for purchase$")
	public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		  driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		  

	}

}