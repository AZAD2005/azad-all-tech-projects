FROM eclipse-temurin:21-jdk
LABEL maintainer ="azad"
WORKDIR /myapp-dir
COPY ./build/libs/open-shift-demo-0.0.1-SNAPSHOT.jar open-shift-demo-0.0.1-SNAPSHOT.jar
EXPOSE 9005
CMD [ "java", "-jar", "open-shift-demo-0.0.1-SNAPSHOT.jar" ]
