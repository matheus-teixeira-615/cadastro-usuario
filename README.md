<h1>📌 CRUD com Banco H2</h1>

<h3>📖 Sobre o Projeto</h3>

Sistema CRUD (Create, Read, Update, Delete) em Java + Spring Boot, usando H2 em memória.
Treina cadastro, gerenciamento de dados, consultas por e-mail e uso de operações ternárias para evitar exclusão de informações não fornecidas.

<h3>🚀 Tecnologias</h3>

- 💻 Java 21
- 🌐 Spring Boot & Spring Web
- 📦 Spring Data JPA
- 🗄️ H2 Database
- ✨ Lombok
- 📂 Maven

<h3>⚙️ Funcionalidades</h3>

```➕ Criar registro```

```📋 Listar registros```

```🔍 Buscar registro por e-mail – treina consultas alternativas em JPA```

```✏️ Atualizar registro – evita exclusão de dados não passados usando operação ternária```

```❌ Excluir registro```

<h3>🗄️ Banco H2</h3>

Configuração no `application.properties`:

```properties
spring.application.name=cadastro-usuario
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.datasource.url=jdbc:h2:mem:usuario
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
```

Console do H2:
🔗 http://localhost:8080/h2-console

Senha: (em branco)

<h3>▶️ Como Rodar</h3>

Clonar o repositório:

```git clone https://github.com/usuario/cadastro-usuario.git```


Entrar na pasta do projeto:

```cd cadastro-usuario```


Rodar a aplicação:

```mvn spring-boot:run```


ou, se usar Gradle:

```./gradlew bootRun```
