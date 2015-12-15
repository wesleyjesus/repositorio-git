package utils;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    tags = {"@run"}, 
    plugin = {"html:target/cucumber-html-report", "json-pretty:target/cucumber-json-report.json"}
)
public class CukesRunner {

}
