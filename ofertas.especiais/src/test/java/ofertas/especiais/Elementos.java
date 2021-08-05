package ofertas.especiais;

import org.openqa.selenium.By;

public class Elementos {

	private By compreCategoria = By.xpath("//button[@class='sc-bqiQRQ dnJwcd']");
	private By promocoesMes = By.xpath("//a[@href='/promocoes-do-mes.html']");
	private By produto = By.xpath("//a[@href='https://m2-stage.drogasil.com.br/nivea-cellular-creme-noturno-52g.html']");
	private By validacao = By.xpath("//h1[text()='Creme Facial Antissinais Noite Nivea Cellular']");
	
	public By getCompreCategoria() {
		return compreCategoria;
	}
	public By getPromocoesMes() {
		return promocoesMes;
	}
	public By getProduto() {
		return produto;
	}
	public By getValidacao() {
		return validacao;
	}
	
}
