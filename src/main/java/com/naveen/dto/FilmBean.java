package com.naveen.dto;

import org.apache.solr.client.solrj.beans.Field;
import org.json.simple.JSONObject;

import java.io.Serializable;
import java.util.List;

public class FilmBean implements Serializable {

    private final static long serialVersionUID = -5215538800184934785L;

    @Field("id")
    private String id;
    @Field("directed_by")
    private List<String> directedBy = null;
    @Field("initial_release_date")
    private String initialReleaseDate;
    @Field("genre")
    private List<String> genre = null;
    @Field("name")
    private String name;

    public FilmBean(String id, List<String> directedBy, String initialReleaseDate, List<String> genre, String name) {
        this.id = id;
        this.directedBy = directedBy;
        this.initialReleaseDate = initialReleaseDate;
        this.genre = genre;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getDirectedBy() {
        return directedBy;
    }

    public void setDirectedBy(List<String> directedBy) {
        this.directedBy = directedBy;
    }

    public String getInitialReleaseDate() {
        return initialReleaseDate;
    }

    public void setInitialReleaseDate(String initialReleaseDate) {
        this.initialReleaseDate = initialReleaseDate;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

