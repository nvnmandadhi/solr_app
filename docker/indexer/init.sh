#!/usr/bin/env bash
echo "Building indexing application jar"
cd /opt/app/indexer

echo "Packaging the indexer application"
mvn install

echo "Starting indexing...."
java -jar /opt/app/indexer/target/indexer-1.0.jar