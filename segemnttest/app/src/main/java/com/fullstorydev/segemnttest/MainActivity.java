package com.fullstorydev.segemnttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.fullstory.FS;
import com.fullstory.FSOnReadyListener;
import com.fullstory.FSSessionData;
import com.segment.analytics.Analytics;

public class MainActivity extends AppCompatActivity implements FSOnReadyListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FS.setReadyListener(this);

        Analytics.with(getApplicationContext()).identify("testuser!!!!!!!Release");
    }

    @Override
    public void onReady(FSSessionData sessionData) {
        Log.d("here",FS.getCurrentSessionURL());
    }
}
