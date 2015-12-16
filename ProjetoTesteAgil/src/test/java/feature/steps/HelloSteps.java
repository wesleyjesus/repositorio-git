package feature.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import interactions.Hello;
import junit.framework.Assert;

public class HelloSteps {
	
	private Hello hello;
	private String hi;
	
	@Dado("^Minha saudaca \"([^\"]*)\"$")
	public void minha_saudacao_com(String greenting){
		hello = new Hello(greenting);
	}
	
	@Quando("^Eu executo minha aplicação$")
	public void eu_digo_hi(){
		hi = hello.sayHi();
	}
	
	@Então("^Ela deveria responder com \"([^\"]*)\"$")
	public void ela_ferecia_responder_com(String expectedHi){
		Assert.assertEquals(expectedHi, hi);
	}
	
	
}
