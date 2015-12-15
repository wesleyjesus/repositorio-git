package utils;

import java.util.Properties;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class SeleniumTestRule implements TestRule {

	private Properties properties;

	public SeleniumTestRule(Properties properties) {
		this.properties = properties;
	}

	@Override
	public Statement apply(final Statement base, Description description) {
		return new Statement() {

			@Override
			public void evaluate() throws Throwable {
				if (System.getProperty("jenkins") != null) {
					properties.load(this.getClass().getClassLoader().getResourceAsStream("selenium-tests.properties"));
				} else {
					properties.load(this.getClass().getClassLoader().getResourceAsStream("selenium-tests-local.properties"));
				}
				base.evaluate();
			}
		};
	}

}
