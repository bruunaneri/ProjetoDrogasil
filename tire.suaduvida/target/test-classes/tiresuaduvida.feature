#Author: bruuuna.neri23@gmail.com
@tag
Feature: Validar tire sua duvida
  Eu como usuario quero fazer login e pesquisar sobre cancelamento do produto

  @tag1
  Scenario: Validar tire sua duvida
    Given que eu faca o login
    When eu entrar em Central de Atendimento
    And pesquisar sobre cancelamento
    Then eu valido a mensagem Como cancelar o produto?

 
