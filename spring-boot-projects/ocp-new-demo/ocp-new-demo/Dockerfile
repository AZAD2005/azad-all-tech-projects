FROM eclipse-temurin:21-jdk
LABEL maintainer ="azad"
WORKDIR /myapp-dir
COPY ./build/libs/ocp-new-demo-0.0.1-SNAPSHOT.jar ocp-new-demo-0.0.1-SNAPSHOT.jar
EXPOSE 9006
CMD [ "java", "-jar", "ocp-new-demo-0.0.1-SNAPSHOT.jar" ]
