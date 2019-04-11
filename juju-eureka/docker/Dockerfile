FROM openjdk:8-jre

RUN mkdir /app

COPY juju-eureka-0.0.1-SNAPSHOT.jar /app/

CMD java -jar /app/juju-eureka-0.0.1-SNAPSHOT.jar -Dspring.profiles.active=prod

EXPOSE 8761