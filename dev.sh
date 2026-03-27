#!/bin/bash

echo "🚀 Iniciando ambiente..."

echo "🐳 Subindo PostgreSQL (Docker)..."
docker compose up -d

echo "⏳ Aguardando banco subir..."
sleep 5

echo "☕ Iniciando Spring Boot..."
./mvnw spring-boot:run
echo "🚀 Iniciando ambiente..."

echo "🐳 Subindo PostgreSQL (Docker)..."
docker compose up -d

echo "⏳ Aguardando banco subir..."
sleep 5

echo "☕ Iniciando Spring Boot..."
./mvnw spring-boot:run