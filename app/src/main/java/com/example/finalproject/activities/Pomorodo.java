package com.example.finalproject.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.finalproject.R;
import com.example.finalproject.model.Account;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Pomorodo extends AppCompatActivity {
    private Account getAccount = new Account();
    ImageButton ibHome, ibGraph, ibMusic, ibClock, ibSetting;
    boolean isTimeRunning = false, isBreak = false;
    final static long DEFAULT_WORKING_TIME = 1500000, DEFAULT_BREAK_TIME = 300000;
    static long startTime, breakTime, millisLeft;
    ImageButton resumePauseButton, resetButton;
    CountDownTimer timer;
    ProgressBar timerProgressBar;
    TextView timerText;
    Vibrator vibrator;
    Ringtone ringtone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pomorodo);

        resumePauseButton = findViewById(R.id.resumePauseButton);
        resetButton = findViewById(R.id.resetButton);
        timerProgressBar = findViewById(R.id.progressBar);
        timerText = findViewById(R.id.textView);

        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        ringtone = RingtoneManager.getRingtone(getApplicationContext(), RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));

        startTime = DEFAULT_WORKING_TIME;
        breakTime = DEFAULT_BREAK_TIME;

        millisLeft = (isBreak) ? breakTime : startTime;
        ibHome = findViewById(R.id.ib_home);
        ibGraph = findViewById(R.id.ib_graph);
        ibMusic = findViewById(R.id.ib_music);
        ibClock = findViewById(R.id.ib_clock);
        ibSetting = findViewById(R.id.ib_settings);


        String idTaiKhoan = getIntent().getStringExtra("idTaiKhoan");
        getData();
        ibHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pomorodo.this, Home_Activity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("user_account", getAccount);
                intent.putExtra("idTaiKhoan", idTaiKhoan);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        ibGraph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pomorodo.this, Progress_total.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("user_account", getAccount);
                intent.putExtra("idTaiKhoan", idTaiKhoan);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        ibMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pomorodo.this, SongsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("user_account", getAccount);
                intent.putExtra("idTaiKhoan", idTaiKhoan);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        ibClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pomorodo.this, Pomorodo.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("user_account", getAccount);
                intent.putExtra("idTaiKhoan", idTaiKhoan);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        ibSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pomorodo.this, Setting.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("user_account", getAccount);
                intent.putExtra("idTaiKhoan", idTaiKhoan);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        onStart();
    }
    public void getData(){
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            // Lấy đối tượng Account từ Bundle
            Account account = (Account) bundle.getSerializable("user_account");
            getAccount = account;
        }
    }
    protected void onStart() {
        super.onStart();

        defineProgress();
        updateTimerProgress();

        resumePauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isTimeRunning)
                    pauseTimer();
                else
                    startTimer();
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetTimer();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.workingTimerOption) {
            Intent workIntent = new Intent(Pomorodo.this, SetTimeActivity.class);

            workIntent.putExtra("startTime", startTime);
            workIntent.putExtra("requestCode", 10);
            startActivityForResult(workIntent, 10);
            return true;
        } else if(item.getItemId() ==  R.id.breakTimerOption){
                Intent breakIntent = new Intent(Pomorodo.this, SetTimeActivity.class);
                breakIntent.putExtra("breakTime", breakTime);
                breakIntent.putExtra("requestCode", 20);
                startActivityForResult(breakIntent, 20);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putBoolean("isTimeRunning", isTimeRunning);
        outState.putLong("millisLeft", millisLeft);
        outState.putBoolean("isBreak", isBreak);

        if (isTimeRunning)
            destroyTimer();
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        isTimeRunning = savedInstanceState.getBoolean("isTimeRunning");
        millisLeft = savedInstanceState.getLong("millisLeft");
        isBreak = savedInstanceState.getBoolean("isBreak");

        defineProgress();
        updateTimerProgress();

        if (millisLeft != startTime)
            updateResumePauseButton();

        if (isTimeRunning)
            startTimer();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            if (requestCode == 10) {
                startTime = Objects.requireNonNull(data.getExtras()).getLong("startTime");

                resetTimer();
                defineProgress();
            }
            else if (requestCode == 20) {
                breakTime = Objects.requireNonNull(data.getExtras()).getLong("breakTime");

                resetTimer();
                defineProgress();
            }
        }
    }

    private void startTimer() {
        isTimeRunning = true;

        timer = new CountDownTimer(millisLeft, 100) {

            @Override
            public void onTick(long millisUntilFinished) {
                millisLeft = millisUntilFinished;

                updateTimerProgress();
            }

            @Override
            public void onFinish() {
                alertTimerFinish();
                changeTimerType();
                defineProgress();
                startTimer();
            }
        }.start();

        updateResumePauseButton();
    }

    public void defineProgress() {
        timerProgressBar.setMax((int) TimeUnit.MILLISECONDS.toSeconds((isBreak) ? breakTime : startTime));
        timerProgressBar.setProgress(timerProgressBar.getMax());
    }

    private void alertTimerFinish() {
        vibrator.vibrate(1000);
        ringtone.play();
    }

    private void changeTimerType() {
        millisLeft = (!isBreak) ? breakTime : startTime;
        isBreak = !isBreak;
    }

    private void destroyTimer() {
        timer.cancel();

        isTimeRunning = false;
    }

    private void pauseTimer() {
        destroyTimer();
        updateResumePauseButton();
    }

    private void resetTimer() {
        if (isTimeRunning)
            destroyTimer();

        millisLeft = (!isBreak) ? startTime : breakTime;

        updateTimerProgress();
        updateResumePauseButton();
    }

    private void updateTimerProgress() {
        String second = String.valueOf(TimeUnit.MILLISECONDS.toSeconds(millisLeft) % 60);
        String minute = String.valueOf(TimeUnit.MILLISECONDS.toMinutes(millisLeft) % 60);
        String hour = String.valueOf(TimeUnit.MILLISECONDS.toHours(millisLeft));

        int hourInt = Integer.parseInt(hour);

        if (Integer.parseInt(minute) < 10 && hourInt > 0)
            minute = "0" + minute;
        if (Integer.parseInt(second) < 10)
            second = "0" + second;

        if (hourInt > 0)
            timerText.setText(getString(R.string.hour_time, hour, minute, second));
        else
            timerText.setText(getString(R.string.time, minute, second));

        timerProgressBar.setProgress((int) TimeUnit.MILLISECONDS.toSeconds(millisLeft));
    }

    private void updateResumePauseButton() {
        resumePauseButton.setImageResource(isTimeRunning ? R.drawable.baseline_pause_24 : R.drawable.baseline_play_arrow_24);
    }
}