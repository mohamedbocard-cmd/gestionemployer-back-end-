# Utilise l'image officielle comme base
FROM mongo:latest

# Copie un fichier de configuration personnalisé (optionnel)
# COPY mongod.conf /etc/mongod.conf

# Copie des scripts d'initialisation de données
COPY ./init-scripts/ /docker-entrypoint-initdb.d/

# Commande par défaut pour lancer mongo avec une config spécifique
# CMD ["mongod", "--config", "/etc/mongod.conf"]
