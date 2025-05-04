# API Recettes de Cuisine – Guide Complet

Cette application est une API REST développée en Java avec Spring Boot. Elle permet de gérer des **recettes de cuisine**, leurs **ingrédients** et leurs **catégories**. Ce guide vous explique comment **l’installer, la lancer avec Docker**, et comment **la tester avec Postman**.

---

## Prérequis

- Java 17+ 
- Maven (pour compiler une fois le .jar)
- Docker & Docker Compose
- Postman (pour tester l’API)

---

## Structure technique

- Backend : Spring Boot (Java)
- Base de données : MariaDB
- Conteneurisation : Docker + Docker Compose
- Tests : Postman (collection fournie)

---

## Étapes de lancement de l’application

### 1. Compiler le projet

```bash
mvn clean package
```

Cela génère `target/recettes-api-0.0.1-SNAPSHOT.jar`.

### 2. Lancement global

```bash
docker compose down --remove-orphans
docker compose up --build
```

### 3. Lancement des  services

```bash
docker-compose up -d mariadb     # Démarre uniquement la base de données
docker-compose up recettes-api   # Démarre l'application Spring Boot
```

###  Vérifier les conteneurs

```bash
docker ps
```

Tu dois voir :
- `recettes-api-mariadb-1`
- `recettes-api-recettes-api-1`

##  Tester l’API avec Postman

### 1. Ouvrir Postman
### 2. Importer la collection `recettes-api-collection-postman.json` et tester les requêtes de la collection.

## Nettoyer l’environnement

```bash
docker compose down -v
```

Supprime les conteneurs et les volumes (supprime les données).

---

##  Auteur

Projet réalisé par **Calixte Nguemo** dans le cadre du TP 4AMS.
