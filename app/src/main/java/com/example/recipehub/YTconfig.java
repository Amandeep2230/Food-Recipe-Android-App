package com.example.recipehub;

import com.google.android.youtube.player.YouTubeBaseActivity;

public class YTconfig extends YouTubeBaseActivity {
    YTconfig()
    {

    }

    private static final String API_KEY = "AIzaSyCGlZJXb0a-MFhU0RIwXyC0Ih5vqE1O85g";

    public static String getApiKey()
    {
        return API_KEY;
    }
}
