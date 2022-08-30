package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.Loginpage;
import utils.TestContexSetup;

public class Loginsteps {
	public WebDriver driver;
	TestContexSetup testcontexsetup;
	public Loginpage loginpage;

	public Loginsteps(TestContexSetup testcontexsetup) {
		this.testcontexsetup=testcontexsetup;
		this.loginpage =testcontexsetup.pageObjectManager.login();
	}

	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		Thread.sleep(4000);
		Assert.assertTrue(loginpage.getTitle_pttlogin_Page().contains("PTT App"));
	}

@When("user enters valid username and password")
public void user_enters_valid_username_and_password( ) {
	testcontexsetup.pageObjectManager.login().Username_Pass("jijin", "Abc123456$");
}
	
	@When("click on signin button")
	public void click_on_signin_button() throws InterruptedException {
		
		testcontexsetup.pageObjectManager.login().click_signin();
	}
	@Then("User is navigated to Home page")
	public void user_is_navigated_to_home_page() {
		
		
		testcontexsetup.pageObjectManager.login().confirmhomepage();
	}

}
