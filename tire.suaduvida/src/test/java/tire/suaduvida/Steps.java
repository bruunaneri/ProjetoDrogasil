package tire.suaduvida;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();
	
	@Given("que eu faca o login")
	public void que_eu_faca_o_login() throws InterruptedException {
		
		metodo.abrirNavegador("https://m2-stage.drogasil.com.br/", "CHROME");
		metodo.pausa();
		metodo.clicar(elemento.getSuaConta());
		metodo.clicar(elemento.getFacaLogin());
		metodo.pausa();
		metodo.escrever(elemento.getEmailCpf(), "jose.dores@teste.com");
		metodo.escrever(elemento.getSenha(), "jose12345");
		metodo.clicar(elemento.getBotaoLogin());
		metodo.pausa();
	    
	}

	@When("eu entrar em Central de Atendimento")
	public void eu_entrar_em_central_de_atendimento() throws InterruptedException {
		
		metodo.clicar(elemento.getCentralAtendimento());
		metodo.pausa();
	   
	}

	@When("pesquisar sobre cancelamento")
	public void pesquisar_sobre_cancelamento() {
		
		metodo.escrever(elemento.getDigitePergunta(), "cancelamento");
		metodo.submit(elemento.getDigitePergunta());
	    
	}

	@Then("eu valido a mensagem Como cancelar o produto?")
	public void eu_valido_a_mensagem_como_cancelar_o_produto() {
		
		metodo.validacao(elemento.getValidacao(), "Como cancelar um pedido");
		metodo.fecharNavegador();
	   
	}

}
