package com.example.crs.a5kac;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MultiPlayerRoom extends PlayingRoom {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    linearLayout = new LinearLayout(getApplicationContext());
    splitCards();
    setContentView(linearLayout);
  }
}
