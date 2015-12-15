package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.BaseTesteSelenium;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage visita(String url) {
		driver.get(url);
		return this;
	}

	public LoginPage autentica(String email, String senha) {
		driver.findElement(By.name("username")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(senha);
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		return this;
	}

	public boolean sucesso() {
		if (driver.getCurrentUrl().contains("j_spring_cas_security_check")) {
			driver.get(BaseTesteSelenium.baseUrl);
		}
		WebElement menuUsuario = driver.findElement(By.xpath("//*[@id='menu_usuario']"));
		return menuUsuario != null;
	}

}
