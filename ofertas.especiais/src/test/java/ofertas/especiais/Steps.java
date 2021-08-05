package ofertas.especiais;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();
	
	@Given("que eu clique em ofertas imperdiveis")
	public void que_eu_clique_em_ofertas_imperdiveis() throws InterruptedException {
		
		metodo.abrirNavegador("https://m2-stage.drogasil.com.br/", "CHROME");
		metodo.pausa();
		metodo.clicar(elemento.getCompreCategoria());
		metodo.clicar(elemento.getPromocoesMes());
		metodo.pausa();
	    
	}

	@When("eu selecionar um produto")
	public void eu_selecionar_um_produto() {
		
		metodo.clicar(elemento.getProduto());
	    
	}

	@Then("eu valido as informacoes")
	public void eu_valido_as_informacoes() {
	    
		metodo.validacao(elemento.getValidacao(), "Creme Facial Antissinais Noite Nivea Cellular");
		metodo.fecharNavegador();
	}

}
