#!/usr/bin/env bash

cd ${SOLR_INSTALL}

echo "Starting Solr"
./bin/solr start -c -p 8983 -d ${SOLR_HOME}

mkdir -p ${core1ConfigDir}

echo "Creating core1"
./bin/solr create_collection -c reviews -d sample_techproducts_configs -n reviews-config -s 2 -rf 2

./bin/post -c reviews ${SOLR_HOME}/data/data.csv
