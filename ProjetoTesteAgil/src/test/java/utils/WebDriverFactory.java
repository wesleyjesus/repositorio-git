package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
	public static WebDriver criarWebDriver() {
		String webdriver = System.getProperty("browser", "firefox");
		
		switch(webdriver){
			case "firefox":	
				return new FirefoxDriver();
			case "chrome":
				return new ChromeDriver();
			default:
				throw new RuntimeException("Webdriver não suportado:" + webdriver);
			
		}
		
	}
}
