package categoria.produtos;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();
	
	@Given("que eu clique em Compre por categorias")
	public void que_eu_clique_em_compre_por_categorias() throws InterruptedException {
		
		metodo.abrirNavegador("https://m2-stage.drogasil.com.br/", "CHROME");
		metodo.pausa();
		
	}

	@When("eu clicar em uma categoria")
	public void eu_clicar_em_uma_categoria() throws InterruptedException {
	   
		metodo.clicar(elemento.getCompreCategoria());
		metodo.clicar(elemento.getBeleza());
		metodo.pausa();
		metodo.clicar(elemento.getProduto());
		metodo.pausa();
		
	}

	@Then("eu valido os produtos")
	public void eu_valido_os_produtos() {
		
		metodo.validacao(elemento.getValidacao(), "Pó Hemostático Needs");
		metodo.fecharNavegador();
	    
	}

}
