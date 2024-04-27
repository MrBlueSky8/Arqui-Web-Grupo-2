FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/Visually_Impaired-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} visualyImpaired.jar
ENTRYPOINT ["java","-jar","/visualyImpaired.jar"]