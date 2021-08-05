package tenho.cadastro;

import org.openqa.selenium.By;

public class Elementos {
	
	private By suaConta = By.xpath("//div[@class='sc-AjmZR qvXUp']");
	private By facaLogin = By.xpath("//button[text()='faça seu login']");
	private By emailCpf = By.id("emailCpf");
	private By senha = By.id("password");
	private By botaoLogin = By.xpath("//*[@id=\"__next\"]/main/div/div/div[2]/div[1]/div[1]/form/button");
	private By validacao = By.xpath("//h3[text()='Olá, José Maria das Dores!']");
	
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
	public By getValidacao() {
		return validacao;
	}

}
