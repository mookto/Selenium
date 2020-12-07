package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
 

public class login_page {


	By username_field= By.xpath( "//input[@id='login-email']");


	By user_password = By.xpath( "//input[@id='login-pass']");


	By login_button = By.xpath("//div[@id='console-951510359']/div/div[2]/div/div/div/div/div/div/div/div[9]/div/div/div");

	WebDriver driver =null;

	public login_page( WebDriver driver) {
		this.driver=driver;



	}
	
	 

	public void enterusername(String username) {


		driver.findElement(username_field).sendKeys( username);
	}


	public void enteruserpassword( String password) {


		driver.findElement(user_password) .sendKeys(password);
	}
	public void clickloginbutton () {
		driver.findElement(login_button).click();
	} 

	public void launchbrowser () {
		String projectpath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath +"/src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}
	public void useronloginpage() throws InterruptedException {

		driver.navigate().to(" https://menugreat.com/console/");
		Thread.sleep(10000);
	}
	public void CheckUserinfoButton() throws InterruptedException {
		Thread.sleep(10000);
		//driver.findElement(userinfoButton).click();
		//if(driver.getCurrentUrl().equals("https://menugreat.com/console/#!Dashboard")) {
			System.out.println(driver.getCurrentUrl() );
		};
}
