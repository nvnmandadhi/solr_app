import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;

public class Review implements Serializable {

    @Field("id")
    private String id;
    @Field
    private String date;
    @Field
    private String dateAdded;
    @Field
    private String dateSeeen;
    @Field
    private String didPurchase;
    @Field
    private String doRecommend;
    @Field
    private String numHelpful;
    @Field
    private String rating;
    @Field
    private String sourceURLs;
    @Field
    private String text;
    @Field
    private String title;
    @Field
    private String userCity;
    @Field
    private String userProvince;
    @Field
    private String username;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getDateSeeen() {
        return dateSeeen;
    }

    public void setDateSeeen(String dateSeeen) {
        this.dateSeeen = dateSeeen;
    }

    public String getDidPurchase() {
        return didPurchase;
    }

    public void setDidPurchase(String didPurchase) {
        this.didPurchase = didPurchase;
    }

    public String getDoRecommend() {
        return doRecommend;
    }

    public void setDoRecommend(String doRecommend) {
        this.doRecommend = doRecommend;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumHelpful() {
        return numHelpful;
    }

    public void setNumHelpful(String numHelpful) {
        this.numHelpful = numHelpful;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSourceURLs() {
        return sourceURLs;
    }

    public void setSourceURLs(String sourceURLs) {
        this.sourceURLs = sourceURLs;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
