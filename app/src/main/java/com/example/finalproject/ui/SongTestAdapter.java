package com.example.finalproject.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.NonNull;

import com.example.finalproject.R;
import com.example.finalproject.model.SongTestGridView;

import java.util.ArrayList;

public class SongTestAdapter extends ArrayAdapter<SongTestGridView> {
    public SongTestAdapter(@NonNull Context context, ArrayList<SongTestGridView> songTestGridViews) {
        super(context, 0, songTestGridViews);
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.grid_song_card_item, parent, false);
        }
        SongTestGridView currentSong = getItem(position);
        ImageButton imageButton = listItemView.findViewById(R.id.ib_music);
        TextView songTitle = listItemView.findViewById(R.id.tv_SongName);
        TextView songUrl = listItemView.findViewById(R.id.tv_url);

        if (currentSong != null) {
            imageButton.setImageResource(currentSong.getImageThumbnail());
            songTitle.setText(currentSong.getTitle());
            songUrl.setText(currentSong.getSongUrl());
        }

        // Set the onClickListener for the ImageButton
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSong(songUrl);
                // Thông báo
                Toast.makeText(getContext(), "Playing song " + songTitle.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        return listItemView;
    }


    public void playSong(TextView songUrl) {
        Dialog dialog = new Dialog(this.getContext());
        dialog.setContentView(R.layout.dialogue_video);

        Button btnClose = dialog.findViewById(R.id.btnClose);
        dialog.show();
        VideoView videoView = dialog.findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this.getContext());
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        String url = songUrl.getText().toString();
        if (url.isEmpty()) {
            // Dùng resource trong app
            videoView.setVideoPath("android.resource://" + this.getContext().getPackageName() + "/" + R.raw.t);
        } else if (url.equalsIgnoreCase("1")) {
            videoView.setVideoPath("android.resource://" + this.getContext().getPackageName() + "/" + R.raw.t1);
        } else if (url.equalsIgnoreCase("2")) {
            videoView.setVideoPath("android.resource://" + this.getContext().getPackageName() + "/" + R.raw.t2);
        } else if (url.equalsIgnoreCase("3")) {
            videoView.setVideoPath("android.resource://" + this.getContext().getPackageName() + "/" + R.raw.t3);
        } else if (url.equalsIgnoreCase("4")) {
            videoView.setVideoPath("android.resource://" + this.getContext().getPackageName() + "/" + R.raw.t4);
        } else if (url.equalsIgnoreCase("5")) {
            videoView.setVideoPath("android.resource://" + this.getContext().getPackageName() + "/" + R.raw.t5);
        } else if (url.equalsIgnoreCase("6")) {
            videoView.setVideoPath("android.resource://" + this.getContext().getPackageName() + "/" + R.raw.t6);
        } else if (url.equalsIgnoreCase("7")) {
            videoView.setVideoPath("android.resource://" + this.getContext().getPackageName() + "/" + R.raw.t71);
        } else if (url.equalsIgnoreCase("8")) {
            videoView.setVideoPath("android.resource://" + this.getContext().getPackageName() + "/" + R.raw.t8);
        }

        videoView.start();

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }
}
