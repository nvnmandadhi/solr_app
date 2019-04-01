import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.util.List;

public class ReviewDataBean implements Serializable {

    @Field("id")
    private String id;
    @Field
    private String name;
    @Field
    private String asins;
    @Field
    private String brand;
    @Field
    private String categories;
    @Field
    private String keys;
    @Field
    private String manufacturer;

    @Field("review_id")
    private String review_id;
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

    public ReviewDataBean(String id, String name, String asins, String brand, String categories, String keys, String review_id, String date, String dateAdded, String dateSeeen, String didPurchase, String doRecommend, String numHelpful, String rating, String sourceURLs, String text, String title, String userCity, String userProvince, String username, String manufacturer) {
        this.id = id;
        this.name = name;
        this.asins = asins;
        this.brand = brand;
        this.categories = categories;
        this.keys = keys;
        this.review_id = review_id;
        this.date = date;
        this.dateAdded = dateAdded;
        this.dateSeeen = dateSeeen;
        this.didPurchase = didPurchase;
        this.doRecommend = doRecommend;
        this.numHelpful = numHelpful;
        this.rating = rating;
        this.sourceURLs = sourceURLs;
        this.text = text;
        this.title = title;
        this.userCity = userCity;
        this.userProvince = userProvince;
        this.username = username;
        this.manufacturer = manufacturer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAsins() {
        return asins;
    }

    public void setAsins(String asins) {
        this.asins = asins;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getReview_id() {
        return review_id;
    }

    public void setReview_id(String review_id) {
        this.review_id = review_id;
    }

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
