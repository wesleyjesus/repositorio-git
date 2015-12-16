package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
	public final WebDriver criarWebDriver() {
			return new FirefoxDriver();
	}
	
}
