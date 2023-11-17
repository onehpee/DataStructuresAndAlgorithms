package org.example.model;

public class Song {
    public String title;
    public String artist;

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
