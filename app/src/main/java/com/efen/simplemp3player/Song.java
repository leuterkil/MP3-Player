package com.efen.simplemp3player;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;

public class Song {

    private long id;
    private String Title;
    private String Artist;
    private String Album;
    private Bitmap CoverArt;

    public Song()
    {
        id=0;
        Title ="";
        Artist = "";
        Album = "";
        CoverArt.equals("");
    }

    public Song(long id,String Title,String Artist,String Album,Bitmap Image)
    {
        this.Album = Album;
        this.Title = Title;
        this.id = id;
        this.Artist = Artist;
        this.CoverArt = Image;
    }

    public Song(long id,String Title,String Artist,String Album)
    {
        this.Album = Album;
        this.Title = Title;
        this.id = id;
        this.Artist = Artist;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    public Bitmap getCoverArt() {
        return CoverArt;
    }
}
