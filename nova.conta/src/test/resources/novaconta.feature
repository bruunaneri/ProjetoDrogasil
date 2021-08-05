#Author: bruuuna.neri23@gmail.com
@tag
Feature: Validar nova conta
		Eu como usuario quero entrar no site e criar uma nova conta

  @tag1
  Scenario: Validar nova conta
    Given eu clique em Novo Cliente? Cadastre-se
    When eu preencher os dados validos
    Then conta é criada com sucesso 
