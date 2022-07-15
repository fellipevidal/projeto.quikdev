#Author: fellipe.vidal@outlook.com


Feature: Cadastro de produtos
  Eu como usuario quero inserir produtos na tabela para serem cadastrados

  @ct01
  Scenario: Cadastrar produtos
    Given que eu esteja na tela de cadastro para adicionar produtos
    And preencher todos os campos corretamente
    When adicionar
    Then produto tela01 adicionado com sucesso

	
	 @ct02
  Scenario: Cadastrar produtos com dados incorretos
    Given que eu esteja na tela de cadastro para adicionar produtos
    And preencher todos os campos incorretamente
    When adicionar
    Then produto com todos os dados incorreto adicionado com sucesso
    
    
     @ct03
  Scenario: Cadastrar produtos tela02
    Given que eu esteja na tela02 de cadastro para adicionar produtos
    And preencher todos os campos corretamente
    When adicionar
    Then produto tela02 adicionado com sucesso
    
     @ct04
  Scenario: Cadastrar produto com dados incorretos tela02
    Given que eu esteja na tela02 de cadastro para adicionar produtos
    And preencher campo nome incorreto
    And preencher campo preco incorreto
    And preencher validade
    When adicionar
    Then produto com nome e preco incorreto adicionados com sucesso
    
     @ct05
  Scenario: Cadastrar produtos tela03
    Given que eu esteja na tela03 de cadastro para adicionar produtos
    And preencher todos os campos corretamente
    When adicionar
    Then produto tela03 adicionado com sucesso
    
     @ct06
  Scenario: Cadastrar produtos com dados incorretos tela03
    Given que eu esteja na tela03 de cadastro para adicionar produtos
    And preencher campo nome incorreto
    And preco correto
    And validade correta
    When adicionar
    Then produto com nome incorreto adicionado com sucesso
    
     @ct07
  Scenario: Dados em branco tela01
    Given que eu esteja na tela de cadastro para adicionar produtos
    When adicionar
    Then campos em branco cadastrado
    
     @ct08
  Scenario: Dados em branco tela02
    Given que eu esteja na tela02 de cadastro para adicionar produtos
    When adicionar
    Then obrigatorio preencher campos tela02 para adicionar
    
     @ct09
  Scenario: Dados em branco tela03
    Given que eu esteja na tela03 de cadastro para adicionar produtos
    When adicionar
    Then obrigatorio preencher campos tela03 para adicionar
  
