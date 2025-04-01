# API - Java Spring Boot com PostgreSQL e MongoDB

## Descrição

Esta API foi desenvolvida em **Java Spring Boot** com o objetivo de permitir que múltiplos usuários acessem registros de pessoas, com diferentes níveis de permissão. 

- **Usuários comuns** podem apenas buscar informações básicas: **nome, CPF e setor**.
- **Administradores** têm acesso completo aos cadastros, podendo **cadastrar, atualizar e visualizar** **nome, CPF, setor, endereço, telefone e e-mail**.
- **Administradores** também possuem permissão para buscar tanto informações simples quanto completas.
- O **PostgreSQL** armazena os cadastros completos.
- O **MongoDB** guarda apenas informações básicas.
- A API conta com **autenticação JWT** via **Spring Security** para garantir a segurança dos dados.

## Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- MongoDB
- Spring Security com JWT
- Docker (opcional)

## Requisitos

Antes de iniciar, certifique-se de ter instalado:
- **Java 21**
- **Maven**
- **Docker** (opcional, para rodar os bancos de dados via containers)
- **PostgreSQL** e **MongoDB** instalados e configurados

## Configuração do Banco de Dados

Crie um banco de dados no PostgreSQL:
```sql
CREATE DATABASE my_db;
```

Defina as configurações do PostgreSQL e MongoDB no **application.properties** ou **application.yml**:

```properties
# PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/meu_banco
spring.datasource.username=your_user
spring.datasource.password=yout_password
spring.jpa.hibernate.ddl-auto=update

# MongoDB
spring.data.mongodb.uri=mongodb://localhost:27017/my_bd_mongo
```

## Execução do Projeto

1. Clone este repositório:
   ```sh
   git clone https://github.com/DouglasSimoesM/cadastro.git
   ```
2. Acesse o diretório do projeto:
   ```sh
   cd cadastro
   ```
3. Compile e execute a aplicação:
   ```sh
   mvn spring-boot:run
   ```

A API estará disponível em `http://localhost:8080`.

## Autenticação JWT

Para acessar as rotas protegidas, é necessário obter um token JWT. Para isso:

1. Registre um usuário via **POST /auth/register**
2. Autentique-se via **POST /auth/login**
3. Use o token recebido no cabeçalho **Authorization: Bearer {token}**

## Como Usar a API (Com Video Demonstrativo)

Um **vídeo tutorial** demonstrando como utilizar a API estará disponível em breve!

---

Feito por [Douglas Simões]
