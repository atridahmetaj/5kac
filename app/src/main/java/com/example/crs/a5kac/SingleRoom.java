package com.example.crs.a5kac;

import android.os.Bundle;
import android.widget.LinearLayout;

public class SingleRoom extends PlayingRoom {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    linearLayout = new LinearLayout(this);
    splitCards();
    setContentView(linearLayout);
  }
}
