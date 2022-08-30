package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestContexSetup;



public class Loginpage {
	public WebDriver driver;
	//public TestContexSetup testcontexsetup;
	
	public Loginpage(WebDriver driver) {

		this.driver=driver;
	}


	By username=By.xpath("//input[@id='username']");
	By pass=By.xpath("//input[@id='password']");
	By signin_btn=By.xpath("//*[@type='submit']");
	By navigation=By.xpath("//div[contains(text(),'Add Client')]");

	
	public void Username_Pass(String Username ,String password) {
		driver.findElement(username).sendKeys(Username);

		driver.findElement(pass).sendKeys(password);
	}

	public void click_signin() throws InterruptedException {

		driver.findElement(signin_btn).click();
		Thread.sleep(5000);
	}
	
	public void confirmhomepage()  {
		
		driver.findElement(navigation).isDisplayed();	

	}
	public String getTitle_pttlogin_Page()
	{
		return driver.getTitle();
		//return null;
	}
	
}
