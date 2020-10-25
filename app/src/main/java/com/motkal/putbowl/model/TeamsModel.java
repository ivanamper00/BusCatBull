package com.motkal.putbowl.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TeamsModel {

    @SerializedName("teams")
    private List<Teams> teams = null;

    public TeamsModel(List<Teams> teams) {
        this.teams = teams;
    }


    public static class Teams{
        @SerializedName("idTeam")
        private String idTeam;
        @SerializedName("idSoccerXML")
        private String idSoccerXML;
        @SerializedName("idAPIfootball")
        private String idAPIfootball;
        @SerializedName("intLoved")
        private String intLoved;
        @SerializedName("strTeam")
        private String strTeam;
        @SerializedName("strTeamShort")
        private String strTeamShort;
        @SerializedName("strAlternate")
        private String strAlternate;
        @SerializedName("intFormedYear")
        private String intFormedYear;
        @SerializedName("strSport")
        private String strSport;
        @SerializedName("strLeague")
        private String strLeague;
        @SerializedName("idLeague")
        private String idLeague;
        @SerializedName("strLeague2")
        private String strLeague2;
        @SerializedName("idLeague2")
        private String idLeague2;
        @SerializedName("strLeague3")
        private String strLeague3;
        @SerializedName("idLeague3")
        private String idLeague3;
        @SerializedName("strLeague4")
        private String strLeague4;
        @SerializedName("idLeague4")
        private String idLeague4;
        @SerializedName("strLeague5")
        private String strLeague5;
        @SerializedName("idLeague5")
        private String idLeague5;
        @SerializedName("strLeague6")
        private String strLeague6;
        @SerializedName("idLeague6")
        private Object idLeague6;
        @SerializedName("strLeague7")
        private String strLeague7;
        @SerializedName("idLeague7")
        private Object idLeague7;
        @SerializedName("strDivision")
        private Object strDivision;
        @SerializedName("strManager")
        private String strManager;
        @SerializedName("strStadium")
        private String strStadium;
        @SerializedName("strKeywords")
        private String strKeywords;
        @SerializedName("strRSS")
        private String strRSS;
        @SerializedName("strStadiumThumb")
        private String strStadiumThumb;
        @SerializedName("strStadiumDescription")
        private String strStadiumDescription;
        @SerializedName("strStadiumLocation")
        private String strStadiumLocation;
        @SerializedName("intStadiumCapacity")
        private String intStadiumCapacity;
        @SerializedName("strWebsite")
        private String strWebsite;
        @SerializedName("strFacebook")
        private String strFacebook;
        @SerializedName("strTwitter")
        private String strTwitter;
        @SerializedName("strInstagram")
        private String strInstagram;
        @SerializedName("strDescriptionEN")
        private String strDescriptionEN;
        @SerializedName("strGender")
        private String strGender;
        @SerializedName("strCountry")
        private String strCountry;
        @SerializedName("strTeamBadge")
        private String strTeamBadge;
        @SerializedName("strTeamJersey")
        private String strTeamJersey;
        @SerializedName("strTeamLogo")
        private String strTeamLogo;
        @SerializedName("strTeamFanart1")
        private String strTeamFanart1;
        @SerializedName("strTeamFanart2")
        private String strTeamFanart2;
        @SerializedName("strTeamFanart3")
        private String strTeamFanart3;
        @SerializedName("strTeamFanart4")
        private String strTeamFanart4;
        @SerializedName("strTeamBanner")
        private String strTeamBanner;
        @SerializedName("strYoutube")
        private String strYoutube;
        @SerializedName("strLocked")
        private String strLocked;

        public Teams(String idTeam, String idSoccerXML, String idAPIfootball, String intLoved, String strTeam, String strTeamShort, String strAlternate, String intFormedYear, String strSport, String strLeague, String idLeague, String strLeague2, String idLeague2, String strLeague3, String idLeague3, String strLeague4, String idLeague4, String strLeague5, String idLeague5, String strLeague6, Object idLeague6, String strLeague7, Object idLeague7, Object strDivision, String strManager, String strStadium, String strKeywords, String strRSS, String strStadiumThumb, String strStadiumDescription, String strStadiumLocation, String intStadiumCapacity, String strWebsite, String strFacebook, String strTwitter, String strInstagram, String strDescriptionEN, String strGender, String strCountry, String strTeamBadge, String strTeamJersey, String strTeamLogo, String strTeamFanart1, String strTeamFanart2, String strTeamFanart3, String strTeamFanart4, String strTeamBanner, String strYoutube, String strLocked) {
            this.idTeam = idTeam;
            this.idSoccerXML = idSoccerXML;
            this.idAPIfootball = idAPIfootball;
            this.intLoved = intLoved;
            this.strTeam = strTeam;
            this.strTeamShort = strTeamShort;
            this.strAlternate = strAlternate;
            this.intFormedYear = intFormedYear;
            this.strSport = strSport;
            this.strLeague = strLeague;
            this.idLeague = idLeague;
            this.strLeague2 = strLeague2;
            this.idLeague2 = idLeague2;
            this.strLeague3 = strLeague3;
            this.idLeague3 = idLeague3;
            this.strLeague4 = strLeague4;
            this.idLeague4 = idLeague4;
            this.strLeague5 = strLeague5;
            this.idLeague5 = idLeague5;
            this.strLeague6 = strLeague6;
            this.idLeague6 = idLeague6;
            this.strLeague7 = strLeague7;
            this.idLeague7 = idLeague7;
            this.strDivision = strDivision;
            this.strManager = strManager;
            this.strStadium = strStadium;
            this.strKeywords = strKeywords;
            this.strRSS = strRSS;
            this.strStadiumThumb = strStadiumThumb;
            this.strStadiumDescription = strStadiumDescription;
            this.strStadiumLocation = strStadiumLocation;
            this.intStadiumCapacity = intStadiumCapacity;
            this.strWebsite = strWebsite;
            this.strFacebook = strFacebook;
            this.strTwitter = strTwitter;
            this.strInstagram = strInstagram;
            this.strDescriptionEN = strDescriptionEN;
            this.strGender = strGender;
            this.strCountry = strCountry;
            this.strTeamBadge = strTeamBadge;
            this.strTeamJersey = strTeamJersey;
            this.strTeamLogo = strTeamLogo;
            this.strTeamFanart1 = strTeamFanart1;
            this.strTeamFanart2 = strTeamFanart2;
            this.strTeamFanart3 = strTeamFanart3;
            this.strTeamFanart4 = strTeamFanart4;
            this.strTeamBanner = strTeamBanner;
            this.strYoutube = strYoutube;
            this.strLocked = strLocked;
        }

        public String getIdTeam() {
            return idTeam;
        }

        public String getIdSoccerXML() {
            return idSoccerXML;
        }

        public String getIdAPIfootball() {
            return idAPIfootball;
        }

        public String getIntLoved() {
            return intLoved;
        }

        public String getStrTeam() {
            return strTeam;
        }

        public String getStrTeamShort() {
            return strTeamShort;
        }

        public String getStrAlternate() {
            return strAlternate;
        }

        public String getIntFormedYear() {
            return intFormedYear;
        }

        public String getStrSport() {
            return strSport;
        }

        public String getStrLeague() {
            return strLeague;
        }

        public String getIdLeague() {
            return idLeague;
        }

        public String getStrLeague2() {
            return strLeague2;
        }

        public String getIdLeague2() {
            return idLeague2;
        }

        public String getStrLeague3() {
            return strLeague3;
        }

        public String getIdLeague3() {
            return idLeague3;
        }

        public String getStrLeague4() {
            return strLeague4;
        }

        public String getIdLeague4() {
            return idLeague4;
        }

        public String getStrLeague5() {
            return strLeague5;
        }

        public String getIdLeague5() {
            return idLeague5;
        }

        public String getStrLeague6() {
            return strLeague6;
        }

        public Object getIdLeague6() {
            return idLeague6;
        }

        public String getStrLeague7() {
            return strLeague7;
        }

        public Object getIdLeague7() {
            return idLeague7;
        }

        public Object getStrDivision() {
            return strDivision;
        }

        public String getStrManager() {
            return strManager;
        }

        public String getStrStadium() {
            return strStadium;
        }

        public String getStrKeywords() {
            return strKeywords;
        }

        public String getStrRSS() {
            return strRSS;
        }

        public String getStrStadiumThumb() {
            return strStadiumThumb;
        }

        public String getStrStadiumDescription() {
            return strStadiumDescription;
        }

        public String getStrStadiumLocation() {
            return strStadiumLocation;
        }

        public String getIntStadiumCapacity() {
            return intStadiumCapacity;
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

        public String getStrInstagram() {
            return strInstagram;
        }

        public String getStrDescriptionEN() {
            return strDescriptionEN;
        }

        public String getStrGender() {
            return strGender;
        }

        public String getStrCountry() {
            return strCountry;
        }

        public String getStrTeamBadge() {
            return strTeamBadge;
        }

        public String getStrTeamJersey() {
            return strTeamJersey;
        }

        public String getStrTeamLogo() {
            return strTeamLogo;
        }

        public String getStrTeamFanart1() {
            return strTeamFanart1;
        }

        public String getStrTeamFanart2() {
            return strTeamFanart2;
        }

        public String getStrTeamFanart3() {
            return strTeamFanart3;
        }

        public String getStrTeamFanart4() {
            return strTeamFanart4;
        }

        public String getStrTeamBanner() {
            return strTeamBanner;
        }

        public String getStrYoutube() {
            return strYoutube;
        }

        public String getStrLocked() {
            return strLocked;
        }
    }

    public List<Teams> getTeams() {
        return teams;
    }
}
