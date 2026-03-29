


<p align="center">
  <img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 21">
  <img src="https://img.shields.io/badge/Spring%20Boot-4.0-brightgreen?style=for-the-badge&logo=springboot&logoColor=white" alt="Spring Boot">
  <img src="https://img.shields.io/badge/PostgreSQL-16-blue?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL">
  <img src="https://img.shields.io/badge/Docker-Enabled-blue?style=for-the-badge&logo=docker&logoColor=white" alt="Docker">
  <img src="https://img.shields.io/badge/DBeaver-382923?style=for-the-badge&logo=dbeaver&logoColor=white" alt="DBeaver">
</p>

# 📅 Agendador de Horários - Backend

**Status do Projeto:** 🟢 Em Desenvolvimento Ativo

API REST robusta para gerenciamento de agendamentos, desenvolvida com foco em **boas práticas de engenharia de software**, **arquitetura limpa** e **ambiente profissional isolado**.

Este projeto não demonstra apenas código, mas também a capacidade de estruturar um ambiente moderno, escalável e alinhado com padrões do mercado.

---

## 🚀 Visão Geral

O sistema simula um fluxo real de agendamentos, garantindo consistência e previsibilidade:

* 📌 Criação inteligente de agendamentos
* 📌 Listagem dinâmica de horários disponíveis
* 📌 Gestão completa (atualização e cancelamento)
* 📌 Validação rigorosa de conflitos de horário

---

## 🏗️ Stack Técnica & Ambiente

Desenvolvido sob o conceito de **ambiente isolado (Clean OS)**, evitando conflitos e garantindo reprodutibilidade:

* 🐳 **Docker** → Containers isolados para PostgreSQL
* 🐧 **WSL 2** → Ambiente Linux nativo dentro do Windows
* 💻 **VS Code** → Desenvolvimento com Remote WSL
* 🗄️ **DBeaver** → Gestão visual do banco de dados
* 🧹 **Windows Clean** → Sem dependências locais desnecessárias

---

## 🔄 Fluxo da Informação

```bash
Cliente → Controller → Service → Repository → PostgreSQL (Docker)
```

---

## 🧠 Arquitetura da Aplicação

Estrutura baseada em separação de responsabilidades:

| Camada         | Responsabilidade                     |
| -------------- | ------------------------------------ |
| **Controller** | 🚦 Exposição da API (endpoints REST) |
| **Service**    | 🧠 Regras de negócio e validações    |
| **Repository** | 🗄️ Acesso a dados via JPA           |
| **Model**      | 💎 Entidades (mapeamento do banco)   |
| **DTO**        | 📦 Transporte seguro de dados        |

---

## ⚙️ Execução do Projeto

### 1. Ambiente (WSL)

```bash
git clone https://github.com/lecooliveira/agendador-horarios.git
cd agendador-horarios
code .
```

### 2. Subir infraestrutura (Docker)

```bash
docker-compose up -d
```

### 3. Executar aplicação

```bash
./mvnw spring-boot:run
```

---

## 🗄️ Banco de Dados

* **Engine:** PostgreSQL (Docker)
* **Host:** localhost
* **Porta:** 5432
* **Database:** agendador
* **Credenciais:** Gerenciadas via `.env`

---

## 💡 Diferenciais Técnicos

* ✅ Ambiente isolado com Docker (reprodutibilidade total)
* ✅ Desenvolvimento Linux-first com WSL
* ✅ Arquitetura organizada e escalável
* ✅ Separação clara de responsabilidades
* ✅ Preparado para evolução (microserviços / cloud)

---

## 👨‍💻 Autor

### Alexandro Oliveira (Leco Oliveira)

Em transição para Desenvolvimento Backend Java, com foco em construir aplicações **escaláveis, bem estruturadas e alinhadas ao mercado**.

---

## ⭐ Contribuição

Contribuições são bem-vindas.
Sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*.

