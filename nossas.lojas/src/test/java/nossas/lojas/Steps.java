package nossas.lojas;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();
	
	@Given("que eu clique em Nossas Lojas")
	public void que_eu_clique_em_nossas_lojas() throws InterruptedException {
		
		metodo.abrirNavegador("https://m2-stage.drogasil.com.br/", "CHROME");
		metodo.pausa();
			    
	}

	@When("eu preencher o campo")
	public void eu_preencher_o_campo() throws InterruptedException {
		
		metodo.clicar(elemento.getNossasLojas());
		metodo.escrever(elemento.getCaixaTexto(), "Itapevi");
		metodo.submit(elemento.getCaixaTexto());
		metodo.pausa();
	    
	}

	@Then("eu encontro uma loja")
	public void eu_encontro_uma_loja() {
		
		metodo.validacao(elemento.getValidacao(), "itapevi");
		metodo.fecharNavegador();
	    
	}

}
