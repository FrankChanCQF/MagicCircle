package com.shadev.pierrebeziercircle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private android.widget.Button btnstart;
    private MagicCircle circle3;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circle3 = (MagicCircle)findViewById(R.id.circle3);
        this.btnstart = (Button) findViewById(R.id.btn_start);
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                circle3.startAnimation();
            }
        });
    }
}
