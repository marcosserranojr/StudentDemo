FROM registry.access.redhat.com/ubi8/openjdk-17:1.15-1.1679485273
#COPY target/demo-0.0.1-SNAPSHOT.jar /user/app/

#WORKDIR /user/app

COPY /src/target/demo-0.0.1-SNAPSHOT.jar /user/app/

WORKDIR /user/app

RUN   chgrp -R 0 /user/app && \
      chmod -R g=u /user/app && \
      chmod +x /user/app

RUN sh -c 'touch demo-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java", "-jar","demo-0.0.1-SNAPSHOT.jar"]
