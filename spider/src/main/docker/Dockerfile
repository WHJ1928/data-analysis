FROM java:8u111-alpine
MAINTAINER whj1928@qq.com
VOLUME /var
ENV TZ="Asia/Shanghai" HOME="/var/app/"
WORKDIR ${HOME}
ADD data-analysis.jar /var/app/data-analysis.jar
EXPOSE 2222
ENTRYPOINT ["java" , "-Djava.security.egd=file:/dev/./urandom", "-jar" ,"/var/app/data-analysis.jar"]