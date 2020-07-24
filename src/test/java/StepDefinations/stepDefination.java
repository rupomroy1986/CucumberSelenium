package StepDefinations;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import MavenCucumber.MavenJavaRestAssured.Base;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import pageObjects.CheckOutPage;

public class stepDefination extends Base  {
	CheckOutPage cp;
	
	@Given("^User is on the landing page$")
    public void user_is_on_the_landing_page() throws Throwable {	
 System.out.println("login page opened");
    }

	@Given("^validated the browser$")
    public void validated_the_browser() throws Throwable {
		System.out.println("validated homew page");
		
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("browser is triggered");
        
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	System.out.println("browsser is started");
        
    }
    
    
	//here ware putting the Then verify selected <Name> items are displayed in Check out page to another step definition file and inheriting it
    @Then("^verify selected (.+) items are displayed in Check out page$")
    public void verify_selected_items_are_displayed_in_check_out_page(String name) throws Throwable {
  	  cp=new CheckOutPage(driver);
  	  	Assert.assertTrue(cp.getProductName().getText().contains(name));
    }
    
    
	
	
	@When("^User login into the application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_the_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
       System.out.println(strArg1);
       System.out.println(strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("home page is populated");
    }

    @And("^cards are displayed are \"([^\"]*)\"$")
    public void cards_are_displayed_are_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
    	//data table
    	          List<List<String>>  obj      = data.raw();
    	          //in the latest version it is data.asList();it is a java colection API
    	          for(int i=0;i<1;i++)
    	          {
    	        	  for(int j=0;j<5;j++)
    	        	  {
    	        		  if(i==j || i<j)
    	        		  {
    	        			  System.out.println(obj.get(i).get(j));
    	        		  }
    	        	  }
    	          }
    	          
    	        	/*System.out.println(obj.get(0).get(0));
    	        	System.out.println(obj.get(0).get(1));
         	         System.out.println(obj.get(0).get(2));
         	         System.out.println(obj.get(0).get(3));
         	         System.out.println(obj.get(0).get(4));*/
         	         }
    	                    
   
            
        
    }



