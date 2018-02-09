package com.gokhale.nilesh.streamingapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

  private static final String API_KEY = "AIzaSyB6NmydHLa3eUUBlgV-pUOkMhDV5UTeW2c";
  private static String VDO_URL = "http://youtu.be/";
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate (savedInstanceState);
    setContentView (R.layout.activity_main);
    YouTubePlayerView player = (YouTubePlayerView)findViewById (R.id.youtube_player);
    player.initialize (API_KEY,this );
  }

  @Override
  public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
    youTubePlayer.setPlayerStateChangeListener (playerStateChangeListner);
    youTubePlayer.setPlaybackEventListener (playbackEventListner);
  }

  @Override
  public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
    Toast.makeText (this, "Failed to initialze", Toast.LENGTH_SHORT).show ( );
  }

  private YouTubePlayer.PlayerStateChangeListener playerStateChangeListner = new YouTubePlayer.PlayerStateChangeListener ( ) {
    @Override
    public void onLoading() {

    }

    @Override
    public void onLoaded(String s) {

    }

    @Override
    public void onAdStarted() {

    }

    @Override
    public void onVideoStarted() {

    }

    @Override
    public void onVideoEnded() {

    }

    @Override
    public void onError(YouTubePlayer.ErrorReason errorReason) {

    }
  };

  private YouTubePlayer.PlaybackEventListener playbackEventListner = new YouTubePlayer.PlaybackEventListener ( ) {
    @Override
    public void onPlaying() {

    }

    @Override
    public void onPaused() {

    }

    @Override
    public void onStopped() {

    }

    @Override
    public void onBuffering(boolean b) {

    }

    @Override
    public void onSeekTo(int i) {

    }
  };
}
