package com.motkal.putbowl.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LeagueModel {
    @SerializedName("leagues")
    private List<League> leagues = null;

    public LeagueModel(List<League> leagues) {
        this.leagues = leagues;
    }

    public static class League{
        @SerializedName("idLeague")
        private String idLeague;
        @SerializedName("strLeague")
        private String strLeague;
        @SerializedName("strSport")
        private String strSport;
        @SerializedName("strLeagueAlternate")
        private String strLeagueAlternate;

        public League(String idLeague, String strLeague, String strSport, String strLeagueAlternate) {
            this.idLeague = idLeague;
            this.strLeague = strLeague;
            this.strSport = strSport;
            this.strLeagueAlternate = strLeagueAlternate;
        }

        public String getIdLeague() {
            return idLeague;
        }

        public String getStrLeague() {
            return strLeague;
        }

        public String getStrSport() {
            return strSport;
        }

        public String getStrLeagueAlternate() {
            return strLeagueAlternate;
        }
    }

    public List<League> getLeagues() {
        return leagues;
    }
}
