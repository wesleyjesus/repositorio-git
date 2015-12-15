package utils;

import org.openqa.selenium.WebDriver;

import pages.LoginPage;

public class UtilSeleniumTestes {

	public static void login(WebDriver driver) {
		login(driver, BaseTesteSelenium.usuario, BaseTesteSelenium.senha, " COJUD/PRGO - COORDENADORIA JURÍDICA E DE DOCUMENTAÇÃO DA PR/GO ");
	}

	public static void login(WebDriver driver, String usuario, String senha, String visibleText) {
		new LoginPage(driver).visita(BaseTesteSelenium.baseUrl).autentica(usuario, senha);
		if (driver.getCurrentUrl().contains("j_spring_cas_security_check")) {
			driver.get(BaseTesteSelenium.baseUrl);
		}
	}

//	public static void logout(WebDriver driver) {
//		LogoutPage logout = new LogoutPage(driver);
//		logout.visita(BaseTesteSelenium.baseUrl);
//		logout.logout();
//	}

}
