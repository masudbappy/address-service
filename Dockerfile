FROM adoptopenjdk/openjdk11
WORKDIR /app
COPY build/libs/address-service-0.0.1-SNAPSHOT.jar .
EXPOSE 8888
ENTRYPOINT ["java","-jar","address-service-0.0.1-SNAPSHOT.jar"]