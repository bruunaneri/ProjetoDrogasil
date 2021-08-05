package ordenar.por;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();
	
	@Given("que eu busque por um produto valido")
	public void que_eu_busque_por_um_produto_valido() throws InterruptedException {
		
		metodo.abrirNavegador("https://m2-stage.drogasil.com.br/", "CHROME");
		metodo.pausa();
		metodo.escrever(elemento.getCaixaTexto(), "Absorvente");
		metodo.submit(elemento.getCaixaTexto());
		metodo.pausa();
	   
	}

	@When("eu clicar em Ordenar por preco")
	public void eu_clicar_em_ordenar_por_preco() throws InterruptedException {
		
		metodo.clicar(elemento.getOrdenarPreco());
		metodo.pausa();
		metodo.clicar(elemento.getProduto());
		metodo.pausa();
	   
	}

	@Then("eu valido as informacoes")
	public void eu_valido_as_informacoes() {
		
		metodo.validacao(elemento.getValidacao(), "Compressa Gaze Absorvente Não Aderente Polar Fix");
		metodo.fecharNavegador();
	    
	}

}
