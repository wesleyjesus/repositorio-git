package utils;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-html-report"},
<<<<<<< HEAD
//		features = {"src/test/java/feature/"},
				features = {"Feature"},
		glue = {"src/test/java/feature.steps"}
=======
		features = {"src/test/java/feature/"}
>>>>>>> branch 'master' of https://github.com/wesleyjesus/repositorio-git.git
		)
public class CucumberRunner {
			
}
