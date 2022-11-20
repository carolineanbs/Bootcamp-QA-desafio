Feature: Funcionalidade de Login sem Cadastro
    @TestCaseKey=PPQ-T3
    Scenario: Funcionalidade de Login sem Cadastro
        
        Given O indivíduo tentará realizar login
        
        And Adiciona um e-mail não cadastrado
        
        When Quando clicar em “Entrar”
        
        Then Aparecerá uma mensagem dizendo “⚠ Login ou senha incorretos.”