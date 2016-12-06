package com.techpalle.newscreen;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.Textview1);
        tv1.setPaintFlags(tv1.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
        tv2=(TextView)findViewById(R.id.Textview2);
        tv2.setPaintFlags(tv1.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
    }
}
