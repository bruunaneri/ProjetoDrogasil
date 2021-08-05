package mais.buscados;

import org.openqa.selenium.By;

public class Elementos {
	
	private By produto = By.xpath("//a[@href='https://www.drogasil.com.br/skinceuticals-blemish-age-solution-125ml.html']");
	private By validacao = By.xpath("//h1[text()='Skinceuticals Tônico Facial Blemish + Age Solution com 125ml']");
	
	public By getProduto() {
		return produto;
	}
	public By getValidacao() {
		return validacao;
	}
	

}
