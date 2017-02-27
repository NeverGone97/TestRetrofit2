package com.example.nut_it.testretrofit2.apiGitHub.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Nut_IT on 2/27/2017.
 */

public class GitHubRepo {
    @SerializedName("latitude")
    @Expose
    private String latitude;

    public String getLatitude() {
        return latitude;
    }
}
