package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.TestContexSetup;

public class Clientspage {

	public WebDriver driver;
	public TestContexSetup testcontexsetup;
		public Clientspage(WebDriver driver) {
		
			this.driver=driver;
		}
		
		
		By add_clients=By.xpath("//div[contains(text(),'Add Client')]");
		By friendly_Name= By.xpath("//input[@id='friendlyName']");
		By FirstName= By.xpath("//input[@id='fullName']");
		By  ClientId=By.xpath("//input[@id='clientId']");

		public void Add_clients(String username) {
			testcontexsetup.driver.findElement(By.xpath("add_clients")).click();			
			
		}
		
	
}
