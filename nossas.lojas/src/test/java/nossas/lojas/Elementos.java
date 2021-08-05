package nossas.lojas;

import org.openqa.selenium.By;

public class Elementos {
	
	private By nossasLojas = By.xpath("//*[@id=\"fixed-container-styles\"]/header/div/a/div/div/p");
	private By caixaTexto = By.id("busc");
	private By validacao = By.xpath("//p[text()='ITAPEVI']");
	
	public By getNossasLojas() {
		return nossasLojas;
	}
	public By getCaixaTexto() {
		return caixaTexto;
	}
	public By getValidacao() {
		return validacao;
	}
}
