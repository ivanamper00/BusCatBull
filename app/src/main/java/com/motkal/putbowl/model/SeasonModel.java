package com.motkal.putbowl.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SeasonModel {
    @SerializedName("seasons")
    private List<Season> seasons = null;

        public static class Season{
            @SerializedName("strSeason")
            private String strSeason;

            public Season(String strSeason) {
                this.strSeason = strSeason;
            }

            public String getStrSeason() {
                return strSeason;
            }
        }

    public SeasonModel(List<Season> seasons) {
        this.seasons = seasons;
    }

    public List<Season> getSeasons() {
        return seasons;
    }
}
