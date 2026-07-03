# Gestor de Tarefas

Esse foi um projeto que desenvolvi para praticar Java com integração ao MySQL utilizando JDBC.

A ideia foi criar um sistema simples de gerenciamento de tarefas funcionando pelo terminal, colocando em prática operações CRUD e melhorando minha organização de código no back-end.

---

## ![Preview do projeto]

<img width="1919" height="1142" alt="Captura de tela 2026-06-03 150328" src="https://github.com/user-attachments/assets/e0cb54de-51a0-439e-804b-4c3790d7f0e2" />
<img width="897" height="697" alt="Captura de tela 2026-06-03 145857" src="https://github.com/user-attachments/assets/2038e838-9da3-466d-b7e3-79db5edd8cdf" />
<img width="972" height="736" alt="Captura de tela 2026-06-03 145942" src="https://github.com/user-attachments/assets/1b070eef-94b6-4520-a975-ec6ac336094f" />
<img width="543" height="375" alt="Captura de tela 2026-06-03 150018" src="https://github.com/user-attachments/assets/5a4ace45-2950-4332-940f-b3a2a9becc15" />

---

<h2> Funcionalidades </h2>

- Cadastrar tarefas
- Listar tarefas
- Atualizar status
- Excluir tarefas

---

<h2> Tecnologias utilizadas </h2>

- Java
- MySQL
- JDBC
- Git/GitHub

---

<h2> Estrutura do projeto </h2>

src/ <br>
├── connection/ <br>
├── dao/ <br>
├── model/ <br>
└── App.java 

---

<h2>  Banco de dados </h2>

CREATE DATABASE task_manager;

USE task_manager;

CREATE TABLE tasks (

    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    description VARCHAR(255),
    status VARCHAR(50)

);

---

<h2>⚙️ Como executar </h2>

1 - Clone o repositório --> git clone https://github.com/seu-usuario/task-manager-java.git

2 - Configure a conexão com o MySQL no ConnectionFactory.java

3 - Execute o App.java

---

<h2> O que aprendi com esse projeto </h2>

Durante o desenvolvimento consegui praticar:

- CRUD
- JDBC
- Integração Java + MySQL
- Organização em camadas
- DAO
- Orientação a objetos

Além disso, também foi um projeto importante para me familiarizar melhor com versionamento utilizando Git e GitHub.

---

# 👩‍💻Autora

Thayane Gabriele.
