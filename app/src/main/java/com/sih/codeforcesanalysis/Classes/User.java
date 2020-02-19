package com.sih.codeforcesanalysis.Classes;

import com.google.gson.annotations.SerializedName;
import com.sih.codeforcesanalysis.R;
import com.sih.codeforcesanalysis.ViewOrCompareProfile;
import com.squareup.picasso.Picasso;

import java.io.Serializable;

@SuppressWarnings("serial") //With this annotation we are going to hide compiler warnings
public class User implements Serializable {
    @SerializedName("handle")
    private String handle;

    @SerializedName("email")
    private String email;

    @SerializedName("vkId")
    private String vkId;

    @SerializedName("openId")
    private String openId;

    @SerializedName("firstName")
    private String firstName;

    @SerializedName("lastName")
    private String lastName;

    @SerializedName("country")
    private String country;

    @SerializedName("city")
    private String city;

    @SerializedName("organization")
    private String organization;

    @SerializedName("contribution")
    private String contribution;

    @SerializedName("rank")
    private String rank;

    @SerializedName("rating")
    private Integer rating;

    @SerializedName("maxRank")
    private String maxRank;

    @SerializedName("maxRating")
    private Integer maxRating;

    @SerializedName("lastOnlineTimeSeconds")
    private Integer lastOnlineTimeSeconds;

    @SerializedName("registrationTimeSeconds")
    private Integer registrationTimeSeconds;

    @SerializedName("friendOfCount")
    private Integer friendOfCount;

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("titlePhoto")
    private String titlePhoto;

    public User() {
    }


    public User(String handle, String email, String vkId, String openId, String thirdName, String lastName, String country, String city, String organization, String contribution, String rank, Integer rating, String maxRank, Integer maxRating, Integer lastOnlineTimeSeconds, Integer registrationTimeSeconds, Integer friendOfCount, String avatar, String titlePhoto) {
        this.handle = handle;
        this.email = email;
        this.vkId = vkId;
        this.openId = openId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.city = city;
        this.organization = organization;
        this.contribution = contribution;
        this.rank = rank;
        this.rating = rating;
        this.maxRank = maxRank;
        this.maxRating = maxRating;
        this.lastOnlineTimeSeconds = lastOnlineTimeSeconds;
        this.registrationTimeSeconds = registrationTimeSeconds;
        this.friendOfCount = friendOfCount;
        this.avatar = avatar;
        this.titlePhoto = titlePhoto;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVkId() {
        return vkId;
    }

    public void setVkId(String vkId) {
        this.vkId = vkId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getContribution() {
        return contribution;
    }

    public void setContribution(String contribution) {
        this.contribution = contribution;
    }

    public String getRank() {
        return rank;
    }



    public void setRank(String rank) {
        this.rank = rank;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getMaxRank() {
        return maxRank;
    }

    public void setMaxRank(String maxRank) {
        this.maxRank = maxRank;
    }

    public Integer getMaxRating() {
        return maxRating;
    }

    public void setMaxRating(Integer maxRating) {
        this.maxRating = maxRating;
    }

    public Integer getLastOnlineTimeSeconds() {
        return lastOnlineTimeSeconds;
    }

    public void setLastOnlineTimeSeconds(Integer lastOnlineTimeSeconds) {
        this.lastOnlineTimeSeconds = lastOnlineTimeSeconds;
    }

    public Integer getRegistrationTimeSeconds() {
        return registrationTimeSeconds;
    }

    public void setRegistrationTimeSeconds(Integer registrationTimeSeconds) {
        this.registrationTimeSeconds = registrationTimeSeconds;
    }

    public Integer getFriendOfCount() {
        return friendOfCount;
    }

    public void setFriendOfCount(Integer friendOfCount) {
        this.friendOfCount = friendOfCount;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getTitlePhoto() {
        return titlePhoto;
    }

    public void setTitlePhoto(String titlePhoto) {
        this.titlePhoto = titlePhoto;
    }
}