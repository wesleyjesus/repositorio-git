#language: pt
Funcionalidade: Realizar Login
  Como usuário do sistema
  Eu quero poder logar na pagina de login do sistema único
  Para que eu possa acessar o sistema

  Cenário: Logar com um usuário já cadastrado
    Quando eu logo com os dados:
      | usuario               | senha                 |
      | wesleyjesus@mpf.mp.br | wesleyjesus@mpf.mp.br |
    E aciona o botao entrar
    Então o usuario visualiza a tela "<link>".
