package com.example.recipehub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class fvid extends YouTubeBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final YouTubePlayerView mYouTubePlayerView;
        Button play;
        final YouTubePlayer.OnInitializedListener mOnInitializedListener;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fvid);
        play = (Button) findViewById(R.id.play);
        mYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.YT);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("bXgxzzNm0U8");
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