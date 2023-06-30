**Fonctionnement**

Le serveur GRPC fonctionne en local sur le port 8081
Le serveur REST fonctionne lui sur le port 8080
L'accès aux ressources se fait par l'intermédiaire d'un serveur web


**Connexion avec Google**

La connexion avec Google se fait via la page HTML du serveur Web
Une fois la connexion faite avec succès l'utilisateur est redirigé vers le serveur web en partant du principe qu'il fonctionne sur le port 80


**Mise en place en ligne de commande pour le serveur GRPC**

protoc --plugin="./lib/protoc-gen-grpc-java-1.56.0-windows-x86_64.exe" --java_out=./src/main/java/infres/ws/grpc --proto_path=./src/main/proto/ project.proto
