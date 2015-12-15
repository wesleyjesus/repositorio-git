package pages;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import utils.BaseTesteSelenium;


public class LoginTesteSelenium extends BaseTesteSelenium {

	@Test
	public void deveAutenticarComSucesso() {
		LoginPage login = new LoginPage(driver);
		login.visita(baseUrl);
		login.autentica(usuario, senha);
		assertTrue(login.sucesso());
	}

}
