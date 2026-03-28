🔵 🐳 DOCKER & POSTGRES

📦 Infraestrutura isolada e profissional

# Criar rede
docker network create rede-app

# Subir banco PostgreSQL
docker run --name postgres-db --network rede-app -d postgres

# Parar todos containers ativos
docker stop $(docker ps -q)

# Limpeza geral (CUIDADO ⚠️)
docker system prune -a

# Listar volumes
docker volume ls

# Build da aplicação
docker build -t app-image .

# Inspecionar container
docker inspect postgres-db

🟢 🐙 GIT — FLUXO BASICO

🔥 Domine o versionamento como um profissional

## 🟢 🐙 GIT — FLUXO BASICO DE VERSIONAMENTO  
> 📈 Boas práticas utilizadas no mercado de desenvolvimento

# Inicializar repositório
git init

# Conectar ao GitHub
git remote add origin <url-do-repositorio>

# Adicionar arquivos
git add .

# Commit inicial
git commit -m "Initial commit"

# Definir branch principal
git branch -M main

# Enviar para o GitHub
git push -u origin main

# Criar nova branch
git checkout -b feature/nome

# Merge de branches
git merge <branch>

# Desfazer último commit (mantendo alterações)
git reset --soft HEAD~1

# Limpeza de arquivos não rastreados
git clean -fd

🟡 🐧 WSL & JAVA ECOSYSTEM

⚙️ Ambiente de alta performance

# Criar projeto Spring Boot
spring init --dependencies=web,jpa --language=java

# Build sem testes
./mvnw clean install -DskipTests

# Rodar aplicação
./mvnw spring-boot:run

# Ver processo na porta 8080
lsof -i :8080

# Teste de endpoint
curl http://localhost:8080/api

# Data do sistema
date

🟣 🗄️ DBEAVER & SQL CONSOLE

⚡ Manipulação direta do banco

-- Listar tabelas
SELECT * FROM pg_catalog.pg_tables;

-- Criar database
CREATE DATABASE app_db;

-- Ver atividade
SELECT * FROM pg_stat_activity;

-- Limpar tabela
TRUNCATE TABLE nome_tabela CASCADE;


⚡ 🔌 STARTDEV HOTKEYS
Ação	                       Atalho
Terminal	                  `CTRL + ``
Busca rápida	               CTRL + P
Formatar código	               ALT + SHIFT + F
Renomear variável	           F2
Organizar imports	           ALT + SHIFT + O





# 🚀 GUIA DE ESTUDO — STARTDEV


## 🔵 🐳 DOCKER & POSTGRES — INFRAESTRUTURA PROFISSIONAL

> 📦 Ambiente isolado e replicável para aplicações modernas

```bash
# Criar rede
docker network create rede-app

# Subir banco PostgreSQL
docker run --name postgres-db --network rede-app -d postgres

# Parar todos containers ativos
docker stop $(docker ps -q)

# Limpeza geral (CUIDADO ⚠️)
docker system prune -a

# Listar volumes
docker volume ls

# Build da aplicação
docker build -t app-image .

# Inspecionar container
docker inspect postgres-db
```

---

## 🟢 🐙 GIT — FLUXO PROFISSIONAL DE VERSIONAMENTO

> 📈 Boas práticas utilizadas no mercado de desenvolvimento

```bash
# Inicializar repositório
git init

# Conectar ao GitHub
git remote add origin <url-do-repositorio>

# Adicionar arquivos
git add .

# Commit inicial
git commit -m "Initial commit"

# Definir branch principal
git branch -M main

# Enviar para o GitHub
git push -u origin main

# Criar nova branch
git checkout -b feature/nome

# Merge de branches
git merge <branch>

# Desfazer último commit (mantendo alterações)
git reset --soft HEAD~1

# Limpeza de arquivos não rastreados
git clean -fd
```

---

## 🟡 🐧 WSL & JAVA ECOSYSTEM — AMBIENTE DE DESENVOLVIMENTO

> ⚙️ Setup otimizado para aplicações backend com alta performance

```bash
# Criar projeto Spring Boot
spring init --dependencies=web,jpa --language=java

# Build sem testes
./mvnw clean install -DskipTests

# Rodar aplicação
./mvnw spring-boot:run

# Ver processo na porta 8080
lsof -i :8080

# Teste de endpoint
curl http://localhost:8080/api

# Data do sistema
date
```

---

## 🟣 🗄️ DBEAVER & SQL CONSOLE — GERENCIAMENTO DE DADOS

> ⚡ Manipulação direta e eficiente do banco de dados

```sql
-- Listar tabelas
SELECT * FROM pg_catalog.pg_tables;

-- Criar database
CREATE DATABASE app_db;

-- Ver atividade
SELECT * FROM pg_stat_activity;

-- Limpar tabela
TRUNCATE TABLE nome_tabela CASCADE;

```
---

⚡ 🔌 STARTDEV HOTKEYS — PRODUTIVIDADE

🚀 Atalhos essenciais para desenvolvimento ágil

Ação	              Atalho

Terminal	         `CTRL + ``
Busca rápida	      CTRL + P
Formatar código	      ALT + SHIFT + F
Renomear variável	  F2
Organizar imports	  ALT + SHIFT + O
