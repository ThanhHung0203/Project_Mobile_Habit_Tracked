package com.example.finalproject.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;

import com.example.finalproject.R;
import com.example.finalproject.model.Account;
import com.example.finalproject.model.SongTestGridView;
import com.example.finalproject.ui.SongTestAdapter;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {
    GridView gridView;
    ImageButton ibHome, ibGraph, ibMusic, ibClock, ibSetting;

    private Account acc = new Account();
    private String idUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        Bundle b = getIntent().getExtras();
        acc = (Account) b.getSerializable("user_account");

        idUser = getIntent().getStringExtra("idTaiKhoan");

        gridView = findViewById(R.id.gridViewSong);

        // Create an ArrayList of SongTestGridView objects
        ArrayList<SongTestGridView> songTestGridViews = new ArrayList<>();
        songTestGridViews.add(new SongTestGridView("Rain", R.drawable.song_sample1, "1"));
        songTestGridViews.add(new SongTestGridView("Lofi", R.drawable.song_sample2, "2"));
        songTestGridViews.add(new SongTestGridView("Chill", R.drawable.song_sample3, "3"));
        songTestGridViews.add(new SongTestGridView("Music Box", R.drawable.song_sample4, "4"));
        songTestGridViews.add(new SongTestGridView("Bolero", R.drawable.song_sample5, "5"));
        songTestGridViews.add(new SongTestGridView("Piano", R.drawable.song_sample6, "6"));
        songTestGridViews.add(new SongTestGridView("Dance", R.drawable.song_sample71, "7"));
        songTestGridViews.add(new SongTestGridView("Guitar", R.drawable.song_sample8, "8"));

        SongTestAdapter SongAdapter = new SongTestAdapter(this, songTestGridViews);
        gridView.setAdapter(SongAdapter);

        // Set up the buttons
        ibHome = findViewById(R.id.ib_home);
        ibGraph = findViewById(R.id.ib_graph);
        ibMusic = findViewById(R.id.ib_music);
        ibClock = findViewById(R.id.ib_clock);
        ibSetting = findViewById(R.id.ib_settings);

        // Set up the buttons to go to the correct activity
        ibHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongsActivity.this, Home_Activity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("user_account", acc);
                intent.putExtra("idTaiKhoan", idUser);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        ibGraph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongsActivity.this, Progress_total.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("user_account", acc);
                intent.putExtra("idTaiKhoan", idUser);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        ibMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongsActivity.this, SongsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("user_account", acc);
                intent.putExtra("idTaiKhoan", idUser);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        ibClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongsActivity.this, Pomorodo.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("user_account", acc);
                intent.putExtra("idTaiKhoan", idUser);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        ibSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongsActivity.this, Setting.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("user_account", acc);
                intent.putExtra("idTaiKhoan", idUser);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}