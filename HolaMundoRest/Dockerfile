# Etapa 1: Construcción (Build)
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
# Copiamos el pom y el código fuente
COPY pom.xml .
COPY src ./src
# Compilamos el proyecto saltando las pruebas para ahorrar tiempo
RUN mvn clean package -DskipTests

# Etapa 2: Ejecución (Runtime)
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
# Buscamos el jar generado y lo renombramos a app.jar
COPY --from=build /app/target/*.jar app.jar
# Exponemos el puerto 8080 (por defecto de Spring Boot)
EXPOSE 8080
# Comando para arrancar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
