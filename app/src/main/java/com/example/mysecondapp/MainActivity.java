package com.example.mysecondapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.hardware.*;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private SensorManager mSensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> mList= mSensorManager.getSensorList(Sensor.TYPE_ALL);

        StringBuilder sb1 = new StringBuilder();
        for (int i=1; i<mList.size(); i++){
            sb1.append(mList.get(i));
            sb1.append(" ");
        }
        Log.d(TAG, String.valueOf(sb1));
        TextView textView1 = (TextView) findViewById(R.id.text_id);
        textView1.append(sb1);
    }
}
