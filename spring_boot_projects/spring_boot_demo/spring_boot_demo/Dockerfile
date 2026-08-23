FROM eclipse-temurin:21-jdk
LABEL maintainer="azad"
WORKDIR /myapp-dir
COPY build/libs/spring_boot_demo-0.0.1-SNAPSHOT.jar spring_boot_demo-0.0.1-SNAPSHOT.jar
EXPOSE 9009
CMD ["java", "-jar", "spring_boot_demo-0.0.1-SNAPSHOT.jar"]