package com.efen.simplemp3player;

import android.Manifest;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static android.content.Context.MODE_PRIVATE;

public class SongAdapter extends BaseAdapter {

    private ArrayList<Song> songs;
    private LayoutInflater songInf;

        @Override
        public int getCount() {
            return songs.size();
        }

        @Override
        public Object getItem(int arg0) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public long getItemId(int arg0) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LinearLayout songLay = (LinearLayout)songInf.inflate
                    (R.layout.song_details, parent, false);
            //get title and artist views
            TextView songView = songLay.findViewById(R.id.SongTitle);
            TextView artistView = songLay.findViewById(R.id.Artist);
            TextView AlbumView = songLay.findViewById(R.id.Album);
            ImageView CoverArt = songLay.findViewById(R.id.Cover);

            //get song using position
            Song currSong = songs.get(position);
            //get title and artist strings
            songView.setText(currSong.getTitle());
            artistView.setText(currSong.getArtist());
            AlbumView.setText(currSong.getAlbum());
            CoverArt.setImageBitmap(currSong.getCoverArt());

            if(position!=currSong.getId())
            {
                songLay.setBackgroundColor(Color.parseColor("#ffffff"));
            }
            else
            {
                songLay.setBackgroundColor(Color.parseColor("#00aaff"));
            }


            //set position as tag
            songLay.setTag(position);
            return songLay;
        }

    public SongAdapter(Context c, ArrayList<Song> theSongs){
        songs=theSongs;
        songInf=LayoutInflater.from(c);
    }



    }
