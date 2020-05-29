package StepDefinations;

import MavenCucumber.MavenJavaRestAssured.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {
	
	@Before("@MobileTest")
	public void mobilevalidation() {
		System.out.println("before mobile validations");
	}
	@After("@MobileTest")
	public void aftervalidation() {
		System.out.println("after mobile validations");
	}
	@After("@SmokeTest")
	public void afterSmokeTest() {
		
		driver.close();
	}
	
	@After("@RegressionTest")
	public void afterRegressionTest() {
		
		driver.close();
	}
	

}
