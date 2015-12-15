#language: pt
Funcionalidade: Validar login
  Como um usuário do sistema
  Eu quero poder acessar a pagina inicial do sistema único
  Para que eu possa acessar o sistema

  Esquema do Cenário: Validar login com sucesso.
    Dado um usuário "<usuario>" com cadastro no sistema.
    Quando preenche o campo senha com a "<senha>"
    E aciona o botao entrar
    Então o usuario visualiza a tela "<link>".

    Exemplos: 
      | usuario               | senha                 |
      | wesleyjesus@mpf.mp.br | wesleyjesus@mpf.mp.br |
