package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "./src/test/resources/features/LoginPage/" }, plugin = { "pretty",
		"json:target/cucumber.json", "html:target/feature-html-reports", "junit:target/cucumber.xml",
		"rerun:target/rerun.txt" }, glue = "com.tollplus.ntta.steps", 
		monochrome = true, dryRun = false, 
		tags = {"@Test" }, strict = true)

public class TestRunner extends AbstractTestNGCucumberTests{

}
