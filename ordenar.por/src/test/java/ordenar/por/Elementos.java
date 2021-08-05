package ordenar.por;

import org.openqa.selenium.By;

public class Elementos {
	
	private By caixaTexto = By.id("searchHeader");
	private By ordenarPreco = By.xpath("//*[@id=\"__next\"]/main/div/div[2]/div/div/div/div[4]/div/label/select/option[2]");
	private By produto = By.xpath("//a[@href='https://www.drogasil.com.br/compressa-gaze-absorvente-nao-aderente-diversos-tamanhos-polar-fix-32534.html']");
	private By validacao = By.xpath("//h1[text()='Compressa Gaze Absorvente Não Aderente Polar Fix']");
	
	public By getCaixaTexto() {
		return caixaTexto;
	}
	public By getOrdenarPreco() {
		return ordenarPreco;
	}
	public By getProduto() {
		return produto;
	}
	public By getValidacao() {
		return validacao;
	}
	
	

}
