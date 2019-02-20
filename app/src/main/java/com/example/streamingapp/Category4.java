package com.example.streamingapp;

import android.support.v7.app.AppCompatActivity;
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

public class Category4 extends YouTubeBaseActivity {

    YouTubePlayerView mYouTubePlayerView;
    Button playBtn4;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;
    public static final String TAG = "Category4";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category4);
        Log.d(TAG, "onCreate: starting.");


        playBtn4 = (Button) findViewById(R.id.playBtn4);
        mYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.view4);


        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "onClick: Done initializing.");
                List<String> videoList= new ArrayList<>();
                videoList.add("pNar3Dh9zDk");
                videoList.add("a7jv-z87vb4");
                videoList.add("ph8M_8sVOEA");
                youTubePlayer.loadVideos(videoList);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "onClick: Failure to initialize.");
            }
        };


        playBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Initializing YouTube Player.");
                mYouTubePlayerView.initialize(holdYouTubeAPI.getApiKey(), mOnInitializedListener);

            }
        });

    }
}
