package com.example.ujikom_david;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    public MediaPlayer musik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playsoun();
        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(2000);
                }catch (InterruptedException exception){
                    exception.printStackTrace();
                }finally {
                    startActivity(new Intent(MainActivity.this,login.class));
                    finish();
                }
            }
        };
        thread.start();
    }

    private void playsoun() {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        musik = MediaPlayer.create(this,R.raw.music);
        musik.setLooping(false);
        musik.start();
    }
}