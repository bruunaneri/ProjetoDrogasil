package itens.pagina;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
Metodos metodo = new Metodos();
Elementos elemento = new Elementos();

@Given("que eu busque um produto valido")
public void que_eu_busque_um_produto_valido() throws InterruptedException {
	
	metodo.abrirNavegador("https://m2-stage.drogasil.com.br/", "CHROME");
	metodo.pausa();
	metodo.escrever(elemento.getCaixaTexto(), "Cimegripe");
	metodo.submit(elemento.getCaixaTexto());
	metodo.pausa();
	 
}

@Given("clique em itens por pagina")
public void clique_em_itens_por_pagina() {
	
	metodo.clicar(elemento.getItensPagina());
    
}

@When("eu colocar um novo numero")
public void eu_colocar_um_novo_numero() {
	
	metodo.validacao(elemento.getValidacao(), "36");
    
}

@Then("eu valido as informacoes")
public void eu_valido_as_informacoes() {
	
	metodo.fecharNavegador();
    
}

}
