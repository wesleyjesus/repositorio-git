package utils;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-html-report"},
//		features = {"src/test/java/feature/"},
				features = {"Feature"},
		glue = {"src/test/java/feature.steps"}
		)
public class CucumberRunner {
			
}
