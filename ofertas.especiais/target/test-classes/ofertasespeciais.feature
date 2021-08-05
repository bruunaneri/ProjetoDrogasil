#Author: bruuuna.neri23@gmail.com
@tag
Feature: Validar ofertas especiais
	Eu como usuario quero entrar no site e clicar em ofertas especiais para ver os produtos disponiveis

  @tag1
  Scenario: Validar ofertas especiais
    Given que eu clique em ofertas imperdiveis
    When eu selecionar um produto
    Then eu valido as informacoes