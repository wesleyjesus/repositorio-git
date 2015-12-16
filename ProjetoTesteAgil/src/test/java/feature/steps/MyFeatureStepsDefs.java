package feature.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import utils.WebDriverFactory;

public class MyFeatureStepsDefs {
	
	WebDriverFactory navegador = new WebDriverFactory();
		
	@Dado("^Eu acesso o site walstore$")
	public void acessaSiteWalstore() throws Throwable{
		System.out.println("Abrir o navegador no site walstore!");
		navegador.criarWebDriver().navigate().to("http://www.walstore.com.br");
		
	}

	@Quando("^Eu clico no link Bebês$")
	public void clicaLinkBebes() throws Throwable{
		System.out.println("Clicar no link Bebês!");
		navegador.criarWebDriver().findElement((By) By.tagName("a").findElement((SearchContext) By.partialLinkText("bebes-"))).click();;	
	}

	@Então("^Eu vejo o título Bebês$")
	public void apareceTitulo() throws Throwable{
		System.out.println("Checar se o título Bebês aparece na página!");
		navegador.criarWebDriver().findElement(By.tagName("h2")).equals("Bebês");
	}
	
	@Quando("^Eu clico no link Cabelo$")
	public void clicaLinkCabelo() throws Throwable{
		System.out.println("Clicar no link Cabelo");
	}
	
}
