FROM eclipse-temurin:21-jdk

LABEL maintainer="azad"

WORKDIR /myapp-dir

COPY build/libs/spring-boot-practice-demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 9008

CMD ["java", "-jar", "app.jar"]