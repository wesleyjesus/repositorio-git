package utils;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/test-report",
							"json:target/test-report.json"},
				monochrome = true)
public class CukesRunner {

}
