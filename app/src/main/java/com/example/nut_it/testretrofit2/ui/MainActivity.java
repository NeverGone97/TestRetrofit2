package com.example.nut_it.testretrofit2.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.nut_it.testretrofit2.R;
import com.example.nut_it.testretrofit2.adapter.Adapter;
import com.example.nut_it.testretrofit2.apiGitHub.model.GitHubRepo;
import com.example.nut_it.testretrofit2.apiGitHub.service.GitHubClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView listView= (ListView) findViewById(R.id.paginationList);
        Retrofit.Builder builder=new Retrofit.Builder().baseUrl("http://bwhere.vn/")
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit=builder.build();
        GitHubClient client=retrofit.create(GitHubClient.class);
        Call<List<GitHubRepo>>call=client.getAllProduct();
        call.enqueue(new Callback<List<GitHubRepo>>() {
            @Override
            public void onResponse(Call<List<GitHubRepo>> call, Response<List<GitHubRepo>> response) {
                List<GitHubRepo> repos=response.body();
                listView.setAdapter(new Adapter(MainActivity.this,repos));
            }

            @Override
            public void onFailure(Call<List<GitHubRepo>> call, Throwable t) {

            }
        });
        }
}
