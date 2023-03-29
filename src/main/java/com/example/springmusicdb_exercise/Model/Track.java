package com.example.springmusicdb_exercise.Model;

public class Track {
    private int track_id;
    private String artist_name;
    private String album_title;
    private String track;
    private int year_of_release;
    private String record_comp;

    public Track() {
    }

    public Track(int track_id, String artist_name, String album_title, String track, int year_of_release, String record_comp) {
        this.track_id = track_id;
        this.artist_name = artist_name;
        this.album_title = album_title;
        this.track = track;
        this.year_of_release = year_of_release;
        this.record_comp = record_comp;
    }

    public int getTrack_id() {
        return track_id;
    }

    public void setTrack_id(int track_id) {
        this.track_id = track_id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getAlbum_title() {
        return album_title;
    }

    public void setAlbum_title(String album_title) {
        this.album_title = album_title;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public int getYear_of_release() {
        return year_of_release;
    }

    public void setYear_of_release(int year_of_release) {
        this.year_of_release = year_of_release;
    }

    public String getRecord_comp() {
        return record_comp;
    }

    public void setRecord_comp(String record_comp) {
        this.record_comp = record_comp;
    }
}
