package com.example.crs.a5kac;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;

public class Card extends AppCompatImageView {

  public Card(Context context, int id) {
    super(context);
    setImageResource(id);
  }
}
