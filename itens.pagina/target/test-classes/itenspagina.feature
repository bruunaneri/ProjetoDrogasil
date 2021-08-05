#Author: bruuuna.neri23@gmail.com
@tag
Feature: Validar itens por pagina
		Eu como usuario quero entrar no site, pesquisar por um produto e mudar a quantidade de itens por pagina

  @tag1
  Scenario: Validar itens por pagina
    Given que eu busque um produto valido 
    And clique em itens por pagina
    When eu colocar um novo numero
    Then eu valido as informacoes
