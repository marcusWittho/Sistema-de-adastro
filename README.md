# Sistema de Cadastro

## Para executar o projeto
- No terminal, acesse a pasta principal do projeto e execute o comando abaixo
```bash
./gradlew run
```

- Com o projeto rodando no terminal, acesse o caminho abaixo pelo seu navegador para visualizar o banco de dados
    - http://localhost:8080/h2-console

- Os endpoints criados foram os seguintes: (para testar os endpoints foi utilizado o postman)
    - Usuários
      - cadastrar: localhost:8080/usuario
      - buscar por id: localhost:8080/usuario/{idUsuario}
      - atualizar: localhost:8080/usuario/{idUsuario} (enviar json do usuario no body)
      - listar todos os usuarios: localhost:8080/usuario
      - remover por id: localhost:8080/usuario/{idUsuario}
    - Eventos
      - cadastrar: localhost:8080/evento
      - buscar por id: localhost:8080/evento/{idUsuario}
      - atualizar: localhost:8080/evento/{idEvento} (enviar json do evento no body)
      - listar todos os eventos: localhost:8080/evento
      - remover por id: localhost:8080/evento/{idEvento}

Sistema de cadastros de eventos, o usuário pode cadastrar três tipos de eventos:
- Show 
- Festa 
- Evento Esportivo 

Cadastro de data, local e horário destes eventos

Lista de todos os eventos cadastrados pelo usuário

Liata dos eventos futuros cadastrados pelo usuário



## Implementações para melhorar a experiência do usuário

- Verificar se a data de cadastro do evento é maior que a data atual
- Implementação de um front-end para melhorar a experiência do usuário
- Melhoria nas opções escolhidas pelo o usuário
- Desenvolver um CRUD e implementar um banco de dados SQL
