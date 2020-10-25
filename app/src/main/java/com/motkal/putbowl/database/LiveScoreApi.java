package com.motkal.putbowl.database;

import com.motkal.putbowl.model.LiveScoreModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface LiveScoreApi {
    String BASE_URL = "https://www.scorebat.com/video-api/";


    @GET("v1")
    Call<List<LiveScoreModel>> getLiveGames();
}
