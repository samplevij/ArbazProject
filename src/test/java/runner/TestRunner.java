package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
		( 
		tags="smoke",
		features = {"src/test/resources/features/"},
		glue = {"stepDefinitions"},
		plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty.html",
                "json:target/cucumber-reports/CucumberTestReport.json"}
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
