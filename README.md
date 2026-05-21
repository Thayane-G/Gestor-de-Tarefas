
# Task Manager

Esse foi um projeto que desenvolvi para praticar Java com integração ao MySQL utilizando JDBC.

A ideia foi criar um sistema simples de gerenciamento de tarefas funcionando pelo terminal, colocando em prática operações CRUD e melhorando minha organização de código no back-end.

<h2> Funcionalidades </h2>

Cadastrar tarefas
Listar tarefas
Atualizar status
Excluir tarefas

<h2> Tecnologias utilizadas </h2>

Java
MySQL
JDBC
Git/GitHub

<h2> Estrutura do projeto </h2>

src/
├── connection/
├── dao/
├── model/
└── App.java

<h2> Banco de dados </h2>

CREATE DATABASE task_manager;

USE task_manager;

CREATE TABLE tasks (

    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    description VARCHAR(255),
    status VARCHAR(50)

);

<h2> Como executar </h2>

1 - Clone o repositório --> git clone https://github.com/seu-usuario/task-manager-java.git

2 - Configure a conexão com o MySQL no ConnectionFactory.java

3 - Execute o App.java

<h2> O que aprendi com esse projeto </h2>

Durante o desenvolvimento consegui praticar:

CRUD
JDBC
integração Java + MySQL
organização em camadas
DAO
orientação a objetos

Além disso, também foi um projeto importante para me familiarizar melhor com versionamento utilizando Git e GitHub.

# Autora

Thayane Gabriele.
