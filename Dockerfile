FROM amazoncorretto:19.0.2
ENV PATH=${PATH}:${JAVA_HOME}/bin
COPY target/retailer-0.0.1-SNAPSHOT.jar /temp/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","temp/app.jar"]