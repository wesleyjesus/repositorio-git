package feature.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	
	WebDriver driver;
	
	@Given("^Usuário está na página inicial$")
	public void acessarPaginaInicial() throws Throwable{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
	}

	@When("^Eu navegar até a página de login$")
	public void acessaPaginaInicial() throws Throwable{
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}
	
	@When("^Eu entrar com meu usuário e senha$")
	public void preencheUsuarioSenha() throws Throwable{
		driver.findElement(By.id("log")).sendKeys("testCucumber1"); 	 
	    driver.findElement(By.id("pwd")).sendKeys("TestCucumber27");
	    driver.findElement(By.id("login")).click();
	}
	
	@Then("^Exibe a mensagem na tela Login Successfully$")
	public void exibeMensagemSucesso() throws Throwable{
		System.out.println("Login Successfully");
	}
	
	@When("^Eu clicar em sair$")
	public void clicaSairSistema() throws Throwable{
		driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
	}
	
	@Then("^Exibe a mensagem LogOut Successfully$")
	public void exibeMensagemLogout() throws Throwable{
		System.out.println("LogOut Successfully");
	}
	
}
