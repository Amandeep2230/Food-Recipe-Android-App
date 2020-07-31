package com.example.recipehub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class svid extends YouTubeBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final YouTubePlayerView mYouTubePlayerView;
        Button play;
        final YouTubePlayer.OnInitializedListener mOnInitializedListener;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_svid);
        play = (Button) findViewById(R.id.play);
        mYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.YT);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("pz6vZXe7Pmg");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mYouTubePlayerView.initialize(YTconfig.getApiKey(), mOnInitializedListener);
            }
        });
    }
}