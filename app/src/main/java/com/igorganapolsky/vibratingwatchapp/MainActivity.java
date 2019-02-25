package com.igorganapolsky.vibratingwatchapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Main activity (application entry point).
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // On click handler for plus button.
        findViewById(R.id.llAddTimerButton).setOnClickListener((view) -> {
            startActivity(new Intent(getApplicationContext(), SetTimerActivity.class));
        });
    }
}
