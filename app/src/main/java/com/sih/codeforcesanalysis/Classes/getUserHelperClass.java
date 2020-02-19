package com.sih.codeforcesanalysis.Classes;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class getUserHelperClass {
    @SerializedName("status")
    private String status;

    @SerializedName("result")
    private List<User> result;

    public getUserHelperClass(String status, List<User> result) {
        this.status = status;
        this.result = result;
    }

    public getUserHelperClass() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<User> getResult() {
        return result;
    }

    public void setResult(List<User> result) {
        this.result = result;
    }
}
