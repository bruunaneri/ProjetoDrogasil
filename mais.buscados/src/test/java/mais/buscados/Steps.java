package mais.buscados;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();


@Given("que eu esteja nos itens mais visitados")
public void que_eu_esteja_nos_itens_mais_visitados() throws InterruptedException {
	
	metodo.abrirNavegador("https://m2-stage.drogasil.com.br/", "CHROME");
    metodo.pausa();
}

@When("eu selecionar um produto")
public void eu_selecionar_um_produto() throws InterruptedException {
	
	metodo.clicar(elemento.getProduto());
	metodo.pausa();
   
}

@Then("eu valido o produto")
public void eu_valido_o_produto() {
	
	metodo.validacao(elemento.getValidacao(), "Skinceuticals Tônico Facial Blemish + Age Solution com 125ml");
	metodo.fecharNavegador();
    
}

}
