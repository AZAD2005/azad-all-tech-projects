FROM eclipse-temurin:21-jdk
LABEL maintainer ="azad"
WORKDIR /myapp-dir
COPY ./target/demo-all-0.0.1-SNAPSHOT.jar demo-all-0.0.1-SNAPSHOT.jar
EXPOSE 9000
CMD [ "java", "-jar", "demo-all-0.0.1-SNAPSHOT.jar" ]
