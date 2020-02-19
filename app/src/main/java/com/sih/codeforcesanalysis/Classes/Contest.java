package com.sih.codeforcesanalysis.Classes;

import com.google.gson.annotations.SerializedName;

public class Contest {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("type")
    private String type;
    @SerializedName("phase")
    private String phase;
    @SerializedName("frozen")
    private boolean frozen;
    @SerializedName("durationSeconds")
    private int durationSeconds;
    @SerializedName("startTimeSeconds")
    private int startTimeSeconds;
    @SerializedName("relativeTimeSeconds")
    private int relativeTimeSeconds;
    @SerializedName("preparedBy")
    private String preparedBy;
    @SerializedName("websiteUrl")
    private String websiteUrl;
    @SerializedName("description")
    private String description;
    @SerializedName("kind")
    private String kind;
    @SerializedName("icpcRegion")
    private String icpcRegion;
    @SerializedName("country")
    private String country;
    @SerializedName("city")
    private String city;
    @SerializedName("season")
    private String season;
    @SerializedName("difficulty")
    private int difficulty;

    public Contest() {
    }

    public Contest(int id, String name, String type, String phase, boolean frozen, int durationSeconds, int startTimeSeconds, int relativeTimeSeconds, String preparedBy, String websiteUrl, String description, String kind, String icpcRegion, String country, String city, String season, int difficulty) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.phase = phase;
        this.frozen = frozen;
        this.durationSeconds = durationSeconds;
        this.startTimeSeconds = startTimeSeconds;
        this.relativeTimeSeconds = relativeTimeSeconds;
        this.preparedBy = preparedBy;
        this.websiteUrl = websiteUrl;
        this.description = description;
        this.kind = kind;
        this.icpcRegion = icpcRegion;
        this.country = country;
        this.city = city;
        this.season = season;
        this.difficulty = difficulty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public int getStartTimeSeconds() {
        return startTimeSeconds;
    }

    public void setStartTimeSeconds(int startTimeSeconds) {
        this.startTimeSeconds = startTimeSeconds;
    }

    public int getRelativeTimeSeconds() {
        return relativeTimeSeconds;
    }

    public void setRelativeTimeSeconds(int relativeTimeSeconds) {
        this.relativeTimeSeconds = relativeTimeSeconds;
    }

    public String getPreparedBy() {
        return preparedBy;
    }

    public void setPreparedBy(String preparedBy) {
        this.preparedBy = preparedBy;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getIcpcRegion() {
        return icpcRegion;
    }

    public void setIcpcRegion(String icpcRegion) {
        this.icpcRegion = icpcRegion;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}
