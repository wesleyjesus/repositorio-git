package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// Cria uma nova instância do drivre Firefox
 
        driver = new FirefoxDriver();
 
        //Coloque uma espera implícita, isto significa que qualquer busca de elementos na página poderia ter o tempo a espera implícita está marcada para antes de lançar exceção
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Abrir o site Online Store
 
        driver.get("http://www.store.demoqa.com");
 
        // Pesquisar o elemento pelo atributo id 'account'(My Account) 
 
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
 
        // Pesquisar o elemento pelo atributo id 'log' (Username)
        // Preencher o campo com o usuário descrito abaixo
 
        driver.findElement(By.id("log")).sendKeys("testCucumber1"); 
 
        // Pesquisar o elemento pelo atributo id 'pwd' (Password)
         // Preencher o campo com a senha descrita abaixo.
 
        driver.findElement(By.id("pwd")).sendKeys("TestCucumber27");
 
        // Enviar o formulário. WebDriver encontrará o formulário para nós, a partir do id do elemento
 
        driver.findElement(By.id("login")).click();
 
        // Print a Log In message to the screen
 
        System.out.println("Login Successfully");
 
        // Pesquisar o elemento pelo atributo id 'account_logout' (Log Out)
 
        driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
 
        // Print a Log In message to the screen
 
        System.out.println("LogOut Successfully");
 
        // Fechar o driver
 
        driver.quit();
 
	}
 
}