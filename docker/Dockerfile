FROM openjdk:11-jre-stretch

WORKDIR /etc

RUN apt-get update && \
  apt-get -y install lsof procps wget gpg dirmngr git vim curl maven

ADD solr-8.0.0.tgz .
RUN mkdir -p /etc/solr_home
RUN rm -fr solr-8.0.0/docs

ENV SOLR_USER="solr" \
    SOLR_UID="8983" \
    SOLR_GROUP="solr" \
    SOLR_GID="8983" \
    SOLR_INSTALL=/etc/solr-8.0.0 \
    SOLR_HOME=/etc/solr_home

RUN groupadd -r --gid $SOLR_GID $SOLR_GROUP && \
      useradd -r --uid $SOLR_UID --gid $SOLR_GID $SOLR_USER

COPY --chown=solr:solr data /etc/solr_home/data/
COPY --chown=solr:solr scripts /etc/solr_home/custom_scripts
COPY --chown=solr:solr src /opt/app/

RUN chown -R $SOLR_USER:$SOLR_GROUP $SOLR_HOME $SOLR_INSTALL /opt/app

WORKDIR $SOLR_HOME
USER $SOLR_USER

RUN cp -R $SOLR_INSTALL/server $SOLR_HOME
RUN mv $SOLR_HOME/server/* $SOLR_HOME
RUN mv $SOLR_HOME/solr/* $SOLR_HOME
RUN rm -fr $SOLR_HOME/server/solr
RUN cd $SOLR_HOME/custom_scripts && chmod 755 init.sh

RUN cd /opt/app/ && mvn package



