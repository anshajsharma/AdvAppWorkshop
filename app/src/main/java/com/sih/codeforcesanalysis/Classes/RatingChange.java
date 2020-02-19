package com.sih.codeforcesanalysis.Classes;

import com.google.gson.annotations.SerializedName;

public class RatingChange {

//    contestId	Integer.
//    contestName	String. Localized.
//    handle	String. Codeforces user handle.
//    rank	Integer. Place of the user in the contest. This field contains user rank on the moment of rating update. If afterwards rank changes (e.g. someone get disqualified), this field will not be update and will contain old rank.
//    ratingUpdateTimeSeconds	Integer. Time, when rating for the contest was update, in unix-format.
//    oldRating	Integer. User rating before the contest.
//    newRating	Integer. User rating after the contest.

    @SerializedName("contestId")
    private int contestId;

    @SerializedName("contestName")
    private String contestName;

    @SerializedName("handle")
    private String handle;

    @SerializedName("rank")
    private int rank;

    @SerializedName("ratingUpdateTimeSeconds")
    private int ratingUpdateTimeSeconds;

    @SerializedName("oldRating")
    private int oldRating;

    @SerializedName("newRating")
    private int newRating;

    public RatingChange() {
    }

    public RatingChange(int contestId, String contestName, String handle, int rank, int ratingUpdateTimeSeconds, int oldRating, int newRating) {
        this.contestId = contestId;
        this.contestName = contestName;
        this.handle = handle;
        this.rank = rank;
        this.ratingUpdateTimeSeconds = ratingUpdateTimeSeconds;
        this.oldRating = oldRating;
        this.newRating = newRating;
    }

    public int getContestId() {
        return contestId;
    }

    public void setContestId(int contestId) {
        this.contestId = contestId;
    }

    public String getContestName() {
        return contestName;
    }

    public void setContestName(String contestName) {
        this.contestName = contestName;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRatingUpdateTimeSeconds() {
        return ratingUpdateTimeSeconds;
    }

    public void setRatingUpdateTimeSeconds(int ratingUpdateTimeSeconds) {
        this.ratingUpdateTimeSeconds = ratingUpdateTimeSeconds;
    }

    public int getOldRating() {
        return oldRating;
    }

    public void setOldRating(int oldRating) {
        this.oldRating = oldRating;
    }

    public int getNewRating() {
        return newRating;
    }

    public void setNewRating(int newRating) {
        this.newRating = newRating;
    }
}
