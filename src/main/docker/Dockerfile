FROM java:8-alpine
ADD bootDocker.jar bootDocker.jar
EXPOSE 8084
ENTRYPOINT ["java","-jar","/data/bootDocker.jar"]

#FROM frolvlad/alpine-oraclejdk8:slim
#VOLUME /tmp
#ADD bootDocker.jar app.jar
#RUN sh -c 'touch /app.jar'
#ENV JAVA_OPTS=""
#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]