FROM openjdk:11
COPY target/demo-0.0.1-SNAPSHOT.jar /user/app/

WORKDIR /user/app

RUN sh -c 'touch demo-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java", "-jar","demo-0.0.1-SNAPSHOT.jar"]