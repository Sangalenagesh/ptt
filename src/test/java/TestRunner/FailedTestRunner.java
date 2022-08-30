package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class FailedTestRunner {

	

@CucumberOptions(features="@target/failed_scenario.txt",glue= "StepDefinitions",
monochrome=true,
plugin= {"pretty","junit:target/JUnitReports/report.xml",
   "json:target/JSONReports/reports.json",
    "html:target/HtmlReport/HtmlReports.html",
   	
}
	
		)
public class TestNgTestRunner extends AbstractTestNGCucumberTests{

}}
