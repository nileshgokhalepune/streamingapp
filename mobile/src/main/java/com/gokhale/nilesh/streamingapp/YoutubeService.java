package com.gokhale.nilesh.streamingapp;

import android.os.AsyncTask;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import retrofit2.Retrofit;

/**
 * Created by ngokhal on 2/8/2018.
 */

public class YoutubeService extends AsyncTask<String,Void,String> {
  private static String SearchURL = "https://www.googleapis.com/youtube/v3/search?part=snippet";

  public String Search(String text){
    String vidoeList="Not found";
    try {
      URL url = new URL (SearchURL + "&q" + text);
    }catch (Exception ex){
      return "Error";
    }
    return  "";
  }

  @Override
  protected String doInBackground(String... strings) {
    return Search (strings[0]);
  }
}
