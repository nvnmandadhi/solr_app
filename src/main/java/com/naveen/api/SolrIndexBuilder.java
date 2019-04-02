package com.naveen.api;

import com.naveen.dto.ReviewDataBean;
import org.apache.solr.client.solrj.impl.HttpSolrClient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URLEncoder;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SolrIndexBuilder {
    private static final Logger LOGGER = Logger.getLogger(SolrIndexBuilder.class.getName());

    public static void main(String[] args) throws Exception {
        LOGGER.info("Using already running Solr nodes");

        final HttpSolrClient solr = getSolrClient();

        final File file = new File("/Users/Naveen/IdeaProjects/solr_app/docker/indexer/data.csv");
        final List<ReviewDataBean> reviewDataBeans = loadBeans(file);

        LOGGER.info("Documents count to index: " + reviewDataBeans.size());

        solr.addBeans("reviews", reviewDataBeans);
        solr.commit("reviews");
    }

    private static HttpSolrClient getSolrClient() {
        return new HttpSolrClient.Builder("http://localhost:8983/solr")
                .withConnectionTimeout(10000)
                .withSocketTimeout(60000)
                .build();
    }

    private static List<ReviewDataBean> loadBeans(File file) throws Exception {
        final Pattern pattern = Pattern.compile(",");
        try (final BufferedReader input = new BufferedReader(new FileReader(file))) {
            return input.lines()
                    .skip(1)
                    .map(line -> {
                        final String s = line.replaceAll("\"", "");
                        final String[] split = pattern.split(s);
                        final String id = getVal(0, split);
                        final String name = getVal(1, split);;
                        final String asins = getVal(2, split);;
                        final String brand = getVal(3, split);;
                        final String categories = getVal(4, split);;
                        final String keys = getVal(5, split);;
                        final String review_id = getVal(6, split);;
                        final String date = getVal(7, split);;
                        final String dateAdded = getVal(8, split);;
                        final String dateSeeen = getVal(9, split);;
                        final String didPurchase = getVal(10, split);;
                        final String doRecommend = getVal(11, split);;
                        final String numHelpful = getVal(12, split);;
                        final String rating = getVal(13, split);;
                        final String sourceURLs = getVal(14, split);;
                        final String text = getVal(15, split);;
                        final String title = getVal(16, split);;
                        final String userCity = getVal(17, split);;
                        final String userProvince = getVal(18, split);;
                        final String username = getVal(19, split);;
                        final String manufacturer = getVal(20, split);;
                        return new ReviewDataBean(
                                id,
                                name,
                                asins,
                                brand,
                                categories,
                                keys,
                                review_id,
                                date,
                                dateAdded,
                                dateSeeen,
                                didPurchase,
                                doRecommend,
                                numHelpful,
                                rating,
                                sourceURLs,
                                text,
                                title,
                                userCity,
                                userProvince,
                                username,
                                manufacturer);
                    }).collect(Collectors.toList());
        }
    }

    public static String getVal(final int index, final String[] split) {
        if(split.length <= index) {
            return null;
        }
        return split[index];
    }
}
