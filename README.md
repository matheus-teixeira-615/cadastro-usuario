📌 CRUD com Banco H2
📖 Sobre o Projeto

Este projeto é um sistema CRUD (Create, Read, Update, Delete) desenvolvido em Java utilizando o Spring Boot, com persistência de dados em um banco H2 Database (em memória).
O objetivo é demonstrar e praticar o funcionamento de operações básicas de cadastro e gerenciamento de dados.

🚀 Tecnologias Utilizadas

Java 21
Spring Boot
Spring Web
Lombrok
H2 Database
Spring Data JPA
Maven

⚙️ Funcionalidades

- Criar um novo registro
- Listar todos os registros
- Buscar registro por Email ( Decidi implementar a busca por e-mail para treinar diferentes formas de realizar consultas utilizando JPA ).
- Atualizar registro existente ( Utilizando a operação ternária para evitar a exclusão direta de dados que não foram passados ).
- Excluir registro

🗄️ Configuração do Banco H2

No arquivo application.properties:

spring.application.name=cadastro-usuario
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.datasource.url=jdbc:h2:mem:usuario
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

Para acessar o console do banco:
🔗 http://localhost:8080/h2-console

Senha: (em branco)

▶️ Como Rodar o Projeto

Clone o repositório:

git clone https://github.com/usuario/cadastro-usuario.git

Acesse a pasta do projeto:

cd nome-do-projeto


Execute a aplicação:

mvn spring-boot:run


ou

./gradlew bootRun
