#!/usr/bin/env bash

cd ${SOLR_INSTALL}

echo "Starting Solr"
./bin/solr start -c -p 8983 -d ${SOLR_HOME}

echo "Creating core1"
./bin/solr create_collection -c reviews -d sample_techproducts_configs -n reviews-config -s 2 -rf 2

echo "Building indexing application jar"


echo "Starting indexing...."
java -jar /app/target/indexer-1.0.jar


