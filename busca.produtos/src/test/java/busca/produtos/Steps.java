package busca.produtos;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();
	
	@Given("que eu digite um produto na busca")
	public void que_eu_digite_um_produto_na_busca() throws InterruptedException {
		
		metodo.abrirNavegador("https://m2-stage.drogasil.com.br/", "CHROME");
		metodo.escrever(elemento.getCaixaTexto(), "dorflex");
		metodo.pausa();
	 
	}

	@When("eu der enter")
	public void eu_der_enter() throws InterruptedException {
	    
		metodo.submit(elemento.getCaixaTexto());
		metodo.clicar(elemento.getProduto());
		metodo.pausa();
		
	}

	@Then("eu valido o produto")
	public void eu_valido_o_produto() {
		
		metodo.validacao(elemento.getValidacao(), "Dorflex Uno Enxaqueca 1g com 20 comprimidos");
		metodo.fecharNavegador();
	   
	}

}
