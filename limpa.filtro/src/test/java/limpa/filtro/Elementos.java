package limpa.filtro;

import org.openqa.selenium.By;

public class Elementos {
	
	private By caixaTexto = By.id("searchHeader");
	private By precos = By.xpath("//a[text()='R$30 - R$50']");
	private By formaFarmaceutica = By.xpath("//a[text()='Ache']");
	private By limparFiltros = By.xpath("//a[text()='Limpar filtros']");
	private By validacao = By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div/div/div/div[1]/p");
	
	public By getCaixaTexto() {
		return caixaTexto;
	}
	public By getPrecos() {
		return precos;
	}
	public By getFormaFarmaceutica() {
		return formaFarmaceutica;
	}
	public By getLimparFiltros() {
		return limparFiltros;
	}
	public By getValidacao() {
		return validacao;
	}

}
