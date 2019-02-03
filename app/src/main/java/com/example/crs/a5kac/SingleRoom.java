package com.example.crs.a5kac;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SingleRoom extends AppCompatActivity {
  ImageView deck,player1,player2,player3,player4;
  ArrayList<Integer> cards;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_solo);
    deck= findViewById(R.id.imview_deck);
    player1=findViewById(R.id.player1);
    player2= findViewById(R.id.player2);
    player3 = findViewById(R.id.player3);
    player4 = findViewById(R.id.iplayer4);

    player1.setVisibility(View.VISIBLE);
    player2.setVisibility(View.VISIBLE);
    player3.setVisibility(View.VISIBLE);
    player4.setVisibility(View.VISIBLE);
    cards = new ArrayList<>();
    cards.add(109);
    cards.add(110);
    cards.add(111);
    cards.add(112);
    deck.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Collections.shuffle(cards);
        images(cards.get(0),player1);
        images(cards.get(1),player2);
        images(cards.get(2),player3);
        images(cards.get(3),player4);

        player1.setVisibility(View.VISIBLE);
        player2.setVisibility(View.VISIBLE);
        player3.setVisibility(View.VISIBLE);
        player4.setVisibility(View.VISIBLE);
      }
    });
  }
  public void images(int card,ImageView image){
    switch (card){
      case 109:
        image.setImageResource(R.drawable.c2);
        break;
      case 110:
        image.setImageResource(R.drawable.c3);
        break;
      case 111:
        image.setImageResource(R.drawable.c4);
        break;
      case 112:
        image.setImageResource(R.drawable.c5);
        break;
    }
  }
}
