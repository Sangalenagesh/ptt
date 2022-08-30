package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/test/java/features/Login.feature",glue= "stepDefinitions",
monochrome=true,
plugin= {"pretty","junit:target/JUnitReports/report.xml",
   "json:target/JSONReports/reports.json",
    "html:target/HtmlReport/HtmlReports.html",
   	"rerun:target/failed_scanarios.txt"
}
	
		)
public class TestNgTestRunner extends AbstractTestNGCucumberTests{

}
