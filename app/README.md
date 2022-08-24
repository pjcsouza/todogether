# todogether

Projeto da disciplina de APS 2022.1 do curso de Ciência da Computação do Centro de Informática da Universidade Federal de Pernambuco - CIn/UFPE

## Setup

### MySQL

Instale o MySQL na sua máquina como preferir e faça os passos a seguir

#### Banco de dados `todogether`

Para rodar o site, é necessário:
- Ter uma conexão MySQL rodando em `localhost:3306`
- criar um database chamado `todogether`

#### Dados de usuários Google mockados

A parte da API do Google está atualmente mockada, então é necessário criar algumas entradas na tabela `usuariosgoogle` antes de rodar.

ex.: 
``` sql
  INSERT `todogether`.`usuariosgoogle` (`email`, `nome`, `senha`) VALUES ('test@gmail.com', 'test', '1234');
```

Somente os usuários presentes nessa tabela podem ser cadastrados.
