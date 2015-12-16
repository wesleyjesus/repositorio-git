package utils;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTesteSelenium {

	protected WebDriver driver;
	public static String baseUrl;
	protected static String usuario;
	protected static String senha;

	private Properties properties = new Properties();

	@Rule
	public TestRule rule = new SeleniumTestRule(properties);

	@Before
	public void setUp() throws Exception {
		configureBasicProperties();
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
//		UtilSeleniumTestes.logout(driver);
		driver.quit();
	}

	 private void configureBasicProperties() {
	 baseUrl = properties.getProperty("baseurl");
	 usuario = properties.getProperty("usuario");
	 senha = properties.getProperty("senha");
	 }

}
