<h1 align="center">🏥 VollMed - API de Gestão Médica</h1>

<p align="center">
  <strong>API REST para gerenciamento de médicos, pacientes e consultas</strong><br>
  Projeto criado para consolidar conhecimentos em <strong>Java e Spring Boot</strong> aplicados no backend.
</p>

---

## 📌 Visão Geral

O **VollMed** é uma API REST desenvolvida como parte dos meus estudos em backend Java. A aplicação simula o sistema de gestão de uma clínica médica, permitindo o cadastro e gerenciamento de médicos, pacientes e agendamentos.

O projeto segue boas práticas de desenvolvimento moderno com foco em:

- Arquitetura limpa baseada em camadas (MVC)
- Integração com banco de dados relacional
- Uso de DTOs para desacoplamento da API
- Redução de boilerplate com Lombok

---

## ⚙️ Tecnologias e Ferramentas

- ✔️ Java 17  
- ✔️ Spring Boot  
- ✔️ Spring Data JPA  
- ✔️ Lombok  
- ✔️ MySQL  
- ✔️ Maven  
- ✔️ Postman (para testes)

---

## 🚀 Como Executar o Projeto Localmente

### ✅ Pré-requisitos

- Java 17+ instalado  
- MySQL instalado e rodando  
- Maven instalado

### ▶️ Passos para execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/Lanzoni15/VollMed.git
   cd VollMed

1. Configure o arquivo application.properties com os dados do seu banco MySQL:
   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/vollmed
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha


1. Execute a aplicação:
   ```bash
   mvn spring-boot:run

1. Acesse a API em:
   ```bash
   (http://localhost:9090/)

## 📐 Protótipo de Interface

O conceito visual da aplicação foi inspirado no protótipo oficial da [Voll.med no Figma](https://www.figma.com/design/N4CgpJqsg7gjbKuDmra3EV/Voll.med).

## 💡 Aprendizados e Destaques Técnicos

Durante o desenvolvimento da API VollMed, aprofundei meus conhecimentos em:
  - 🧠 Estruturação de projetos com Spring Boot e MVC

  - 🔄 Criação de endpoints RESTful (GET, POST, PUT, DELETE)

  - 🛡️ Validações com Bean Validation e tratamento de erros

  - 📦 Mapeamento de entidades com JPA e integração com MySQL

  - 🧰 Uso de DTOs para transferências seguras de dados

  - 🔍 Testes manuais com Postman e verificação do comportamento da API

  - 🧹 Organização de código limpo e reutilizável com Lombok

## ✨ Autor
Desenvolvido por Arthur Lanzoni

📚 Estudante de tecnologia com foco em backend Java e Spring Boot

