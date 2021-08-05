package itens.pagina;

import org.openqa.selenium.By;

public class Elementos {
	
	private By caixaTexto = By.id("searchHeader");
	private By itensPagina = By.xpath("//option[text()='36']");
	private By validacao = By.xpath("//option[text()='36']");
	
	public By getCaixaTexto() {
		return caixaTexto;
	}
	public By getItensPagina() {
		return itensPagina;
	}
	public By getValidacao() {
		return validacao;
	}
	
	

}
