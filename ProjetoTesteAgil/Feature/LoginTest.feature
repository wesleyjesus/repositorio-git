Feature: Realizar login

  Scenario: Realizar login com sucesso
    Given Usuário está na página inicial
    When Eu navegar até a página de login
    And Eu entrar com meu usuário e senha
    Then Exibe a mensagem na tela Login Successfully

  Scenario: Realizar logout com sucesso
    When Eu clicar em sair
    Then Exibe a mensagem LogOut Successfully
