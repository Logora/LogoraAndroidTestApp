package com.logora.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.logora.logora_sdk.WidgetFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String applicationName = "logora-demo";
        WidgetFragment widget = new WidgetFragment(this.getApplicationContext(), "1162254885", applicationName);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.logora_widget_container, widget)
                .commit();
    }
}