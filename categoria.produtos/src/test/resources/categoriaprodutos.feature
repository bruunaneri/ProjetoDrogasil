#Author: bruuuna.neri23@gmail.com
@tag
Feature: Validar categoria de produtos
	Eu como usuario quero entrar no site e procurar um produto por categorias

  @tag1
  Scenario: Validar categoria de produtos
    Given que eu clique em Compre por categorias
    When eu clicar em uma categoria
    Then eu valido os produtos
