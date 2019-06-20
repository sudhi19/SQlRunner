FROM openjdk:10-jre-slim
COPY ./target/sqlrunner.jar D://SP//
WORKDIR D://SP//
EXPOSE 8080
CMD ["java", "-jar", "sqlrunner.jar"]