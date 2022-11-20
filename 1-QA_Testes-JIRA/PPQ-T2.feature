Feature: Redefinição de senha
    @TestCaseKey=PPQ-T2
    Scenario: Redefinição de senha
        
        Given O indivíduo tentará realizar login
        
        And Quando clicar em “Esqueceu senha?”
        
        When Entra na página de recuperação de senha
        
        Then Adiciona um e-mail