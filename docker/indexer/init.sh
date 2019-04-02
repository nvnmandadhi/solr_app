#!/usr/bin/env bash
echo "Building indexing application jar"
cd /opt/app/indexer

echo "Packaging the indexer application"
mvn package

echo "Waiting for 30s"
sleep 1m

echo "Starting indexing...."
java -jar /opt/app/indexer/target/indexer-1.0-jar-with-dependencies.jar -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=1044