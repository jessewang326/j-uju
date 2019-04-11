FROM openjdk:8-jre

RUN mkdir /app

COPY juju-eureka-0.0.1-SNAPSHOT.jar /app/

CMD java -jar -Dspring.profiles.active=prod1 /app/juju-eureka-0.0.1-SNAPSHOT.jar

EXPOSE 8761