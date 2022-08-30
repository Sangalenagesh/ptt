package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager{
	public Loginpage login;
	public WebDriver driver;
	public Clientspage clientpage;
	
	
	public PageObjectManager( WebDriver driver) {
		
		this.driver=driver;
	}



	public Loginpage login() {
		
		login=new Loginpage(driver);
		return login;
	}
	
	public Clientspage client() {
		clientpage=new Clientspage(driver);
		return clientpage;
	}
}
