package com.example.nut_it.testretrofit2.apiGitHub.service;

import com.example.nut_it.testretrofit2.apiGitHub.model.GitHubRepo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Nut_IT on 2/27/2017.
 */

public interface GitHubClient {
    @GET("api/4.2/place")
    Call<List<GitHubRepo>> getAllProduct();
}
