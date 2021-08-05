#Author: bruuuna.neri23@gmail.com
@tag
Feature: Validar ordenar por
  Eu como usuario quero entrar no site, pesquisar por um produto e ordenar por preco

  @tag1
  Scenario: Validar ordenar por
    Given que eu busque por um produto valido
    When eu clicar em Ordenar por preco
    Then eu valido as informacoes

 
