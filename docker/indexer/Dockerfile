FROM openjdk:11-jre-stretch

WORKDIR /opt/app/indexer

COPY ./docker/indexer/init.sh .
ADD ./pom.xml .
COPY src /opt/app/indexer

RUN apt-get update
RUN apt-get install -y maven

RUN chmod 755 /opt/app/indexer/init.sh

ENTRYPOINT ["/opt/app/indexer/init.sh"]