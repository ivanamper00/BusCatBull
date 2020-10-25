package com.motkal.putbowl.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseCountry {

    @SerializedName("countrys")
    private List<Country> countrys = null;

    public ResponseCountry(List<Country> countrys) {
        this.countrys = countrys;
    }

    public List<Country> getCountrys() {
        return countrys;
    }

    public static class Country{
        @SerializedName("idLeague")
        private String idLeague;
        @SerializedName("idSoccerXML")
        private Object idSoccerXML;
        @SerializedName("idAPIfootball")
        private Object idAPIfootball;
        @SerializedName("strSport")
        private String strSport;
        @SerializedName("strLeague")
        private String strLeague;
        @SerializedName("strLeagueAlternate")
        private String strLeagueAlternate;
        @SerializedName("strDivision")
        private String strDivision;
        @SerializedName("idCup")
        private String idCup;
        @SerializedName("strCurrentSeason")
        private String strCurrentSeason;
        @SerializedName("intFormedYear")
        private String intFormedYear;
        @SerializedName("dateFirstEvent")
        private String dateFirstEvent;
        @SerializedName("strGender")
        private String strGender;
        @SerializedName("strCountry")
        private String strCountry;
        @SerializedName("strWebsite")
        private String strWebsite;
        @SerializedName("strFacebook")
        private String strFacebook;
        @SerializedName("strTwitter")
        private String strTwitter;
        @SerializedName("strYoutube")
        private String strYoutube;
        @SerializedName("strRSS")
        private String strRSS;
        @SerializedName("strDescriptionEN")
        private String strDescriptionEN;
        @SerializedName("strDescriptionDE")
        private String strDescriptionDE;
        @SerializedName("strDescriptionFR")
        private String strDescriptionFR;
        @SerializedName("strDescriptionIT")
        private Object strDescriptionIT;
        @SerializedName("strDescriptionCN")
        private Object strDescriptionCN;
        @SerializedName("strDescriptionJP")
        private Object strDescriptionJP;
        @SerializedName("strDescriptionRU")
        private Object strDescriptionRU;
        @SerializedName("strDescriptionES")
        private Object strDescriptionES;
        @SerializedName("strDescriptionPT")
        private Object strDescriptionPT;
        @SerializedName("strDescriptionSE")
        private Object strDescriptionSE;
        @SerializedName("strDescriptionNL")
        private Object strDescriptionNL;
        @SerializedName("strDescriptionHU")
        private Object strDescriptionHU;
        @SerializedName("strDescriptionNO")
        private Object strDescriptionNO;
        @SerializedName("strDescriptionPL")
        private Object strDescriptionPL;
        @SerializedName("strDescriptionIL")
        private Object strDescriptionIL;
        @SerializedName("strFanart1")
        private String strFanart1;
        @SerializedName("strFanart2")
        private String strFanart2;
        @SerializedName("strFanart3")
        private String strFanart3;
        @SerializedName("strFanart4")
        private String strFanart4;
        @SerializedName("strBanner")
        private String strBanner;
        @SerializedName("strBadge")
        private String strBadge;
        @SerializedName("strLogo")
        private String strLogo;
        @SerializedName("strPoster")
        private String strPoster;
        @SerializedName("strTrophy")
        private String strTrophy;
        @SerializedName("strNaming")
        private String strNaming;
        @SerializedName("strComplete")
        private String strComplete;
        @SerializedName("strLocked")
        private String strLocked;

        public String getIdLeague() {
            return idLeague;
        }

        public Object getIdSoccerXML() {
            return idSoccerXML;
        }

        public Object getIdAPIfootball() {
            return idAPIfootball;
        }

        public String getStrSport() {
            return strSport;
        }

        public String getStrLeague() {
            return strLeague;
        }

        public String getStrLeagueAlternate() {
            return strLeagueAlternate;
        }

        public String getStrDivision() {
            return strDivision;
        }

        public String getIdCup() {
            return idCup;
        }

        public String getStrCurrentSeason() {
            return strCurrentSeason;
        }

        public String getIntFormedYear() {
            return intFormedYear;
        }

        public String getDateFirstEvent() {
            return dateFirstEvent;
        }

        public String getStrGender() {
            return strGender;
        }

        public String getStrCountry() {
            return strCountry;
        }

        public String getStrWebsite() {
            return strWebsite;
        }

        public String getStrFacebook() {
            return strFacebook;
        }

        public String getStrTwitter() {
            return strTwitter;
        }

        public String getStrYoutube() {
            return strYoutube;
        }

        public String getStrRSS() {
            return strRSS;
        }

        public String getStrDescriptionEN() {
            return strDescriptionEN;
        }

        public String getStrDescriptionDE() {
            return strDescriptionDE;
        }

        public String getStrDescriptionFR() {
            return strDescriptionFR;
        }

        public Object getStrDescriptionIT() {
            return strDescriptionIT;
        }

        public Object getStrDescriptionCN() {
            return strDescriptionCN;
        }

        public Object getStrDescriptionJP() {
            return strDescriptionJP;
        }

        public Object getStrDescriptionRU() {
            return strDescriptionRU;
        }

        public Object getStrDescriptionES() {
            return strDescriptionES;
        }

        public Object getStrDescriptionPT() {
            return strDescriptionPT;
        }

        public Object getStrDescriptionSE() {
            return strDescriptionSE;
        }

        public Object getStrDescriptionNL() {
            return strDescriptionNL;
        }

        public Object getStrDescriptionHU() {
            return strDescriptionHU;
        }

        public Object getStrDescriptionNO() {
            return strDescriptionNO;
        }

        public Object getStrDescriptionPL() {
            return strDescriptionPL;
        }

        public Object getStrDescriptionIL() {
            return strDescriptionIL;
        }

        public String getStrFanart1() {
            return strFanart1;
        }

        public String getStrFanart2() {
            return strFanart2;
        }

        public String getStrFanart3() {
            return strFanart3;
        }

        public String getStrFanart4() {
            return strFanart4;
        }

        public String getStrBanner() {
            return strBanner;
        }

        public String getStrBadge() {
            return strBadge;
        }

        public String getStrLogo() {
            return strLogo;
        }

        public String getStrPoster() {
            return strPoster;
        }

        public String getStrTrophy() {
            return strTrophy;
        }

        public String getStrNaming() {
            return strNaming;
        }

        public String getStrComplete() {
            return strComplete;
        }

        public String getStrLocked() {
            return strLocked;
        }

        public Country(String idLeague, Object idSoccerXML, Object idAPIfootball, String strSport, String strLeague, String strLeagueAlternate, String strDivision, String idCup, String strCurrentSeason, String intFormedYear, String dateFirstEvent, String strGender, String strCountry, String strWebsite, String strFacebook, String strTwitter, String strYoutube, String strRSS, String strDescriptionEN, String strDescriptionDE, String strDescriptionFR, Object strDescriptionIT, Object strDescriptionCN, Object strDescriptionJP, Object strDescriptionRU, Object strDescriptionES, Object strDescriptionPT, Object strDescriptionSE, Object strDescriptionNL, Object strDescriptionHU, Object strDescriptionNO, Object strDescriptionPL, Object strDescriptionIL, String strFanart1, String strFanart2, String strFanart3, String strFanart4, String strBanner, String strBadge, String strLogo, String strPoster, String strTrophy, String strNaming, String strComplete, String strLocked) {
            this.idLeague = idLeague;
            this.idSoccerXML = idSoccerXML;
            this.idAPIfootball = idAPIfootball;
            this.strSport = strSport;
            this.strLeague = strLeague;
            this.strLeagueAlternate = strLeagueAlternate;
            this.strDivision = strDivision;
            this.idCup = idCup;
            this.strCurrentSeason = strCurrentSeason;
            this.intFormedYear = intFormedYear;
            this.dateFirstEvent = dateFirstEvent;
            this.strGender = strGender;
            this.strCountry = strCountry;
            this.strWebsite = strWebsite;
            this.strFacebook = strFacebook;
            this.strTwitter = strTwitter;
            this.strYoutube = strYoutube;
            this.strRSS = strRSS;
            this.strDescriptionEN = strDescriptionEN;
            this.strDescriptionDE = strDescriptionDE;
            this.strDescriptionFR = strDescriptionFR;
            this.strDescriptionIT = strDescriptionIT;
            this.strDescriptionCN = strDescriptionCN;
            this.strDescriptionJP = strDescriptionJP;
            this.strDescriptionRU = strDescriptionRU;
            this.strDescriptionES = strDescriptionES;
            this.strDescriptionPT = strDescriptionPT;
            this.strDescriptionSE = strDescriptionSE;
            this.strDescriptionNL = strDescriptionNL;
            this.strDescriptionHU = strDescriptionHU;
            this.strDescriptionNO = strDescriptionNO;
            this.strDescriptionPL = strDescriptionPL;
            this.strDescriptionIL = strDescriptionIL;
            this.strFanart1 = strFanart1;
            this.strFanart2 = strFanart2;
            this.strFanart3 = strFanart3;
            this.strFanart4 = strFanart4;
            this.strBanner = strBanner;
            this.strBadge = strBadge;
            this.strLogo = strLogo;
            this.strPoster = strPoster;
            this.strTrophy = strTrophy;
            this.strNaming = strNaming;
            this.strComplete = strComplete;
            this.strLocked = strLocked;


        }
    }

}
