package com.example.rawrestest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer1 = null;
    MediaPlayer mediaPlayer2 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer1 = MediaPlayer.create(this, R.raw.bomb);
        AssetManager am = getAssets();
        try {
            AssetFileDescriptor afd = am.openFd("shot.mp3");
            mediaPlayer2 = new MediaPlayer();
            mediaPlayer2.setDataSource(afd.getFileDescriptor());
            mediaPlayer2.prepare();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 获取第一个按钮，并为它绑定事件监听器
        Button playRaw = (Button) findViewById(R.id.playRaw);
        playRaw.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                // 播放声音
                mediaPlayer1.start();
            }
        });
        // 获取第二个按钮，并为它绑定事件监听器
        Button playAsset = (Button) findViewById(R.id.playAsset);
        playAsset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                // 播放声音
                mediaPlayer2.start();
            }
        });
    }
}
