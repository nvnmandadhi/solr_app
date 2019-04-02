FROM ubuntu

WORKDIR /opt/app/indexer

COPY ./docker/indexer/init.sh .
ADD ./pom.xml .
COPY / /opt/app/indexer
COPY ./docker/indexer/data.csv .

RUN apt-get update
RUN apt-get install -y maven
RUN apt-get install -y openjdk-8-jdk

RUN chmod 755 /opt/app/indexer/init.sh

ENTRYPOINT ["/opt/app/indexer/init.sh"]