import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.CloudSolrClient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SolrIndexBuilder {
    private static final Logger LOGGER = Logger.getLogger(SolrIndexBuilder.class.getName());

    public static void main(String[] args) throws Exception {
        LOGGER.info("Using already running Solr nodes");
        final SolrClient solr = new CloudSolrClient.Builder().withSolrUrl("http://localhost:8983/solr").build();

        final List<ReviewDataBean> reviewDataBeans = loadBeans(new File("/opt/app/indexer/data.csv"));

        LOGGER.info("Documents count to index: " + reviewDataBeans.size());
        solr.addBeans(reviewDataBeans);
        solr.commit();
    }

    private static List<ReviewDataBean> loadBeans(File file) throws Exception {
        final Pattern pattern = Pattern.compile(",");
        try (final BufferedReader input = new BufferedReader(new FileReader(file))) {
            return input.lines()
                    .skip(1)
                    .map(line -> {
                        final String[] split = pattern.split(line);
                        return new ReviewDataBean(
                                split[0],
                                split[1],
                                split[2],
                                split[3],
                                split[4],
                                split[5],
                                split[6],
                                split[7],
                                split[8],
                                split[9],
                                split[10],
                                split[11],
                                split[12],
                                split[13],
                                split[14],
                                split[15],
                                split[16],
                                split[17],
                                split[18],
                                split[19],
                                split[20]);
                    }).collect(Collectors.toList());
        }
    }
}
