package Stepdefinations;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 
import PageFactory.login_page;
import io.cucumber.java.en.*;

public class Test {
	
	WebDriver driver=null;
	login_page login =new login_page(driver);

	
	@Given("browser is open")
	public void  browser_is_open() {
		
		login.launchbrowser( );
	}

	@When("user is on the login page")
	public void user_is_on_the_login_page() throws InterruptedException {
		 
		login.useronloginpage();
		 
	  }
	

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password( String username,String password) {
		
		  login.enterusername(username); 
		  login.enteruserpassword(password);
		 
		
	}

	 

	@And("user clicks login button")
	public void user_clicks_login_button() throws InterruptedException {
	    login.clickloginbutton();
	}

	@And("user navigate to dashboard")
	public void user_navigate_to_dashboard( ) throws InterruptedException  {	
		  
		  login.CheckUserinfoButton();
	}
	
	@And("user click userinfo button")
	public void  user_click_userinfo_button( ) throws InterruptedException  {	
		  
		   login.clickCheckUserinfoButton();
	}
	@And("user click logout button")
	public void user_click_logout_button( ) throws InterruptedException  {	
		  
		   login.clickLogoutButton();
	}
	@Then("user navigate to homepage")
	public void user_navigate_to_homepage( ) throws InterruptedException  {	
		  
		   login.CheckHomepageUrl();
	}
	

}
	


 
 