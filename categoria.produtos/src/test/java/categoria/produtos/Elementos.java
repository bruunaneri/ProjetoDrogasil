package categoria.produtos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By compreCategoria = By.xpath("//button[@class='sc-bqiQRQ dnJwcd']");
	private By beleza = By.xpath("//a[@href='/beleza.html']");
	private By produto = By.xpath("//a[@href='https://m2-stage.drogasil.com.br/needs-po-hemostatico-20g.html']");
	private By validacao = By.xpath("//h1[text()='Pó Hemostático Needs']");
	
	public By getCompreCategoria() {
		return compreCategoria;
	}
	public By getBeleza() {
		return beleza;
	}
	public By getProduto() {
		return produto;
	}
	public By getValidacao() {
		return validacao;
	}

}
