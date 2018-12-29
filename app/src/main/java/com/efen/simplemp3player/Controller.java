package com.efen.simplemp3player;

import android.content.Context;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;

public class Controller extends MediaController {


    public Controller(Context context) {
        super(context);
    }

    public void hide()
    {

    }
    @Override
    public void setAnchorView(View view) {
        super.setAnchorView(view);
        View customView = View.inflate(getContext(),R.layout.text_view_for_controller, null);
        TextView tvSongTitle = (TextView) customView.findViewById(R.id.songTitleView);
        tvSongTitle.setText("set your song title");
        addView(customView);
    }

    public void setSongTitle(String name){
        TextView tvSongTitle = (TextView) findViewById(R.id.songTitleView);
        tvSongTitle.setText(name);
    }
}
