package com.motkal.putbowl.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EventsModel {
    @SerializedName("events")
    private List<Event> events = null;

    public EventsModel(List<Event> events) {
        this.events = events;
    }

    public static class Event{
        @SerializedName("idEvent")
        private String idEvent;
        @SerializedName("idSoccerXML")
        private Object idSoccerXML;
        @SerializedName("idAPIfootball")
        private String idAPIfootball;
        @SerializedName("strEvent")
        private String strEvent;
        @SerializedName("strEventAlternate")
        private String strEventAlternate;
        @SerializedName("strFilename")
        private String strFilename;
        @SerializedName("strSport")
        private String strSport;
        @SerializedName("idLeague")
        private String idLeague;
        @SerializedName("strLeague")
        private String strLeague;
        @SerializedName("strSeason")
        private String strSeason;
        @SerializedName("strDescriptionEN")
        private String strDescriptionEN;
        @SerializedName("strHomeTeam")
        private String strHomeTeam;
        @SerializedName("strAwayTeam")
        private String strAwayTeam;
        @SerializedName("intHomeScore")
        private String intHomeScore;
        @SerializedName("intRound")
        private String intRound;
        @SerializedName("intAwayScore")
        private String intAwayScore;
        @SerializedName("intSpectators")
        private Object intSpectators;
        @SerializedName("strOfficial")
        private String strOfficial;
        @SerializedName("strHomeGoalDetails")
        private String strHomeGoalDetails;
        @SerializedName("strHomeRedCards")
        private Object strHomeRedCards;
        @SerializedName("strHomeYellowCards")
        private Object strHomeYellowCards;
        @SerializedName("strHomeLineupGoalkeeper")
        private Object strHomeLineupGoalkeeper;
        @SerializedName("strHomeLineupDefense")
        private Object strHomeLineupDefense;
        @SerializedName("strHomeLineupMidfield")
        private Object strHomeLineupMidfield;
        @SerializedName("strHomeLineupForward")
        private Object strHomeLineupForward;
        @SerializedName("strHomeLineupSubstitutes")
        private Object strHomeLineupSubstitutes;
        @SerializedName("strHomeFormation")
        private Object strHomeFormation;
        @SerializedName("strAwayRedCards")
        private Object strAwayRedCards;
        @SerializedName("strAwayYellowCards")
        private Object strAwayYellowCards;
        @SerializedName("strAwayGoalDetails")
        private String strAwayGoalDetails;
        @SerializedName("strAwayLineupGoalkeeper")
        private Object strAwayLineupGoalkeeper;
        @SerializedName("strAwayLineupDefense")
        private Object strAwayLineupDefense;
        @SerializedName("strAwayLineupMidfield")
        private Object strAwayLineupMidfield;
        @SerializedName("strAwayLineupForward")
        private Object strAwayLineupForward;
        @SerializedName("strAwayLineupSubstitutes")
        private Object strAwayLineupSubstitutes;
        @SerializedName("strAwayFormation")
        private Object strAwayFormation;
        @SerializedName("intHomeShots")
        private Object intHomeShots;
        @SerializedName("intAwayShots")
        private Object intAwayShots;
        @SerializedName("strTimestamp")
        private String strTimestamp;
        @SerializedName("dateEvent")
        private String dateEvent;
        @SerializedName("dateEventLocal")
        private String dateEventLocal;
        @SerializedName("strDate")
        private Object strDate;
        @SerializedName("strTime")
        private String strTime;
        @SerializedName("strTimeLocal")
        private String strTimeLocal;
        @SerializedName("strTVStation")
        private Object strTVStation;
        @SerializedName("idHomeTeam")
        private String idHomeTeam;
        @SerializedName("idAwayTeam")
        private String idAwayTeam;
        @SerializedName("strResult")
        private String strResult;
        @SerializedName("strVenue")
        private String strVenue;
        @SerializedName("strCountry")
        private String strCountry;
        @SerializedName("strCity")
        private String strCity;
        @SerializedName("strPoster")
        private Object strPoster;
        @SerializedName("strFanart")
        private Object strFanart;
        @SerializedName("strThumb")
        private String strThumb;
        @SerializedName("strBanner")
        private Object strBanner;
        @SerializedName("strMap")
        private Object strMap;
        @SerializedName("strTweet1")
        private String strTweet1;
        @SerializedName("strTweet2")
        private String strTweet2;
        @SerializedName("strTweet3")
        private String strTweet3;
        @SerializedName("strVideo")
        private String strVideo;
        @SerializedName("strStatus")
        private String strStatus;
        @SerializedName("strPostponed")
        private String strPostponed;
        @SerializedName("strLocked")
        private String strLocked;

        public Event(String idEvent, Object idSoccerXML, String idAPIfootball, String strEvent, String strEventAlternate, String strFilename, String strSport, String idLeague, String strLeague, String strSeason, String strDescriptionEN, String strHomeTeam, String strAwayTeam, String intHomeScore, String intRound, String intAwayScore, Object intSpectators, String strOfficial, String strHomeGoalDetails, Object strHomeRedCards, Object strHomeYellowCards, Object strHomeLineupGoalkeeper, Object strHomeLineupDefense, Object strHomeLineupMidfield, Object strHomeLineupForward, Object strHomeLineupSubstitutes, Object strHomeFormation, Object strAwayRedCards, Object strAwayYellowCards, String strAwayGoalDetails, Object strAwayLineupGoalkeeper, Object strAwayLineupDefense, Object strAwayLineupMidfield, Object strAwayLineupForward, Object strAwayLineupSubstitutes, Object strAwayFormation, Object intHomeShots, Object intAwayShots, String strTimestamp, String dateEvent, String dateEventLocal, Object strDate, String strTime, String strTimeLocal, Object strTVStation, String idHomeTeam, String idAwayTeam, String strResult, String strVenue, String strCountry, String strCity, Object strPoster, Object strFanart, String strThumb, Object strBanner, Object strMap, String strTweet1, String strTweet2, String strTweet3, String strVideo, String strStatus, String strPostponed, String strLocked) {
            this.idEvent = idEvent;
            this.idSoccerXML = idSoccerXML;
            this.idAPIfootball = idAPIfootball;
            this.strEvent = strEvent;
            this.strEventAlternate = strEventAlternate;
            this.strFilename = strFilename;
            this.strSport = strSport;
            this.idLeague = idLeague;
            this.strLeague = strLeague;
            this.strSeason = strSeason;
            this.strDescriptionEN = strDescriptionEN;
            this.strHomeTeam = strHomeTeam;
            this.strAwayTeam = strAwayTeam;
            this.intHomeScore = intHomeScore;
            this.intRound = intRound;
            this.intAwayScore = intAwayScore;
            this.intSpectators = intSpectators;
            this.strOfficial = strOfficial;
            this.strHomeGoalDetails = strHomeGoalDetails;
            this.strHomeRedCards = strHomeRedCards;
            this.strHomeYellowCards = strHomeYellowCards;
            this.strHomeLineupGoalkeeper = strHomeLineupGoalkeeper;
            this.strHomeLineupDefense = strHomeLineupDefense;
            this.strHomeLineupMidfield = strHomeLineupMidfield;
            this.strHomeLineupForward = strHomeLineupForward;
            this.strHomeLineupSubstitutes = strHomeLineupSubstitutes;
            this.strHomeFormation = strHomeFormation;
            this.strAwayRedCards = strAwayRedCards;
            this.strAwayYellowCards = strAwayYellowCards;
            this.strAwayGoalDetails = strAwayGoalDetails;
            this.strAwayLineupGoalkeeper = strAwayLineupGoalkeeper;
            this.strAwayLineupDefense = strAwayLineupDefense;
            this.strAwayLineupMidfield = strAwayLineupMidfield;
            this.strAwayLineupForward = strAwayLineupForward;
            this.strAwayLineupSubstitutes = strAwayLineupSubstitutes;
            this.strAwayFormation = strAwayFormation;
            this.intHomeShots = intHomeShots;
            this.intAwayShots = intAwayShots;
            this.strTimestamp = strTimestamp;
            this.dateEvent = dateEvent;
            this.dateEventLocal = dateEventLocal;
            this.strDate = strDate;
            this.strTime = strTime;
            this.strTimeLocal = strTimeLocal;
            this.strTVStation = strTVStation;
            this.idHomeTeam = idHomeTeam;
            this.idAwayTeam = idAwayTeam;
            this.strResult = strResult;
            this.strVenue = strVenue;
            this.strCountry = strCountry;
            this.strCity = strCity;
            this.strPoster = strPoster;
            this.strFanart = strFanart;
            this.strThumb = strThumb;
            this.strBanner = strBanner;
            this.strMap = strMap;
            this.strTweet1 = strTweet1;
            this.strTweet2 = strTweet2;
            this.strTweet3 = strTweet3;
            this.strVideo = strVideo;
            this.strStatus = strStatus;
            this.strPostponed = strPostponed;
            this.strLocked = strLocked;
        }

        public String getIdEvent() {
            return idEvent;
        }

        public Object getIdSoccerXML() {
            return idSoccerXML;
        }

        public String getIdAPIfootball() {
            return idAPIfootball;
        }

        public String getStrEvent() {
            return strEvent;
        }

        public String getStrEventAlternate() {
            return strEventAlternate;
        }

        public String getStrFilename() {
            return strFilename;
        }

        public String getStrSport() {
            return strSport;
        }

        public String getIdLeague() {
            return idLeague;
        }

        public String getStrLeague() {
            return strLeague;
        }

        public String getStrSeason() {
            return strSeason;
        }

        public String getStrDescriptionEN() {
            return strDescriptionEN;
        }

        public String getStrHomeTeam() {
            return strHomeTeam;
        }

        public String getStrAwayTeam() {
            return strAwayTeam;
        }

        public String getIntHomeScore() {
            return intHomeScore;
        }

        public String getIntRound() {
            return intRound;
        }

        public String getIntAwayScore() {
            return intAwayScore;
        }

        public Object getIntSpectators() {
            return intSpectators;
        }

        public String getStrOfficial() {
            return strOfficial;
        }

        public String getStrHomeGoalDetails() {
            return strHomeGoalDetails;
        }

        public Object getStrHomeRedCards() {
            return strHomeRedCards;
        }

        public Object getStrHomeYellowCards() {
            return strHomeYellowCards;
        }

        public Object getStrHomeLineupGoalkeeper() {
            return strHomeLineupGoalkeeper;
        }

        public Object getStrHomeLineupDefense() {
            return strHomeLineupDefense;
        }

        public Object getStrHomeLineupMidfield() {
            return strHomeLineupMidfield;
        }

        public Object getStrHomeLineupForward() {
            return strHomeLineupForward;
        }

        public Object getStrHomeLineupSubstitutes() {
            return strHomeLineupSubstitutes;
        }

        public Object getStrHomeFormation() {
            return strHomeFormation;
        }

        public Object getStrAwayRedCards() {
            return strAwayRedCards;
        }

        public Object getStrAwayYellowCards() {
            return strAwayYellowCards;
        }

        public String getStrAwayGoalDetails() {
            return strAwayGoalDetails;
        }

        public Object getStrAwayLineupGoalkeeper() {
            return strAwayLineupGoalkeeper;
        }

        public Object getStrAwayLineupDefense() {
            return strAwayLineupDefense;
        }

        public Object getStrAwayLineupMidfield() {
            return strAwayLineupMidfield;
        }

        public Object getStrAwayLineupForward() {
            return strAwayLineupForward;
        }

        public Object getStrAwayLineupSubstitutes() {
            return strAwayLineupSubstitutes;
        }

        public Object getStrAwayFormation() {
            return strAwayFormation;
        }

        public Object getIntHomeShots() {
            return intHomeShots;
        }

        public Object getIntAwayShots() {
            return intAwayShots;
        }

        public String getStrTimestamp() {
            return strTimestamp;
        }

        public String getDateEvent() {
            return dateEvent;
        }

        public String getDateEventLocal() {
            return dateEventLocal;
        }

        public Object getStrDate() {
            return strDate;
        }

        public String getStrTime() {
            return strTime;
        }

        public String getStrTimeLocal() {
            return strTimeLocal;
        }

        public Object getStrTVStation() {
            return strTVStation;
        }

        public String getIdHomeTeam() {
            return idHomeTeam;
        }

        public String getIdAwayTeam() {
            return idAwayTeam;
        }

        public String getStrResult() {
            return strResult;
        }

        public String getStrVenue() {
            return strVenue;
        }

        public String getStrCountry() {
            return strCountry;
        }

        public String getStrCity() {
            return strCity;
        }

        public Object getStrPoster() {
            return strPoster;
        }

        public Object getStrFanart() {
            return strFanart;
        }

        public String getStrThumb() {
            return strThumb;
        }

        public Object getStrBanner() {
            return strBanner;
        }

        public Object getStrMap() {
            return strMap;
        }

        public String getStrTweet1() {
            return strTweet1;
        }

        public String getStrTweet2() {
            return strTweet2;
        }

        public String getStrTweet3() {
            return strTweet3;
        }

        public String getStrVideo() {
            return strVideo;
        }

        public String getStrStatus() {
            return strStatus;
        }

        public String getStrPostponed() {
            return strPostponed;
        }

        public String getStrLocked() {
            return strLocked;
        }
    }

    public List<Event> getEvents() {
        return events;
    }
}
