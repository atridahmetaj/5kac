package com.example.crs.a5kac;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity {
    Button solo;
    Button multiplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        solo=findViewById(R.id.solo);
        multiplayer=findViewById(R.id.multip);

        solo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Solo.class));
                //startActivityForResult(new Intent(MainActivity.this, Kerko.class), KERKOACTIVITY);

            }
        });

        multiplayer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Dhoma.class));
                //startActivityForResult(new Intent(MainActivity.this, Kerko.class), KERKOACTIVITY);

            }
        });
        //main activity mendoj te kete 2 butona ku do zgjedhi nese do luaje solo apo multiplayer
        //solo e con ne activitet tjeter ku do zgjedhi veshtiresine
        // multiplayer e con ne activityn DHOMA ku do ftoje shoket ose random match(mbetet per tu diskutuar)

    }
}
