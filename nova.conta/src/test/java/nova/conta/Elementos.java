package nova.conta;

import org.openqa.selenium.By;

public class Elementos {
	
	private By suaConta = By.xpath("//div[@class='sc-AjmZR qvXUp']");
	private By clienteNovo = By.xpath("//a[@href='/customer/account/create']");
	private By nomeCompleto = By.id("nomecompleto");
	private By cpf = By.id("cpf");
	private By telefone = By.id("telefone");
	private By data = By.id("dataDeNascimento");
	private By genero = By.xpath("//label[text()='Feminino']");
	private By email = By.id("email");
	private By senha = By.id("senha");
	private By confirmarSenha = By.id("confirmarSenha");
	private By aceitaTermos = By.xpath("//label[text()='Aceito uso dos meus dados']");
	private By cadastrar = By.xpath("//*[@id=\"__next\"]/main/div/form/div/div[3]/div[3]/div[3]/button");
	private By validacao = By.xpath("//h3[text()='Olá, José Maria das Dores!']");
	
	public By getSuaConta() {
		return suaConta;
	}
	public By getClienteNovo() {
		return clienteNovo;
	}
	public By getNomeCompleto() {
		return nomeCompleto;
	}
	public By getCpf() {
		return cpf;
	}
	public By getTelefone() {
		return telefone;
	}
	public By getData() {
		return data;
	}
	public By getGenero() {
		return genero;
	}
	public By getEmail() {
		return email;
	}
	public By getSenha() {
		return senha;
	}
	public By getConfirmarSenha() {
		return confirmarSenha;
	}
	public By getAceitaTermos() {
		return aceitaTermos;
	}
	public By getCadastrar() {
		return cadastrar;
	}
	public By getValidacao() {
		return validacao;
	}

}
