package com.example.musicplayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Music {
    private int id;
    private String name;
    private String artist;
    private int coverResId;
    private int artistResId;
    private int musicFileResId;

    public int getMusicFileResId() {
        return musicFileResId;
    }

    public void setMusicFileResId(int musicFileResId) {
        this.musicFileResId = musicFileResId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getCoverResId() {
        return coverResId;
    }

    public void setCoverResId(int coverResId) {
        this.coverResId = coverResId;
    }

    public int getArtistResId() {
        return artistResId;
    }

    public void setArtistResId(int artistResId) {
        this.artistResId = artistResId;
    }
    public static List<Music> getList(){
        List<Music> musicList=new ArrayList<>();
        Music music1=new Music();
        music1.setArtist("Tones and I");
        music1.setName("Dance Monkey");
        music1.setCoverResId(R.drawable.tonesandicover);
        music1.setArtistResId(R.drawable.tonesandi);
        music1.setMusicFileResId(R.raw.music_1);

        Music music2=new Music();
        music2.setArtist("Imagine Dragons");
        music2.setName("Thunder");
        music2.setCoverResId(R.drawable.imaginedragonscover);
        music2.setArtistResId(R.drawable.imaginedragons);
        music2.setMusicFileResId(R.raw.music_2);

        Music music3=new Music();
        music3.setArtist("Ed Sheeran");
        music3.setName("Shape of You");
        music3.setCoverResId(R.drawable.edsheerancover);
        music3.setArtistResId(R.drawable.edsheeran);
        music3.setMusicFileResId(R.raw.music_3);

        musicList.add(music1);
        musicList.add(music2);
        musicList.add(music3);
        return  musicList;
    }
    public static String convertMillisToString(long durationInMillis){
        long second = (durationInMillis / 1000) % 60;
        long minute = ((durationInMillis/1000) / 60) % 60;

        return String.format(Locale.US, "%02d:%02d", minute, second);
    }
}
