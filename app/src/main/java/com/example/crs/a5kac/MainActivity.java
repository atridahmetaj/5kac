package com.example.crs.a5kac;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        //main activity mendoj te kete 2 butona ku do zgjedhi nese do luaje solo apo multiplayer
        //solo e con ne activitet tjeter ku do zgjedhi veshtiresine
        // multiplayer e con ne activityn DHOMA ku do ftoje shoket ose random match(mbetet per tu diskutuar)

    }
}
