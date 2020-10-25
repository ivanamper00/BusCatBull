package com.motkal.putbowl.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LiveScoreModel {
    @SerializedName("title")
    private String title;
    @SerializedName("embed")
    private String embed;
    @SerializedName("url")
    private String url;
    @SerializedName("thumbnail")
    private String thumbnail;
    @SerializedName("date")
    private String date;
    @SerializedName("side1")
    private Side side1;
    @SerializedName("side2")
    private Side side2;
    @SerializedName("competition")
    private Competition competition;
    @SerializedName("videos")
    private List<Video> videos = null;

        public static class Competition{
            @SerializedName("name")
            private String name;
            @SerializedName("id")
            private Integer id;
            @SerializedName("url")
            private String url;

                public Competition(String name, Integer id, String url) {
                    this.name = name;
                    this.id = id;
                    this.url = url;
                }

            public String getName() {
                return name;
            }

            public Integer getId() {
                return id;
            }

            public String getUrl() {
                return url;
            }
        }

        public static class Video{
            @SerializedName("title")
            private String title;
            @SerializedName("embed")
            private String embed;

                public Video(String title, String embed) {
                    this.title = title;
                    this.embed = embed;
                }

            public String getTitle() {
                return title;
            }

            public String getEmbed() {
                return embed;
            }
        }
        public static class Side{
            @SerializedName("name")
            private String name;
            @SerializedName("url")
            private String url;

                public Side(String name, String url) {
                    this.name = name;
                    this.url = url;
                }

            public String getName() {
                return name;
            }

            public String getUrl() {
                return url;
            }
        }

        public LiveScoreModel(String title, String embed, String url, String thumbnail, String date, Side side1, Side side2, Competition competition, List<Video> videos) {
            this.title = title;
            this.embed = embed;
            this.url = url;
            this.thumbnail = thumbnail;
            this.date = date;
            this.side1 = side1;
            this.side2 = side2;
            this.competition = competition;
            this.videos = videos;
        }

    public String getTitle() {
        return title;
    }

    public String getEmbed() {
        return embed;
    }

    public String getUrl() {
        return url;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getDate() {
        return date;
    }

    public Side getSide1() {
        return side1;
    }

    public Side getSide2() {
        return side2;
    }

    public Competition getCompetition() {
        return competition;
    }

    public List<Video> getVideos() {
        return videos;
    }
}
