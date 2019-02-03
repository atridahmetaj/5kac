package com.example.crs.a5kac;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_main);

    Button solo = findViewById(R.id.solo);
    Button multiplayer = findViewById(R.id.multip);

    multiplayer.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        startActivity(new Intent(getApplicationContext(), MultiPlayerRoom.class));
      }
    });

    solo.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        startActivity(new Intent(getApplicationContext(), SingleRoom.class));
      }
    });
  }
}
