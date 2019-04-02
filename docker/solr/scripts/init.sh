#!/usr/bin/env bash

cd ${SOLR_INSTALL}

echo "Starting Solr"
./bin/solr start -c -p 8983 -f "$@" -d ${SOLR_HOME}

echo "Creating core1"
./bin/solr create_collection -c reviews -d sample_techproducts_configs -n reviews-config -s 2 -rf 2


