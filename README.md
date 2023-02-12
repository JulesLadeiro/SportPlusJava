# SportPlusJava

**API Java Spring pour site SPORT+**

## Projets

Back-end (sur ce repo)

Front-end (sur le repo [JulesLadeiro/SportPlusJavaFront](https://github.com/JulesLadeiro/SportPlusJavaFront))

## Points API

### Authentification

| Méthode | Endpoint      | Description                                                                              |
| ------- | ------------- | ---------------------------------------------------------------------------------------- |
| POST    | /authenticate | Authentifie un utilisateur, reçoit un objet JSON avec l'email et mot de passe non crypté |

### Utilisateurs

L'endpoint de récupération d'utilisateurs ne sont pas accéssibles via l'API.

| Méthode | Endpoint | Description                                                                                     |
| ------- | -------- | ----------------------------------------------------------------------------------------------- |
| POST    | /users   | Crée un utilisateur, reçoit un objet JSON avec le username, l'email, mot de passe et role       |
| UPDATE  | /users   | Met à jour un utilisateur, reçoit un objet JSON avec le username, l'email, mot de passe et role |

### Catalogues

L'endpoint de création et édition et suppression de catalogue n'est pas disponible car il est crée automatiquement lors de la création d'un utilisateur de role CLIENT.

| Méthode | Endpoint        | Description                      |
| ------- | --------------- | -------------------------------- |
| GET     | /catalogue      | Récupère tous les catalogues     |
| GET     | /catalogue/{id} | Récupère un catalogue par son id |

### Produits

| Méthode | Endpoint      | Description                                                                                           |
| ------- | ------------- | ----------------------------------------------------------------------------------------------------- |
| GET     | /product      | Récupère tous les produits                                                                            |
| GET     | /product/{id} | Récupère un produit par son id                                                                        |
| POST    | /product      | Crée un produit, reçoit un objet JSON avec le nom, le prix, l'image en base64 et le catalogueId       |
| UPDATE  | /product      | Met à jour un produit, reçoit un objet JSON avec le nom, le prix, l'image en base64 et le catalogueId |
| DELETE  | /product/{id} | Supprime un produit par son id                                                                        |