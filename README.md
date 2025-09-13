# 🔐 API de Autenticação e Autorização
Uma API RESTful para gerenciamento de usuários e controle de acesso, construída com Java 24 e Spring Boot.

## Sobre o Projeto
Esta API é o núcleo de um sistema de gerenciamento de identidades, fornecendo endpoints para autenticação, autorização e gestão de usuários. Ela foi desenvolvida para ser escalável, segura e fácil de integrar com outras aplicações.

## Funcionalidades
Cadastro de Novos Usuários: Endpoint público para registro de novos usuários.

Login de Usuários: Gera tokens de acesso (ex: JWT) para autenticação.

Alteração de Senha: Endpoint seguro para que usuários autenticados possam alterar sua senha.

Inativação de Conta: Gerenciamento do status da conta, permitindo que administradores ou o próprio usuário inativem a conta.

Validação de Token: Proteção de endpoints, garantindo que apenas usuários com tokens válidos e autorização adequada possam acessá-los.

Permissões e Roles: Sistema de autorização baseado em papéis (roles), como ADMIN, MANAGER ou USER, para controlar o acesso a recursos específicos.

## Tecnologias Utilizadas
Java 24: Versão mais recente da linguagem Java, aproveitando melhorias de performance e segurança.

Spring Boot: Framework para simplificar o desenvolvimento de aplicações Java, com foco em microsserviços e APIs.

Spring Security: Padrão de mercado para segurança em aplicações Spring.

Spring Data JPA: Para abstração da camada de persistência e interação com o banco de dados.

Jwt: Para a geração e validação de tokens JWT.

H2 database: Banco de dados utilizado para persistir as informações dos usuários em tempo de execução.

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
│   │   │                     └── controllers (Endpoints da API)
│   │   │                     ├── config (Configurações de segurança, etc.)
│   │   │                     ├── domain (Entidades de domínio, DTOs)
│   │   │                     ├── repositories (Camada de acesso a dados)
│   │   │                     └── services (Regras de negócio)
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
└── pom.xml
```


Desenvolvido por [Daiana Eger Michels](https://github.com/DaianaEgerMichels/)
