package limpa.filtro;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	@Given("que eu pesquise um sintoma")
	public void que_eu_pesquise_um_sintoma() throws InterruptedException {
		
		metodo.abrirNavegador("https://m2-stage.drogasil.com.br/", "CHROME");
		metodo.pausa();
		metodo.escrever(elemento.getCaixaTexto(), "Gripe");
		metodo.submit(elemento.getCaixaTexto());
		metodo.pausa();
		
	}

	@Given("coloque filtros")
	public void coloque_filtros() throws InterruptedException {
		
		metodo.clicar(elemento.getPrecos());
		metodo.pausa();
		metodo.clicar(elemento.getFormaFarmaceutica());
		metodo.pausa();
		
	}

	@When("eu limpar os filtros")
	public void eu_limpar_os_filtros() throws InterruptedException {
		
		metodo.clicar(elemento.getLimparFiltros());
		metodo.pausa();

	}

	@Then("eu valido se o filtro foi limpo")
	public void eu_valido_se_o_filtro_foi_limpo() {
		
		metodo.validacao(elemento.getValidacao(), "167 PRODUTOS ENCONTRADOS");
		metodo.fecharNavegador();

	}

}
