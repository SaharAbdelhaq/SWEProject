package najah.edu;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "uses_cases",
	//plugin = {"html:target/cucumber/wikipedia.html"},
	monochrome=true,
	snippets = SnippetType.CAMELCASE,
	glue= {"najah.edu"}, plugin= {"html: target/cucumber.html"}) 
	//dryRun = true)

//dryRun == ? strict


public class Acceptance {
	
  }
  