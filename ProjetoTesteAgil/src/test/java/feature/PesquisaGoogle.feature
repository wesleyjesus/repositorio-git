#language: pt
Funcionalidade: Pesquisar no Google

  Cenário: Procurar a página da Walstore
    Dado Eu estou na página de pesquisa do google
    Quando Eu procurar por "walstore"
    Então O título da página deve começar com "walstore"
