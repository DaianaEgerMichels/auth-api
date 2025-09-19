# 🔐  Authentication and Authorization API (pt-BR: API de Autenticação e Autorização)
A RESTful API for user management and access control, built with Java 24 and Spring Boot.
(pt-BR: Uma API RESTful para gerenciamento de usuários e controle de acesso, construída com Java 24 e Spring Boot.)

## About the Project (pt-BR: Sobre o Projeto)
This API is the core of an identity management system, providing endpoints for authentication, authorization, and user management. It was designed to be scalable, secure, and easy to integrate with other applications.
(pt-BR: Esta API é o núcleo de um sistema de gerenciamento de identidades, fornecendo endpoints para autenticação, autorização e gestão de usuários. Ela foi desenvolvida para ser escalável, segura e fácil de integrar com outras aplicações.)

## Features (pt-BR: Funcionalidades)
New User Registration: Public endpoint for new user registration.
(pt-BR: Cadastro de Novos Usuários: Endpoint público para registro de novos usuários.)

User Login: Generates access tokens (e.g., JWT) for authentication.
(pt-BR: Login de Usuários: Gera tokens de acesso (ex: JWT) para autenticação.)

Password Change: Secure endpoint for authenticated users to change their password.
(pt-BR: Alteração de Senha: Endpoint seguro para que usuários autenticados possam alterar sua senha.)

Account Deactivation: Manages account status, allowing administrators or the user themselves to deactivate the account.
(pt-BR: Inativação de Conta: Gerenciamento do status da conta, permitindo que administradores ou o próprio usuário inativem a conta.)

Token Validation: Protects endpoints, ensuring that only users with valid tokens and proper authorization can access them.
(pt-BR: Validação de Token: Proteção de endpoints, garantindo que apenas usuários com tokens válidos e autorização adequada possam acessá-los.)

Permissions and Roles: Role-based authorization system, such as ADMIN, MANAGER, or USER, to control access to specific resources.
(pt-BR: Permissões e Roles: Sistema de autorização baseado em papéis (roles), como ADMIN, MANAGER ou USER, para controlar o acesso a recursos específicos.)

## Technologies Used (pt-BR: Tecnologias Utilizadas)
Java 24: Latest version of the Java language, taking advantage of performance and security improvements.
(pt-BR: Versão mais recente da linguagem Java, aproveitando melhorias de performance e segurança.)

Spring Boot: Framework to simplify the development of Java applications, focusing on microservices and APIs.
(pt-BR: Framework para simplificar o desenvolvimento de aplicações Java, com foco em microsserviços e APIs.)

Spring Security: Industry standard for security in Spring applications.
(pt-BR: Padrão de mercado para segurança em aplicações Spring.)

Spring Data JPA: For abstraction of the persistence layer and interaction with the database.
(pt-BR: Para abstração da camada de persistência e interação com o banco de dados.)

Jwt: For generating and validating JWT tokens.
(pt-BR: Para a geração e validação de tokens JWT.)

H2 database: Database used to persist user information at runtime.
(pt-BR: Banco de dados utilizado para persistir as informações dos usuários em tempo de execução.)

```
Estrutura do Projeto
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── github
│   │   │           └── DaianaEgerMichels
|   |   |                └── auth_api
│   │   │                   └── v1
│   │   │                     └── controllers (en-US: API endpoints; pt-BR: Pontos de acesso da API)
│   │   │                     ├── infra (en-US: Security configurations; pt-BR: Configurações de segurança, etc.)
│   │   │                     ├── domain (en-US: Entities at domain, DTOs; pt-BR: Entidades de domínio, DTOs)
│   │   │                     ├── repositories (en-US: Database access layer; pt-BR: Camada de acesso a dados)
│   │   │                     └── services (en-US: Business rules ; pt-BR: Regras de negócio)
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
└── pom.xml
```


Developed by (pt-BR: Desenvolvido por) [Daiana Eger Michels](https://github.com/DaianaEgerMichels/)
