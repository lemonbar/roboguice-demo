package com.lemon.android;

import android.os.Bundle;
import android.widget.TextView;
import roboguice.activity.RoboActivity;
import roboguice.inject.InjectResource;
import roboguice.inject.InjectView;

public class HelloAndroidActivity extends RoboActivity {
    @InjectView(R.id.textView)
    TextView textView;

    @InjectResource(R.string.hello_world)
    String text;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView.setText(text);
    }

}

