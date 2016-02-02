package feature.steps.def;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class PesquisaGoogleSteps {
	private final WebDriver driver = new FirefoxDriver();
	
	
	@Dado("^Eu estou na página de pesquisa do google$")
	public void eu_entro_no_google(){
		driver.get("https://www.google.com.br/");
	}
	
	@Quando("^Eu procurar por \"([^\"]*)\"$")
	public void procuro_por(String query){
		WebElement element = driver.findElement(By.name("q"));
		
		element.sendKeys(query);
		element.submit();
	}
	
	@Então("^O título da página deve começar com \"([^\"]*)\"$")
	public void checkTitle(){
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d){
				return d.getTitle().toLowerCase().startsWith("walstore");
			}
		});
		Assert.assertEquals(driver.getTitle(), "walstore");
	}
	
	@After()
	public void closeBrowser(){
		driver.quit();
	}
	
}
