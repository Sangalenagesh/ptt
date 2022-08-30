package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.TestContexSetup;

public class Hooks {

	TestContexSetup testcontexsetup;
	public Hooks(TestContexSetup testcontexsetup) {

		this.testcontexsetup=testcontexsetup;
	}
	@Before
   public void beforevalidation() {
	
}

	@After
	public void afterscenario() throws IOException {

		testcontexsetup.testbase.WebDriverManager().quit();

	}
	@AfterStep
	public void AddScreenShot(Scenario scenario) throws IOException {

		if(scenario.isFailed()) {
			WebDriver driver=	testcontexsetup.testbase.WebDriverManager();
			
			File sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         byte [] filecontent= FileUtils.readFileToByteArray(sourcepath);
          scenario.attach(filecontent, "image/png", "png");
          
          
          
		}
	}
}
