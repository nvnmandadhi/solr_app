package com.naveen.api;

import com.naveen.dto.FilmBean;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class SolrIndexBuilder {
    private static final Logger LOGGER = Logger.getLogger(SolrIndexBuilder.class.getName());

    public static void main(String[] args) throws Exception {
        LOGGER.info("Using already running Solr nodes");

        final HttpSolrClient solr = getSolrClient();

        final File file = new File("/Users/Naveen/IdeaProjects/solr_app/docker/indexer/films.json");
        final List<FilmBean> reviewDataBeans = loadBeans(file);

        LOGGER.info("Documents count to index: " + reviewDataBeans.size());

        solr.addBeans("films", reviewDataBeans);
        solr.commit("films");
    }

    private static HttpSolrClient getSolrClient() {
        return new HttpSolrClient.Builder("http://solr:8983/solr")
                .withConnectionTimeout(10000)
                .withSocketTimeout(60000)
                .build();
    }

    private static List<FilmBean> loadBeans(File file) throws Exception {
        final JSONParser parser = new JSONParser();
        List<FilmBean> dataBeans = new ArrayList<>();

        try (final FileReader reader = new FileReader(file)) {
            final Object parse = parser.parse(reader);
            JSONArray films = (JSONArray) parse;
            final Object collect = films.stream().map(film -> parseFilmObject((JSONObject) film)).collect(Collectors.toList());
            dataBeans = (List<FilmBean>) collect;
        } catch (final Exception e) {
            //
        }
        return dataBeans;
    }

    private static FilmBean parseFilmObject(JSONObject film) {
        String id = (String) film.get("id");

        List<String> directed_by = (List<String>) film.get("directed_by");

        String lastName = (String) film.get("initial_release_date");

        List<String> website = (List<String>) film.get("genre");
        String name = (String) film.get("name");

        return new FilmBean(id, directed_by, lastName, website, name);

    }

}
