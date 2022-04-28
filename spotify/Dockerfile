#新版dockerfile-0117-wangduo,只有端口需要改动

#image持续集成插件 约定,此df文件,必须与pom同级别
FROM openjdk:8-jre
MAINTAINER cmii-wangduo

#在pom.xml里通过buildArgs指定的变量，可以在Dockerfile中通过ARG指令引用进
#类似于: register-service-spring-boot-CMCC.1.0.3-SNAPSHOT
ARG JAR_FILE

#注意: Do not use ${project.build.directory} as a way to reference your build directory.
COPY target/${JAR_FILE} /app.jar

#只有这里需要改动
CMD ["--server.port=8080"]
EXPOSE 8080

ENTRYPOINT ["java","-jar", "/app.jar"]