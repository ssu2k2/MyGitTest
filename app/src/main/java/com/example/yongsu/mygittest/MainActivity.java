package com.example.yongsu.mygittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final String TAG = getClass().getSimpleName();
    TextView tvTitle0, tvTitle1;

    ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate()");
        tvTitle0 = (TextView)findViewById(R.id.tvText0);
        tvTitle1 = (TextView)findViewById(R.id.tvText1);
        test();
    }
    private void test() {
        Log.d(TAG, "Call Test()");
    }

}
