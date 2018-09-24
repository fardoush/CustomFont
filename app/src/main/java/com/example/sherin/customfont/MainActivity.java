package com.example.sherin.customfont;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textViewId);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"FloralCapitals.ttf");
        textView.setTypeface(typeface);
    }
}
