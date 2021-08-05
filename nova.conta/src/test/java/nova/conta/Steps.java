package nova.conta;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();
	

@Given("eu clique em Novo Cliente? Cadastre-se")
public void eu_clique_em_novo_cliente_cadastre_se() throws InterruptedException {
	
	metodo.abrirNavegador("https://m2-stage.drogasil.com.br/", "CHROME");
	metodo.pausa();
	metodo.clicar(elemento.getSuaConta());
	metodo.clicar(elemento.getClienteNovo());
	metodo.pausa();
    
}

@When("eu preencher os dados validos")
public void eu_preencher_os_dados_validos() {
	
	metodo.escrever(elemento.getNomeCompleto(), "José Maria das Dores");
	metodo.escrever(elemento.getCpf(), "92058900065");
	metodo.escrever(elemento.getTelefone(), "11945871236");
	metodo.escrever(elemento.getData(), "14/08/1955");
	metodo.clicar(elemento.getGenero());
	metodo.escrever(elemento.getEmail(), "jose.dores@teste.com");
	metodo.escrever(elemento.getSenha(), "jose12345");
	metodo.escrever(elemento.getConfirmarSenha(), "jose12345");
	metodo.clicar(elemento.getAceitaTermos());
	metodo.clicar(elemento.getCadastrar());
    
}

@Then("conta é criada com sucesso")
public void conta_é_criada_com_sucesso() {
	
	metodo.validacao(elemento.getValidacao(), "Olá, José Maria das Dores!");
	metodo.fecharNavegador();
    
}

}
