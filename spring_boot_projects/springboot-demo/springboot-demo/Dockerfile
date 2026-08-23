FROM eclipse-temurin:21-jdk
LABEL maintainer="azad"
WORKDIR /myapp-dir
COPY build/libs/springboot-demo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9002
CMD ["java", "-jar", "app.jar"]
