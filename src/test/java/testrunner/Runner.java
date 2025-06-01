package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features= {"src/test/java/Features/login.feature"},
		dryRun = !true,
		glue="stepDefinition", 
		snippets = SnippetType.CAMELCASE,
		monochrome = true
		)
public class Runner extends AbstractTestNGCucumberTests{
	
}
