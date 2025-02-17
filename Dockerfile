FROM openjdk:11

ARG JAR_FILE=target/*.jar
ARG XLSX=target/*.xlsx
RUN mkdir /opt/middleware && mkdir /opt/middleware/log;\
    groupadd --gid 2000 jvm_group && \
    useradd --uid 2000 --gid jvm_group --shell /bin/bash jvm_user;\
	chown -R 2000:2000 /opt/middleware

USER jvm_user
COPY ${JAR_FILE} /opt/middleware/app.jar
COPY ${XLSX} /opt/middleware/src/main/resources/dataset.xlsx
WORKDIR /opt/middleware
ENTRYPOINT ["java","-jar","/opt/middleware/app.jar"]