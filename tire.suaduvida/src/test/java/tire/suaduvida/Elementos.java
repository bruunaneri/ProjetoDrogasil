package tire.suaduvida;

import org.openqa.selenium.By;

public class Elementos {
	
	private By suaConta = By.xpath("//div[@class='sc-AjmZR qvXUp']");
	private By facaLogin = By.xpath("//*[@id=\"fixed-container-styles\"]/header/div/div[1]/div[2]/button");
	private By emailCpf = By.id("emailCpf");
	private By senha = By.id("password");
	private By botaoLogin = By.xpath("//button[@class='sc-bqiQRQ efGKhS Button']");
	private By centralAtendimento = By.xpath("//a[text()='Central de Atendimento']");
	private By digitePergunta = By.xpath("//input[text()='Digite sua pergunta']");
	private By validacao = By.xpath("/html/body/div[1]/div[2]/div/div[2]/ul/li/a/span[2]");
	
	public By getSuaConta() {
		return suaConta;
	}
	public By getFacaLogin() {
		return facaLogin;
	}
	public By getEmailCpf() {
		return emailCpf;
	}
	public By getSenha() {
		return senha;
	}
	public By getBotaoLogin() {
		return botaoLogin;
	}
	public By getCentralAtendimento() {
		return centralAtendimento;
	}
	public By getDigitePergunta() {
		return digitePergunta;
	}
	public By getValidacao() {
		return validacao;
	}

}
