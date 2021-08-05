#Author: bruuuna.neri23@gmail.com
@tag
Feature: Validar mais buscados
	Eu como usuario quero entrar no site e verificar os itens mais buscados
  @tag1
  Scenario: Validar mais buscados
    Given que eu esteja nos itens mais visitados
    When eu selecionar um produto
    Then eu valido o produto
