# Etape de build
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /build
COPY  . .
# Excuter le build avec la classe principale explicitement spcifie
RUN mvn clean install -DskipTests

# tape de runtime
FROM eclipse-temurin:21-jre-jammy
RUN mkdir /app
WORKDIR /app
COPY --from=build /build/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

