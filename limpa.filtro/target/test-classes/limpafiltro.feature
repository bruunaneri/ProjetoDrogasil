#Author: bruuuna.neri23@gmail.com
@tag
Feature: Validar limpar filtro
		Eu como usuario quero entrar no site, fazer uma busca e limpar a caixa de texto para realizar uma nova

  @tag1
  Scenario: Validar limpar filtro
    Given que eu pesquise um sintoma 
    And coloque filtros
    When eu limpar os filtros
    Then eu valido se o filtro foi limpo
