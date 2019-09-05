FROM openjdk:8-jdk-alpine
ADD *.jar app.jar
#设置上海时区 需要把服务器/usr/share/zoneinfo/Asia目录下的Shanghai文件复制到dockerFile相同目录下
ADD Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone
#RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
#&& echo 'Asia/Shanghai' >/etc/timezone \
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

#FROM java:8-alpine
#ADD bootDocker.jar bootDocker.jar
#EXPOSE 8084
#ENTRYPOINT ["java","-jar","/data/bootDocker.jar"]