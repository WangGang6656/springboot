FROM  registry.moan.com:5000/moan/jdk17-maven3.6-nodejs18-base:latest

WORKDIR /app

COPY target/*.jar /app/app.jar
COPY application-dev.yml /app/application-dev.yml

EXPOSE 8080

ENTRYPOINT ["nohup","java", "-jar","/app/app.jar","-Dlog4j2.formatMsgNoLookups=true","--spring.config.location=/app/application-dev.yml","&"]

