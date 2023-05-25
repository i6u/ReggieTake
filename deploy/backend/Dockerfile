FROM openjdk:8-jre-alpine
ARG profile=prod
ARG JAR_PATH
ENV SPRING_PROFILES_ACTIVE ${profile}
COPY reggie-server/target/reggie-server-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]