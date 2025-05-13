# 🧾 Recettes API

Une API REST développée en Java avec Spring Boot pour gérer des recettes de cuisine, leurs ingrédients et catégories. Le projet est conteneurisé avec Docker et testé avec Postman.

---

## 🚀 Fonctionnalités

- Création, consultation, modification et suppression de recettes
- Gestion des ingrédients et des catégories
- Recherche par nom pour recettes, ingrédients, et catégories
- Liaison recette ↔ ingrédients avec quantités et unités
- Export Postman pour test des routes

---

## 🛠️ Technologies utilisées

- **Java 17**
- **Spring Boot**
- **Spring Data JPA** (ORM)
- **MariaDB** (base de données)
- **Docker & Docker Compose**
- **Postman**
- **DBeaver** (visualisation BDD)
- **Git** (versionning)

---

## ✅ Pré-requis

- [Docker Desktop](https://www.docker.com/products/docker-desktop/)
- Postman pour tester l'API

---

## ⚙️ Lancement du projet

1. Clone du projet :
```bash
git clone https://github.com/NguemoCalixteCode/Recette-API.git
cd recettes-api
```

2. Lancer les conteneurs Docker :
```bash
docker-compose up --build
```

3. L’API sera accessible sur : [http://localhost:8081](http://localhost:8081)

4. La base MariaDB écoute sur : `localhost:3306`  
   - Utilisateur : `root`  
   - Mot de passe : `secret`  
   - Base : `recettes_db`

---

## 🧱 Structure du projet

```
src/
├── controllers/
├── services/
├── repositories/
├── dto/
├── entities/
```

---

##  Tester l’API avec Postman

### 1. Ouvrir Postman
### 2. Importer la collection `recettes-api-collection-postman.json` et tester les requêtes de la collection.
---

## 👤 Auteur

Calixte Nguemo  

