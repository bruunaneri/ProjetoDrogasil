#Author: bruuuna.neri23@gmail.com
@tag
Feature: Validar busca de produtos
		Eu como usuario quero entrar no site e procurar por um produto

  @tag1
  Scenario: Validar busca de produtos
    Given que eu digite um produto na busca
    When eu der enter
    Then eu valido o produto
