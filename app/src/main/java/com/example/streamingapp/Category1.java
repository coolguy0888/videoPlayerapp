package com.example.streamingapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class Category1 extends YouTubeBaseActivity {

    YouTubePlayerView mYouTubePlayerView;
    Button playBtn1;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;
    public static final String TAG = "Category1";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category1);
        Log.d(TAG, "onCreate: starting.");


        playBtn1 = (Button) findViewById(R.id.playBtn1);
        mYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.view1);


        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "onClick: Done initializing.");
                List<String> videoList= new ArrayList<>();
                videoList.add("oHg5SJYRHA0");
                videoList.add("FxQTY-W6GIo");
                videoList.add("26xhnFNGLSc");
                youTubePlayer.loadVideos(videoList);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "onClick: Failure to initialize.");
            }
        };


        playBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Initializing YouTube Player.");
                mYouTubePlayerView.initialize(holdYouTubeAPI.getApiKey(), mOnInitializedListener);

            }
        });

    }



}
