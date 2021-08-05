package tenho.cadastro;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();
	

@Given("que eu clique em Faça seu login")
public void que_eu_clique_em_faça_seu_login() throws InterruptedException {
	
	metodo.abrirNavegador("https://m2-stage.drogasil.com.br/", "CHROME");
	metodo.pausa();
	metodo.clicar(elemento.getSuaConta());
	metodo.clicar(elemento.getFacaLogin());
	metodo.pausa();
   
}

@When("eu preencher os campos obrigatorios")
public void eu_preencher_os_campos_obrigatorios() throws InterruptedException {
	
	metodo.escrever(elemento.getEmailCpf(), "jose.dores@teste.com");
	//metodo.escrever(elemento.getEmailCpf(), "920.589.000-65");
	metodo.escrever(elemento.getSenha(), "jose12345");
    metodo.clicar(elemento.getBotaoLogin());
    metodo.pausa();
}

@Then("entro no site com meu cadastro")
public void entro_no_site_com_meu_cadastro() {
	
	metodo.validacao(elemento.getValidacao(), "Olá, José Maria das Dores!");
	metodo.fecharNavegador();
    
}

}
