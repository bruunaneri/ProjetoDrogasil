package busca.produtos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By caixaTexto = By.id("searchHeader");
	private By produto = By.xpath("//div[@class='sc-iqVVwt jzqRgN false null']");
	private By validacao = By.xpath("//h1[text()='Dorflex Uno Enxaqueca 1g com 20 comprimidos']");

	public By getCaixaTexto() {
		return caixaTexto;
	}

	public By getProduto() {
		return produto;
	}
	
	public By getValidacao() {
		return validacao;
	}

	
	
	
	

}
