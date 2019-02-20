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

public class Category2 extends YouTubeBaseActivity {

    YouTubePlayerView mYouTubePlayerView;
    Button playBtn2;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;
    public static final String TAG = "Category2";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category2);
        Log.d(TAG, "onCreate: starting.");


        playBtn2 = (Button) findViewById(R.id.playBtn2);
        mYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.view2);


        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "onClick: Done initializing.");
                List<String> videoList= new ArrayList<>();
                videoList.add("DuwCBPl_FQk");
                videoList.add("3ZtC_kQXYL0");
                videoList.add("ScJuoG5nJOU");
                youTubePlayer.loadVideos(videoList);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "onClick: Failure to initialize.");
            }
        };


        playBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Initializing YouTube Player.");
                mYouTubePlayerView.initialize(holdYouTubeAPI.getApiKey(), mOnInitializedListener);

            }
        });

    }



}
