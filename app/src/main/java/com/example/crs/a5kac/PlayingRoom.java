package com.example.crs.a5kac;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;

import java.util.Hashtable;

public class PlayingRoom extends Activity {
  private Context mcontext=getApplicationContext();
  private final String[] cardNames = {
     "c2"
          , "c3", "c4", "c5", "c6", "c7", "c8", "c9", "c10", "cj", "cq", "ck", "ca",
     "d2", "d3", "d4", "d5", "d6", "d7", "d8", "d9", "d10", "dj", "dq", "dk", "da",
     "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9", "h10", "hj", "hq", "hk", "ha",
     "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10", "sj", "sq", "sk", "sa",
      "blue_back", "gray_back", "green_back", "purple_back",
      "red_back"
      , "yellow_back"
  };
  private Hashtable<String, Card> cards = new Hashtable<>();
  protected LinearLayout linearLayout;

  private void setupCards() {
    for (String card : cardNames) {
      int imageId = Utilities.getResId(card, R.drawable.class);
      cards.put(card, new Card());
    }
  }

  protected void splitCards() {
    setupCards();

  }

}
